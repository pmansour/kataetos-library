package org.kataetos.date.coptic;

import org.kataetos.date.CopticMonth;
import org.kataetos.date.YearDate;
import org.kataetos.date.YearlessCopticDate;

public class YearlessCopticDateImpl implements YearlessCopticDate {

	private Integer day;
	private CopticMonth month;
	
	public YearlessCopticDateImpl(Integer day, CopticMonth month) {
		this.day = day;
		this.month = month;
	}

	@Override
	public YearDate withYear(Integer year) {
		return new YearCopticDateImpl(day, month, year);
	}

	@Override
	public Integer getDay() {
		return day;
	}

	@Override
	public CopticMonth getMonth() {
		return month;
	}

}
