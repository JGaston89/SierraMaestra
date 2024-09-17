package com.cerveza.app.servicio;

import java.util.List;

import com.cerveza.app.entidad.Barril;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BarrileServicio {
    List<Barril> listarTodosLosBarriles();
    
    Barril guardarBarril(Barril barril);
    
    Barril obtenerBarrilPorId(Long id);
    
    Barril actualizarBarril(Barril barril);
    
    void eliminarBarril(Long id);

    List<Barril> listarBarrilesPorEstado(String estado);
    
    Page<Barril> listarTodosLosBarriles(Pageable pageable);
    
    Page<Barril> listarBarrilesPorEstado(String estado, Pageable pageable);
}
