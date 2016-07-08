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
@Table(name = "tabelarpps")
public class Rpps implements Serializable {

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
    @Column(name = "PLMPS")
    private Double plmps;
    @Column(name = "PLBB")
    private Double plbb;
    @Column(name = "Share")
    private Double share;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 50)
    @Column(name = "DataFonte")
    private String dataFonte;

    public Rpps() {
    }

    public Rpps(String codigoIBGE) {
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

    public Double getPlmps() {
        return plmps;
    }

    public void setPlmps(Double plmps) {
        this.plmps = plmps;
    }

    public Double getPlbb() {
        return plbb;
    }

    public void setPlbb(Double plbb) {
        this.plbb = plbb;
    }

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
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
        if (!(object instanceof Rpps)) {
            return false;
        }
        Rpps other = (Rpps) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelarpps[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
