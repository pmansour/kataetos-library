package org.kataetos.date;

public interface YearDate {

  public YearGregorianDate toGregorianDate();

  public YearCopticDate toCopticDate();

  public YearlessDate withoutYear();

  public YearDate nextDay();
}
