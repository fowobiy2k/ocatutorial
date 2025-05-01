package org.example.datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class WorkingWithTime {
    public static void main(String[] args) {
        WorkingWithTime wwt = new WorkingWithTime();
        wwt.printTimeByZone("Africa/Addis_Ababa");
    }

    private void printTimeByZone(String zone) {
        System.out.println(LocalTime.now(ZoneId.of(zone)));
    }
}
