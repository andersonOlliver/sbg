/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.consulta;

import br.com.bb.intranet.supermt.governo.sbg.model.EvolucaoEmpregosDireto;
import br.com.bb.intranet.supermt.governo.sbg.repository.EvolucaoEmpregosDiretoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.service.EvolucaoEmpregosDiretoCadastro;
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
public class ConsultaEvolucaoEmpregosDiretoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EvolucaoEmpregosDiretoRepositorio repository;
    
    private List<EvolucaoEmpregosDireto> dados;

    public void consultar(){
        this.dados = this.repository.todos();
    }
    public List<EvolucaoEmpregosDireto> getDados() {
        return dados;
    }
    
    
    
    
}
