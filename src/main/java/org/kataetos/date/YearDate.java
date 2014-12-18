package org.kataetos.date;

public interface YearDate extends Comparable<YearDate> {

  public YearGregorianDate toGregorianDate();

  public YearCopticDate toCopticDate();

  public DayOfWeek getDayOfWeek();

  public YearlessDate withoutYear();

  public YearDate addDays(Integer numberOfDays);
}
