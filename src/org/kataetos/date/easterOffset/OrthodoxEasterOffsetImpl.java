package org.kataetos.date.easterOffset;

import org.kataetos.date.OrthodoxEasterOffset;
import org.kataetos.date.YearGregorianDate;

public class OrthodoxEasterOffsetImpl implements OrthodoxEasterOffset {
	
	private Integer offset;
	
	public OrthodoxEasterOffsetImpl(Integer offset) {
		this.offset = offset;
	}

	@Override
	public YearGregorianDate withYear(Integer year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getOffset() {
		return offset;
	}

}
