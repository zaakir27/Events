/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.BMWCrudService;
import events.BMW;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static org.mockito.Mockito.when;

/**
 *
 * @author zaakir
 */
public class BMWTestCrudService {
    @Mock
    BMWCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BMWCrudService.class);
    }
    
    public BMWTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreate() throws Exception {
        BMW t1 = new BMW.Builder().location("cticc").build();
        BMW returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        BMW testBMW = new BMW.Builder().location("cticc").build();
        BMW returnQuestion = crudService.find(testBMW.getLocation());
        when(crudService.find(testBMW.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testBMW.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        BMW testBMW = new BMW.Builder().location("cticc").build();
        
        BMW returnQuestion = crudService.merge(testBMW);
        when(crudService.merge(testBMW)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testBMW);
        
        returnQuestion = crudService.remove(testBMW);
        when(crudService.remove(testBMW)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testBMW);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         BMW testBMW = new BMW.Builder().location("cticc").build();
        BMW returnQuestion = crudService.remove(testBMW);
        when(crudService.remove(testBMW)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testBMW);
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