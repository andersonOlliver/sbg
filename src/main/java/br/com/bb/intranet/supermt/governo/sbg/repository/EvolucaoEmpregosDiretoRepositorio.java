/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.EvolucaoEmpregosDireto;
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
public class EvolucaoEmpregosDiretoRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public EvolucaoEmpregosDiretoRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<EvolucaoEmpregosDireto> todos() {
        TypedQuery<EvolucaoEmpregosDireto> query = manager.createQuery("from EvolucaoEmpregosDireto", EvolucaoEmpregosDireto.class);
        return query.getResultList();
    }

    public EvolucaoEmpregosDireto porId(Long id) {
        return manager.find(EvolucaoEmpregosDireto.class, id);
    }

    public void adicionar(EvolucaoEmpregosDireto usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(EvolucaoEmpregosDireto usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(EvolucaoEmpregosDireto.class);

        return criteria;
    }

    public void remover(EvolucaoEmpregosDireto usuario) {
        this.manager.remove(usuario);
    }
    
}
