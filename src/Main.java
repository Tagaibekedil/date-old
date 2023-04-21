import java.time.LocalDateTime;
import java.time.temporal.WeekFields;

public class Main {
    public static void main(String[] args) {
       /* 1. Объявить LocalDate 28.09.2009 15:45:1515
        2.Найти какой это день недели.
        3. Найти какой это по счету день в году
        4.Найти номер недели в месяце
        5.Найти день недели

        6.Вывести номер месяца года
        */
        LocalDateTime localDateTime=LocalDateTime.of(2009,9,28,15,45,15,15);
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.get(WeekFields.ISO.weekOfMonth()));
        System.out.println(localDateTime.get(WeekFields.ISO.dayOfWeek()));
        System.out.println(localDateTime.getMonth().getValue());

    }
}