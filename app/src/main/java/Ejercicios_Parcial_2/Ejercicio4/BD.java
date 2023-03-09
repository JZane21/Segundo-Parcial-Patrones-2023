package Ejercicios_Parcial_2.Ejercicio4;

import java.util.Vector;

public class BD {

    private IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    private Vector<Libros> librosList = new Vector<>();
    public void addLibros(Libros libros){
        librosList.add(libros);
    }

    public void buscarLibros(){
        this.strategy.execute(librosList);
    }
}
