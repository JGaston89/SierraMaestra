package com.cerveza.app.servicio;

import com.cerveza.app.entidad.Lote;
import java.util.List;

public interface LoteServicio {
    List<Lote> listarTodosLosLotes();
    
    Lote obtenerLotePorId(Long id);
    
    Lote guardarLote(Lote lote);
    
    Lote actualizarLote(Lote lote);
    
    void eliminarLote(Long id);
    
}

