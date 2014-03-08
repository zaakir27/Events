/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.events;


import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planners.BeachPlanner;
import planners.CelebPlanner;
import planners.ClubPlanner;
import planners.HousePlanner;

/**
 *
 * @author zaakir
 */
public class PlannersTest {
    
    public static HousePlanner createhouseplanner;
    public static HousePlanner updatehouseplanner;
    
    public static ClubPlanner createclubplanner;
    public static ClubPlanner updateclubplanner;
    
     public static BeachPlanner createbeachplanner;
    public static BeachPlanner updatebeachplanner;
    
    public static CelebPlanner createceleb;
    public static CelebPlanner updateceleb;
    public PlannersTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void createhouseplanner(){
        Assert.assertEquals(createhouseplanner.getContactNum(),"696");
    }
    
    @Test
    public void createclubplanner(){
        Assert.assertEquals(createclubplanner.getContactNum(),"696");
    }
    
    @Test
    public void createbeachplanner(){
        Assert.assertEquals(createbeachplanner.getContactNum(),"696");
    }
    
    @Test 
    public void updatehouseplanner(){
        Assert.assertEquals(updatehouseplanner.getContactNum(),"4260");
        }
    
    @Test 
    public void updateclubplanner(){
        Assert.assertEquals(updateclubplanner.getContactNum(),"4260");
    }
    
    @Test 
    public void updatebeachplanner(){
        Assert.assertEquals(updatebeachplanner.getContactNum(),"4260");
    }
    
    @Test 
    public void createceleb(){
        Assert.assertEquals(createceleb.getContactNum(),"696");
    }
    
    @Test 
    public void updateceleb(){
        Assert.assertEquals(updateceleb.getContactNum(),"4260");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        createhouseplanner = new HousePlanner.Builder().name("jackie").surname("chan").num("696").build();
        updatehouseplanner = new HousePlanner.Builder().name("jackie").surname("chan").num("4260").build();
        
        createclubplanner = new ClubPlanner.Builder().name("jackie").surname("chan").num("696").build();
        updateclubplanner = new ClubPlanner.Builder().name("jackie").surname("chan").num("4260").build();
        
        createbeachplanner = new BeachPlanner.Builder().name("jackie").surname("chan").num("696").build();
        updatebeachplanner = new BeachPlanner.Builder().name("jackie").surname("chan").num("4260").build();
        
        createceleb = new CelebPlanner.Builder().name("jackie").surname("chan").num("696").build();
        updateceleb = new CelebPlanner.Builder().name("jackie").surname("chan").num("4260").build();
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