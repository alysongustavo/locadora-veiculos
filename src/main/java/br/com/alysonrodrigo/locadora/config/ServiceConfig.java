package br.com.alysonrodrigo.locadora.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.alysonrodrigo.locadora.service.FabricanteService;

@ComponentScan(basePackageClasses = FabricanteService.class)
@Configuration
public class ServiceConfig {

}
