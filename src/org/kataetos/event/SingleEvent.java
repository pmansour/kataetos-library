package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

import com.google.common.collect.ImmutableSet;

public class SingleEvent extends Event {

  private YearlessDate date;

  @Override
  public Set<YearlessDate> getDates() {
    return ImmutableSet.of(date);
  }

  SingleEvent(String name, String description, Object image, EventType type, YearlessDate date) {
    super(name, description, image, type);
    this.date = date;
  }
}
