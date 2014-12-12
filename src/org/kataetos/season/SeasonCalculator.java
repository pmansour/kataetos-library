package org.kataetos.season;

import java.util.HashSet;
import java.util.Set;

import org.kataetos.date.CopticMonth;
import org.kataetos.date.YearCopticDate;
import org.kataetos.date.YearDate;
import org.kataetos.date.YearGregorianDate;

public class SeasonCalculator {

	/**
	 * @example
	 * if (SeasonCalculator.seasons(date).contains(Season.*)) {
	 *   // Do something.
	 * }
	 */
	public static Set<Season> seasons(YearDate date) {
		YearGregorianDate gregorianDate = date.toGregorianDate();
		YearCopticDate copticDate = date.toCopticDate();
		
		Set<Season> seasons = new HashSet<Season>();
		
		if (isNativityFast(gregorianDate)) {
			seasons.add(Season.NativityFast);
		}
		
		if (isKiahk(copticDate)) {
			seasons.add(Season.Kiahk);
		}
		
		// TODO(pmansour): Confirm that annual is mutually exclusive with all the other seasons.
		if (seasons.size() == 0) {
			seasons.add(Season.Annual);
		}
		
		// TODO(pmansour): Etc...
		
		return seasons;
	}
	
	private static Boolean isNativityFast(YearGregorianDate date) {
		return (date.getMonth() == 1 && date.getDay() < 7) ||
				(date.getMonth() == 11 && date.getDay() >= 25) ||
				date.getMonth() == 12;
	}
	
	private static Boolean isKiahk(YearCopticDate date) {
		return date.getMonth() == CopticMonth.KIAHK;
	}
}
