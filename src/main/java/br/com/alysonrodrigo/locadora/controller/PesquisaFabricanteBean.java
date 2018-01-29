package br.com.alysonrodrigo.locadora.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import br.com.alysonrodrigo.locadora.domain.Fabricante;
import br.com.alysonrodrigo.locadora.service.FabricanteService;
import br.com.alysonrodrigo.locadora.service.exceptions.NegocioException;
import br.com.alysonrodrigo.locadora.util.jsf.FacesUtil;

@Configuration
public class PesquisaFabricanteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private FabricanteService fabricanteService;

	private List<Fabricante> fabricantes;

	private Fabricante fabricanteSelecionado;

	public List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public Fabricante getFabricanteSelecionado() {
		return fabricanteSelecionado;
	}

	public void setFabricanteSelecionado(Fabricante fabricanteSelecionado) {
		this.fabricanteSelecionado = fabricanteSelecionado;
	}

	public void inicializar() {
		try {
			fabricantes = fabricanteService.todosFabricantes();
		} catch (NegocioException e) {
			FacesUtil.addErrorMessage(e.getMessage());
		}
	}
}
