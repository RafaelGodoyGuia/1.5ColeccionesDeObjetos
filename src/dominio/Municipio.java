package dominio;

import java.util.ArrayList;

public class Municipio {
    private ArrayList<Localidad> localidades;

    public int contarHabitantes () {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return (totalHabitantes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Municipio: \n");
        for (Localidad localidad : localidades) {
            sb.append(localidad.toString()).append("\n");
        }
        return sb.toString();
    }
}
