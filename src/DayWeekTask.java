package UdemyTasks;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* In what years between 2015 and 2130 will the 25th of December be a Sunday ?
* Using any standard date handling libraries of your programming language; compare
* the dates calculated with the output of other languages to discover any anomalies
* in the handling of dates which may be due to, for example, overflow in types used
* to represent dates/times similar to y2k type problems.
*/
public class DayWeek {
    public static void main(String[] args) {
        for (int i = 2015; i <= 2030; i++) {
            Calendar calendar = new GregorianCalendar(i, Calendar.DECEMBER, 25);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(calendar.getTime());
            }
        }
    }
}
