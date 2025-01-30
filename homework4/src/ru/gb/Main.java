package ru.gb;

import java.time.LocalDate;

import ru.gb.enums.Genders;
import ru.gb.enums.Holidays;

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Vasily", LocalDate.of(2000, 1, 1), 50000, Genders.MALE);
        Employee empl2 = new Employee("Sergey", LocalDate.of(1999, 12, 11), 60000, Genders.MALE);
        Employee empl3 = new Employee("Andrey", LocalDate.of(1989, 10, 11), 80000, Genders.MALE);
        Employee empl4 = new Employee("Vika", LocalDate.of(2002, 5, 8), 35000, Genders.FEMALE);
        Boss boss1 = new Boss("Kirill", LocalDate.of(1985, 5, 1), 180000, Genders.MALE);

        Employee[] employs = {empl1, empl2, empl3, boss1, empl4};

        celebrateEmploys(employs);
    }

    static void celebrateEmploys(Employee[] employs) {
        Holidays holiday = getNowDateHoliday();
        if (!(holiday.equals(Holidays.NONE))) {
            for (Employee employee : employs) {
                System.out.println(employee.getName() + " ," + holiday.getCelebration());
            }
        }
    }

    static Holidays getNowDateHoliday() {
        LocalDate nowDate = LocalDate.now();
        Holidays result = Holidays.NONE;
        for (Holidays holiday : Holidays.values()) {
            if (compareDateWithoutYear(nowDate, holiday.getCelebrationDate())) {
                result = holiday;
            }
        }
        return result;
    }

    static boolean compareDateWithoutYear(LocalDate date1, LocalDate date2) {
        return date1.getDayOfMonth() == date2.getDayOfMonth() && date1.getMonth() == date2.getMonth();
    }
}