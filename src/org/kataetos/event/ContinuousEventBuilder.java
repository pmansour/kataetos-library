package org.kataetos.event;

import org.kataetos.date.YearlessDate;

public class ContinuousEventBuilder extends EventBuilder {

    private YearlessDate startDate, endDate;

    @Override
    public ContinuousEventBuilder withName(String name) {
        return (ContinuousEventBuilder) super.withName(name);
    }

    @Override
    public ContinuousEventBuilder withDescription(String description) {
        return (ContinuousEventBuilder) super.withDescription(description);
    }

    @Override
    public ContinuousEventBuilder withImage(Object image) {
        return (ContinuousEventBuilder) super.withImage(image);
    }

    @Override
    public ContinuousEventBuilder withType(EventType type) {
        return (ContinuousEventBuilder) super.withType(type);
    }

    public ContinuousEventBuilder withStartDate(YearlessDate startDate) {
        ContinuousEventBuilder newBuilder = (ContinuousEventBuilder) copy();
        newBuilder.startDate = startDate;
        return newBuilder;
    }

    public ContinuousEventBuilder withEndDate(YearlessDate endDate) {
        ContinuousEventBuilder newBuilder = (ContinuousEventBuilder) copy();
        newBuilder.endDate = endDate;
        return newBuilder;
    }

    @Override
    protected ContinuousEventBuilder newBuilder() {
        return new ContinuousEventBuilder();
    }

    @Override
    protected void fillInExtraFields(EventBuilder builder) {
        ((ContinuousEventBuilder) builder).startDate = startDate;
        ((ContinuousEventBuilder) builder).endDate = endDate;
    }

    @Override
    public Event build() {
        return new ContinuousEvent(name, description, image, type, startDate, endDate);
    }

}
