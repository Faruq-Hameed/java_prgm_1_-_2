package part_10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison implements Comparable<LiteracyComparison> {
    // theme, age group, gender, country, year, literacy percent
    // Niger (2015), female, 11.01572

    private String country;
    private int year;
    private String sex;
    private double literacyPercent;

    public LiteracyComparison(String country, int year, String sex, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.sex = sex;
        this.literacyPercent = literacyPercent;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        // Niger (2015), female, 11.01572
        return this.country
                + " (" + this.year + "), "
                + this.sex + ", "
                + this.literacyPercent;

    }

    @Override
    public int compareTo(LiteracyComparison other) { // we use Double compare for double types
        return Double.compare(literacyPercent, other.getLiteracyPercent());
    }

    public static void main(String[] args) {
        ArrayList<LiteracyComparison> literacyComparisons = new ArrayList<>();

        try {
            // Adult literacy rate, population 15+ years, female (%),Tanzania,2015,76.08978

            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(",")) // get each row then split by ,
                    .forEach(countryDetail -> {
                        // extract each needed details from ach countru data
                        String sexPart = countryDetail[2].trim(); // e.g. "female (%)" trim remove white space at the
                                                                  // both end
                        String sex = sexPart.split(" ")[0]; // "female"

                        String country = countryDetail[3];
                        int year = Integer.valueOf(countryDetail[4]);
                        double literacyPercent = Double.parseDouble(countryDetail[5]);
                        LiteracyComparison newObj = new LiteracyComparison(country, year, sex, literacyPercent);
                        literacyComparisons.add(newObj);
                    });
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Collections.sort(literacyComparisons); // sort original list

        for (LiteracyComparison obj : literacyComparisons) {
            System.out.println(obj); // print the sorted list
        }
    }

}
