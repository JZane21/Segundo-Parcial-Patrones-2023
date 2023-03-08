package Ejercicios_Parcial_2.Ejercicio3;

public class Subscriptor implements IObserver{

    private String tipoNotificacion;
    private String name;

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion.toLowerCase();
    }

    public Subscriptor(String tipoNotificacion, String name) {
        this.name = name;
        if(tipoNotificacion.isEmpty()){
            this.tipoNotificacion = "";
        }else{
            this.tipoNotificacion = tipoNotificacion.toLowerCase();
        }
    }

    @Override
    public void update(String msg) {
        System.out.println(">>> Subscriptor <<<");
        System.out.println("Name: "+name);
        System.out.println(">>> Notify <<<");
        System.out.println(msg);
    }
    
}
