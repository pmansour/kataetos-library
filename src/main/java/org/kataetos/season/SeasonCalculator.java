package org.kataetos.season;

import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

import org.kataetos.date.CopticMonth;
import org.kataetos.date.YearCopticDate;
import org.kataetos.date.YearDate;
import org.kataetos.date.YearGregorianDate;
import org.kataetos.date.YearlessGregorianDate;
import org.kataetos.date.calculator.CopticNewYearCalculator;
import org.kataetos.date.calculator.OrthodoxEasterCalculator;
import org.kataetos.date.coptic.YearCopticDateImpl;
import org.kataetos.date.gregorian.YearGregorianDateImpl;

/**
 * Encapsulates domain logic to calculate the season of the year, based on a given date.
 *
 * @author pmansour
 */
public class SeasonCalculator {

  /**
   * Calculate the seasons of the year for the given date.
   * @param date The date for which to calculate the seasons.
   * @return All the seasons that apply. Minimum 0 and maximum 2 seasons.
   * @example
   * if (SeasonCalculator.seasons(date).contains(Season.*)) {
   *   // Do something.
   * }
   */
  public static Set<Season> seasons(YearDate date) {
    YearGregorianDate gregorianDate = date.toGregorianDate();
    YearCopticDate copticDate = date.toCopticDate();
    YearGregorianDate orthodoxEasterDate =
        OrthodoxEasterCalculator.getEasterDate(gregorianDate.getYear());
    YearCopticDate copticNewYearDate =
        CopticNewYearCalculator.copticNewYear(gregorianDate.getYear()).toCopticDate();

    if (isInKiahk(copticDate)) {
      return ImmutableSet.of(Season.Kiahk, Season.NativityFast);
    }
    if (isInHolyFiftyDays(gregorianDate, orthodoxEasterDate)) {
      return ImmutableSet.of(Season.HolyFiftyDays);
    }
    if (isInNayrouzPeriod(copticDate, copticNewYearDate)) {
      return ImmutableSet.of(Season.Nayrouz);
    }

    if (isInNativityFast(copticDate, gregorianDate)) {
      return ImmutableSet.of(Season.NativityFast);
    }
    if (isInJonahFast(gregorianDate, orthodoxEasterDate)) {
      return ImmutableSet.of(Season.JonahFast);
    }
    if (isInLent(gregorianDate, orthodoxEasterDate)) {
      return ImmutableSet.of(Season.Lent);
    }
    if (isInApostlesFast(gregorianDate, orthodoxEasterDate)) {
      return ImmutableSet.of(Season.ApostlesFast);
    }
    if (isInStMaryFast(copticDate)) {
      return ImmutableSet.of(Season.StMaryFast);
    }

    return ImmutableSet.of();
  }

  private static Boolean isInKiahk(YearCopticDate date) {
    return date.getMonth() == CopticMonth.KIAHK;
  }
  private static Boolean isInHolyFiftyDays(YearGregorianDate date, YearGregorianDate easterDate) {
    YearGregorianDate firstDay, lastDay;

    firstDay = easterDate.addDays(1); // Easter Monday.
    lastDay = easterDate.addDays(48); // Saturday just before Pentecost.

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }
  private static Boolean isInNayrouzPeriod(YearCopticDate date, YearCopticDate copticNewYearDate) {
    YearCopticDate firstDay, lastDay;

    firstDay = copticNewYearDate.addDays(0); // Coptic New Year.
    lastDay = copticNewYearDate.addDays(15); // Day before the start of Feast of the Cross.

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }
  private static Boolean isInNativityFast(YearCopticDate copticDate, YearGregorianDate gregorianDate) {
    YearCopticDate firstDay, lastDay;

    firstDay = new YearCopticDateImpl(15, CopticMonth.HATOUR, copticDate.getYear());
    lastDay = new YearGregorianDateImpl(6, 1, gregorianDate.addDays(42).getYear()).toCopticDate();

    return copticDate.compareTo(firstDay) >= 0 && copticDate.compareTo(lastDay) <= 0;
  }
  private static Boolean isInJonahFast(YearGregorianDate date, YearGregorianDate easterDate) {
    YearGregorianDate firstDay, lastDay;

    firstDay = easterDate.addDays(-69); // Monday 2 weeks before the start of lent.
    lastDay = firstDay.addDays(2); // Wednesday 2 days after that.

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }
  private static Boolean isInLent(YearGregorianDate date, YearGregorianDate easterDate) {
    YearGregorianDate firstDay, lastDay;

    firstDay = easterDate.addDays(-55); // Monday 55 days before Easter.
    lastDay = easterDate.addDays(-9); // End of Lent Friday (just over a week before Easter).

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }
  private static Boolean isInApostlesFast(YearGregorianDate date, YearGregorianDate easterDate) {
    YearGregorianDate firstDay, lastDay;

    firstDay = easterDate.addDays(50); // Monday after Pentecost.
    lastDay = new YearGregorianDateImpl(11, 7, date.getYear()); // Day before Apostles Feast.

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }
  private static Boolean isInStMaryFast(YearCopticDate date) {
    YearCopticDate firstDay, lastDay;

    firstDay = new YearCopticDateImpl(1, CopticMonth.MESRA, date.getYear()); // Starts 1 Mesra.
    lastDay = new YearCopticDateImpl(15, CopticMonth.MESRA, date.getYear()); // Lasts 2 weeks.

    return date.compareTo(firstDay) >= 0 && date.compareTo(lastDay) <= 0;
  }

}
