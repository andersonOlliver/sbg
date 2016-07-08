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
@Table(name = "tabelaidh")
public class TabelaIdh implements Serializable {

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
    @Column(name = "IDHM1991")
    private Double idhm1991;
    @Column(name = "IDHM2000")
    private Double idhm2000;
    @Column(name = "IDHM2010")
    private Double idhm2010;
    @Column(name = "IDHMClassific2010")
    private Double iDHMClassific2010;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Column(name = "Datafonte")
    private Integer datafonte;

    public TabelaIdh() {
    }

    public TabelaIdh(String codigoIBGE) {
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

    public Double getIdhm1991() {
        return idhm1991;
    }

    public void setIdhm1991(Double idhm1991) {
        this.idhm1991 = idhm1991;
    }

    public Double getIdhm2000() {
        return idhm2000;
    }

    public void setIdhm2000(Double idhm2000) {
        this.idhm2000 = idhm2000;
    }

    public Double getIdhm2010() {
        return idhm2010;
    }

    public void setIdhm2010(Double idhm2010) {
        this.idhm2010 = idhm2010;
    }

    public Double getIDHMClassific2010() {
        return iDHMClassific2010;
    }

    public void setIDHMClassific2010(Double iDHMClassific2010) {
        this.iDHMClassific2010 = iDHMClassific2010;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public Integer getDatafonte() {
        return datafonte;
    }

    public void setDatafonte(Integer datafonte) {
        this.datafonte = datafonte;
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
        if (!(object instanceof TabelaIdh)) {
            return false;
        }
        TabelaIdh other = (TabelaIdh) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaidh[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
