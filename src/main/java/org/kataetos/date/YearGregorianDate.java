package org.kataetos.date;

public interface YearGregorianDate extends YearDate {

  public Integer getDay();

  public Integer getMonth();

  public Integer getYear();

  @Override
  public YearlessGregorianDate withoutYear();
}
