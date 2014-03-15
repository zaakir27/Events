/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.ToyotaCrudService;
import events.Toyota;
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
public class ToyotaTestCrudService {
    @Mock
    ToyotaCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ToyotaCrudService.class);
    }
    public ToyotaTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        Toyota t1 = new Toyota.Builder().location("cticc").build();
        Toyota returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        Toyota testToyota = new Toyota.Builder().location("cticc").build();
        Toyota returnQuestion = crudService.find(testToyota.getLocation());
        when(crudService.find(testToyota.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testToyota.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Toyota testToyota = new Toyota.Builder().location("cticc").build();
        
       Toyota returnQuestion = crudService.merge(testToyota);
        when(crudService.merge(testToyota)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testToyota);
        
        returnQuestion = crudService.remove(testToyota);
        when(crudService.remove(testToyota)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testToyota);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         Toyota testToyota = new Toyota.Builder().location("cticc").build();
        Toyota returnQuestion = crudService.remove(testToyota);
        when(crudService.remove(testToyota)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testToyota);
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