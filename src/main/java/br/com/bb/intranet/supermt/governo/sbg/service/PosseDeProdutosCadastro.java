/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutos;
import br.com.bb.intranet.supermt.governo.sbg.repository.PosseDeProdutosRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.util.Transactional;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author t1071801
 */
public class PosseDeProdutosCadastro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PosseDeProdutosRepositorio posseDeProdutoss;

    @Transactional
    public void salvar(PosseDeProdutos posseDeProdutos) throws NegocioException {
        if (posseDeProdutos == null) {
            throw new NegocioException("PosseDeProdutos inválido!");
        }

        this.posseDeProdutoss.adicionar(posseDeProdutos);
    }

    @Transactional
    public void atualizar(PosseDeProdutos posseDeProdutos) throws NegocioException {
        if (posseDeProdutos == null ) {
            throw new NegocioException("PosseDeProdutos inválido!");
        }

        this.posseDeProdutoss.atualizar(posseDeProdutos);
    }

    public void excluir(PosseDeProdutos posseDeProdutos) throws NegocioException {
        posseDeProdutos = this.posseDeProdutoss.porId(posseDeProdutos.getId());

        if (posseDeProdutos == null) {
            throw new NegocioException("PosseDeProdutos não existe!");
        }

        this.posseDeProdutoss.remover(posseDeProdutos);
        
       
    }
    
}
