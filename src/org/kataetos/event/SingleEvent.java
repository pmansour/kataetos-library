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

  @Override
  public SingleEvent withName(String name) {
    return (SingleEvent) super.withName(name);
  }

  @Override
  public SingleEvent withDescription(String description) {
    return (SingleEvent) super.withDescription(description);
  }

  @Override
  public SingleEvent withImage(Object image) {
    return (SingleEvent) super.withImage(image);
  }

  @Override
  public SingleEvent withType(EventType type) {
    return (SingleEvent) super.withType(type);
  }

  public SingleEvent withDate(YearlessDate date) {
    SingleEvent newEvent = (SingleEvent) copy();
    newEvent.date = date;
    return newEvent;
  }

  @Override
  protected Event newEvent() {
    return new SingleEvent();
  }

  @Override
  protected void copyExtraFields(Event superclassDestination) {
    SingleEvent destination = (SingleEvent) superclassDestination;
    destination.date = date;
  }
}
