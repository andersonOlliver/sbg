/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.governo.sbg.converter;

import br.com.bb.intranet.supermt.governo.sbg.model.SitesPrefeituras;
import br.com.bb.intranet.supermt.governo.sbg.repository.SitesPrefeiturasRepositorio;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Olliver
 */
@FacesConverter(forClass = SitesPrefeituras.class)
public class SitesPrefeiturasConverter implements Converter {

    @Inject
    private SitesPrefeiturasRepositorio repositorio;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        SitesPrefeituras retorno = null;

        if (value != null && StringUtils.isNotEmpty(value)) {
            retorno = this.repositorio.porCodigoIBGE(value);
        }

        return retorno;

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            return ((SitesPrefeituras) value).getCodigoIBGE();
        }

        return null;
    }
}
