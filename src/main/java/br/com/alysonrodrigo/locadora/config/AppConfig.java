package br.com.alysonrodrigo.locadora.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.alysonrodrigo.locadora.controller.CadastroFabricanteController;

@Configuration
@ComponentScan(basePackageClasses = CadastroFabricanteController.class)
public class AppConfig {

}
