package br.com.alysonrodrigo.locadora.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.alysonrodrigo.locadora.domain.Fabricante;
import br.com.alysonrodrigo.locadora.service.FabricanteService;
import br.com.alysonrodrigo.locadora.service.exceptions.NegocioException;
import br.com.alysonrodrigo.locadora.util.jsf.FacesUtil;

@Scope(value = "view")
@Controller
public class CadastroFabricanteController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private FabricanteService fabricanteService;
	
	private Fabricante fabricante;
	
	public CadastroFabricanteController(){
		limpar();
	}
	
	public void inicializar() {
		if (this.fabricante == null) {
			limpar();
		}
	
	}
	
	public void salvar(){
		
		try{
			this.fabricanteService.salvar(fabricante);
			FacesUtil.addSuccessMessage("Fabricante salvo com sucesso!");
			
			this.limpar();
		}catch(NegocioException e){
			FacesUtil.addErrorMessage(e.getMessage());
		}
	}
	
	public void limpar(){
		this.fabricante = new Fabricante();
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	

}
