/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.Pib;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author t1071801
 */
public class PibRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public PibRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<Pib> todos() {
        TypedQuery<Pib> query = manager.createQuery("from Pib", Pib.class);
        return query.getResultList();
    }

    public Pib porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
                criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));

        return (Pib) criteria.uniqueResult();
    }

    
    public void adicionar(Pib usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(Pib usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Pib.class);

        return criteria;
    }

    public void remover(Pib usuario) {
        this.manager.remove(usuario);
    }
    
}
