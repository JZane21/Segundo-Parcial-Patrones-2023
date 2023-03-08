package Ejercicios_Parcial_2.Ejercicio1;

public class Archivo {
    private String contenido;
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public void showInfo(){
        System.out.println("------------");
        System.out.println("contenido: "+contenido);
        System.out.println("state: "+state);
        System.out.println("************");
    }
}
