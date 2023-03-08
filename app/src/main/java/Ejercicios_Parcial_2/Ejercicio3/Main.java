package Ejercicios_Parcial_2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        for(int i=0;i<3;i++){
            Subscriptor subscriptor = new Subscriptor("video","persona "+i);
            facebook.attach(subscriptor);
        }
        for(int i=0;i<2;i++){
            Subscriptor subscriptor = new Subscriptor("","persona "+(i+10));
            facebook.attach(subscriptor);
        }

        facebook.notifyObservers("video");
        facebook.notifyObservers("imagen");
    }
}
