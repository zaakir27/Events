/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.HousePlannerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import planners.HousePlanner;

/**
 *
 * @author zaakir
 */
public class HousePlannerCrudServiceImpl implements HousePlannerCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public HousePlanner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public HousePlanner persist(HousePlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public HousePlanner merge(HousePlanner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public HousePlanner remove(HousePlanner entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<HousePlanner> findAll() {
        return null;
    }
    
}

