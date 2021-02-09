package com.interview.cos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * Create some dates
         */
        Date d1 = createDate("02-04-2019");
        Date d2 = createDate("02-04-2016");
        Date d3 = createDate("02-04-2018");
        Date d4 = createDate("02-04-2021");

        Event e1 = new Event("Event1", "city1", 1, d1);
        Event e2 = new Event("Event2", "city2", 2, d2);
        Event e3 = new Event("Event3", "city3", 3, d3);
        Event e4 = new Event("Event4", "city4", 4, d4);

        List<Event> events = Arrays.asList(e1, e2, e3, e4);

        Events eventsClass = new Events(events);

        /*
         * The output will be: Event4, Event1, Event3, Event2
         */
        for(Event e : eventsClass.getEvents()) {
            System.out.println(e.getEventName());
        }

        System.out.println("---------------------------------");

        Date d5 = createDate("02-06-2021");
        Event e5 = new Event("Event5", "city5", 5, d5);
        eventsClass.pushEvent(e5, d5);

        for(Event e : eventsClass.getEvents()) {
            System.out.println(e.getEventName());
        }

    }

    private static Date createDate(String dateAsString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy");
        try {
            Date date = dateFormat.parse(dateAsString);

            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
