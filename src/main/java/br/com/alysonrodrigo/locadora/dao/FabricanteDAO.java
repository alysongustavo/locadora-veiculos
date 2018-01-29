package br.com.alysonrodrigo.locadora.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alysonrodrigo.locadora.domain.Fabricante;

@Repository
public interface FabricanteDAO extends JpaRepository<Fabricante, Long> {

}
