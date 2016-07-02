package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = " posse_de_produtos")
public class PosseDeProdutos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "Porte")
    private BigDecimal porte;

    @Size(max = 255)
    @Column
    private String classificacao;

    @Size(max = 255)
    @Column(name = "ROA")
    private String roa;

    @Column(name = "FUNDEB", precision = 20, scale = 2)
    private BigDecimal fundeb;

    @Column(name = "FPM", precision = 20, scale = 2)
    private BigDecimal fpm;

    @Column(precision = 20, scale = 2)
    private BigDecimal municipes;

    @Column(name = "Servidores", precision = 20, scale = 2)
    private BigDecimal servidores;

    @Size(max = 255)
    @Column(name = "AASP", precision = 20, scale = 2)
    private String aasp;

    @Column(precision = 20, scale = 2)
    private BigDecimal aplicacoes;

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
    @Column
    private String licitacoese;

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
    @Column
    private String bBCreditoSalario;

    @Size(max = 255)
    @Column(name="bb_credito_consignacao")
    private String bBCreditoConsignacao;

    @Size(max = 255)
    @Column(name="bb_credito_decimo_terceiro")
    private String bBCreditoDecimoTerceiroSalario;

    @Size(max = 255)
    @Column
    private String limitedeCredito;

    @Size(max = 255)
    @Column(name = "Limite_Estabelecido")
    private String limiteEstabelecido;

    @Size(max = 255)
    @Column(name = "Risco_Atribuido")
    private String riscoAtribuido;

    @Column(name = "MCD", precision = 20, scale = 2)
    private BigDecimal mcd;

    @Size(max = 255)
    @Column(name = "MCR")
    private String mcr;

    @Column(name = "MC_Fundos", precision = 20, scale = 2)
    private BigDecimal mCFundos;

    @Column(precision = 20, scale = 2)
    private BigDecimal mes;

    @Column(name = "Ano", precision = 20, scale = 2)
    private BigDecimal ano;

    @Size(max = 255)
    @Column(name = "Carteira")
    private String carteira;

    @Size(max = 255)
    @Column(name = "Gecon")
    private String gecon;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    @Temporal(TemporalType.DATE)
    @Column(name = "vencto")
    private Date vencto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPorte() {
        return porte;
    }

    public void setPorte(BigDecimal porte) {
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

    public BigDecimal getFundeb() {
        return fundeb;
    }

    public void setFundeb(BigDecimal fundeb) {
        this.fundeb = fundeb;
    }

    public BigDecimal getFpm() {
        return fpm;
    }

    public void setFpm(BigDecimal fpm) {
        this.fpm = fpm;
    }

    public BigDecimal getMunicipes() {
        return municipes;
    }

    public void setMunicipes(BigDecimal municipes) {
        this.municipes = municipes;
    }

    public BigDecimal getServidores() {
        return servidores;
    }

    public void setServidores(BigDecimal servidores) {
        this.servidores = servidores;
    }

    public String getAasp() {
        return aasp;
    }

    public void setAasp(String aasp) {
        this.aasp = aasp;
    }

    public BigDecimal getAplicacoes() {
        return aplicacoes;
    }

    public void setAplicacoes(BigDecimal aplicacoes) {
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

    public String getLicitacoese() {
        return licitacoese;
    }

    public void setLicitacoese(String licitacoese) {
        this.licitacoese = licitacoese;
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

    public String getBBCreditoDecimoTerceiroSalario() {
        return bBCreditoDecimoTerceiroSalario;
    }

    public void setBBCreditoDecimoTerceiroSalario(String bBCreditoDecimoTerceiroSalario) {
        this.bBCreditoDecimoTerceiroSalario = bBCreditoDecimoTerceiroSalario;
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

    public String getRiscoAtribuido() {
        return riscoAtribuido;
    }

    public void setRiscoAtribuido(String riscoAtribuido) {
        this.riscoAtribuido = riscoAtribuido;
    }

    public BigDecimal getMcd() {
        return mcd;
    }

    public void setMcd(BigDecimal mcd) {
        this.mcd = mcd;
    }

    public String getMcr() {
        return mcr;
    }

    public void setMcr(String mcr) {
        this.mcr = mcr;
    }

    public BigDecimal getMCFundos() {
        return mCFundos;
    }

    public void setMCFundos(BigDecimal mCFundos) {
        this.mCFundos = mCFundos;
    }

    public BigDecimal getMes() {
        return mes;
    }

    public void setMes(BigDecimal mes) {
        this.mes = mes;
    }

    public BigDecimal getAno() {
        return ano;
    }

    public void setAno(BigDecimal ano) {
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

    public DadosGoverno getDadosGoverno() {
        return dadosGoverno;
    }

    public void setDadosGoverno(DadosGoverno dadosGoverno) {
        this.dadosGoverno = dadosGoverno;
    }

    public Date getVencto() {
        return vencto;
    }

    public void setVencto(Date vencto) {
        this.vencto = vencto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PosseDeProdutos other = (PosseDeProdutos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
