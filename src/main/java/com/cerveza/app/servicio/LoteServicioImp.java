package com.cerveza.app.servicio;


import com.cerveza.app.entidad.Lote;
import com.cerveza.app.repositorio.LoteRepositorio;
import com.cerveza.app.servicio.LoteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service("loteServicioImp")
public class LoteServicioImp implements LoteServicio {

    @Autowired
    private LoteRepositorio loteRepositorio;

    @Override
    public List<Lote> listarTodosLosLotes() {
        return loteRepositorio.findAll();
    }

    @Override
    public Lote obtenerLotePorId(Long id) {
        Optional<Lote> lote = loteRepositorio.findById(id);
        return lote.orElse(null); // Puedes manejar la excepción si el Lote no se encuentra
    }

    @Override
    public Lote guardarLote(Lote lote) {
        return loteRepositorio.save(lote);
    }

    @Override
    public void eliminarLote(Long id) {
        loteRepositorio.deleteById(id);
    }

    @Override
    public Lote actualizarLote(Lote lote) {
        return loteRepositorio.save(lote);
    }
    
    @Override
    public Page<Lote> listarTodosLosLotes(Pageable pageable) {
        return loteRepositorio.findAll(pageable);
    }
	
	
}
