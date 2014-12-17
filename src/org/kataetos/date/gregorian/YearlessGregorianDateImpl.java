package org.kataetos.date.gregorian;

import org.kataetos.date.YearGregorianDate;
import org.kataetos.date.YearlessDate;
import org.kataetos.date.YearlessGregorianDate;

public class YearlessGregorianDateImpl implements YearlessGregorianDate {

    private Integer day, month;

    public YearlessGregorianDateImpl(Integer day, Integer month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public YearGregorianDate withYear(Integer year) {
        return new YearGregorianDateImpl(day, month, year);
    }

    @Override
    public Integer getDay() {
        return day;
    }

    @Override
    public Integer getMonth() {
        return month;
    }

    @Override
    public YearlessDate nextDay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof YearlessGregorianDate)) {
            return false;
        }

        YearlessGregorianDate otherGregorianDate = (YearlessGregorianDate) other;

        return getDay().equals(otherGregorianDate.getDay())
                && getMonth().equals(otherGregorianDate.getMonth());
    }

}
