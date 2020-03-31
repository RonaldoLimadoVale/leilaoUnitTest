package br.aula.rav.dominio;

public class Lance{
	
	private Usuario usuario;
	private double valor;
	
	public Lance(Usuario u, double v) {
		this.usuario = u;
		this.valor = v;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public double getValor() {
		return this.valor;
	}
}