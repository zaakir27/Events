/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.ChrisBrownCrudService;
import events.ChrisBrown;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class ChrisBrownCrudServiceImpl implements ChrisBrownCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ChrisBrown find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ChrisBrown persist(ChrisBrown entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChrisBrown merge(ChrisBrown entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ChrisBrown remove(ChrisBrown entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ChrisBrown> findAll() {
        return null;
    }
    
}
