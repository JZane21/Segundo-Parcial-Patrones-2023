package Ejercicios_Parcial_2.Ejercicio1;

public class Memento {
    private Archivo archivo;

    public Memento(Archivo archivo) {
        this.archivo = archivo;
    }

    public Archivo getConcreteObject() {
        return archivo;
    }
}
