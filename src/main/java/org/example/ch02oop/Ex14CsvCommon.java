package org.example.ch02oop;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.net.URL;

public class Ex14CsvCommon {
    public static void main(String[] args) throws Exception {
        String fileName = "users.csv";
        ClassLoader classLoader = Ex14CsvCommon.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            System.out.println("File not found " + fileName);
            return;
        }

        try (Reader in = new FileReader(resource.getFile())) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.builder().setDelimiter(";").setHeader()
                    .setSkipHeaderRecord(true)
                    .build().parse(in);
            for (CSVRecord record : records) {
                String username = record.get("Username");
                int id = Integer.parseInt(record.get("Identifier"));
                System.out.println(username);
                System.out.println(id);
            }
        }
    }
}
