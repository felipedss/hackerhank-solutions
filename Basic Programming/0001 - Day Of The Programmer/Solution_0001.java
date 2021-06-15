import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution_0001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String result = dayOfProgrammer(n);
        System.out.println(result);
    }

    static String dayOfProgrammer(int year) {
        LocalDate date;
        boolean leapYear = year % 4 == 0;

        if (year > 1918) {
            leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 4);
        }

        if (leapYear) {
            date = LocalDate.of(year, Month.SEPTEMBER, 12);
        } else {
            date = LocalDate.of(year, Month.SEPTEMBER, 13);
        }
        if (year == 1918) date = LocalDate.of(year, Month.SEPTEMBER, 26);
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

}