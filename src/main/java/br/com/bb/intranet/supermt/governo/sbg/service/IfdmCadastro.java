/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.Ifdm;
import br.com.bb.intranet.supermt.governo.sbg.repository.IfdmRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class IfdmCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private IfdmRepositorio ifdms;

    @Transactional
    public void salvar(Ifdm ifdm) throws NegocioException {
        if (ifdm == null) {
            throw new NegocioException("Ifdm inválido!");
        }

        this.ifdms.adicionar(ifdm);
    }

    @Transactional
    public void atualizar(Ifdm ifdm) throws NegocioException {
        if (ifdm == null ) {
            throw new NegocioException("Ifdm inválido!");
        }

        this.ifdms.atualizar(ifdm);
    }

    public void excluir(Ifdm ifdm) throws NegocioException {
        ifdm = this.ifdms.porId(ifdm.getId());

        if (ifdm == null) {
            throw new NegocioException("Ifdm não existe!");
        }

        this.ifdms.remover(ifdm);
        
       
    }
    
}
