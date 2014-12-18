package org.kataetos.date;

/**
 * Represents a [description of a] date not tied to a particular year.
 *
 * @author pmansour
 */
public interface YearlessDate {

  /**
   * Make this date into a YearDate by giving a year on which it occurs.
   *
   * @param year The year on which this date occurs. Exact definition of year depends on the type
   *             of YearlessDate.
   * @return A YearDate of the same type as this YearlessDate, but tied to the given year.
   */
  public YearDate withYear(Integer year);

}
