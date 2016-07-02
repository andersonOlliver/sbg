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
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = "bb_no_municipio")
public class BbNoMunicipio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 255)
    private String codigoIBGE;

    @Column(precision = 20, scale = 2)
    private BigDecimal quantidadeFIES;

    @Column(precision = 20, scale = 2)
    private BigDecimal volumeFIES;

    @Column(precision = 20, scale = 2)
    private BigDecimal quantidadeMPO;

    @Column(precision = 20, scale = 2)
    private BigDecimal volumeMPO;

    @Column(precision = 20, scale = 2)
    private BigDecimal acessibilidadeQtd;

    @Column(precision = 20, scale = 2)
    private BigDecimal acessibilidadeVol;

    @Column(precision = 20, scale = 2)
    private BigDecimal creditoAgriculturaEmpres;

    @Column(precision = 20, scale = 2)
    private BigDecimal creditoAgriculturaFamiliar;

    @Column(precision = 20, scale = 2)
    private BigDecimal creditoBacenVolume;

    @Column(precision = 20, scale = 2)
    private BigDecimal creditoBacenShare;
    
    @ManyToOne
    @JoinColumn(name = "dados_governo")
    private DadosGoverno dadosGoverno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public BigDecimal getQuantidadeFIES() {
        return quantidadeFIES;
    }

    public void setQuantidadeFIES(BigDecimal quantidadeFIES) {
        this.quantidadeFIES = quantidadeFIES;
    }

    public BigDecimal getVolumeFIES() {
        return volumeFIES;
    }

    public void setVolumeFIES(BigDecimal volumeFIES) {
        this.volumeFIES = volumeFIES;
    }

    public BigDecimal getQuantidadeMPO() {
        return quantidadeMPO;
    }

    public void setQuantidadeMPO(BigDecimal quantidadeMPO) {
        this.quantidadeMPO = quantidadeMPO;
    }

    public BigDecimal getVolumeMPO() {
        return volumeMPO;
    }

    public void setVolumeMPO(BigDecimal volumeMPO) {
        this.volumeMPO = volumeMPO;
    }

    public BigDecimal getAcessibilidadeQtd() {
        return acessibilidadeQtd;
    }

    public void setAcessibilidadeQtd(BigDecimal acessibilidadeQtd) {
        this.acessibilidadeQtd = acessibilidadeQtd;
    }

    public BigDecimal getAcessibilidadeVol() {
        return acessibilidadeVol;
    }

    public void setAcessibilidadeVol(BigDecimal acessibilidadeVol) {
        this.acessibilidadeVol = acessibilidadeVol;
    }

    public BigDecimal getCreditoAgriculturaEmpres() {
        return creditoAgriculturaEmpres;
    }

    public void setCreditoAgriculturaEmpres(BigDecimal creditoAgriculturaEmpres) {
        this.creditoAgriculturaEmpres = creditoAgriculturaEmpres;
    }

    public BigDecimal getCreditoAgriculturaFamiliar() {
        return creditoAgriculturaFamiliar;
    }

    public void setCreditoAgriculturaFamiliar(BigDecimal creditoAgriculturaFamiliar) {
        this.creditoAgriculturaFamiliar = creditoAgriculturaFamiliar;
    }

    public BigDecimal getCreditoBacenVolume() {
        return creditoBacenVolume;
    }

    public void setCreditoBacenVolume(BigDecimal creditoBacenVolume) {
        this.creditoBacenVolume = creditoBacenVolume;
    }

    public BigDecimal getCreditoBacenShare() {
        return creditoBacenShare;
    }

    public void setCreditoBacenShare(BigDecimal creditoBacenShare) {
        this.creditoBacenShare = creditoBacenShare;
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
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final BbNoMunicipio other = (BbNoMunicipio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
