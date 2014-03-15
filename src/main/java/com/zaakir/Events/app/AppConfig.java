/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaakir.Events.app;

import com.zaakir.Events.service.crud.Impl.AttendeeCrudServiceImpl;
import com.zaakir.Events.services.crud.AttendeeCrudService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author zaakir
 */

@Configurable
public class AppConfig {
    @Bean(name = "attendeeCrudService")
    public  AttendeeCrudService getAttendeeCrudService(){
        return new AttendeeCrudServiceImpl();
    }
}