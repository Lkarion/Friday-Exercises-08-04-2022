package DayOffResolver;

import java.util.Locale;
import java.util.Scanner;

public class DayOffResolver {
    //Day-off Resolver
    // написать программу, которая при вводе с клавиатуры дня недели отвечает
    // на вопрос является ли этот день недели выходным. ( Для выходного выводит
    // it is true, для рабочего  it is false
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day:");
        String day = sc.nextLine();
        System.out.println(day + " is a day-off -> " + isDayOff(DaysOfWeek.valueOf(day.toUpperCase(Locale.ROOT))));
        sc.close();
    }

    public static boolean isDayOff (DaysOfWeek dayToCheck){
        switch (dayToCheck){
            case MONDAY: return false;
            case TUESDAY: return false;
            case WEDNESDAY: return false;
            case THURSDAY: return false;
            case FRIDAY: return false;
            case SATURDAY: return true;
            case SUNDAY: return true;
            default: return false;
        }
    }
}
