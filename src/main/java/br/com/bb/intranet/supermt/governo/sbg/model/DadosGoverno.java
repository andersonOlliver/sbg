package br.com.bb.intranet.supermt.governo.sbg.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Olliver
 *
 */
@Entity
@Table(name = "dados_governo")
public class DadosGoverno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 9999)
    @Column(name = "Gerev", length = 4)
    private String gerev;

    @Size(max = 9999)
    @Column(name = "Prefixo", length = 4)
    private String prefixo;

    @Size(max = 50)
    @Column(length = 50)
    private String agenciaRelacionamento;

    @Size(max = 10)
    @Column(name = "MCI", length = 9)
    private String mci;

    @Size(max = 20)
    @Column(name = "CNPJ", length = 20)
    private String cnpj;

    @Size(max = 100)
    @Column(name = "NOME", length = 100)
    private String nome;

    @Size(max = 70)
    @Column(length = 70)
    private String municipio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGerev() {
        return gerev;
    }

    public void setGerev(String gerev) {
        this.gerev = gerev;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getAgenciaRelacionamento() {
        return agenciaRelacionamento;
    }

    public void setAgenciaRelacionamento(String agenciaRelacionamento) {
        this.agenciaRelacionamento = agenciaRelacionamento;
    }

    public String getMci() {
        return mci;
    }

    public void setMci(String mci) {
        this.mci = mci;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final DadosGoverno other = (DadosGoverno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
