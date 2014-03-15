/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.ClubPlannerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import planners.ClubPlanner;

/**
 *
 * @author zaakir
 */
public class ClubPlannerCrudServiceImpl implements ClubPlannerCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ClubPlanner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ClubPlanner persist(ClubPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ClubPlanner merge(ClubPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ClubPlanner remove(ClubPlanner entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ClubPlanner> findAll() {
        return null;
    }
    
}
