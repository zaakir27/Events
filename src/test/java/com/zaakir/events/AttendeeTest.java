/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events;

import attendee.AttendeeImpl;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author zaakir
 */
public class AttendeeTest {
    public static AttendeeImpl createattend;
    public static AttendeeImpl updateattend;
    
    public AttendeeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void createattend (){
        Assert.assertEquals(createattend.getContactNum(),"2120");
    }
    
    @Test
    public void updateattend (){
                Assert.assertEquals(updateattend.getAdmit(),5);

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        createattend = new AttendeeImpl.Builder("213").name("zaakir").surname("Arendse").contactNum("2120").admit(2).build();
        updateattend = new AttendeeImpl.Builder("213").name("zaakir").surname("Arendse").contactNum("2120").admit(5).build();

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