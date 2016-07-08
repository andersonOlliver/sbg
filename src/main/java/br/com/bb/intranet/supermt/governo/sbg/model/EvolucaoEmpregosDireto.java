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
@Table(name = "tabelaevolucaoempregosdiretos")
public class EvolucaoEmpregosDireto implements Serializable {

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
    @Column(name = "EvolEmpregdireto2011")
    private Double evolEmpregdireto2011;
    @Column(name = "EvolEmpregdireto2012")
    private Double evolEmpregdireto2012;
    @Column(name = "EvolEmpregdireto2013")
    private Double evolEmpregdireto2013;
    @Column(name = "EvolEmpregdireto2014")
    private Double evolEmpregdireto2014;
    @Column(name = "EvolEmpregdireto2015")
    private Double evolEmpregdireto2015;
    @Column(name = "EvolEmpregdireto2016")
    private Double evolEmpregdireto2016;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 50)
    @Column(name = "DataFonte")
    private String dataFonte;

    public EvolucaoEmpregosDireto() {
    }

    public EvolucaoEmpregosDireto(String codigoIBGE) {
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

    public Double getEvolEmpregdireto2011() {
        return evolEmpregdireto2011;
    }

    public void setEvolEmpregdireto2011(Double evolEmpregdireto2011) {
        this.evolEmpregdireto2011 = evolEmpregdireto2011;
    }

    public Double getEvolEmpregdireto2012() {
        return evolEmpregdireto2012;
    }

    public void setEvolEmpregdireto2012(Double evolEmpregdireto2012) {
        this.evolEmpregdireto2012 = evolEmpregdireto2012;
    }

    public Double getEvolEmpregdireto2013() {
        return evolEmpregdireto2013;
    }

    public void setEvolEmpregdireto2013(Double evolEmpregdireto2013) {
        this.evolEmpregdireto2013 = evolEmpregdireto2013;
    }

    public Double getEvolEmpregdireto2014() {
        return evolEmpregdireto2014;
    }

    public void setEvolEmpregdireto2014(Double evolEmpregdireto2014) {
        this.evolEmpregdireto2014 = evolEmpregdireto2014;
    }

    public Double getEvolEmpregdireto2015() {
        return evolEmpregdireto2015;
    }

    public void setEvolEmpregdireto2015(Double evolEmpregdireto2015) {
        this.evolEmpregdireto2015 = evolEmpregdireto2015;
    }

    public Double getEvolEmpregdireto2016() {
        return evolEmpregdireto2016;
    }

    public void setEvolEmpregdireto2016(Double evolEmpregdireto2016) {
        this.evolEmpregdireto2016 = evolEmpregdireto2016;
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
        if (!(object instanceof EvolucaoEmpregosDireto)) {
            return false;
        }
        EvolucaoEmpregosDireto other = (EvolucaoEmpregosDireto) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaevolucaoempregosdiretos[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
