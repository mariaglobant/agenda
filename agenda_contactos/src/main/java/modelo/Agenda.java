package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    private List<Registro> registros;

    public Agenda() {
        registros = new ArrayList<>();
    }

    public void anadirRegistro(Registro registro) {
        registros.add(registro);
        Collections.sort(registros, Comparator.comparing(Registro::getNombreCompleto).thenComparing(Registro::getApellido));
    }

    public void eliminarRegistro(Registro registro) {
        registros.remove(registro);
    }

    public List<Registro> verRegistro() {
        return this.registros;
    }

    public void detalleRegistro(String nombreCompleto, String apellido) {
        for (Registro registro : registros) {
            if (registro.getNombreCompleto().equals(nombreCompleto) && registro.getApellido().equals(apellido)) {
                System.out.println(registro);
                return;
            }
        }
        System.out.println("Registro no encontrado.");
    }
}
