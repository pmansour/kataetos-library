package org.kataetos.date.easterOffset;

import org.kataetos.date.WesternEasterOffset;
import org.kataetos.date.YearGregorianDate;

public class WesternEasterOffsetImpl implements WesternEasterOffset {
	
	private Integer offset;
	
	public WesternEasterOffsetImpl(Integer offset) {
		this.offset = offset;
	}
	
	@Override
	public Integer getOffset() {
		return offset;
	}

	@Override
	public YearGregorianDate withYear(Integer year) {
		// TODO Auto-generated method stub
		return null;
	}

}
