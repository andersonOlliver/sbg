/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.consulta;

import br.com.bb.intranet.supermt.governo.sbg.model.SitesPrefeituras;
import br.com.bb.intranet.supermt.governo.sbg.service.GeraRelatorio;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Olliver
 */
@Named
@ViewScoped
public class RelatorioBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private GeraRelatorio geraRelatorio;
    
    private Relatorio relatorio;
    private SitesPrefeituras infoPrefeitura;
    private String codigoIBGE;
    
    public void buscar(){
        this.relatorio = this.geraRelatorio.gerar(codigoIBGE);
    }

    public SitesPrefeituras getInfoPrefeitura() {
        return infoPrefeitura;
    }

    public void setInfoPrefeitura(SitesPrefeituras infoPrefeitura) {
        this.infoPrefeitura = infoPrefeitura;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }
    
    
    
}
