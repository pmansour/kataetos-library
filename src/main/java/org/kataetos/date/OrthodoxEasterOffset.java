package org.kataetos.date;

public interface OrthodoxEasterOffset extends YearlessDate {

  public Integer getOffset();

  @Override
  public YearGregorianDate withYear(Integer year);

}
