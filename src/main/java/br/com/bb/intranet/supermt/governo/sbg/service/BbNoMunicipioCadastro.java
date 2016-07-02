/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.BbNoMunicipio;
import br.com.bb.intranet.supermt.governo.sbg.repository.BBNoMunicipioRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class BbNoMunicipioCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private BBNoMunicipioRepositorio bbNoMunicipios;

    @Transactional
    public void salvar(BbNoMunicipio bbNoMunicipio) throws NegocioException {
        if (bbNoMunicipio == null) {
            throw new NegocioException("BbNoMunicipio inválido!");
        }

        this.bbNoMunicipios.adicionar(bbNoMunicipio);
    }

    @Transactional
    public void atualizar(BbNoMunicipio bbNoMunicipio) throws NegocioException {
        if (bbNoMunicipio == null ) {
            throw new NegocioException("BbNoMunicipio inválido!");
        }

        this.bbNoMunicipios.atualizar(bbNoMunicipio);
    }

    public void excluir(BbNoMunicipio bbNoMunicipio) throws NegocioException {
        bbNoMunicipio = this.bbNoMunicipios.porId(bbNoMunicipio.getId());

        if (bbNoMunicipio == null) {
            throw new NegocioException("BbNoMunicipio não existe!");
        }

        this.bbNoMunicipios.remover(bbNoMunicipio);
        
       
    }
    
}
