/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.cadastro;

import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutos;
import br.com.bb.intranet.supermt.governo.sbg.repository.DadosGovernoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.service.NegocioException;
import br.com.bb.intranet.supermt.governo.sbg.service.PosseDeProdutosCadastro;
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
public class CadastroPosseDeProdutosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PosseDeProdutosCadastro cadastro;

    @Inject
    private DadosGovernoRepositorio dadosGovernoRepositorio;

    private PosseDeProdutos dado;
    private List<DadosGoverno> dadosGoverno;

    public void prepararCadastro() {
        this.dado = new PosseDeProdutos();
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

    public PosseDeProdutos getDado() {
        return dado;
    }

    public void setDado(PosseDeProdutos dado) {
        this.dado = dado;
    }

    public List<DadosGoverno> getDadosGoverno() {
        return dadosGoverno;
    }

}
