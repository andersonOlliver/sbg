/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutosAbril2016;
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
public class PosseDeProdutosAbril2016Repositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public PosseDeProdutosAbril2016Repositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<PosseDeProdutosAbril2016> todos() {
        TypedQuery<PosseDeProdutosAbril2016> query = manager.createQuery("from PosseDeProdutosAbril2016", PosseDeProdutosAbril2016.class);
        return query.getResultList();
    }

    public PosseDeProdutosAbril2016 porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
                criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));

        return (PosseDeProdutosAbril2016) criteria.uniqueResult();
    }

    public void adicionar(PosseDeProdutosAbril2016 usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(PosseDeProdutosAbril2016 usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(PosseDeProdutosAbril2016.class);

        return criteria;
    }

    public void remover(PosseDeProdutosAbril2016 usuario) {
        this.manager.remove(usuario);
    }
    
}
