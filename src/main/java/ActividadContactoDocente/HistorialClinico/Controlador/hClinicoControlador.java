package ActividadContactoDocente.HistorialClinico.Controlador;

import ActividadContactoDocente.HistorialClinico.Entidad.hClinico;
import ActividadContactoDocente.HistorialClinico.Servicio.hClinicoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller
public class hClinicoControlador {

    private final hClinicoServicio hClinicoServicio;
    private static final Logger logger = LoggerFactory.getLogger(hClinicoControlador.class);

    // Inyección de dependencias a través del constructor
    @Autowired
    public hClinicoControlador(hClinicoServicio hClinicoServicio) {
        this.hClinicoServicio = hClinicoServicio;
    }

    /**
     * Mapeo para mostrar el formulario de historiales clínicos.
     */
    @GetMapping("/historialClinico")
    public String mostrarFormulario(Model model) {
        hClinico nuevoHistorial = new hClinico(); // Asegúrate de que las propiedades coinciden con los th:field
        model.addAttribute("paciente", nuevoHistorial); // "paciente" enlazado en th:object
        return "pages/historialClinico";
    }


    /**
     * Mapeo para procesar el formulario de historiales clínicos.
     */
    @PostMapping("/historialClinico")
    public String guardarHistorial(
            @Valid @ModelAttribute("hClinico") hClinico hClinico,
            BindingResult resultado,
            Model model) {

        if (resultado.hasErrors()) {
            // Si hay errores, se regresa al formulario con los errores mostrados
            model.addAttribute("listados", hClinicoServicio.obtenerListaPacientes());
            return "pages/historialClinico";
        }

        try {
            hClinicoServicio.guardarHistorial(hClinico);
            model.addAttribute("mensajeExito", "El historial clínico se guardó correctamente.");
        } catch (Exception e) {
            logger.error("Error al guardar el historial clínico: ", e);
            model.addAttribute("mensajeError", "Hubo un error al intentar guardar el historial clínico. Por favor, inténtelo de nuevo.");
        }

        return "redirect:/historialClinico"; // Redirección para evitar reenvíos de formularios
    }
}
