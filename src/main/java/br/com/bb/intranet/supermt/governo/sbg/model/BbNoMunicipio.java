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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Olliver
 */
@Entity
@Table(name = "bb_no_municipio")
public class BbNoMunicipio implements Serializable {

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
    @Column(name = "FIESQtd")
    private Double fIESQtd;
    @Column(name = "FIESVol")
    private Double fIESVol;
    @Column(name = "MPOQuant")
    private Double mPOQuant;
    @Column(name = "MPOVol")
    private Double mPOVol;
    @Column(name = "AcessibilidadeQtd")
    private Double acessibilidadeQtd;
    @Column(name = "AcessibilidadeVol")
    private Double acessibilidadeVol;
    @Column(name = "CreditoaAgriculturaEmpres")
    private Double creditoaAgriculturaEmpres;
    @Column(name = "CreditoaAgriculturaFamiliar")
    private Double creditoaAgriculturaFamiliar;
    @Column(name = "CreditoBacenVolume")
    private Double creditoBacenVolume;
    @Column(name = "CreditoBacenShare")
    private Double creditoBacenShare;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 50)
    @Column(name = "DataFonte")
    private String dataFonte;

    public BbNoMunicipio() {
    }

    public BbNoMunicipio(String codigoIBGE) {
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

    public Double getFIESQtd() {
        return fIESQtd;
    }

    public void setFIESQtd(Double fIESQtd) {
        this.fIESQtd = fIESQtd;
    }

    public Double getFIESVol() {
        return fIESVol;
    }

    public void setFIESVol(Double fIESVol) {
        this.fIESVol = fIESVol;
    }

    public Double getMPOQuant() {
        return mPOQuant;
    }

    public void setMPOQuant(Double mPOQuant) {
        this.mPOQuant = mPOQuant;
    }

    public Double getMPOVol() {
        return mPOVol;
    }

    public void setMPOVol(Double mPOVol) {
        this.mPOVol = mPOVol;
    }

    public Double getAcessibilidadeQtd() {
        return acessibilidadeQtd;
    }

    public void setAcessibilidadeQtd(Double acessibilidadeQtd) {
        this.acessibilidadeQtd = acessibilidadeQtd;
    }

    public Double getAcessibilidadeVol() {
        return acessibilidadeVol;
    }

    public void setAcessibilidadeVol(Double acessibilidadeVol) {
        this.acessibilidadeVol = acessibilidadeVol;
    }

    public Double getCreditoaAgriculturaEmpres() {
        return creditoaAgriculturaEmpres;
    }

    public void setCreditoaAgriculturaEmpres(Double creditoaAgriculturaEmpres) {
        this.creditoaAgriculturaEmpres = creditoaAgriculturaEmpres;
    }

    public Double getCreditoaAgriculturaFamiliar() {
        return creditoaAgriculturaFamiliar;
    }

    public void setCreditoaAgriculturaFamiliar(Double creditoaAgriculturaFamiliar) {
        this.creditoaAgriculturaFamiliar = creditoaAgriculturaFamiliar;
    }

    public Double getCreditoBacenVolume() {
        return creditoBacenVolume;
    }

    public void setCreditoBacenVolume(Double creditoBacenVolume) {
        this.creditoBacenVolume = creditoBacenVolume;
    }

    public Double getCreditoBacenShare() {
        return creditoBacenShare;
    }

    public void setCreditoBacenShare(Double creditoBacenShare) {
        this.creditoBacenShare = creditoBacenShare;
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
        if (!(object instanceof BbNoMunicipio)) {
            return false;
        }
        BbNoMunicipio other = (BbNoMunicipio) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.BbNoMunicipio[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
