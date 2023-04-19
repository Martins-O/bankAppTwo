package exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Age {

    public static int getAge(String dob){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, formatter);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        LocalDate currentDate = LocalDate.now();
//        DayOfWeek day = DayOfWeek.valueOf(String.valueOf(currentDate));

        return Period.between(date,currentDate).getYears();

    }

    public static void main(String[] args) {
//        LocalDate date = LocalDate.parse("2022-04-15");
        String date = "15/05/2021";
        System.out.println(getAge(date));

    }
}
