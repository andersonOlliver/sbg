/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.consulta;

import br.com.bb.intranet.supermt.governo.sbg.model.SitesPrefeituras;
import br.com.bb.intranet.supermt.governo.sbg.repository.SitesPrefeiturasRepositorio;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Olliver
 */
@Named
@ViewScoped
public class InicioBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private SitesPrefeiturasRepositorio repositorio;

    private List<SitesPrefeituras> prefeituras;
    private SitesPrefeituras prefeitura;
    private String nomePrefeitura;

    public void consultar() {
        this.prefeitura = new SitesPrefeituras();
        this.prefeituras = this.repositorio.todos();
    }

    public List<String> pesquisarMunicipio(String nome) {
        return this.repositorio.prefeiturasQueContem(nome);
    }

    public void direcionar(String municipio) {
        this.prefeitura = this.repositorio.porMunicipio(municipio);
        if (prefeitura == null) {
            this.addErrorMessage("Prefeitura não existe em nossos registros!", "Contate o Administrador do Sistema!");
        } else {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/governo/sbg/relatorio.super?codigo-ibge=" + prefeitura.getCodigoIBGE());
            } catch (IOException ex) {
                System.out.println("Erro ao redirecionar!");
            }
        }
    }

    void addErrorMessage(String textoMensagem, String detalhe) {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage mensagem = new FacesMessage(textoMensagem, detalhe);
        mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
        context.addMessage(null, mensagem);
    }

    public List<SitesPrefeituras> getPrefeituras() {
        return prefeituras;
    }

    public SitesPrefeituras getPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(SitesPrefeituras prefeitura) {
        this.prefeitura = prefeitura;
    }

    public String getNomePrefeitura() {
        return nomePrefeitura;
    }

    public void setNomePrefeitura(String nomePrefeitura) {
        this.nomePrefeitura = nomePrefeitura;
    }

}
