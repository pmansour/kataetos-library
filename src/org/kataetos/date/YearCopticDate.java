package org.kataetos.date;


public interface YearCopticDate extends YearDate {

	public Integer getDay();
	public CopticMonth getMonth();
	public Integer getYear();
	
	@Override
	public YearlessCopticDate withoutYear();
}
