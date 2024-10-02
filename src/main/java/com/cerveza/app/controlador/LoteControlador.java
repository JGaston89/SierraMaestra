package com.cerveza.app.controlador;
import com.cerveza.app.entidad.Barril;
import com.cerveza.app.entidad.Lote;
import com.cerveza.app.servicio.BarrileServicio;
import com.cerveza.app.servicio.LoteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping
public class LoteControlador {

    @Autowired
    private LoteServicio servicio;
    
    @Autowired
    private BarrileServicio barrileServicio;

    @GetMapping("/lote")
    public String listarTodosLosLotes(Model modelo) {
        List<Lote> lotes = servicio.listarTodosLosLotes();
        modelo.addAttribute("lotes", lotes);
        modelo.addAttribute("estados", new String[]{"Activo", "Inactivo"});
        return "tabla_lote";
    }

    @GetMapping("/{id}")
    public String obtenerLotePorId(@PathVariable("id") Long id, Model modelo) {
        Lote lote = servicio.obtenerLotePorId(id);
        if (lote != null) {
            modelo.addAttribute("lote", lote);
            return "detalle_lote";
        } else {
            return "404";
        }
    }

    @PostMapping("/lote")
    public String guardarLote(@ModelAttribute("lote") Lote lote) {
        servicio.guardarLote(lote);
        return "redirect:/lote";
    }

    @GetMapping("/lote/nuevo")
    public String crearLoteFormulario(Model modelo) {
        Lote lote = new Lote();
        List<Barril> barrilesLimpios = barrileServicio.listarBarrilesPorEstadoLimpio();
        modelo.addAttribute("lote", lote);
        modelo.addAttribute("barrilesLimpios", barrilesLimpios);
        modelo.addAttribute("estados", new String[]{"Activo", "Inactivo"});
        return "crear_lote";
    }

    @DeleteMapping("/{id}")
    public String eliminarLote(@PathVariable("id") Long id) {
        servicio.eliminarLote(id);
        return "redirect:/lote";
    }
}

