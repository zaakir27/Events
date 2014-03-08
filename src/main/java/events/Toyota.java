/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import attendee.AttendeeImpl;
import java.util.List;

/**
 *
 * @author zaakir
 */
public class Toyota implements Event{
     private String name;
    private String location;
    private String date;
    private int size;
    private List<AttendeeImpl> attendee ;
    
    private Toyota(){
        
    }
    
    private Toyota(Builder build){
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
            this.name = "Toyota";
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
        
        
        public Toyota build(){
            return new Toyota(this);
        }
    }
    
}
