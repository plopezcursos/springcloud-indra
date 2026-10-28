package es.formacion.cursoindra.cliente.domain;

@SuppressWarnings("serial")

public class Cliente extends PersonaFisica {
	
	private Integer nroCliente;
	
	public Cliente() {
	}

	public Cliente(String nombre, String nif, String municipio) {
		super(nombre, nif, municipio);
	}
	
	public Cliente(String nombre, String apellido1, String apellido2, String nif, Genero sexo, String municipio, String privincia, Integer nroCliente) {
		super(nombre, apellido1, apellido2, nif, sexo, municipio, privincia);
		this.nroCliente = nroCliente;
	}

	public Integer getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

}
