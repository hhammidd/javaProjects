package com.projects.csvProjects.readcsvAndSaveInDB.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Country {
    private int numRow;
    private LocalDate sourceDate;
    private String ESERCENTE ;
    private double AMOUNT;
    private Date DATA_MOVI;
    private BigDecimal COD_SCARTO;
    private String POS_TYPE;

    public String getPOS_TYPE() {
        return POS_TYPE;
    }

    public void setPOS_TYPE(String POS_TYPE) {
        this.POS_TYPE = POS_TYPE;
    }

    public BigDecimal getCOD_SCARTO() {
        return COD_SCARTO;
    }

    public void setCOD_SCARTO(BigDecimal COD_SCARTO) {
        this.COD_SCARTO = COD_SCARTO;
    }

    public Date getDATA_MOVI() {
        return DATA_MOVI;
    }

    public void setDATA_MOVI(Date DATA_MOVI) {
        this.DATA_MOVI = DATA_MOVI;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getESERCENTE() {
        return ESERCENTE;
    }

    public void setESERCENTE(String ESERCENTE) {
        this.ESERCENTE = ESERCENTE;
    }

    public LocalDate getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(LocalDate sourceDate) {
        this.sourceDate = sourceDate;
    }

    public int getNumRow() {
        return numRow;
    }

    public void setNumRow(int numRow) {
        this.numRow = numRow;
    }


    @Override
    public String toString() {
        return "Country{" +
                "numRow=" + numRow +
                ", sourceDate=" + sourceDate +
                ", ESERCENTE='" + ESERCENTE + '\'' +
                ", AMOUNT=" + AMOUNT +
                ", DATA_MOVI=" + DATA_MOVI +
                ", COD_SCARTO=" + COD_SCARTO +
                ", POS_TYPE='" + POS_TYPE + '\'' +
                '}';
    }
}
