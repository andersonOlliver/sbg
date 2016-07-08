/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.service;

import br.com.bb.intranet.supermt.governo.sbg.controller.consulta.Relatorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.BBNoMunicipioRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.ContratacoesFcoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.DadosGovernoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.EvolucaoEmpregosDiretoRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.IbamRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.IfdmRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.McdRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.PibRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.PosseDeProdutosAbril2016Repositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.PosseDeProdutosRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.RadarDeNegociosGPMunicipiosRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.RppsRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.SitesPrefeiturasRepositorio;
import br.com.bb.intranet.supermt.governo.sbg.repository.TabelaIdhRepositorio;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Olliver
 */
public class GeraRelatorio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private BBNoMunicipioRepositorio bbNoMunicipioRepositorio;

    @Inject
    private ContratacoesFcoRepositorio contratacoesFcoRepositorio;

    @Inject
    private DadosGovernoRepositorio dadosGovernoRepositorio;

    @Inject
    private EvolucaoEmpregosDiretoRepositorio evolucaoEmpregosDiretoRepositorio;

    @Inject
    private IfdmRepositorio ifdmRepositorio;

    @Inject
    private PibRepositorio pibRepositorio;

    @Inject
    private PosseDeProdutosAbril2016Repositorio posseDeProdutosAbril2016Repositorio;

    @Inject
    private PosseDeProdutosRepositorio posseDeProdutosRepositorio;

    @Inject
    private RadarDeNegociosGPMunicipiosRepositorio radarDeNegociosGPMunicipiosRepositorio;

    @Inject
    private RppsRepositorio rppsRepositorio;

    @Inject
    private SitesPrefeiturasRepositorio sitesPrefeiturasRepositorio;

    @Inject
    private TabelaIdhRepositorio tabelaIdhRepositorio;

    @Inject
    private IbamRepositorio ibamRepositorio;
    
    @Inject
    private McdRepositorio mcdRepositorio;

    public Relatorio gerar(String codigoIBGE) {
        Relatorio retorno = new Relatorio();
        
        long start = System.currentTimeMillis();
        
        retorno.setbBNoMunicipio(this.bbNoMunicipioRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setContratacoesFco(this.contratacoesFcoRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setDadosGoverno(this.dadosGovernoRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setEvolucaoEmpregosDireto(this.evolucaoEmpregosDiretoRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setIbam(this.ibamRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setIfdm(this.ifdmRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setPib(this.pibRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setPosseDeProdutos(this.posseDeProdutosRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setPosseDeProdutosAbril2016(this.posseDeProdutosAbril2016Repositorio.porCodigoIBGE(codigoIBGE));
        retorno.setRadarDeNegociosGPMunicipios(this.radarDeNegociosGPMunicipiosRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setRpps(this.rppsRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setSitesPrefeituras(this.sitesPrefeiturasRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setTabelaIdh(this.tabelaIdhRepositorio.porCodigoIBGE(codigoIBGE));
        retorno.setListaMcd(this.mcdRepositorio.porMCI(retorno.getDadosGoverno().getMci()));

        long end = System.currentTimeMillis();
        
        System.out.println("Tempo decorrido: " + (end - start));
        
        return retorno;
    }

}
