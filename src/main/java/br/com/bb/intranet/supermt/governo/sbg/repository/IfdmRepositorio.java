/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.Ifdm;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class IfdmRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public IfdmRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<Ifdm> todos() {
        TypedQuery<Ifdm> query = manager.createQuery("from Ifdm", Ifdm.class);
        return query.getResultList();
    }

    public Ifdm porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));
        return (Ifdm) criteria.uniqueResult();
    }

    public void adicionar(Ifdm valor) {
        this.manager.persist(valor);
    }

    public void atualizar(Ifdm valor) {
        this.manager.merge(valor);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Ifdm.class);

        return criteria;
    }

    public void remover(Ifdm valor) {
        this.manager.remove(valor);
    }

}
