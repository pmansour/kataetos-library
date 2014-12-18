package org.kataetos.date.coptic;

import org.kataetos.date.CopticMonth;
import org.kataetos.date.DayOfWeek;
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
  public DayOfWeek getDayOfWeek() {
    // TODO Auto-generated method stub
    return null;
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
  public YearCopticDate addDays(Integer numberOfDays) {
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

  @Override
  public int compareTo(YearDate other) {
    YearCopticDate otherCoptic = other.toCopticDate();

    // Compare by year, then month, then day.
    if (getYear() < otherCoptic.getYear()) {
      return -1;
    } else if (getYear() > otherCoptic.getYear()) {
      return 1;
    }
    int monthComparison = getMonth().compareTo(otherCoptic.getMonth());
    if (monthComparison < 0) {
      return -1;
    } else if (monthComparison > 0) {
      return 1;
    }
    if (getDay() < otherCoptic.getDay()) {
      return -1;
    } else if (getDay() > otherCoptic.getDay()) {
      return 1;
    }

    return 0;
  }
}
