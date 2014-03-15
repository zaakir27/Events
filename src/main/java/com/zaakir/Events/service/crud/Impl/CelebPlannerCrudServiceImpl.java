/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.CelebPlannerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import planners.CelebPlanner;

/**
 *
 * @author zaakir
 */
public class CelebPlannerCrudServiceImpl implements CelebPlannerCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CelebPlanner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CelebPlanner persist(CelebPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CelebPlanner merge(CelebPlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CelebPlanner remove(CelebPlanner entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CelebPlanner> findAll() {
        return null;
    }
    
}
