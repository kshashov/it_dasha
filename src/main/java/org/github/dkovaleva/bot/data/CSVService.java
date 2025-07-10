package org.github.dkovaleva.bot.data;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVService {

    public static List<List<String>> loadCSV(String filename) {
        try {
            Reader in = new FileReader("src/main/resources/bot/" + filename);

            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
//                .setHeader(HEADERS)
//                .setSkipHeaderRecord(true)
                    .build();

            Iterable<CSVRecord> records = csvFormat.parse(in);

            List<List<String>> result = new ArrayList<>();
            records.forEach(record -> {
                result.add(record.stream().toList());
            });

            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void createCSV(String filename, List<List<String>> rows) {
        StringWriter sw = new StringWriter();

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
//                .setHeader(HEADERS)
                .build();

        try (final CSVPrinter printer = new CSVPrinter(sw, csvFormat)) {
            rows.forEach((row) -> {
                try {
                    printer.printRecord(row);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            FileWriter fw = new FileWriter("src/main/resources/bot/" + filename, false);
            fw.write(sw.toString());
            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createCSV("hui",
                List.of(
                        List.of("a", "b"),
                        List.of("c", "d")
                )
        );

        try {
            List<List<String>> loaded = loadCSV("hui");
            System.out.println(loaded);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
