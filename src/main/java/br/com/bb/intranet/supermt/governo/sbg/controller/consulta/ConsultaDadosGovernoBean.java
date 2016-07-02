/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.consulta;

import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
import br.com.bb.intranet.supermt.governo.sbg.repository.DadosGovernoRepositorio;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author t1071801
 */
@Named
@ViewScoped
public class ConsultaDadosGovernoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private DadosGovernoRepositorio repository;

    private List<DadosGoverno> dados;

    public void consultar() {
        
        this.dados = this.repository.todos();
        
    }

    public List<DadosGoverno> getDados() {
        return dados;
    }
    
    
}
