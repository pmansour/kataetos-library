package org.kataetos.calendar;

import org.kataetos.event.Event;

public interface CalendarBuilder {

    public CalendarBuilder withEvents(Event... events);

    public CalendarBuilder withTheme(Theme theme);

    public CalendarBuilder withConfiguration(Configuration config);

    public Calendar build(Integer gregorianYear);

}
