package Ejercicios_Parcial_2.Ejercicio2;

public class Estudiantes extends Usuario{
    private int numeroMatricula;
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Estudiantes(IMediator mediator) {
        super(mediator);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        if(tipoMensaje.toLowerCase().equals("todos") ||
        tipoMensaje.toLowerCase().equals("docentes") ||
        tipoMensaje.toLowerCase().equals("administrativos")){
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
        System.out.println("N Matricula: "+numeroMatricula);
    }
    
}
