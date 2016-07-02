/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.repository;

import br.com.bb.intranet.supermt.governo.sbg.model.RadarDeNegociosGPMunicipios;
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
public class RadarDeNegociosGPMunicipiosRepositorio implements Serializable {

    private static final long serialVersionUID = 1L;

    private EntityManager manager;

    @Inject
    public RadarDeNegociosGPMunicipiosRepositorio(EntityManager manager) {
        this.manager = manager;
    }

    public List<RadarDeNegociosGPMunicipios> todos() {
        TypedQuery<RadarDeNegociosGPMunicipios> query = manager.createQuery("from RadarDeNegociosGPMunicipios", RadarDeNegociosGPMunicipios.class);
        return query.getResultList();
    }

    public RadarDeNegociosGPMunicipios porId(Long id) {
        return manager.find(RadarDeNegociosGPMunicipios.class, id);
    }

    public void adicionar(RadarDeNegociosGPMunicipios usuario) {
        this.manager.persist(usuario);
    }

    public void atualizar(RadarDeNegociosGPMunicipios usuario) {
        this.manager.merge(usuario);
    }

    private Criteria criarCriteria() {
        Session session = manager.unwrap(Session.class);
        Criteria criteria = session.createCriteria(RadarDeNegociosGPMunicipios.class);

        return criteria;
    }

    public void remover(RadarDeNegociosGPMunicipios usuario) {
        this.manager.remove(usuario);
    }
    
}
