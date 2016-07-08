/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.controller.consulta;

import br.com.bb.intranet.supermt.governo.sbg.model.BbNoMunicipio;
import br.com.bb.intranet.supermt.governo.sbg.model.ContratacoesFCO;
import br.com.bb.intranet.supermt.governo.sbg.model.DadosGoverno;
import br.com.bb.intranet.supermt.governo.sbg.model.EvolucaoEmpregosDireto;
import br.com.bb.intranet.supermt.governo.sbg.model.Ibam;
import br.com.bb.intranet.supermt.governo.sbg.model.Ifdm;
import br.com.bb.intranet.supermt.governo.sbg.model.Mcd;
import br.com.bb.intranet.supermt.governo.sbg.model.Pib;
import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutos;
import br.com.bb.intranet.supermt.governo.sbg.model.PosseDeProdutosAbril2016;
import br.com.bb.intranet.supermt.governo.sbg.model.RadarDeNegociosGPMunicipios;
import br.com.bb.intranet.supermt.governo.sbg.model.Rpps;
import br.com.bb.intranet.supermt.governo.sbg.model.SitesPrefeituras;
import br.com.bb.intranet.supermt.governo.sbg.model.TabelaIdh;
import java.util.List;

/**
 *
 * @author Olliver
 */
public class Relatorio {
    
    private BbNoMunicipio bBNoMunicipio;
    private ContratacoesFCO contratacoesFco;
    private DadosGoverno dadosGoverno;
    private EvolucaoEmpregosDireto evolucaoEmpregosDireto;
    private Ifdm ifdm;
    private Pib pib;
    private PosseDeProdutos posseDeProdutos;
    private PosseDeProdutosAbril2016 posseDeProdutosAbril2016;
    private RadarDeNegociosGPMunicipios radarDeNegociosGPMunicipios;
    private Rpps rpps;
    private SitesPrefeituras sitesPrefeituras;
    private TabelaIdh tabelaIdh;
    private Ibam ibam;
    private List<Mcd> listaMcd;

    public BbNoMunicipio getbBNoMunicipio() {
        return bBNoMunicipio;
    }

    public void setbBNoMunicipio(BbNoMunicipio bBNoMunicipio) {
        this.bBNoMunicipio = bBNoMunicipio;
    }

    public ContratacoesFCO getContratacoesFco() {
        return contratacoesFco;
    }

    public void setContratacoesFco(ContratacoesFCO contratacoesFco) {
        this.contratacoesFco = contratacoesFco;
    }

    public DadosGoverno getDadosGoverno() {
        return dadosGoverno;
    }

    public void setDadosGoverno(DadosGoverno dadosGoverno) {
        this.dadosGoverno = dadosGoverno;
    }

    public EvolucaoEmpregosDireto getEvolucaoEmpregosDireto() {
        return evolucaoEmpregosDireto;
    }

    public void setEvolucaoEmpregosDireto(EvolucaoEmpregosDireto evolucaoEmpregosDireto) {
        this.evolucaoEmpregosDireto = evolucaoEmpregosDireto;
    }

    public Ifdm getIfdm() {
        return ifdm;
    }

    public void setIfdm(Ifdm ifdm) {
        this.ifdm = ifdm;
    }

    public Pib getPib() {
        return pib;
    }

    public void setPib(Pib pib) {
        this.pib = pib;
    }

    public PosseDeProdutos getPosseDeProdutos() {
        return posseDeProdutos;
    }

    public void setPosseDeProdutos(PosseDeProdutos posseDeProdutos) {
        this.posseDeProdutos = posseDeProdutos;
    }

    public PosseDeProdutosAbril2016 getPosseDeProdutosAbril2016() {
        return posseDeProdutosAbril2016;
    }

    public void setPosseDeProdutosAbril2016(PosseDeProdutosAbril2016 posseDeProdutosAbril2016) {
        this.posseDeProdutosAbril2016 = posseDeProdutosAbril2016;
    }

    public RadarDeNegociosGPMunicipios getRadarDeNegociosGPMunicipios() {
        return radarDeNegociosGPMunicipios;
    }

    public void setRadarDeNegociosGPMunicipios(RadarDeNegociosGPMunicipios radarDeNegociosGPMunicipios) {
        this.radarDeNegociosGPMunicipios = radarDeNegociosGPMunicipios;
    }

    public Rpps getRpps() {
        return rpps;
    }

    public void setRpps(Rpps rpps) {
        this.rpps = rpps;
    }

    public SitesPrefeituras getSitesPrefeituras() {
        return sitesPrefeituras;
    }

    public void setSitesPrefeituras(SitesPrefeituras sitesPrefeituras) {
        this.sitesPrefeituras = sitesPrefeituras;
    }

    public TabelaIdh getTabelaIdh() {
        return tabelaIdh;
    }

    public void setTabelaIdh(TabelaIdh tabelaIdh) {
        this.tabelaIdh = tabelaIdh;
    }

    public Ibam getIbam() {
        return ibam;
    }

    public void setIbam(Ibam ibam) {
        this.ibam = ibam;
    }

    public List<Mcd> getListaMcd() {
        return listaMcd;
    }

    public void setListaMcd(List<Mcd> listaMcd) {
        this.listaMcd = listaMcd;
    }
    
    
}
