package org.kataetos.event;

import java.util.HashSet;
import java.util.Set;

import org.kataetos.date.YearlessDate;

public class ContinuousEvent extends Event {

  // The start and end dates, inclusive, of this event.
  private YearlessDate startDate, endDate;

  @Override
  public Set<YearlessDate> getDates() {
    Set<YearlessDate> dates = new HashSet<YearlessDate>();

    for (YearlessDate date = startDate; !date.equals(endDate); date = date.nextDay()) {
      dates.add(date);
    }

    return dates;
  }

  ContinuousEvent(String name, String description, Object image, EventType type,
                  YearlessDate startDate, YearlessDate endDate) {
    super(name, description, image, type);
    this.startDate = startDate;
    this.endDate = endDate;
  }

}
