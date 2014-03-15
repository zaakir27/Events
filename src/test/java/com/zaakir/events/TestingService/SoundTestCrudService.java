/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.SoundCrudService;
import events.Sound;
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
public class SoundTestCrudService {
    @Mock
    SoundCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SoundCrudService.class);
    }
    public SoundTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreate() throws Exception {
        Sound t1 = new Sound.Builder().location("cticc").build();
        Sound returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        Sound testSound = new Sound.Builder().location("cticc").build();
        Sound returnQuestion = crudService.find(testSound.getLocation());
        when(crudService.find(testSound.getLocation())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testSound.getLocation());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Sound testSound = new Sound.Builder().location("cticc").build();
        
       Sound returnQuestion = crudService.merge(testSound);
        when(crudService.merge(testSound)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testSound);
        
        returnQuestion = crudService.remove(testSound);
        when(crudService.remove(testSound)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testSound);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         Sound testSound = new Sound.Builder().location("cticc").build();
        Sound returnQuestion = crudService.remove(testSound);
        when(crudService.remove(testSound)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testSound);
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