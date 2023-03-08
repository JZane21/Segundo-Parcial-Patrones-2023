package Ejercicios_Parcial_2.Ejercicio2;

public class Docente extends Usuario{
    private int ci;

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Docente(IMediator mediator) {
        super(mediator);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        if(tipoMensaje.toLowerCase().equals("estudiantes") ||
        tipoMensaje.toLowerCase().equals("docentes")){
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
        System.out.println("Ci: "+ci);
    }
    
}
