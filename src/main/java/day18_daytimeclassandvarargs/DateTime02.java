package day18_daytimeclassandvarargs;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1 : Type the code that find out how many month Ali lived.
        //Date of birth of Ali is 4th of June 1997

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 4);
        LocalDate currentDate = LocalDate.now();

        long numOfMonths = ChronoUnit.MONTHS.between(dobAli, currentDate);
        System.out.println(numOfMonths);

        //Example 2 : //Example 2: Tom was born 45 years, 8 months and 5 days after 29 October 1923.
        //        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //        //Type code to calculate the exact date of birth of Tom and Veli
        //        //Type code to check if the date of birth of Tom and Veli is the same or not.


        LocalDate dobTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);
        LocalDate dobVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobVeli);

        boolean isSame = dobTom.equals(dobVeli);
        System.out.println(isSame);

        //Example 3: Type code to find the time difference in hours between Japan time zone and Germany time zone.

        LocalDateTime tj = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime tg = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long timeDiff = ChronoUnit.HOURS.between(tg, tj);
        System.out.println(timeDiff);





    }
}
