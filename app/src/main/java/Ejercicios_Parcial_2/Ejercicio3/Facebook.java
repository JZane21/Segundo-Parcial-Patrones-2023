package Ejercicios_Parcial_2.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements ISubject{
    
    private List<IObserver> observerList = new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String tipo) {
        for(int i=0;i<observerList.size();i++){
            if(observerList.get(i) instanceof Subscriptor){
                Subscriptor subscriptor = (Subscriptor) observerList.get(i);
                if(subscriptor.getTipoNotificacion().equals(tipo)
                || subscriptor.getTipoNotificacion().equals("")
                ){
                    subscriptor.update(tipo);
                }
            }
        }
    }
    
}
