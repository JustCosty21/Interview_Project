package com.interview.cos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public final class Events {
    private List<Event> events;

    public Events(List<Event> events) {
        this.events = events;
    }

    public void pushEvent(Event event, Date date) {
        if (this.events == null)
            return;

        if (this.events.size() == 0)
            return;

        for (Event e : events) {
            Date listEventDate = e.getDate();
            if (listEventDate.before(date)) {
                this.events.add(event);

                break;
            }
        }
    }


    public Event getEvent(long date) {
        for (Event e : this.events) {
            long listEventDateAsLong = getDateAsLong(e.getDate());
            if (listEventDateAsLong == -1)
                continue;

            if (listEventDateAsLong == date)
                return e;
        }

        return null;
    }

    private long getDateAsLong(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date d = f.parse(date.toString());

            return d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return -1;
    }


    public List<Event> getEvents() {
        events.sort((o1, o2) -> o2.getDate().compareTo(o1.getDate()));

        return events;
    }
}
