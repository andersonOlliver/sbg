/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 */
@Entity
@Table(name = "tabelaradardenegociosgovernoperfilmunic")
public class RadarDeNegociosGPMunicipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CodigoIBGE")
    private String codigoIBGE;
    @Size(max = 255)
    @Column(name = "Municipio")
    private String municipio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ROAValor")
    private Double rOAValor;
    @Size(max = 255)
    @Column(name = "ROARankBrasil")
    private String rOARankBrasil;
    @Size(max = 255)
    @Column(name = "ROARankUF")
    private String rOARankUF;
    @Column(name = "Populacao")
    private Double populacao;
    @Column(name = "Servidores")
    private Double servidores;
    @Column(name = "RepassesFUNDEB")
    private Double repassesFUNDEB;
    @Column(name = "RepassesFPM")
    private Double repassesFPM;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 50)
    @Column(name = "DataFonte")
    private String dataFonte;

    public RadarDeNegociosGPMunicipios() {
    }

    public RadarDeNegociosGPMunicipios(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Double getROAValor() {
        return rOAValor;
    }

    public void setROAValor(Double rOAValor) {
        this.rOAValor = rOAValor;
    }

    public String getROARankBrasil() {
        return rOARankBrasil;
    }

    public void setROARankBrasil(String rOARankBrasil) {
        this.rOARankBrasil = rOARankBrasil;
    }

    public String getROARankUF() {
        return rOARankUF;
    }

    public void setROARankUF(String rOARankUF) {
        this.rOARankUF = rOARankUF;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public Double getServidores() {
        return servidores;
    }

    public void setServidores(Double servidores) {
        this.servidores = servidores;
    }

    public Double getRepassesFUNDEB() {
        return repassesFUNDEB;
    }

    public void setRepassesFUNDEB(Double repassesFUNDEB) {
        this.repassesFUNDEB = repassesFUNDEB;
    }

    public Double getRepassesFPM() {
        return repassesFPM;
    }

    public void setRepassesFPM(Double repassesFPM) {
        this.repassesFPM = repassesFPM;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getDataFonte() {
        return dataFonte;
    }

    public void setDataFonte(String dataFonte) {
        this.dataFonte = dataFonte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoIBGE != null ? codigoIBGE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RadarDeNegociosGPMunicipios)) {
            return false;
        }
        RadarDeNegociosGPMunicipios other = (RadarDeNegociosGPMunicipios) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaradardenegociosgovernoperfilmunic[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
