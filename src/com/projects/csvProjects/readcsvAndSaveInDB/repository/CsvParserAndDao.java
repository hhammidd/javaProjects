package com.projects.csvProjects.readcsvAndSaveInDB.repository;

import java.text.ParseException;

public interface CsvParserAndDao {
    int loadQsSafeTc40InCup() throws ParseException;
}
