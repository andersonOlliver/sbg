/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 */
@Entity
@Table(name = "tabelaposseprodutos")
public class PosseDeProdutos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "IBGE")
    private String ibge;
    @Size(max = 255)
    @Column(name = "MCI")
    private String mci;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Porte")
    private Double porte;
    @Size(max = 255)
    @Column(name = "Classificacao")
    private String classificacao;
    @Size(max = 255)
    @Column(name = "AASP")
    private String aasp;
    @Column(name = "Aplicacoes")
    private Double aplicacoes;
    @Column(name = "Responsabilidades")
    private Double responsabilidades;
    @Size(max = 255)
    @Column(name = "REC")
    private String rec;
    @Size(max = 255)
    @Column(name = "DBT")
    private String dbt;
    @Size(max = 255)
    @Column(name = "CTU")
    private String ctu;
    @Size(max = 255)
    @Column(name = "CPB")
    private String cpb;
    @Size(max = 255)
    @Column(name = "CBR")
    private String cbr;
    @Size(max = 255)
    @Column(name = "OBN")
    private String obn;
    @Size(max = 255)
    @Column(name = "PAG")
    private String pag;
    @Size(max = 255)
    @Column(name = "Contracheque")
    private String contracheque;
    @Size(max = 255)
    @Column(name = "Licitacoes")
    private String licitacoes;
    @Size(max = 255)
    @Column(name = "Recad")
    private String recad;
    @Size(max = 255)
    @Column(name = "Fopag_no_BB")
    private String fopagnoBB;
    @Size(max = 255)
    @Column(name = "PasepFopag")
    private String pasepFopag;
    @Size(max = 255)
    @Column(name = "RPPS")
    private String rpps;
    @Size(max = 255)
    @Column(name = "BBCredito_Salario")
    private String bBCreditoSalario;
    @Size(max = 255)
    @Column(name = "BBCredito_Consignacao")
    private String bBCreditoConsignacao;
    @Size(max = 255)
    @Column(name = "BBCredito_13Sal")
    private String bBCredito13Sal;
    @Size(max = 255)
    @Column(name = "LimiteCredito")
    private String limiteCredito;
    @Column(name = "Limite_Estabelecido")
    private Double limiteEstabelecido;
    @Column(name = "Vencto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencto;
    @Size(max = 255)
    @Column(name = "Risco_Atribuido")
    private String riscoAtribuido;
    @Size(max = 255)
    @Column(name = "Carteira")
    private String carteira;
    @Size(max = 255)
    @Column(name = "Gecon")
    private String gecon;
    @Size(max = 50)
    @Column(name = "Fonte")
    private String fonte;
    @Size(max = 50)
    @Column(name = "DataFonte")
    private String dataFonte;

    public PosseDeProdutos() {
    }

    public PosseDeProdutos(String ibge) {
        this.ibge = ibge;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getMci() {
        return mci;
    }

    public void setMci(String mci) {
        this.mci = mci;
    }

    public Double getPorte() {
        return porte;
    }

    public void setPorte(Double porte) {
        this.porte = porte;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getAasp() {
        return aasp;
    }

    public void setAasp(String aasp) {
        this.aasp = aasp;
    }

    public Double getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(Double aplicacoes) {
        this.aplicacoes = aplicacoes;
    }

    public Double getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(Double responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getDbt() {
        return dbt;
    }

    public void setDbt(String dbt) {
        this.dbt = dbt;
    }

    public String getCtu() {
        return ctu;
    }

    public void setCtu(String ctu) {
        this.ctu = ctu;
    }

    public String getCpb() {
        return cpb;
    }

    public void setCpb(String cpb) {
        this.cpb = cpb;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getObn() {
        return obn;
    }

    public void setObn(String obn) {
        this.obn = obn;
    }

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

    public String getContracheque() {
        return contracheque;
    }

    public void setContracheque(String contracheque) {
        this.contracheque = contracheque;
    }

    public String getLicitacoes() {
        return licitacoes;
    }

    public void setLicitacoes(String licitacoes) {
        this.licitacoes = licitacoes;
    }

    public String getRecad() {
        return recad;
    }

    public void setRecad(String recad) {
        this.recad = recad;
    }

    public String getFopagnoBB() {
        return fopagnoBB;
    }

    public void setFopagnoBB(String fopagnoBB) {
        this.fopagnoBB = fopagnoBB;
    }

    public String getPasepFopag() {
        return pasepFopag;
    }

    public void setPasepFopag(String pasepFopag) {
        this.pasepFopag = pasepFopag;
    }

    public String getRpps() {
        return rpps;
    }

    public void setRpps(String rpps) {
        this.rpps = rpps;
    }

    public String getBBCreditoSalario() {
        return bBCreditoSalario;
    }

    public void setBBCreditoSalario(String bBCreditoSalario) {
        this.bBCreditoSalario = bBCreditoSalario;
    }

    public String getBBCreditoConsignacao() {
        return bBCreditoConsignacao;
    }

    public void setBBCreditoConsignacao(String bBCreditoConsignacao) {
        this.bBCreditoConsignacao = bBCreditoConsignacao;
    }

    public String getBBCredito13Sal() {
        return bBCredito13Sal;
    }

    public void setBBCredito13Sal(String bBCredito13Sal) {
        this.bBCredito13Sal = bBCredito13Sal;
    }

    public String getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Double getLimiteEstabelecido() {
        return limiteEstabelecido;
    }

    public void setLimiteEstabelecido(Double limiteEstabelecido) {
        this.limiteEstabelecido = limiteEstabelecido;
    }

    public Date getVencto() {
        return vencto;
    }

    public void setVencto(Date vencto) {
        this.vencto = vencto;
    }

    public String getRiscoAtribuido() {
        return riscoAtribuido;
    }

    public void setRiscoAtribuido(String riscoAtribuido) {
        this.riscoAtribuido = riscoAtribuido;
    }

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public String getGecon() {
        return gecon;
    }

    public void setGecon(String gecon) {
        this.gecon = gecon;
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
        hash += (ibge != null ? ibge.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosseDeProdutos)) {
            return false;
        }
        PosseDeProdutos other = (PosseDeProdutos) object;
        if ((this.ibge == null && other.ibge != null) || (this.ibge != null && !this.ibge.equals(other.ibge))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelaposseprodutos[ ibge=" + ibge + " ]";
    }
    
}
