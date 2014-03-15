/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.JellyTotsCrudService;
import events.JellyTots;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class JellyTotsCrudServiceImpl implements JellyTotsCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public JellyTots find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public JellyTots persist(JellyTots entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public JellyTots merge(JellyTots entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public JellyTots remove(JellyTots entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<JellyTots> findAll() {
        return null;
    }
    
}
