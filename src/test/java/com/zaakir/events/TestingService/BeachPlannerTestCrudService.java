/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.BeachPlannerCrudService;
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
import planners.BeachPlanner;

/**
 *
 * @author zaakir
 */
public class BeachPlannerTestCrudService {
     @Mock
    BeachPlannerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BeachPlannerCrudService.class);
    }
    public BeachPlannerTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        BeachPlanner t1 = new BeachPlanner.Builder().name("Tom").build();
        BeachPlanner returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        BeachPlanner testBeachPlanner = new BeachPlanner.Builder().name("Tom").build();
        BeachPlanner returnQuestion = crudService.find(testBeachPlanner.getName());
        when(crudService.find(testBeachPlanner.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testBeachPlanner.getName());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        BeachPlanner testBeachPlanner = new BeachPlanner.Builder().name("Tom").build();
        
       BeachPlanner returnQuestion = crudService.merge(testBeachPlanner);
        when(crudService.merge(testBeachPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testBeachPlanner);
        
        returnQuestion = crudService.remove(testBeachPlanner);
        when(crudService.remove(testBeachPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testBeachPlanner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         BeachPlanner testBeachPlanner = new BeachPlanner.Builder().name("Tom").build();
        BeachPlanner returnQuestion = crudService.remove(testBeachPlanner);
        when(crudService.remove(testBeachPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testBeachPlanner);
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