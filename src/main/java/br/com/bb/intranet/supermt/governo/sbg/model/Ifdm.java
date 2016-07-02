package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = "ifdm")
public class Ifdm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 20, scale = 2)
    private BigDecimal ifdm;

    @Column(precision = 20, scale = 2)
    private BigDecimal rankingIFDMNacional;

    @Column(precision = 20, scale = 2)
    private BigDecimal rankingIFDMEstadual;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getIfdm() {
        return ifdm;
    }

    public void setIfdm(BigDecimal ifdm) {
        this.ifdm = ifdm;
    }

    public BigDecimal getRankingIFDMNacional() {
        return rankingIFDMNacional;
    }

    public void setRankingIFDMNacional(BigDecimal rankingIFDMNacional) {
        this.rankingIFDMNacional = rankingIFDMNacional;
    }

    public BigDecimal getRankingIFDMEstadual() {
        return rankingIFDMEstadual;
    }

    public void setRankingIFDMEstadual(BigDecimal rankingIFDMEstadual) {
        this.rankingIFDMEstadual = rankingIFDMEstadual;
    }

    public DadosGoverno getDadosGoverno() {
        return dadosGoverno;
    }

    public void setDadosGoverno(DadosGoverno dadosGoverno) {
        this.dadosGoverno = dadosGoverno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Ifdm other = (Ifdm) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
