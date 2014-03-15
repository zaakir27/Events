/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.AttendeeCrudService;
import com.zaakir.Events.services.crud.BMWCrudService;
import events.BMW;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class BMWCrudServiceImpl implements BMWCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BMW find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BMW persist(BMW entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BMW merge(BMW entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BMW remove(BMW entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BMW> findAll() {
        return null;
    }
    
}
