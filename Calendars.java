import java.util.*;
import java.text.*;

public class Calendars { 

    public static void main(String[] args) {

        GregorianCalendar g = new GregorianCalendar();
        int day = g.get(Calendar.DATE);
        int month = g.get(Calendar.MONTH) + 1;    // month (Jan = 1, Dec = 12)
        int year = g.get(Calendar.YEAR);     // year

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check for leap year
        if (month == 2 && g.isLeapYear(year)) days[month] = 29;

        // print calendar header
        System.out.println("       " + 
            DateFormatSymbols.getInstance().getMonths()[month-1]+
            " " + year);
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        // starting day
        int d = new GregorianCalendar(year, month-1, 1)
                .get(Calendar.DAY_OF_WEEK)-1;
    
        for (int i = 0; i < d; i++)
            System.out.print("    ");
        for (int i = 1; i <= days[month]; i++) {
            if(i != day)
                System.out.printf("%3d ", i);
            else
                System.out.printf("%2d* ", i);
            if ((i + d) % 7 == 0) 
                System.out.println();
        }
        System.out.println();
    }
}