package org.kataetos.event;

import org.kataetos.date.YearlessDate;

public class SingleEventBuilder extends EventBuilder {

  private YearlessDate date;

  @Override
  public SingleEventBuilder withName(String name) {
    return (SingleEventBuilder) super.withName(name);
  }

  @Override
  public SingleEventBuilder withDescription(String description) {
    return (SingleEventBuilder) super.withDescription(description);
  }

  @Override
  public SingleEventBuilder withImage(Object image) {
    return (SingleEventBuilder) super.withImage(image);
  }

  @Override
  public SingleEventBuilder withType(EventType type) {
    return (SingleEventBuilder) super.withType(type);
  }

  public SingleEventBuilder withDate(YearlessDate date) {
    SingleEventBuilder newBuilder = (SingleEventBuilder) copy();
    newBuilder.date = date;
    return newBuilder;
  }

  @Override
  protected SingleEventBuilder newBuilder() {
    return new SingleEventBuilder();
  }

  @Override
  protected void fillInExtraFields(EventBuilder builder) {
    ((SingleEventBuilder) builder).date = date;
  }

  @Override
  public Event build() {
    return new SingleEvent(name, description, image, type, date);
  }

}
