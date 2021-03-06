/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
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
public class DadosGovernoRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public DadosGovernoRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<DadosGoverno> todos() {
        TypedQuery<DadosGoverno> query = manager.createQuery("from DadosGoverno", DadosGoverno.class);
        return query.getResultList();
    }

    public DadosGoverno porCodigoIBGE(String codigoIBGE){
        Criteria criteria = criarCriteria();
        
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));
        
        return (DadosGoverno) criteria.uniqueResult();
    }

    public void adicionar(DadosGoverno valor) {
        this.manager.persist(valor);
    }

    public void atualizar(DadosGoverno valor) {
        this.manager.merge(valor);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(DadosGoverno.class);

        return criteria;
    }

    public void remover(DadosGoverno valor) {
        this.manager.remove(valor);
    }
    
}
