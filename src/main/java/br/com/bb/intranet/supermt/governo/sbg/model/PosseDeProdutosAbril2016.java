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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Olliver
 */
@Entity
@Table(name = "tabelapossedeprodutosabril2016")
public class PosseDeProdutosAbril2016 implements Serializable {

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
    @Column(name = "MCI")
    private Double mci;
    @Size(max = 255)
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Porte")
    private Double porte;
    @Size(max = 255)
    @Column(name = "Classificacao")
    private String classificacao;
    @Size(max = 255)
    @Column(name = "ROA")
    private String roa;
    @Column(name = "FUNDEB")
    private Double fundeb;
    @Column(name = "FPM")
    private Double fpm;
    @Column(name = "Municipes")
    private Double municipes;
    @Column(name = "Servidores")
    private Double servidores;
    @Size(max = 255)
    @Column(name = "AASP")
    private String aasp;
    @Column(name = "Aplicacoes")
    private Double aplicacoes;
    @Size(max = 255)
    @Column(name = "Responsabilidades")
    private String responsabilidades;
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
    @Column(name = "LicitacoesE")
    private String licitacoesE;
    @Size(max = 255)
    @Column(name = "Recad")
    private String recad;
    @Size(max = 255)
    @Column(name = "Fopag_no_BB")
    private String fopagnoBB;
    @Size(max = 255)
    @Column(name = "Pasep_Fopag")
    private String pasepFopag;
    @Size(max = 255)
    @Column(name = "RPPS")
    private String rpps;
    @Size(max = 255)
    @Column(name = "BBCreditoSalario")
    private String bBCreditoSalario;
    @Size(max = 255)
    @Column(name = "BBCreditoConsignacao")
    private String bBCreditoConsignacao;
    @Size(max = 255)
    @Column(name = "BBCredito13Sal")
    private String bBCredito13Sal;
    @Size(max = 255)
    @Column(name = "LimitedeCredito")
    private String limitedeCredito;
    @Size(max = 255)
    @Column(name = "LimiteEstabelecido")
    private String limiteEstabelecido;
    @Column(name = "Vencto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencto;
    @Size(max = 255)
    @Column(name = "RiscoAtribuido")
    private String riscoAtribuido;
    @Column(name = "MCD")
    private Double mcd;
    @Size(max = 255)
    @Column(name = "MCR")
    private String mcr;
    @Column(name = "MC_Fundos")
    private Double mCFundos;
    @Column(name = "Mes")
    private Double mes;
    @Column(name = "Ano")
    private Double ano;
    @Size(max = 255)
    @Column(name = "Carteira")
    private String carteira;
    @Size(max = 255)
    @Column(name = "Gecon")
    private String gecon;

    public PosseDeProdutosAbril2016() {
    }

    public PosseDeProdutosAbril2016(String codigoIBGE) {
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

    public Double getMci() {
        return mci;
    }

    public void setMci(Double mci) {
        this.mci = mci;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getRoa() {
        return roa;
    }

    public void setRoa(String roa) {
        this.roa = roa;
    }

    public Double getFundeb() {
        return fundeb;
    }

    public void setFundeb(Double fundeb) {
        this.fundeb = fundeb;
    }

    public Double getFpm() {
        return fpm;
    }

    public void setFpm(Double fpm) {
        this.fpm = fpm;
    }

    public Double getMunicipes() {
        return municipes;
    }

    public void setMunicipes(Double municipes) {
        this.municipes = municipes;
    }

    public Double getServidores() {
        return servidores;
    }

    public void setServidores(Double servidores) {
        this.servidores = servidores;
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

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
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

    public String getLicitacoesE() {
        return licitacoesE;
    }

    public void setLicitacoesE(String licitacoesE) {
        this.licitacoesE = licitacoesE;
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

    public String getLimitedeCredito() {
        return limitedeCredito;
    }

    public void setLimitedeCredito(String limitedeCredito) {
        this.limitedeCredito = limitedeCredito;
    }

    public String getLimiteEstabelecido() {
        return limiteEstabelecido;
    }

    public void setLimiteEstabelecido(String limiteEstabelecido) {
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

    public Double getMcd() {
        return mcd;
    }

    public void setMcd(Double mcd) {
        this.mcd = mcd;
    }

    public String getMcr() {
        return mcr;
    }

    public void setMcr(String mcr) {
        this.mcr = mcr;
    }

    public Double getMCFundos() {
        return mCFundos;
    }

    public void setMCFundos(Double mCFundos) {
        this.mCFundos = mCFundos;
    }

    public Double getMes() {
        return mes;
    }

    public void setMes(Double mes) {
        this.mes = mes;
    }

    public Double getAno() {
        return ano;
    }

    public void setAno(Double ano) {
        this.ano = ano;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoIBGE != null ? codigoIBGE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosseDeProdutosAbril2016)) {
            return false;
        }
        PosseDeProdutosAbril2016 other = (PosseDeProdutosAbril2016) object;
        if ((this.codigoIBGE == null && other.codigoIBGE != null) || (this.codigoIBGE != null && !this.codigoIBGE.equals(other.codigoIBGE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bb.intranet.supermt.governo.superbase.entidades.Tabelapossedeprodutosabril2016[ codigoIBGE=" + codigoIBGE + " ]";
    }
    
}
