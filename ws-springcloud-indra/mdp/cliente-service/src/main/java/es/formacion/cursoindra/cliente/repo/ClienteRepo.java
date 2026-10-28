package es.formacion.cursoindra.cliente.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.formacion.cursoindra.cliente.domain.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

}
