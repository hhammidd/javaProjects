package com.projects.csvProjects.readcsvAndSaveInDB.repository;

import com.projects.csvProjects.readcsvAndSaveInDB.model.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsvParserAndDaoImp implements CsvParserAndDao {
    private final static String FILE_VISA_PREFIX = "TC40_";
    private final static String FILE_WEEKLY_BIN_VISA_PREFIX = "TC40_BIN_";

    private final static String SOURCE_FILE_PREFIX = "SAFE_";
    private final static String CUP_SOURCE_FILE_PREFIX = "CUP_";
    private final static SimpleDateFormat DATE_FORMAT_OUTPUT = new SimpleDateFormat("yyyy-MM-dd");
    private final static SimpleDateFormat CUP_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

    private final static int ISS_COL = 1;
    private final static int TRANS_DATE_COL = 3;
    private final static int FT_COL = 4;
    private final static int ACCOUNT_NUMBER_COL = 6;
    private final static int LOCAL_AMOUNT_COL = 10;
    private final static int MERCHANT_COL = 17;
    private final static int CITY_COL = 18;
    private final static int MERCHANT_ID_COL = 23;
    private final static int MCC_COL = 24;
    private final static int POS_ENTRY_MODE_COL = 26;
    private final static int ARN_COL = 31;
    private final static int CARD_HLDR_PRES_CD_COL = 35;
    private final static int CAT_LVL_POS_TERM_TYPE_COL = 36;
    private final static int TERM_CAP_CD_COL = 37;
    private final static int ENTERED_DATE_COL = 49;
    private final static int SECURE_CODE_COL = 56;
    private final static int CARD_PRESENT_INDICATOR_COL = 58;

    private final static int CUP_FRAUD_TRANSACTION_SEQUENCE_COL = 0;
    private final static int CUP_REPORT_DATE_COL = 2;
    private final static int CUP_FRAUD_TYPE_COL = 3;
    private final static int CUP_CARD_NUMBER_COL = 4;
    private final static int CUP_ISSUER_IN_COL = 5;
    private final static int CUP_MERCHANT_ID_COL = 7;
    private final static int CUP_MERCHANT_NAME_COL = 8;
    private final static int CUP_TRANSACTION_DATE_COL = 12;
    private final static int CUP_REAL_TRANSACTION_AMOUNT_COL = 14;


    @Override
    public int loadQsSafeTc40InCup() throws ParseException {


        InputStream inputStream = null;
        LocalDate DATA_ABB = LocalDate.now();
        Date sourceDate = null;


        BufferedReader br = null;

        List<Country> countryList = new ArrayList<Country>();
        Country country = null;

        try {
            String csvFile = "csvExample.csv";

            br = new BufferedReader(new FileReader(csvFile));

            String line = br.readLine();
            String cvsSplitBy = ",";

            int processedRows = 0;
            while ((line = br.readLine()) != null) {
                // here for canceling "" from csv
                line = line.replace("\"", "");
                // use comma as separator
                String[] csvFields = line.split(cvsSplitBy);
                country = new Country();

                // another ways
                //System.out.println("csvFields [code= " + csvFields[4].trim() + " , name=" + csvFields[5].trim() + "]");

                processedRows++;

                // int Number of Records
                country.setNumRow(processedRows);

                // 1. String Set Example
                String merchantDesc = csvFields[CUP_MERCHANT_NAME_COL].trim();
                // just take the first 25 char of merchant name
                if (merchantDesc.length() > 25)
                    merchantDesc = merchantDesc.substring(0, 25);
                country.setESERCENTE(merchantDesc);

                // 2. Double example
                country.setAMOUNT(Double.valueOf(csvFields[CUP_REAL_TRANSACTION_AMOUNT_COL].trim()));

                // 3. LocalDate
                sourceDate = CUP_DATE_FORMAT.parse(csvFields[CUP_REPORT_DATE_COL].trim());
                country.setSourceDate(sourceDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

                // double
                country.setAMOUNT(Double.valueOf(csvFields[CUP_REAL_TRANSACTION_AMOUNT_COL].trim()));

                // 4. Date
                country.setDATA_MOVI(CUP_DATE_FORMAT.parse(csvFields[CUP_TRANSACTION_DATE_COL].trim()));

                country.setPOS_TYPE(" ");

                countryList.add(country);
                // MAKE THE OBJECT

            }
            System.out.println("hey: " + countryList);
            // insert taken Data to DB
            insertCSVToMysqlDb(countryList);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return 0;
    }

    private void insertCSVToMysqlDb(List<Country> countryList) throws Exception {

        //1. take the parser list of csv and controll if is empty return
        if (countryList.isEmpty()) {
            return;
        }

        //2. do the query and insert on db
        //3. Write

        String sql ="";
        // depend DAO and JDBC and JPA

    }
}
