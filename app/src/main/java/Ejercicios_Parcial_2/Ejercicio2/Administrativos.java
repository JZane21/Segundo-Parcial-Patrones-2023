package Ejercicios_Parcial_2.Ejercicio2;

public class Administrativos extends Usuario{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativos(IMediator mediator) {
        super(mediator);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        if(tipoMensaje.toLowerCase().equals("todos")){
            this.mediator.send(msg,this,tipoMensaje);
        }else{
            System.out.println("imposible");
        }
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Mensaje recibido");
        System.out.println("para:");
        this.informacion();
    }

    @Override
    public void informacion(){
        super.informacion();
        System.out.println("Cargo: "+cargo);
    }
    
}
