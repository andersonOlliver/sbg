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
@Table(name = "tabelaibam")
public class Ibam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CodigoIBGE")
    private String codigoIBGE;
    @Size(max = 255)
    @Column(name = "municipio")
    private String municipio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "numeroVereadores")
    private Double numeroVereadores;
    @Size(max = 255)
    @Column(name = "dataAniversario")
    private String dataAniversario;
    @Size(max = 255)
    @Column(name = "Prefeito_2012")
    private String prefeito2012;
    @Size(max = 255)
    @Column(name = "Prefeito_2008")
    private String prefeito2008;
    @Size(max = 255)
    @Column(name = "Prefeito_2004")
    private String prefeito2004;
    @Size(max = 255)
    @Column(name = "Prefeito_2000")
    private String prefeito2000;
    @Size(max = 255)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 255)
    @Column(name = "DataFonte")
    private String dataFonte;

    public Ibam() {
    }

    public Ibam(String codigoIBGE) {
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

    public Double getNumeroVereadores() {
        return numeroVereadores;
    }

    public void setNumeroVereadores(Double numeroVereadores) {
        this.numeroVereadores = numeroVereadores;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getPrefeito2012() {
        return prefeito2012;
    }

    public void setPrefeito2012(String prefeito2012) {
        this.prefeito2012 = prefeito2012;
    }

    public String getPrefeito2008() {
        return prefeito2008;
    }

    public void setPrefeito2008(String prefeito2008) {
        this.prefeito2008 = prefeito2008;
    }

    public String getPrefeito2004() {
        return prefeito2004;
    }

    public void setPrefeito2004(String prefeito2004) {
        this.prefeito2004 = prefeito2004;
    }

    public String getPrefeito2000() {
        return prefeito2000;
    }

    public void setPrefeito2000(String prefeito2000) {
        this.prefeito2000 = prefeito2000;
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
        if (!(object instanceof Ibam)) {
            return false;
        }
        Ibam other = (Ibam) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaibam[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
