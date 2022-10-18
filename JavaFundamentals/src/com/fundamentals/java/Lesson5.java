package com.fundamentals.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

/*Working with Calendar Data */
public class Lesson5 {

    private Object localDateTime;

    public void localDateTimeExample() {

        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);
        System.out.println(timeNow.getMonth());
        System.out.println(timeNow.getYear());
        System.out.println(timeNow.minusMonths(2));
        System.out.println(timeNow.plusDays(23));

    }

    public void localEpochExample() {
        LocalDateTime epochNow = LocalDateTime.ofEpochSecond(1666049278L, 0, ZoneOffset.MIN);
        System.out.println(epochNow);
        System.out.println(epochNow.withDayOfMonth(11));
    }

    public void localDateParseExample() {
        LocalDateTime born = LocalDateTime.parse("1973-10-05T10:15:30");
        System.out.println(born);
    }

    public void localDateExample() {
        LocalDate dateNow = LocalDate.now(ZoneId.systemDefault());
        System.out.println(dateNow.atTime(9,25));
        System.out.println(dateNow.getChronology().eras());
    }

    public void epochDateExample() {
        LocalDate epochDate = LocalDate.ofEpochDay(9446);
        System.out.println(epochDate.isLeapYear());
        System.out.println(epochDate.lengthOfYear());
        System.out.println(epochDate); // Won't work because no time specified.
    }

    public void epochBDayTrial() {
        LocalDate epochBDay = LocalDate.of(1995, 11, 12);
        long bday = epochBDay.toEpochDay();
        System.out.println(bday);
    }

    public void localTimeExample() {
        LocalTime time = LocalTime.now(Clock.systemUTC());
        System.out.println(time);
        System.out.println(time.atOffset(ZoneOffset.ofHours(-5)));; // adds -5 to the time total. Does not format.
        int hour = time.getHour();//
        System.out.println(hour);
        System.out.println(time.withMinute(45)); // changes minutes, does not add minutes

    }

    public void bornDateFormatter() {
        LocalDateTime born = LocalDateTime.parse("1973-10-05T10:15:30");
        String sampleDate = born.format(DateTimeFormatter.ofPattern("MMM dd yyyy G - h:m a"));
        System.out.println(sampleDate);
        ZonedDateTime zone = born.atZone(ZoneId.of("-0500"));
        System.out.println(zone.format(DateTimeFormatter.ofPattern("VV z")));
    }

    public void timePeriodExample() {
        Period period = Period.of(4, 8, 21); // years + months + days after the LocalDate that was added.
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    }

}
