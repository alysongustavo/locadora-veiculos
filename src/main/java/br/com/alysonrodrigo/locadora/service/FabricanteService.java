package br.com.alysonrodrigo.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alysonrodrigo.locadora.dao.FabricanteDAO;
import br.com.alysonrodrigo.locadora.domain.Fabricante;
import br.com.alysonrodrigo.locadora.service.exceptions.NegocioException;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteDAO fabricanteDAO;
	

	@Transactional
	public void salvar(Fabricante fabricante) throws NegocioException{
		
		if(fabricante.getNome() == null || fabricante.getNome().trim().equals("")){
			throw new NegocioException("O nome do fabricante é obrigatório");
		}
		
		this.fabricanteDAO.save(fabricante);
	}
	
	public List<Fabricante> todosFabricantes(){
		List<Fabricante> fabricantes = fabricanteDAO.findAll();
		return fabricantes;
		
	}
}
