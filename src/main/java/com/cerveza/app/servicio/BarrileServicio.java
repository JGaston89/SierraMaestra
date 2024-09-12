package com.cerveza.app.servicio;

import java.util.List;

import com.cerveza.app.entidad.Barril;

public interface BarrileServicio {
	public List<Barril> listarTodosLosBarriles();
	
	public Barril guardarBarril(Barril barril);
	
	public Barril obtenerBarrilPorId(Long Id);
	
	public Barril actualizarBarril(Barril barril);
	
	public void eliminarBarril(Long Id);

}
