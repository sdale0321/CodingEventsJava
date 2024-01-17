package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>(); // map object will store integer/event pairs and the integers will take place of ID's
                    // final means that once the property (Map) is initiated, it cannot be changed - you can alter the insides, but not the concept that contains them

    // get all events
    public static Collection<Event> getAll() {
        return events.values();
    }

    // get a single event
    public static Event getById(int id) {
        return events.get(id);
    }

    // add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    // remove an event
    public static void remove(int id) {
        events.remove(id);
    }

}
// Summary : Encapsulating the behavior of event objects so no one else needs to know about the changes made internally with
//           We created this class and all of its members are static - the only public members are these methods that allow us to do
//           various things with event objects