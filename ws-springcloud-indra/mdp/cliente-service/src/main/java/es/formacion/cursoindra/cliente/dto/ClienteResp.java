package es.formacion.cursoindra.cliente.dto;

public record ClienteResp(
	Integer idCliente,
	String nombre,
	String nif,
	String ciudad,
	Integer nroCliente
) {}
