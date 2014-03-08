/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events;

import attendee.AttendeeImpl;
import events.BMW;
import events.ChrisBrown;
import events.JellyTots;
import events.Sound;
import events.Speed;
import events.Toyota;
import events.Waves;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planners.ClubPlanner;
import planners.Planner;

/**
 *
 * @author zaakir
 */
public class EventsTest {
    
    public static ChrisBrown createcb;
    public static ChrisBrown updatecb;
    
    public static Waves createw;
    public static Waves updatew;
    
    public static BMW createbmw;
    public static BMW updatebmw;
    
    public static JellyTots createtots;
    public static JellyTots updatetots;
    
    public static Speed createspeed;
    public static Speed updatespeed;
    
    public static Sound createsound;
    public static Sound updatesound;
    
    public static Toyota createtoy;
    public static Toyota updatetoy;
    
    
    
    
    
    
    public static AttendeeImpl attendee;
    
    public EventsTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void createcb(){
        Assert.assertEquals(createcb.getLocation(),"galaxy");
    }
    
    @Test
    public void updatecb(){
        Assert.assertEquals(updatecb.getLocation(),"universe");
    }
    
    @Test
    public void createw(){
        Assert.assertEquals(createw.getLocation(),"galaxy");
    }
    
    @Test
    public void updatew(){
        Assert.assertEquals(updatew.getLocation(),"universe");
    }
    
    @Test
    public void createbmw(){
        Assert.assertEquals(createbmw.getLocation(),"galaxy");
    }
    
    @Test
    public void updatebmw(){
        Assert.assertEquals(updatebmw.getLocation(),"universe");
    }
    
    @Test
    public void createtots(){
        Assert.assertEquals(createtots.getLocation(),"galaxy");
    }
    
    @Test
    public void updatetots(){
        Assert.assertEquals(updatetots.getLocation(),"universe");
    }
    
    @Test
    public void createspeed(){
        Assert.assertEquals(createspeed.getLocation(),"galaxy");
    }
    
    @Test
    public void updatespeed(){
        Assert.assertEquals(updatespeed.getLocation(),"universe");
    }
    
    @Test
    public void createsound(){
        Assert.assertEquals(createsound.getLocation(),"galaxy");
    }
    
    @Test
    public void updatesound(){
        Assert.assertEquals(updatesound.getLocation(),"universe");
    }
    
    @Test
    public void createtoy(){
        Assert.assertEquals(createtoy.getLocation(),"galaxy");
    }
    
    @Test
    public void updatetoy(){
        Assert.assertEquals(updatetoy.getLocation(),"universe");
    }
    
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        List <AttendeeImpl> list = new ArrayList <AttendeeImpl>();
      
     
        attendee = new AttendeeImpl.Builder("023").build();
        list.add(attendee);
        
        createcb = new ChrisBrown.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        updatecb = new ChrisBrown.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        createw = new Waves.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        updatew = new Waves.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        createbmw = new  BMW.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        updatebmw = new BMW.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        createtots = new  JellyTots.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        updatetots = new JellyTots.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        createspeed = new  Speed.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        updatespeed = new Speed.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        createsound  = new  Sound.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        
        updatesound = new Sound.Builder().location("universe").date("5-jan").size(50).alist(list).build();
                
        createtoy  = new  Toyota.Builder().location("galaxy").date("5-jan").size(50).alist(list).build();
        
        updatetoy = new Toyota.Builder().location("universe").date("5-jan").size(50).alist(list).build();
        
        
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}