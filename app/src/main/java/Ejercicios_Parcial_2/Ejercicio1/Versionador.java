package Ejercicios_Parcial_2.Ejercicio1;

public class Versionador {
    private Archivo archivo;

    public void setMemento(Archivo state){
        System.out.println("Versionador> setMemento"+state.getState());
        state.showInfo();
        this.archivo =state;
    }

    public Memento createMemento(){
        return new Memento(archivo);
    }

    public void restoreMemento(Memento memento){
        archivo = memento.getConcreteObject();
        System.out.println("Restore Object");
        archivo.showInfo();
    }
}
