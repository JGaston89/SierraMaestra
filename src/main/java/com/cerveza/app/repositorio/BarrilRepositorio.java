package com.cerveza.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cerveza.app.entidad.Barril;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BarrilRepositorio extends JpaRepository<Barril, Long> {
    List<Barril> findByEstado(String estado);
    Page<Barril> findByEstado(String estado, Pageable pageable);
}
