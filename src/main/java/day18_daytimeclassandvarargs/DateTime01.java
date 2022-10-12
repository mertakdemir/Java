package day18_daytimeclassandvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get ""current date" by typing Java code

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);


        //How to get "current time" by typing Java code

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //How to get "current date and time" by typing Java code

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //How to get "current date" in another country

        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        //How to get "current time" in another country

        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);


        //How to get "current date and time" in another country

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //How to go future in date

        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1Next);

        //How to go past in date

       LocalDate cd1past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1past);

        //Homework : Type code to learn how to go future and past in time


        //How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour =  ct1.getHour();
        System.out.println(hour);

        int minute = ct1.getMinute();
        System.out.println(minute);

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Uppercase "M" is for months, lowercase "m" is for minutes.

        String formattedcurrentDate = dtf.format(cd1);
        System.out.println(formattedcurrentDate);


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy"); // "MMM" gives you the "first three characters" of the month name
                                                                         // "yy" gives you the "last 2 digits" of the year

        String formattedcurrentDate2 = dt.format(cd1);
        System.out.println(formattedcurrentDate2);


        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); // "MMMM" gives you full name of the month


        String formattedcurrentDate3 = d.format(cd1);
        System.out.println(formattedcurrentDate3);


        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a"); //"hh" uses 12 hours system, "HH" uses 24 hours system.
                                                                        //"a" is for to display "AM" or "PM"
        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);


        //How to create a specific date
        LocalDate dob1 = LocalDate.of(2012, 3, 13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY, 21);

        //How to compare two dates

        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);








    }
}
