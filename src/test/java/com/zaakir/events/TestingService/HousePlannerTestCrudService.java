/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.HousePlannerCrudService;
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
import planners.HousePlanner;

/**
 *
 * @author zaakir
 */
public class HousePlannerTestCrudService {
     @Mock
    HousePlannerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(HousePlannerCrudService.class);
    }
    public HousePlannerTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        HousePlanner t1 = new HousePlanner.Builder().name("Tom").build();
        HousePlanner returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        HousePlanner testHousePlanner = new HousePlanner.Builder().name("Tom").build();
        HousePlanner returnQuestion = crudService.find(testHousePlanner.getName());
        when(crudService.find(testHousePlanner.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testHousePlanner.getName());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        HousePlanner testHousePlanner = new HousePlanner.Builder().name("Tom").build();
        
       HousePlanner returnQuestion = crudService.merge(testHousePlanner);
        when(crudService.merge(testHousePlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testHousePlanner);
        
        returnQuestion = crudService.remove(testHousePlanner);
        when(crudService.remove(testHousePlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testHousePlanner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         HousePlanner testHousePlanner = new HousePlanner.Builder().name("Tom").build();
        HousePlanner returnQuestion = crudService.remove(testHousePlanner);
        when(crudService.remove(testHousePlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testHousePlanner);
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