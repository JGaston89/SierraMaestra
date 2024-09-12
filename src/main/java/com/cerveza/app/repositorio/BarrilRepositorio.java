package com.cerveza.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerveza.app.entidad.Barril;

@Repository
public interface BarrilRepositorio extends JpaRepository<Barril, Long>{

}
 