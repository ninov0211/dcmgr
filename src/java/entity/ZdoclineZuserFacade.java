/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dinov
 */
@Stateless
public class ZdoclineZuserFacade extends AbstractFacade<ZdoclineZuser> {

    @PersistenceContext(unitName = "dcmgrPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZdoclineZuserFacade() {
        super(ZdoclineZuser.class);
    }
    
}
