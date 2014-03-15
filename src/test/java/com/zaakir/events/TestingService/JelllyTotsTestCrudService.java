/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.JellyTotsCrudService;
import events.JellyTots;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;

/**
 *
 * @author zaakir
 */
public class JelllyTotsTestCrudService {
     @Mock
    JellyTotsCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JellyTotsCrudService.class);
    }
    public JelllyTotsTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreate() throws Exception {
        JellyTots t1 = new JellyTots.Builder().location("cticc").build();
        JellyTots returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        JellyTots testJellyTots = new JellyTots.Builder().location("cticc").build();
        JellyTots returnQuestion = crudService.find(testJellyTots.getLocation());
        when(crudService.find(testJellyTots.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testJellyTots.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        JellyTots testJellyTots = new JellyTots.Builder().location("cticc").build();
        
       JellyTots returnQuestion = crudService.merge(testJellyTots);
        when(crudService.merge(testJellyTots)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testJellyTots);
        
        returnQuestion = crudService.remove(testJellyTots);
        when(crudService.remove(testJellyTots)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testJellyTots);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         JellyTots testJellyTots = new JellyTots.Builder().location("cticc").build();
        JellyTots returnQuestion = crudService.remove(testJellyTots);
        when(crudService.remove(testJellyTots)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testJellyTots);
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