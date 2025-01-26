package ActividadContactoDocente.HistorialClinico.Controlador;

import ActividadContactoDocente.HistorialClinico.Entidad.hClinico;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.util.List;



public class registroControlador {

   /* @GetMapping("/registroExitoso")
    public String mostrarRegistroExitoso(Model model) {
        hClinico nuevoPaciente = new hClinico(); // Asegúrate de que las propiedades coinciden con los th:field
        model.addAttribute("paciente", nuevoPaciente); // "paciente" enlazado en th:object
        return "pages/registroExitoso";
    }*/

    @GetMapping("/registroExitoso")
    public String mostrarRegistroExitoso(Model model) {
        hClinico nuevoPaciente = new hClinico();
        model.addAttribute("paciente", nuevoPaciente);
        return "registroExitoso"; // Ahora solo "registroExitoso", sin "pages/"
    }


    @PostMapping("/registroExitoso")
    public String registroPaciente(
            @Valid @ModelAttribute("paciente") hClinico paciente,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            // Asegúrate de que esta lista sea relevante o remuévela si no aplica
            List<String> listarPacientes = Arrays.asList("Pacientes");
            model.addAttribute("profesiones", listarPacientes);
            model.addAttribute("errores", bindingResult.getAllErrors());

            // Redirigir al formulario si hay errores
            return "pages/formularios";
        }

        // Si no hay errores, agrega el objeto paciente al modelo
        model.addAttribute("paciente", paciente);

        // Redirigir a la vista de registro exitoso
        return "pages/registroExitoso";
    }
}
