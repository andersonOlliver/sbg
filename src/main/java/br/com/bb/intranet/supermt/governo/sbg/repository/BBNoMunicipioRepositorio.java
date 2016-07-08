/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.bb.intranet.supermt.governo.sbg.model.BbNoMunicipio;
import br.com.bb.intranet.supermt.governo.sbg.model.TabelaIdh;

/**
 *
 * @author t1071801
 */
public class BBNoMunicipioRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public BBNoMunicipioRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<BbNoMunicipio> todos() {
        TypedQuery<BbNoMunicipio> query = manager.createQuery("from BbNoMunicipio", BbNoMunicipio.class);
        return query.getResultList();
    }

    public BbNoMunicipio porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));
        return (BbNoMunicipio) criteria.uniqueResult();
    }

    public void adicionar(BbNoMunicipio usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(BbNoMunicipio usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(BbNoMunicipio.class);

        return criteria;
    }

    public void remover(BbNoMunicipio usuario) {
        this.manager.remove(usuario);
    }

}
