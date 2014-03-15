/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.CelebPlannerCrudService;
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
import planners.CelebPlanner;

/**
 *
 * @author zaakir
 */
public class CelebPlannerTestCrudService {
    @Mock
    CelebPlannerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CelebPlannerCrudService.class);
    }
    public CelebPlannerTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        CelebPlanner t1 = new CelebPlanner.Builder().name("Tom").build();
        CelebPlanner returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        CelebPlanner testCelebPlanner = new CelebPlanner.Builder().name("Tom").build();
        CelebPlanner returnQuestion = crudService.find(testCelebPlanner.getName());
        when(crudService.find(testCelebPlanner.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testCelebPlanner.getName());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        CelebPlanner testCelebPlanner = new CelebPlanner.Builder().name("Tom").build();
        
       CelebPlanner returnQuestion = crudService.merge(testCelebPlanner);
        when(crudService.merge(testCelebPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testCelebPlanner);
        
        returnQuestion = crudService.remove(testCelebPlanner);
        when(crudService.remove(testCelebPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testCelebPlanner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         CelebPlanner testCelebPlanner = new CelebPlanner.Builder().name("Tom").build();
        CelebPlanner returnQuestion = crudService.remove(testCelebPlanner);
        when(crudService.remove(testCelebPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testCelebPlanner);
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