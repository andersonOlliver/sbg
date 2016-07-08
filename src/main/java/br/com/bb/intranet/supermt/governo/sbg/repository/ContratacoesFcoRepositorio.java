/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.ContratacoesFCO;
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
public class ContratacoesFcoRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public ContratacoesFcoRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<ContratacoesFCO> todos() {
        TypedQuery<ContratacoesFCO> query = manager.createQuery("from ContratacoesFCO", ContratacoesFCO.class);
        return query.getResultList();
    }

    public ContratacoesFCO porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));

        return (ContratacoesFCO) criteria.uniqueResult();
    }

    public void adicionar(ContratacoesFCO valor) {
        this.manager.persist(valor);
    }

    public void atualizar(ContratacoesFCO valor) {
        this.manager.merge(valor);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(ContratacoesFCO.class);

        return criteria;
    }

    public void remover(ContratacoesFCO valor) {
        this.manager.remove(valor);
    }

}
