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

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = "pib")
public class Pib implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(precision = 20, scale = 2)
    private BigDecimal pIBaPrecosCorrentes;

    @Column(precision = 20, scale = 2)
    private BigDecimal populacao;

    @Column(precision = 20, scale = 2)
    private BigDecimal pIBperCapta;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getpIBaPrecosCorrentes() {
        return pIBaPrecosCorrentes;
    }

    public void setpIBaPrecosCorrentes(BigDecimal pIBaPrecosCorrentes) {
        this.pIBaPrecosCorrentes = pIBaPrecosCorrentes;
    }

    public BigDecimal getPopulacao() {
        return populacao;
    }

    public void setPopulacao(BigDecimal populacao) {
        this.populacao = populacao;
    }

    public BigDecimal getpIBperCapta() {
        return pIBperCapta;
    }

    public void setpIBperCapta(BigDecimal pIBperCapta) {
        this.pIBperCapta = pIBperCapta;
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
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final Pib other = (Pib) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
