package org.kataetos.date;

/**
 * Represents a date that is tied to a particular year.
 *
 * @author pmansour
 */
public interface YearDate extends Comparable<YearDate> {

  /**
   * Convert this date to a date according to the Gregorian calendar.
   */
  public YearGregorianDate toGregorianDate();

  /**
   * Convert this date to a date according to the Coptic calendar.
   */
  public YearCopticDate toCopticDate();

  /**
   * Get the day of the week that this date falls on.
   */
  public DayOfWeek getDayOfWeek();

  /**
   * Get a date similar to this one, but without being tied to a particular year.
   */
  public YearlessDate withoutYear();

  /**
   * Create a date that is a particular offset of days after this date.
   *
   * @param numberOfDays The offset after this date. If it is negative, then the new date will be
   *                     before this date. If it is positive, it will be after. If it is zero,
   *                     then a copy of this date is returned.
   * @return Another YearDate instance.
   */
  public YearDate addDays(Integer numberOfDays);
}
