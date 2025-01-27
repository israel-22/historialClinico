package ActividadContactoDocente.HistorialClinico.Controlador;

import ActividadContactoDocente.HistorialClinico.Entidad.hClinico;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class registroControlador {

    // Método para mostrar la página de registro exitoso
    @GetMapping("/registroExitoso")
    public String mostrarRegistroExitoso(Model model) {
        hClinico nuevoPaciente = new hClinico();
        model.addAttribute("paciente", nuevoPaciente);
        return "registroExitoso";  // Nombre de la plantilla sin el prefijo 'pages/'
    }

    // Método para procesar el registro del paciente
    @PostMapping("/registroExitoso")
    public String registroPaciente(
            @Valid @ModelAttribute("paciente") hClinico paciente,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            // Si hay errores, volvemos al formulario
            List<String> listarPacientes = Arrays.asList("Pacientes");
            model.addAttribute("profesiones", listarPacientes);
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "historialClinico";  // Regresamos al formulario original
        } else {
            // Si no hay errores, redirigimos a la página de éxito
            model.addAttribute("paciente", paciente);  // Pasamos el paciente al modelo para mostrar los datos
            return "registroExitoso";  // Vista de éxito
        }
    }
}
