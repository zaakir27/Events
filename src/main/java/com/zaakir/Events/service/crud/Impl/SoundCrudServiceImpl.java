/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.service.crud.Impl;

import com.zaakir.Events.services.crud.SoundCrudService;
import events.Sound;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author zaakir
 */
public class SoundCrudServiceImpl implements SoundCrudService{

     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Sound find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Sound persist(Sound entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Sound merge(Sound entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Sound remove(Sound entity) {
        return  null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Sound> findAll() {
        return null;
    }
    
}
