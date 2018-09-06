package com.projects.csvProjects.readcsvAndSaveInDB;

import com.projects.csvProjects.readcsvAndSaveInDB.repository.CsvParserAndDaoImp;

import java.text.ParseException;

public class MainCsvController {
    public static void main(String[] args) throws ParseException {
        int loadQsSafeTc40InCup = 0;
        CsvParserAndDaoImp csvParserAndDaoImp = new CsvParserAndDaoImp();
        loadQsSafeTc40InCup = csvParserAndDaoImp.loadQsSafeTc40InCup();
    }
}
