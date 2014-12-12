package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

/**
 * Immutable abstract class to represent a (yearless) event.
 * 
 * @author peter
 * 
 */
public abstract class Event {

  private String name;
  private String description;
  // TODO(pmansour): Work out the best representation for images, that would work in both Java SE
  // and Android.
  private Object image;
  private EventType type;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Object getImage() {
    return image;
  }

  public EventType getType() {
    return type;
  }

  public abstract Set<YearlessDate> getDates();

  public Event withName(String name) {
    Event newEvent = copy();
    newEvent.name = name;
    return newEvent;
  }

  public Event withDescription(String description) {
    Event newEvent = copy();
    newEvent.description = description;
    return newEvent;
  }

  public Event withImage(Object image) {
    Event newEvent = copy();
    newEvent.image = image;
    return newEvent;
  }

  public Event withType(EventType type) {
    Event newEvent = copy();
    newEvent.type = type;
    return newEvent;
  }

  /**
   * Just create a new instance of whatever subclass this is.
   */
  protected abstract Event newEvent();

  /**
   * Copy whatever fields exist in a subclass to the given object.
   */
  protected abstract void copyExtraFields(Event destination);

  /**
   * Subclasses should override this, use the superclass method, and copy whatever other fields they
   * have.
   */
  protected final Event copy() {
    Event copy = newEvent();

    copy.name = name;
    copy.description = description;
    // TODO(pmansour): This needs to be a deep copy.
    copy.image = image;
    copy.type = type;

    copyExtraFields(copy);

    return copy;
  }

}
