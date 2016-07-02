/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.ContratacoesFco;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;

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

    public List<ContratacoesFco> todos() {
        TypedQuery<ContratacoesFco> query = manager.createQuery("from ContratacoesFco", ContratacoesFco.class);
        return query.getResultList();
    }

    public ContratacoesFco porId(Long id) {
        return manager.find(ContratacoesFco.class, id);
    }

    public void adicionar(ContratacoesFco usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(ContratacoesFco usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(ContratacoesFco.class);

        return criteria;
    }

    public void remover(ContratacoesFco usuario) {
        this.manager.remove(usuario);
    }
    
}
