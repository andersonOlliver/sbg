package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = "radar_de_negocios")
public class RadarDeNegociosGPMunicipios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ROA_Valor", precision = 20, scale = 2)
    private BigDecimal valorROA;

    @Size(max = 255)
    @Column(name = "ROA_Rank_Brasil")
    private String rankBrasilROA;

    @Size(max = 255)
    @Column(name = "ROA_Rank_UF")
    private String rankUfROA;

    @Column(name = "populacao", precision = 20, scale = 2)
    private BigDecimal populacao;

    @Column(name = "Servidores", precision = 20, scale = 2)
    private BigDecimal servidores;

    @Column(name = "Repasses_FUNDEB", precision = 20, scale = 2)
    private BigDecimal repassesFUNDEB;

    @Column(name = "Repasses_FPM", precision = 20, scale = 2)
    private BigDecimal repassesFPM;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorROA() {
        return valorROA;
    }

    public void setValorROA(BigDecimal valorROA) {
        this.valorROA = valorROA;
    }

    public String getRankBrasilROA() {
        return rankBrasilROA;
    }

    public void setRankBrasilROA(String rankBrasilROA) {
        this.rankBrasilROA = rankBrasilROA;
    }

    public String getRankUfROA() {
        return rankUfROA;
    }

    public void setRankUfROA(String rankUfROA) {
        this.rankUfROA = rankUfROA;
    }

    public BigDecimal getPopulacao() {
        return populacao;
    }

    public void setPopulacao(BigDecimal populacao) {
        this.populacao = populacao;
    }

    public BigDecimal getServidores() {
        return servidores;
    }

    public void setServidores(BigDecimal servidores) {
        this.servidores = servidores;
    }

    public BigDecimal getRepassesFUNDEB() {
        return repassesFUNDEB;
    }

    public void setRepassesFUNDEB(BigDecimal repassesFUNDEB) {
        this.repassesFUNDEB = repassesFUNDEB;
    }

    public BigDecimal getRepassesFPM() {
        return repassesFPM;
    }

    public void setRepassesFPM(BigDecimal repassesFPM) {
        this.repassesFPM = repassesFPM;
    }

    public DadosGoverno getDadosGoverno() {
        return dadosGoverno;
    }

    public void setDadosGoverno(DadosGoverno dadosGoverno) {
        this.dadosGoverno = dadosGoverno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final RadarDeNegociosGPMunicipios other = (RadarDeNegociosGPMunicipios) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
