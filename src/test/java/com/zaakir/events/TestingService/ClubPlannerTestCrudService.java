/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events.TestingService;

import com.zaakir.Events.services.crud.ClubPlannerCrudService;
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
import planners.ClubPlanner;

/**
 *
 * @author zaakir
 */
public class ClubPlannerTestCrudService {
     @Mock
    ClubPlannerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ClubPlannerCrudService.class);
    }
    public ClubPlannerTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void testCreate() throws Exception {
        ClubPlanner t1 = new ClubPlanner.Builder().name("Tom").build();
        ClubPlanner returnQuestion = crudService.persist(t1);
        when(crudService.persist(t1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(t1);


    }
    
    @Test
    public void testRead() throws Exception{
        
        ClubPlanner testClubPlanner = new ClubPlanner.Builder().name("Tom").build();
        ClubPlanner returnQuestion = crudService.find(testClubPlanner.getName());
        when(crudService.find(testClubPlanner.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(testClubPlanner.getName());
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        ClubPlanner testClubPlanner = new ClubPlanner.Builder().name("Tom").build();
        
       ClubPlanner returnQuestion = crudService.merge(testClubPlanner);
        when(crudService.merge(testClubPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(testClubPlanner);
        
        returnQuestion = crudService.remove(testClubPlanner);
        when(crudService.remove(testClubPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testClubPlanner);
    }
    
    @Test
    public void testDelete() throws Exception{
        
         ClubPlanner testClubPlanner = new ClubPlanner.Builder().name("Tom").build();
        ClubPlanner returnQuestion = crudService.remove(testClubPlanner);
        when(crudService.remove(testClubPlanner)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(testClubPlanner);
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