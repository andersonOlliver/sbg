/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.cadastro;

import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
import br.com.bb.intranet.supermt.governo.sbg.service.DadosGovernoCadastro;
import br.com.bb.intranet.supermt.governo.sbg.service.NegocioException;
import java.io.Serializable;
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
public class CadastroDadosGovernoBean implements Serializable {

    @Inject
    private DadosGovernoCadastro cadastro;

    private DadosGoverno dado;

    public void prepararCadastro() {
        this.dado = new DadosGoverno();
    }

    public void salvar() {
        FacesContext context = FacesContext.getCurrentInstance();

        try {

            this.cadastro.salvar(this.dado);

            this.prepararCadastro();
            context.addMessage(null, new FacesMessage("DadosGoverno salvo com sucesso!"));

        } catch (NegocioException e) {

            FacesMessage mensagem = new FacesMessage(e.getMessage());
            mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, mensagem);
        }
    }

    public DadosGoverno getDadosGoverno() {
        return dado;
    }

    public void setDadosGoverno(DadosGoverno dado) {
        this.dado = dado;
    }
    
}
