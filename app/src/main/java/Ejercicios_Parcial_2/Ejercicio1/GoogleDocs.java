package Ejercicios_Parcial_2.Ejercicio1;

import java.util.Vector;

public class GoogleDocs {
    private Vector<Memento> versionesArchivos = new Vector<>();
    private int puntero = -1;
    private Versionador versionador = new Versionador();
    
    public void addMemento(Archivo archivo){
        versionador.setMemento(archivo);
        versionesArchivos.add(versionador.createMemento());
        puntero++;
    }

    public void realizarComando(String comando){
        if(comando.toLowerCase().equals("ctrl+z") && puntero>0){
            puntero--;
            versionador.restoreMemento(versionesArchivos.get(puntero));
        }else if(comando.toLowerCase().equals("ctrl+y") 
        && puntero<versionesArchivos.size()){
            puntero++;
            versionador.restoreMemento(versionesArchivos.get(puntero));
        }else{
            System.out.println("--- imposible ---");
            versionador.restoreMemento(versionesArchivos.get(puntero));
        }
    }
}
