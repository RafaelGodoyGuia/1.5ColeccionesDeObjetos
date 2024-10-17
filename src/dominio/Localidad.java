package dominio;

public class Localidad {
    private int numeroDeHabitantes;

    //constructores
    public Localidad (int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }
    public void setNumeroDeHabitantes (int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public int getNumeroDeHabitantes () {
        return (this.numeroDeHabitantes);
    }

    @Override
    public String toString() {
        return "Número de habitantes: " + this.numeroDeHabitantes;
    }
}
