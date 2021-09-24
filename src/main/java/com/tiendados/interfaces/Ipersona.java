package com.tiendados.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiendados.modelo.Persona;

@Repository
public interface Ipersona extends CrudRepository<Persona, Integer> {

}
