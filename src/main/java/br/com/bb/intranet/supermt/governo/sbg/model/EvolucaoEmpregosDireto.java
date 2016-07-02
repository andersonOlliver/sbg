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
@Table(name = "evolucao_empregos_direto")
public class EvolucaoEmpregosDireto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2011;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2012;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2013;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2014;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2015;

    @Column(precision = 20, scale = 2)
    private BigDecimal evolEmpregdireto2016;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getEvolEmpregdireto2011() {
        return evolEmpregdireto2011;
    }

    public void setEvolEmpregdireto2011(BigDecimal evolEmpregdireto2011) {
        this.evolEmpregdireto2011 = evolEmpregdireto2011;
    }

    public BigDecimal getEvolEmpregdireto2012() {
        return evolEmpregdireto2012;
    }

    public void setEvolEmpregdireto2012(BigDecimal evolEmpregdireto2012) {
        this.evolEmpregdireto2012 = evolEmpregdireto2012;
    }

    public BigDecimal getEvolEmpregdireto2013() {
        return evolEmpregdireto2013;
    }

    public void setEvolEmpregdireto2013(BigDecimal evolEmpregdireto2013) {
        this.evolEmpregdireto2013 = evolEmpregdireto2013;
    }

    public BigDecimal getEvolEmpregdireto2014() {
        return evolEmpregdireto2014;
    }

    public void setEvolEmpregdireto2014(BigDecimal evolEmpregdireto2014) {
        this.evolEmpregdireto2014 = evolEmpregdireto2014;
    }

    public BigDecimal getEvolEmpregdireto2015() {
        return evolEmpregdireto2015;
    }

    public void setEvolEmpregdireto2015(BigDecimal evolEmpregdireto2015) {
        this.evolEmpregdireto2015 = evolEmpregdireto2015;
    }

    public BigDecimal getEvolEmpregdireto2016() {
        return evolEmpregdireto2016;
    }

    public void setEvolEmpregdireto2016(BigDecimal evolEmpregdireto2016) {
        this.evolEmpregdireto2016 = evolEmpregdireto2016;
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
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final EvolucaoEmpregosDireto other = (EvolucaoEmpregosDireto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
