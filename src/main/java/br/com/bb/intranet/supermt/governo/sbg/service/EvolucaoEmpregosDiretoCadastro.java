/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.EvolucaoEmpregosDireto;
import br.com.bb.intranet.supermt.governo.sbg.repository.EvolucaoEmpregosDiretoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class EvolucaoEmpregosDiretoCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EvolucaoEmpregosDiretoRepositorio desembolsos;

    @Transactional
    public void salvar(EvolucaoEmpregosDireto desembolso) throws NegocioException {
        if (desembolso == null) {
            throw new NegocioException("EvolucaoEmpregosDireto inválido!");
        }

        this.desembolsos.adicionar(desembolso);
    }

    @Transactional
    public void atualizar(EvolucaoEmpregosDireto desembolso) throws NegocioException {
        if (desembolso == null ) {
            throw new NegocioException("EvolucaoEmpregosDireto inválido!");
        }

        this.desembolsos.atualizar(desembolso);
    }

    public void excluir(EvolucaoEmpregosDireto desembolso) throws NegocioException {
        desembolso = this.desembolsos.porId(desembolso.getId());

        if (desembolso == null) {
            throw new NegocioException("EvolucaoEmpregosDireto não existe!");
        }

        this.desembolsos.remover(desembolso);
        
       
    }
    
}
