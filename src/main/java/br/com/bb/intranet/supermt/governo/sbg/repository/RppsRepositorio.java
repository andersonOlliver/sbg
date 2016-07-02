/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.Rpps;
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
public class RppsRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public RppsRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<Rpps> todos() {
        TypedQuery<Rpps> query = manager.createQuery("from Rpps", Rpps.class);
        return query.getResultList();
    }

    public Rpps porId(Long id) {
        return manager.find(Rpps.class, id);
    }

    public void adicionar(Rpps usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(Rpps usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(Rpps.class);

        return criteria;
    }

    public void remover(Rpps usuario) {
        this.manager.remove(usuario);
    }
    
}
