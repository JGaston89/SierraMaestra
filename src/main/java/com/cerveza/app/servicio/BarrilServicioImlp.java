package com.cerveza.app.servicio;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import org.springframework.stereotype.Service;
import com.cerveza.app.entidad.Barril;
import com.cerveza.app.repositorio.BarrilRepositorio;

@Service
public class BarrilServicioImlp implements BarrileServicio {

	@Autowired
	private BarrilRepositorio repositorio;
	
	@Override
	public List<Barril> listarTodosLosBarriles() {
		return repositorio.findAll();
	}

	@Override
	public Barril guardarBarril(Barril barril) {
		return repositorio.save(barril);
	}

	@Override
	public Barril obtenerBarrilPorId(Long Id) {
		return repositorio.findById(Id).get();
	}

	@Override
	public Barril actualizarBarril(Barril barril) {
		return repositorio.save(barril);
	}

	@Override
	public void eliminarBarril(Long Id) {
		repositorio.deleteById(Id);
		
	}

}
