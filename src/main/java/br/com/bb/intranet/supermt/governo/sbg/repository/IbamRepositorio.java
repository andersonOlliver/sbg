/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.Ibam;
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
public class IbamRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public IbamRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<Ibam> todos() {
        TypedQuery<Ibam> query = manager.createQuery("from Ibam", Ibam.class);
        return query.getResultList();
    }

    public Ibam porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));
        return (Ibam) criteria.uniqueResult();
    }

    public void adicionar(Ibam valor) {
        this.manager.persist(valor);
    }

    public void atualizar(Ibam valor) {
        this.manager.merge(valor);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Ibam.class);

        return criteria;
    }

    public void remover(Ibam valor) {
        this.manager.remove(valor);
    }

    
}
