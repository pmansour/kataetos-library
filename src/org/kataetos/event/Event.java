package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

/**
 * Immutable abstract class to represent a (yearless) event.
 *
 * @author peter
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

    Event(String name, String description, Object image, EventType type) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
    }

}
