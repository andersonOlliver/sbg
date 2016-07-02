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
@Table(name = "tabela_idh")
public class TabelaIdh implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(precision = 20, scale = 2)
    private BigDecimal idhm1991;

    @Column(precision = 20, scale = 2)
    private BigDecimal idhm2000;

    @Column(precision = 20, scale = 2)
    private BigDecimal idhm2010;

    @Column(precision = 20, scale = 2)
    private BigDecimal iDHMClassific2010;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getIdhm1991() {
        return idhm1991;
    }

    public void setIdhm1991(BigDecimal idhm1991) {
        this.idhm1991 = idhm1991;
    }

    public BigDecimal getIdhm2000() {
        return idhm2000;
    }

    public void setIdhm2000(BigDecimal idhm2000) {
        this.idhm2000 = idhm2000;
    }

    public BigDecimal getIdhm2010() {
        return idhm2010;
    }

    public void setIdhm2010(BigDecimal idhm2010) {
        this.idhm2010 = idhm2010;
    }

    public BigDecimal getiDHMClassific2010() {
        return iDHMClassific2010;
    }

    public void setiDHMClassific2010(BigDecimal iDHMClassific2010) {
        this.iDHMClassific2010 = iDHMClassific2010;
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
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final TabelaIdh other = (TabelaIdh) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
