/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.BeachPlannerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import planners.BeachPlanner;

/**
 *
 * @author zaakir
 */
public class BeachPlannerCrudServiceImpl implements BeachPlannerCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BeachPlanner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BeachPlanner persist(BeachPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BeachPlanner merge(BeachPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BeachPlanner remove(BeachPlanner entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BeachPlanner> findAll() {
        return null;
    }
    
}
