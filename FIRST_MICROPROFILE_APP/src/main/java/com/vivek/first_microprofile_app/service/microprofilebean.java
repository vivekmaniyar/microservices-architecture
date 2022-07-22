/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.vivek.first_microprofile_app.service;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vicky
 */
@Stateless
public class microprofilebean {
    
    @PersistenceContext(unitName = "com.vivek_FIRST_MICROPROFILE_APP_war_1.0-SNAPSHOTPU")
    EntityManager em;
    
    public Collection<TblState> getAllStates(){
        return em.createNamedQuery("TblState.findAll").getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
