package ru.gb.enums;

import java.time.LocalDate;

public enum Holidays {
    NONE(LocalDate.of(0, 2, 2), "Нет праздника(")
    , NEW_YEAR(LocalDate.of(0, 1,1), "С новым годом!")
    , FEBRUARY_23(LocalDate.of(0, 2,23), "С днем защитника отечества!")
    , MARCH_8(LocalDate.of(0, 3,8), "С международным женским днем!")
    , MAY_1(LocalDate.of(0, 5,1), "С днем всех трудящихся!")
    , VICTORY_DAY(LocalDate.of(0, 5,9), "С днем Победы!");

    private final LocalDate celebrationDate;
    private final String celebration;

    Holidays(LocalDate celebrationDate, String celebration) {
        this.celebrationDate = celebrationDate;
        this.celebration = celebration;
    }

    public LocalDate getCelebrationDate() {
        return celebrationDate;
    }

    public String getCelebration() {
        return celebration;
    }
}
