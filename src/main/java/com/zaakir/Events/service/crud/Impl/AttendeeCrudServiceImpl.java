/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import attendee.Attendee;
import com.zaakir.Events.services.crud.AttendeeCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class AttendeeCrudServiceImpl implements AttendeeCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Attendee find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Attendee persist(Attendee entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Attendee merge(Attendee entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Attendee remove(Attendee entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Attendee> findAll() {
        return null;
    }
    
}
