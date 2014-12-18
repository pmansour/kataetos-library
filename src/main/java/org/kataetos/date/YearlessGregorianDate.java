package org.kataetos.date;

public interface YearlessGregorianDate extends YearlessDate {
    public Integer getDay();

    public Integer getMonth();

    @Override
    public YearGregorianDate withYear(Integer year);
}
