/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.ToyotaCrudService;
import events.Toyota;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class ToyotaCrudServiceImpl implements ToyotaCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Toyota find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Toyota persist(Toyota entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Toyota merge(Toyota entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Toyota remove(Toyota entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Toyota> findAll() {
        return null;
    }
    
}