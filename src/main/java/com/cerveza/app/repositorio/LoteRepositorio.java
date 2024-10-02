package com.cerveza.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cerveza.app.entidad.Lote;

public interface LoteRepositorio extends JpaRepository<Lote, Long> {
   
}
