package ActividadContactoDocente.HistorialClinico.Servicio;

import ActividadContactoDocente.HistorialClinico.Entidad.hClinico;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class hClinicoServicio {

    public List<String> obtenerListaPacientes() {
        return Arrays.asList("Paciente 1", "Paciente 2", "Paciente 3");
    }

    public void guardarHistorial(hClinico hClinico) {
        // Aquí puedes integrar lógica para guardar el historial en una base de datos
        System.out.println("Historial guardado: " + hClinico.toString());
    }
}
