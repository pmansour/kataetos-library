package org.kataetos.date.gregorian;

import org.kataetos.date.YearCopticDate;
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

}
