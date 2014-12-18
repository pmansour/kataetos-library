package org.kataetos.event;

public abstract class EventBuilder {

  protected String name;
  protected String description;
  protected Object image;
  protected EventType type;

  public EventBuilder withName(String name) {
    EventBuilder newBuilder = copy();
    newBuilder.name = name;
    return newBuilder;
  }

  public EventBuilder withDescription(String description) {
    EventBuilder newBuilder = copy();
    newBuilder.description = description;
    return newBuilder;
  }

  public EventBuilder withImage(Object image) {
    EventBuilder newBuilder = copy();
    newBuilder.image = image;
    return newBuilder;
  }

  public EventBuilder withType(EventType type) {
    EventBuilder newBuilder = copy();
    newBuilder.type = type;
    return newBuilder;
  }

  protected final EventBuilder copy() {
    EventBuilder newBuilder = newBuilder();

    newBuilder.name = name;
    newBuilder.description = description;
    // TODO(pmansour): Make a deep copy of the image.
    newBuilder.image = image;
    newBuilder.type = type;

    fillInExtraFields(newBuilder);

    return newBuilder;
  }

  protected abstract EventBuilder newBuilder();

  protected abstract void fillInExtraFields(EventBuilder builder);

  public abstract Event build();

}
