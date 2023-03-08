package Ejercicios_Parcial_2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        GoogleDocs googleDocs = new GoogleDocs();

        archivo.setContenido("hola 1");
        archivo.setState("estado 1");
        googleDocs.addMemento(archivo);

        archivo.setContenido("hola 2");
        archivo.setState("estado 2");
        googleDocs.addMemento(archivo);

        archivo.setContenido("hola 3");
        archivo.setState("estado 3");
        googleDocs.addMemento(archivo);

        archivo.setContenido("hola 4");
        archivo.setState("estado 4");
        googleDocs.addMemento(archivo);

        googleDocs.realizarComando("ctrl+z");
        googleDocs.realizarComando("ctrl+z");
        googleDocs.realizarComando("ctrl+z");
    }
}
