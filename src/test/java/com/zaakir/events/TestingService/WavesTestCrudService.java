/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.WavesCrudService;
import events.Waves;
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
public class WavesTestCrudService {
     @Mock
    WavesCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(WavesCrudService.class);
    }
    public WavesTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        Waves t1 = new Waves.Builder().location("cticc").build();
        Waves returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        Waves testWaves = new Waves.Builder().location("cticc").build();
        Waves returnQuestion = crudService.find(testWaves.getLocation());
        when(crudService.find(testWaves.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testWaves.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Waves testWaves = new Waves.Builder().location("cticc").build();
        
       Waves returnQuestion = crudService.merge(testWaves);
        when(crudService.merge(testWaves)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testWaves);
        
        returnQuestion = crudService.remove(testWaves);
        when(crudService.remove(testWaves)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testWaves);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         Waves testWaves = new Waves.Builder().location("cticc").build();
        Waves returnQuestion = crudService.remove(testWaves);
        when(crudService.remove(testWaves)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testWaves);
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