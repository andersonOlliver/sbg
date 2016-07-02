/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.cadastro;

import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
import br.com.bb.intranet.supermt.governo.sbg.model.EvolucaoEmpregosDireto;
import br.com.bb.intranet.supermt.governo.sbg.repository.DadosGovernoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.service.EvolucaoEmpregosDiretoCadastro;
import br.com.bb.intranet.supermt.governo.sbg.service.NegocioException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author t1071801
 */
@Named
@ViewScoped
public class CadastroEvolucaoEmpregosDiretoBean  implements Serializable {

    @Inject
    private EvolucaoEmpregosDiretoCadastro cadastro;
    
    @Inject
    private DadosGovernoRepositorio dadosGovernoRepositorio;
    
    private EvolucaoEmpregosDireto dado;
    private List<DadosGoverno> dadosGoverno;
    
    public void prepararCadastro(){
        this.dado = new EvolucaoEmpregosDireto();
        this.dadosGoverno = this.dadosGovernoRepositorio.todos();
    }
    
    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {

            this.cadastro.salvar(this.dado);

            this.prepararCadastro();
            context.addMessage(null, new FacesMessage("Dados inserido salvo com sucesso!"));

        } catch (NegocioException e) {

            FacesMessage mensagem = new FacesMessage(e.getMessage());
            mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, mensagem);
        }
    }

    public EvolucaoEmpregosDireto getDado() {
        return dado;
    }

    public void setDado(EvolucaoEmpregosDireto dado) {
        this.dado = dado;
    }

    public List<DadosGoverno> getDadosGoverno() {
        return dadosGoverno;
    }
    
    
}
