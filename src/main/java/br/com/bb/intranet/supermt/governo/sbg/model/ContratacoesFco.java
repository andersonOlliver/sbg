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
@Table(name = "contratacoes_fco")
public class ContratacoesFco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCORuralQuant;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCORuralValor;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCOEmpresarialQuant;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCOEmpresarialValor;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCOQuantTot;

    @Column(precision = 20, scale = 2)
    private BigDecimal fCOValorTot;

    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getfCORuralQuant() {
        return fCORuralQuant;
    }

    public void setfCORuralQuant(BigDecimal fCORuralQuant) {
        this.fCORuralQuant = fCORuralQuant;
    }

    public BigDecimal getfCORuralValor() {
        return fCORuralValor;
    }

    public void setfCORuralValor(BigDecimal fCORuralValor) {
        this.fCORuralValor = fCORuralValor;
    }

    public BigDecimal getfCOEmpresarialQuant() {
        return fCOEmpresarialQuant;
    }

    public void setfCOEmpresarialQuant(BigDecimal fCOEmpresarialQuant) {
        this.fCOEmpresarialQuant = fCOEmpresarialQuant;
    }

    public BigDecimal getfCOEmpresarialValor() {
        return fCOEmpresarialValor;
    }

    public void setfCOEmpresarialValor(BigDecimal fCOEmpresarialValor) {
        this.fCOEmpresarialValor = fCOEmpresarialValor;
    }

    public BigDecimal getfCOQuantTot() {
        return fCOQuantTot;
    }

    public void setfCOQuantTot(BigDecimal fCOQuantTot) {
        this.fCOQuantTot = fCOQuantTot;
    }

    public BigDecimal getfCOValorTot() {
        return fCOValorTot;
    }

    public void setfCOValorTot(BigDecimal fCOValorTot) {
        this.fCOValorTot = fCOValorTot;
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
        final ContratacoesFco other = (ContratacoesFco) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
