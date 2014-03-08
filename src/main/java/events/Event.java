/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import attendee.AttendeeImpl;
import java.util.List;
import planners.Planner;

/**
 *
 * @author zaakir
 */
public interface Event {
    
    String getName ();
    String getLocation ();
    String getDate();
    int getSize();
    List<AttendeeImpl> getAttendee ();
    
    
}
