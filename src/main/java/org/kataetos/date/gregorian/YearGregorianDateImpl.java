package org.kataetos.date.gregorian;

import org.kataetos.date.DayOfWeek;
import org.kataetos.date.YearCopticDate;
import org.kataetos.date.YearDate;
import org.kataetos.date.YearGregorianDate;
import org.kataetos.date.YearlessGregorianDate;

public class YearGregorianDateImpl implements YearGregorianDate {

  private Integer day, month, year;

  public YearGregorianDateImpl(Integer day, Integer month, Integer year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public YearGregorianDate toGregorianDate() {
    return this;
  }

  @Override
  public YearCopticDate toCopticDate() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DayOfWeek getDayOfWeek() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public YearlessGregorianDate withoutYear() {
    return new YearlessGregorianDateImpl(day, month);
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
  public Integer getYear() {
    return year;
  }

  @Override
  public YearGregorianDate addDays(Integer numberOfDays) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof YearGregorianDate)) {
      return false;
    }

    YearGregorianDate otherGregorianDate = (YearGregorianDate) other;

    return getDay().equals(otherGregorianDate.getDay())
           && getMonth().equals(otherGregorianDate.getMonth())
           && getYear().equals(otherGregorianDate.getYear());
  }

  @Override
  public int compareTo(YearDate other) {
    YearGregorianDate otherGregorian = other.toGregorianDate();

    // Compare by year, then month, then day.
    if (getYear() < otherGregorian.getYear()) {
      return -1;
    } else if (getYear() > otherGregorian.getYear()) {
      return 1;
    }
    if (getMonth() < otherGregorian.getMonth()) {
      return -1;
    } else if (getMonth() > otherGregorian.getMonth()) {
      return 1;
    }
    if (getDay() < otherGregorian.getDay()) {
      return -1;
    } else if (getDay() > otherGregorian.getDay()) {
      return 1;
    }

    return 0;
  }
}
