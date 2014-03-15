/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.SpeedCrudService;
import events.JellyTots;
import events.Speed;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author zaakir
 */
public class SpeedTestCrudService {
     @Mock
    SpeedCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SpeedCrudService.class);
    }
    public SpeedTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
    @Test
    public void testCreate() throws Exception {
        Speed t1 = new Speed.Builder().location("cticc").build();
        Speed returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        Speed testSpeed = new Speed.Builder().location("cticc").build();
        Speed returnQuestion = crudService.find(testSpeed.getLocation());
        when(crudService.find(testSpeed.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testSpeed.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Speed testSpeed = new Speed.Builder().location("cticc").build();
        
       Speed returnQuestion = crudService.merge(testSpeed);
        when(crudService.merge(testSpeed)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testSpeed);
        
        returnQuestion = crudService.remove(testSpeed);
        when(crudService.remove(testSpeed)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testSpeed);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         Speed testSpeed = new Speed.Builder().location("cticc").build();
        Speed returnQuestion = crudService.remove(testSpeed);
        when(crudService.remove(testSpeed)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testSpeed);
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