package br.com.alysonrodrigo.locadora.service.exceptions;

public class NegocioException extends RuntimeException {

	public NegocioException(String mensagem){
		super(mensagem);
	}
}
