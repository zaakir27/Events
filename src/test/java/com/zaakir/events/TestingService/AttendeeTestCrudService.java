/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import attendee.Attendee;
import attendee.AttendeeImpl;
import com.zaakir.Events.services.crud.AttendeeCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
/**
 *
 * @author zaakir
 */
public class AttendeeTestCrudService {
    @Mock
    AttendeeCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AttendeeCrudService.class);
    }
    
    public AttendeeTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreate() throws Exception {
        Attendee t1 = new AttendeeImpl.Builder("jack").build();
        Attendee returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        Attendee testAtt = new AttendeeImpl.Builder("jack").build();
        Attendee returnQuestion = crudService.find(testAtt.getAttendID());
        when(crudService.find(testAtt.getAttendID())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testAtt.getAttendID());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Attendee deleteAtt = new AttendeeImpl.Builder("11").build();
        
        Attendee returnQuestion = crudService.merge(deleteAtt);
        when(crudService.merge(deleteAtt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(deleteAtt);
        
        returnQuestion = crudService.remove(deleteAtt);
        when(crudService.remove(deleteAtt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteAtt);
    }
    
    @Test
    public void testDelete() throws Exception{
        
        Attendee deleteAtt = new AttendeeImpl.Builder("11").build();
        Attendee returnQuestion = crudService.remove(deleteAtt);
        when(crudService.remove(deleteAtt)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(deleteAtt);
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
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