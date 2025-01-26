package ActividadContactoDocente.HistorialClinico.Controlador;

import ActividadContactoDocente.HistorialClinico.Entidad.hClinico;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class hClinicoControlador {

    @GetMapping("/historialesClinicos")
    public String historial(Model model) {
        hClinico hClinico = new hClinico(); // Crear una nueva instancia de hClinico
        List<String> ListaPacientes = Arrays.asList("Paciente 1", "Paciente 2", "Paciente 3");
        model.addAttribute("listados", ListaPacientes); // Lista de pacientes
        model.addAttribute("hClinico", hClinico); // Añadir el objeto hClinico al modelo
        return "pages/historialesClinicos"; // Devolver la vista
    }
}
