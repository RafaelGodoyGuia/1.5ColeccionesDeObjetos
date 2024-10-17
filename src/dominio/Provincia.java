package dominio;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Municipio> municipios;

    public int contarHabitantes () {
        int totalHabitantes = 0;

        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return (totalHabitantes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Provincia: \n");
        for (Municipio municipio : municipios) {
            sb.append(municipio.toString()).append("\n");
        }
        return sb.toString();
    }
}
