package com.interview.cos;

import java.util.Date;
import java.util.List;

public class Event implements Comparable {
    private final String eventName;
    private final String cityName;
    private final int edition;
    private final Date date;
    private final List<String> guestList;

    public Event(String eventName, String cityName, int edition, Date date, List<String> guestList) {
        this.eventName = eventName;
        this.cityName = cityName;
        this.edition = edition;
        this.date = date;
        this.guestList = guestList;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getEdition() {
        return this.edition;
    }

    public Date getDate() {
        return this.date;
    }

    @Override
    public int compareTo(Object o) {
        Event otherEvent = (Event) o;
        if (this.getEventName().equals(otherEvent.getEventName())) {
            if (this.getCityName().equals(otherEvent.getCityName())) {
                if (this.getEdition() == otherEvent.getEdition()) {
                    if (this.getDate().equals(otherEvent.getDate())) {
                        return 0;
                    }
                }
            }
        }

        return -1;
    }
}
