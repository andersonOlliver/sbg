/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.TabelaIdh;
import br.com.bb.intranet.supermt.governo.sbg.repository.TabelaIdhRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class TabelaIdhCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private TabelaIdhRepositorio tabelaIdhs;

    @Transactional
    public void salvar(TabelaIdh tabelaIdh) throws NegocioException {
        if (tabelaIdh == null) {
            throw new NegocioException("TabelaIdh inválido!");
        }

        this.tabelaIdhs.adicionar(tabelaIdh);
    }

    @Transactional
    public void atualizar(TabelaIdh tabelaIdh) throws NegocioException {
        if (tabelaIdh == null ) {
            throw new NegocioException("TabelaIdh inválido!");
        }

        this.tabelaIdhs.atualizar(tabelaIdh);
    }

    public void excluir(TabelaIdh tabelaIdh) throws NegocioException {
        tabelaIdh = this.tabelaIdhs.porId(tabelaIdh.getId());

        if (tabelaIdh == null) {
            throw new NegocioException("TabelaIdh não existe!");
        }

        this.tabelaIdhs.remover(tabelaIdh);
        
       
    }
    
}
