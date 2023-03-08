package Ejercicios_Parcial_2.Ejercicio2;

public abstract class Usuario {

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected IMediator mediator;

    public Usuario (IMediator mediator){
        this.mediator=mediator;
    }

    public abstract void send(String msg, String tipoMensaje);
    public abstract void messageReceived(String msg);
    public void informacion(){
        System.out.println("-------------");
        System.out.println("NOMBRE: "+nombre);
    }
}
