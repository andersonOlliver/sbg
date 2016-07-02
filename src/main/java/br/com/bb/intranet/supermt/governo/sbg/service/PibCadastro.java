/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.Pib;
import br.com.bb.intranet.supermt.governo.sbg.repository.PibRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class PibCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PibRepositorio pibs;

    @Transactional
    public void salvar(Pib pib) throws NegocioException {
        if (pib == null) {
            throw new NegocioException("Pib inválido!");
        }

        this.pibs.adicionar(pib);
    }

    @Transactional
    public void atualizar(Pib pib) throws NegocioException {
        if (pib == null ) {
            throw new NegocioException("Pib inválido!");
        }

        this.pibs.atualizar(pib);
    }

    public void excluir(Pib pib) throws NegocioException {
        pib = this.pibs.porId(pib.getId());

        if (pib == null) {
            throw new NegocioException("Pib não existe!");
        }

        this.pibs.remover(pib);
        
       
    }
    
}
