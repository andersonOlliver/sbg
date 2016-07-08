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
@Table(name = "basedadosgoverno")
public class DadosGoverno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CodigoIBGE")
    private String codigoIBGE;
    @Size(max = 255)
    @Column(name = "Gerev")
    private String gerev;
    @Size(max = 255)
    @Column(name = "Prefixo")
    private String prefixo;
    @Size(max = 255)
    @Column(name = "AgenciaRelacionamento")
    private String agenciaRelacionamento;
    @Size(max = 255)
    @Column(name = "MCI")
    private String mci;
    @Size(max = 255)
    @Column(name = "CNPJ")
    private String cnpj;
    @Size(max = 255)
    @Column(name = "NOME")
    private String nome;
    @Size(max = 255)
    @Column(name = "Municipio")
    private String municipio;

    public DadosGoverno() {
    }

    public DadosGoverno(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getGerev() {
        return gerev;
    }

    public void setGerev(String gerev) {
        this.gerev = gerev;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getAgenciaRelacionamento() {
        return agenciaRelacionamento;
    }

    public void setAgenciaRelacionamento(String agenciaRelacionamento) {
        this.agenciaRelacionamento = agenciaRelacionamento;
    }

    public String getMci() {
        return mci;
    }

    public void setMci(String mci) {
        this.mci = mci;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
        if (!(object instanceof DadosGoverno)) {
            return false;
        }
        DadosGoverno other = (DadosGoverno) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Basedadosgoverno[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
