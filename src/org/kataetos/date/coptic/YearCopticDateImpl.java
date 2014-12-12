package org.kataetos.date.coptic;

import org.kataetos.date.CopticMonth;
import org.kataetos.date.YearCopticDate;
import org.kataetos.date.YearDate;
import org.kataetos.date.YearGregorianDate;
import org.kataetos.date.YearlessCopticDate;

public class YearCopticDateImpl implements YearCopticDate {

  private Integer day;
  private CopticMonth month;
  private Integer year;

  public YearCopticDateImpl(Integer day, CopticMonth month, Integer year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }


  @Override
  public YearGregorianDate toGregorianDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public YearCopticDate toCopticDate() {
    return this;
  }

  @Override
  public YearlessCopticDate withoutYear() {
    return new YearlessCopticDateImpl(day, month);
  }


  @Override
  public Integer getDay() {
    return day;
  }


  @Override
  public CopticMonth getMonth() {
    return month;
  }


  @Override
  public Integer getYear() {
    return year;
  }


  @Override
  public YearDate nextDay() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof YearCopticDate)) {
      return false;
    }

    YearCopticDate otherCopticDate = (YearCopticDate) other;

    return getDay().equals(otherCopticDate.getDay())
        && getMonth().equals(otherCopticDate.getMonth())
        && getYear().equals(otherCopticDate.getYear());
  }

}
