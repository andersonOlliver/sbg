/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.ContratacoesFco;
import br.com.bb.intranet.supermt.governo.sbg.repository.ContratacoesFcoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class ContratacoesFcoCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ContratacoesFcoRepositorio contratacoesFcos;

    @Transactional
    public void salvar(ContratacoesFco contratacoesFco) throws NegocioException {
        if (contratacoesFco == null) {
            throw new NegocioException("ContratacoesFco inválido!");
        }

        this.contratacoesFcos.adicionar(contratacoesFco);
    }

    @Transactional
    public void atualizar(ContratacoesFco contratacoesFco) throws NegocioException {
        if (contratacoesFco == null ) {
            throw new NegocioException("ContratacoesFco inválido!");
        }

        this.contratacoesFcos.atualizar(contratacoesFco);
    }

    public void excluir(ContratacoesFco contratacoesFco) throws NegocioException {
        contratacoesFco = this.contratacoesFcos.porId(contratacoesFco.getId());

        if (contratacoesFco == null) {
            throw new NegocioException("ContratacoesFco não existe!");
        }

        this.contratacoesFcos.remover(contratacoesFco);
        
       
    }
    
}
