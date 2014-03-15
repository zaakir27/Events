/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.SpeedCrudService;
import events.Speed;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class SpeedCrudServiceImpl implements SpeedCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Speed find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Speed persist(Speed entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Speed merge(Speed entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Speed remove(Speed entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Speed> findAll() {
        return null;
    }
    
}