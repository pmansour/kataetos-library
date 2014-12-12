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

  @Override
  public ContinuousEvent withName(String name) {
    return (ContinuousEvent) super.withName(name);
  }

  @Override
  public ContinuousEvent withDescription(String description) {
    return (ContinuousEvent) super.withDescription(description);
  }

  @Override
  public ContinuousEvent withImage(Object image) {
    return (ContinuousEvent) super.withImage(image);
  }

  @Override
  public ContinuousEvent withType(EventType type) {
    return (ContinuousEvent) super.withType(type);
  }

  public ContinuousEvent withStartDate(YearlessDate startDate) {
    ContinuousEvent newEvent = (ContinuousEvent) copy();
    newEvent.startDate = startDate;
    return newEvent;
  }

  public ContinuousEvent withEndDate(YearlessDate endDate) {
    ContinuousEvent newEvent = (ContinuousEvent) copy();
    newEvent.endDate = endDate;
    return newEvent;
  }

  @Override
  protected Event newEvent() {
    return new ContinuousEvent();
  }

  @Override
  protected void copyExtraFields(Event superclassDestination) {
    ContinuousEvent destination = (ContinuousEvent) superclassDestination;
    destination.startDate = startDate;
    destination.endDate = endDate;
  }

}
