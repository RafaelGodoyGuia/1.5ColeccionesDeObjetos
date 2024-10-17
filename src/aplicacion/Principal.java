package aplicacion;

import dominio.Localidad;

public class Principal {
    public static void main (String[] args) {
        Localidad localidad = new Localidad(12345);

        System.out.println(localidad.toString());
    }
}
