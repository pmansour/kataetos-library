package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

import com.google.common.collect.ImmutableSet;

public class RepeatedEvent extends Event {

  private Set<YearlessDate> dates;

  @Override
  public Set<YearlessDate> getDates() {
    return dates;
  }

  @Override
  public RepeatedEvent withName(String name) {
    return (RepeatedEvent) super.withName(name);
  }

  @Override
  public RepeatedEvent withDescription(String description) {
    return (RepeatedEvent) super.withDescription(description);
  }

  @Override
  public RepeatedEvent withImage(Object image) {
    return (RepeatedEvent) super.withImage(image);
  }

  @Override
  public RepeatedEvent withType(EventType type) {
    return (RepeatedEvent) super.withType(type);
  }

  public RepeatedEvent withDates(Set<YearlessDate> dates) {
    RepeatedEvent newEvent = (RepeatedEvent) copy();
    newEvent.dates = ImmutableSet.copyOf(dates);
    return newEvent;
  }

  @Override
  protected void copyExtraFields(Event superclassDestination) {
    RepeatedEvent destination = (RepeatedEvent) superclassDestination;
    destination.dates = ImmutableSet.copyOf(dates);
  }

  @Override
  protected Event newEvent() {
    return new RepeatedEvent();
  }

}
