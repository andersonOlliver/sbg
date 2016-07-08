/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.Mcd;
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
 * @author Olliver
 */
public class McdRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public McdRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<Mcd> todos() {
        TypedQuery<Mcd> query = manager.createQuery("from Mcd", Mcd.class);
        return query.getResultList();
    }

    public List<Mcd> porMCI(String mci) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("mci", mci));
        return criteria.list();
    }

    public void adicionar(Mcd valor) {
        this.manager.persist(valor);
    }

    public void atualizar(Mcd valor) {
        this.manager.merge(valor);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Mcd.class);

        return criteria;
    }

    public void remover(Mcd valor) {
        this.manager.remove(valor);
    }

    
}
