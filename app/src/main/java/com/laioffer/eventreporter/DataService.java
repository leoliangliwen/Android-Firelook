package com.laioffer.eventreporter;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 20; ++i) {
            eventData.add(
                    new Event("Event" + i,  i +" W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        return eventData;
    }

    public static List<String> getEventNames() {
        List<String> eventName = new ArrayList<String>();
        for (int i = 0; i < 20; ++i) {
            eventName.add("Event" + i);
        }
        return eventName;
    }
}
