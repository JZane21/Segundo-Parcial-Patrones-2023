package Ejercicios_Parcial_2.Ejercicio3;

public interface ISubject {
    void attach (IObserver observer);
    void deattach (IObserver observer);
    void notifyObservers(String tipo);
}
