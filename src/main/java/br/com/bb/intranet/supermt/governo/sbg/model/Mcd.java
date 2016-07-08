/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 */
@Entity
@Table(name = "tabelamcd")
public class Mcd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "MCI")
    private String mci;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ANO")
    private Double ano;
    @Column(name = "MES")
    private Double mes;
    @Column(name = "MCD")
    private BigDecimal mcd;
    @Column(name = "FUNDOS")
    private BigDecimal fundos;
    @Column(name = "MCR")
    private BigDecimal mcr;
    @Column(name = "FOPAG")
    private Double fopag;
    @Column(name = "VALOR_FOPAG")
    private BigDecimal valorFopag;
    @Column(name = "FOPAG_CONTA_CORRENTE")
    private Double fopagContaCorrente;
    @Column(name = "VALOR_FOPAG_CONTA_CORRENTE")
    private BigDecimal valorFopagContaCorrente;
    @Column(name = "FOPAG_CONTRA_RECIBO")
    private Double fopagContraRecibo;
    @Column(name = "VALOR_FOPAG_CONTRA_RECIBO")
    private BigDecimal valorFopagContraRecibo;
    @Column(name = "FOPAG_DOC")
    private Double fopagDoc;
    @Column(name = "VALOR_FOPAG_DOC")
    private BigDecimal valorFopagDoc;
    @Column(name = "FOPAG_POUPANCA")
    private Double fopagPoupanca;
    @Column(name = "VALOR_FOPAG_POUPANCA")
    private BigDecimal valorFopagPoupanca;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;

    public Mcd() {
    }

    public Mcd(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMci() {
        return mci;
    }

    public void setMci(String mci) {
        this.mci = mci;
    }

    public Double getAno() {
        return ano;
    }

    public void setAno(Double ano) {
        this.ano = ano;
    }

    public Double getMes() {
        return mes;
    }

    public void setMes(Double mes) {
        this.mes = mes;
    }

    public BigDecimal getMcd() {
        return mcd;
    }

    public void setMcd(BigDecimal mcd) {
        this.mcd = mcd;
    }

    public BigDecimal getFundos() {
        return fundos;
    }

    public void setFundos(BigDecimal fundos) {
        this.fundos = fundos;
    }

    public BigDecimal getMcr() {
        return mcr;
    }

    public void setMcr(BigDecimal mcr) {
        this.mcr = mcr;
    }

    public Double getFopag() {
        return fopag;
    }

    public void setFopag(Double fopag) {
        this.fopag = fopag;
    }

    public BigDecimal getValorFopag() {
        return valorFopag;
    }

    public void setValorFopag(BigDecimal valorFopag) {
        this.valorFopag = valorFopag;
    }

    public Double getFopagContaCorrente() {
        return fopagContaCorrente;
    }

    public void setFopagContaCorrente(Double fopagContaCorrente) {
        this.fopagContaCorrente = fopagContaCorrente;
    }

    public BigDecimal getValorFopagContaCorrente() {
        return valorFopagContaCorrente;
    }

    public void setValorFopagContaCorrente(BigDecimal valorFopagContaCorrente) {
        this.valorFopagContaCorrente = valorFopagContaCorrente;
    }

    public Double getFopagContraRecibo() {
        return fopagContraRecibo;
    }

    public void setFopagContraRecibo(Double fopagContraRecibo) {
        this.fopagContraRecibo = fopagContraRecibo;
    }

    public BigDecimal getValorFopagContraRecibo() {
        return valorFopagContraRecibo;
    }

    public void setValorFopagContraRecibo(BigDecimal valorFopagContraRecibo) {
        this.valorFopagContraRecibo = valorFopagContraRecibo;
    }

    public Double getFopagDoc() {
        return fopagDoc;
    }

    public void setFopagDoc(Double fopagDoc) {
        this.fopagDoc = fopagDoc;
    }

    public BigDecimal getValorFopagDoc() {
        return valorFopagDoc;
    }

    public void setValorFopagDoc(BigDecimal valorFopagDoc) {
        this.valorFopagDoc = valorFopagDoc;
    }

    public Double getFopagPoupanca() {
        return fopagPoupanca;
    }

    public void setFopagPoupanca(Double fopagPoupanca) {
        this.fopagPoupanca = fopagPoupanca;
    }

    public BigDecimal getValorFopagPoupanca() {
        return valorFopagPoupanca;
    }

    public void setValorFopagPoupanca(BigDecimal valorFopagPoupanca) {
        this.valorFopagPoupanca = valorFopagPoupanca;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mcd)) {
            return false;
        }
        Mcd other = (Mcd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelamcd[ id=" + id + " ]";
    }
    
}
