package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

public class RepeatedEvent extends Event {

  private Set<YearlessDate> dates;

  @Override
  public Set<YearlessDate> getDates() {
    return dates;
  }

  RepeatedEvent(String name, String description, Object image, EventType type,
                Set<YearlessDate> dates) {
    super(name, description, image, type);
    this.dates = dates;
  }

}
