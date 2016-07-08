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
@Table(name = "tabelaifdm2013")
public class Ifdm implements Serializable {

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
    @Column(name = "IFDM")
    private Double ifdm;
    @Column(name = "RankingIFDMNacional")
    private Double rankingIFDMNacional;
    @Column(name = "RankingIFDMEstadual")
    private Double rankingIFDMEstadual;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Column(name = "DataFonte")
    private Integer dataFonte;

    public Ifdm() {
    }

    public Ifdm(String codigoIBGE) {
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

    public Double getIfdm() {
        return ifdm;
    }

    public void setIfdm(Double ifdm) {
        this.ifdm = ifdm;
    }

    public Double getRankingIFDMNacional() {
        return rankingIFDMNacional;
    }

    public void setRankingIFDMNacional(Double rankingIFDMNacional) {
        this.rankingIFDMNacional = rankingIFDMNacional;
    }

    public Double getRankingIFDMEstadual() {
        return rankingIFDMEstadual;
    }

    public void setRankingIFDMEstadual(Double rankingIFDMEstadual) {
        this.rankingIFDMEstadual = rankingIFDMEstadual;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public Integer getDataFonte() {
        return dataFonte;
    }

    public void setDataFonte(Integer dataFonte) {
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
        if (!(object instanceof Ifdm)) {
            return false;
        }
        Ifdm other = (Ifdm) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaifdm2013[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
