/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.SitesPrefeituras;
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
public class SitesPrefeiturasRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public SitesPrefeiturasRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<SitesPrefeituras> todos() {
        TypedQuery<SitesPrefeituras> query = manager.createQuery("from SitesPrefeituras", SitesPrefeituras.class);
        return query.getResultList();
    }

    public SitesPrefeituras porCodigoIBGE(String codigoIBGE) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("codigoIBGE", codigoIBGE));
        return (SitesPrefeituras) criteria.uniqueResult();
    }

    public SitesPrefeituras porMunicipio(String municipio) {
        Criteria criteria = criarCriteria();
        criteria.add(Restrictions.eq("municipio", municipio));
        return (SitesPrefeituras) criteria.uniqueResult();
    }

    public List<String> prefeiturasQueContem(String nome) {

        TypedQuery<String> query = manager.createQuery(
                "select distinct municipio from SitesPrefeituras "
                + " where municipio like :municipio", String.class);
        query.setParameter("municipio", "%" + nome + "%");
        return query.getResultList();

    }

    public void adicionar(SitesPrefeituras usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(SitesPrefeituras usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(SitesPrefeituras.class);

        return criteria;
    }

    public void remover(SitesPrefeituras usuario) {
        this.manager.remove(usuario);
    }
}
