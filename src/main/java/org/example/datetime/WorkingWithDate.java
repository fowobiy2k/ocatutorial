package org.example.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class WorkingWithDate {
    public static void main(String[] args) {
        WorkingWithDate wwd = new WorkingWithDate();
        wwd.printTimeZoneCountByContinent("america");
    }

    private void printTimeZoneByContinent(String continent) {
        ZoneId.getAvailableZoneIds().stream().filter(zone -> zone.toLowerCase().startsWith(continent.toLowerCase())).forEach(System.out::println);
    }

    private void printTimeZoneCountByContinent(String continent) {
        System.out.println("There are " + ZoneId.getAvailableZoneIds().stream().filter(zone -> zone.toLowerCase().startsWith(continent.toLowerCase())).count() + " time zones in " + continent);
    }

    private void printTimeZoneCount() {
        System.out.println("There are a total of " + ZoneId.getAvailableZoneIds().size() + " time zones");
    }

    private void printAllZoneIds() {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }

    private void printDateByZoneId() {
        LocalDate inAustralia = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(inAustralia);
    }
}
