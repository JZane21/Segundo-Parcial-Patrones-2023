package Ejercicios_Parcial_2.Ejercicio4;

import java.util.Vector;

public class Alg2 implements IStrategy{

    @Override
    public void execute(Vector<Libros> librosList) {
        for(int i=0;i<librosList.size()-1;i++){
            for(int j=i+1;j<librosList.size();j++){
                if(librosList.get(i).getT1()>librosList.get(j).getT1()){
                    Libros aux = librosList.get(i);
                    librosList.set(i, librosList.get(j));
                    librosList.set(j, aux);
                }
            }
        }
        librosList.forEach(i->i.info());
    }
    
}
