/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.ChrisBrownCrudService;
import events.ChrisBrown;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static org.mockito.Mockito.when;
import org.testng.annotations.Test;


/**
 *
 * @author zaakir
 */
public class ChrisBrownTestCrudService {
    @Mock
    ChrisBrownCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ChrisBrownCrudService.class);
    }
    
    public ChrisBrownTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
    @Test
    public void testCreate() throws Exception {
        ChrisBrown t1 = new ChrisBrown.Builder().location("cticc").build();
        ChrisBrown returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        ChrisBrown testChrisBrown = new ChrisBrown.Builder().location("cticc").build();
        ChrisBrown returnQuestion = crudService.find(testChrisBrown.getLocation());
        when(crudService.find(testChrisBrown.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testChrisBrown.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        ChrisBrown testChrisBrown = new ChrisBrown.Builder().location("cticc").build();
        
        ChrisBrown returnQuestion = crudService.merge(testChrisBrown);
        when(crudService.merge(testChrisBrown)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testChrisBrown);
        
        returnQuestion = crudService.remove(testChrisBrown);
        when(crudService.remove(testChrisBrown)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testChrisBrown);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         ChrisBrown testChrisBrown = new ChrisBrown.Builder().location("cticc").build();
        ChrisBrown returnQuestion = crudService.remove(testChrisBrown);
        when(crudService.remove(testChrisBrown)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testChrisBrown);
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