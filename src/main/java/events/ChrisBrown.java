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
public class ChrisBrown implements Event{
    
    private String name;
    private String location;
    private String date;
    private int size;
    private List<AttendeeImpl> attendee ;
    
    private ChrisBrown(){
        
    }
    
    private ChrisBrown(Builder build){
       name = build.name;
       location = build.location;
       date = build.date;
       size = build.size;
       attendee = build.attendee;
        
        
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public List<AttendeeImpl> getAttendee() {
        return attendee;
    }

    
    
    public static class Builder{
        
    private String name;
    private String location;
    private String date;
    private int size;
    private List<AttendeeImpl> attendee ;
        
        public Builder(){
            this.name = "Chris Brown";
        }
    
        public Builder location(String l){
            location = l;
            return this;
        }
        
        public Builder date(String d){
            date = d;
            return this;
        }
        
        public Builder size(int s){
            size = s;
            return this;
        }     
        
     
        public Builder alist(List<AttendeeImpl> attendee){
            attendee = this.attendee;
            return this;
        }
        
        
        public ChrisBrown build(){
            return new ChrisBrown(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 43 * hash + (this.date != null ? this.date.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChrisBrown other = (ChrisBrown) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.date == null) ? (other.date != null) : !this.date.equals(other.date)) {
            return false;
        }
        return true;
    }

    
   
    
    
}
