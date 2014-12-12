package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

public class RepeatedEventBuilder extends EventBuilder {

  private Set<YearlessDate> dates;

  @Override
  public RepeatedEventBuilder withName(String name) {
    return (RepeatedEventBuilder) super.withName(name);
  }

  @Override
  public RepeatedEventBuilder withDescription(String description) {
    return (RepeatedEventBuilder) super.withDescription(description);
  }

  @Override
  public RepeatedEventBuilder withImage(Object image) {
    return (RepeatedEventBuilder) super.withImage(image);
  }

  @Override
  public RepeatedEventBuilder withType(EventType type) {
    return (RepeatedEventBuilder) super.withType(type);
  }

  public RepeatedEventBuilder withDates(Set<YearlessDate> dates) {
    RepeatedEventBuilder newBuilder = (RepeatedEventBuilder) copy();
    newBuilder.dates = dates;
    return newBuilder;
  }

  @Override
  protected RepeatedEventBuilder newBuilder() {
    return new RepeatedEventBuilder();
  }

  @Override
  protected void fillInExtraFields(EventBuilder builder) {
    ((RepeatedEventBuilder) builder).dates = dates;
  }

  @Override
  public Event build() {
    return new RepeatedEvent(name, description, image, type, dates);
  }

}
