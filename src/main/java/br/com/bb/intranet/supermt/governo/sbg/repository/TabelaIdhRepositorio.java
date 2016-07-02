/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.TabelaIdh;
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
public class TabelaIdhRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public TabelaIdhRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<TabelaIdh> todos() {
        TypedQuery<TabelaIdh> query = manager.createQuery("from TabelaIdh", TabelaIdh.class);
        return query.getResultList();
    }

    public TabelaIdh porId(Long id) {
        return manager.find(TabelaIdh.class, id);
    }

    public void adicionar(TabelaIdh usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(TabelaIdh usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(TabelaIdh.class);

        return criteria;
    }

    public void remover(TabelaIdh usuario) {
        this.manager.remove(usuario);
    }
    
}
