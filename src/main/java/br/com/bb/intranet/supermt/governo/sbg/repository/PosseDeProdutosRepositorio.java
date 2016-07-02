/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutos;
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
public class PosseDeProdutosRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public PosseDeProdutosRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<PosseDeProdutos> todos() {
        TypedQuery<PosseDeProdutos> query = manager.createQuery("from PosseDeProdutos", PosseDeProdutos.class);
        return query.getResultList();
    }

    public PosseDeProdutos porId(Long id) {
        return manager.find(PosseDeProdutos.class, id);
    }

    public void adicionar(PosseDeProdutos usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(PosseDeProdutos usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(PosseDeProdutos.class);

        return criteria;
    }

    public void remover(PosseDeProdutos usuario) {
        this.manager.remove(usuario);
    }
    
}
