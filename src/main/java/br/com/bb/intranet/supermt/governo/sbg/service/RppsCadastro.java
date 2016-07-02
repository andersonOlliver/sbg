/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.Rpps;
import br.com.bb.intranet.supermt.governo.sbg.repository.RppsRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class RppsCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private RppsRepositorio rppss;

    @Transactional
    public void salvar(Rpps rpps) throws NegocioException {
        if (rpps == null) {
            throw new NegocioException("Rpps inválido!");
        }

        this.rppss.adicionar(rpps);
    }

    @Transactional
    public void atualizar(Rpps rpps) throws NegocioException {
        if (rpps == null ) {
            throw new NegocioException("Rpps inválido!");
        }

        this.rppss.atualizar(rpps);
    }

    public void excluir(Rpps rpps) throws NegocioException {
        rpps = this.rppss.porId(rpps.getId());

        if (rpps == null) {
            throw new NegocioException("Rpps não existe!");
        }

        this.rppss.remover(rpps);
        
       
    }
    
    
}
