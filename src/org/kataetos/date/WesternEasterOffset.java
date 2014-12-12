package org.kataetos.date;


public interface WesternEasterOffset extends YearlessDate {

	public Integer getOffset();
	
	@Override
	public YearGregorianDate withYear(Integer year);

}
