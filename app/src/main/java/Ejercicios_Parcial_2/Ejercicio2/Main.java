package Ejercicios_Parcial_2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Estudiantes e1 = new Estudiantes(chat);
        Estudiantes e2 = new Estudiantes(chat);

        Docente docente = new Docente(chat);
        Docente docente2 = new Docente(chat);
        
        Administrativos administrativos = new Administrativos(chat);
        Administrativos administrativo2 = new Administrativos(chat);
        
        administrativos.setNombre("a1");
        administrativos.setCargo("g1");

        administrativo2.setNombre("a1");
        administrativo2.setCargo("g2");

        docente.setNombre("d1");
        docente.setCi(11111);

        docente2.setNombre("d2");
        docente2.setCi(22222);

        e1.setNombre("e1");
        e1.setNumeroMatricula(123);

        e2.setNombre("e2");
        e2.setNumeroMatricula(321);

        chat.addUsuario(administrativo2);
        chat.addUsuario(administrativos);
        chat.addUsuario(e1);
        chat.addUsuario(e2);
        chat.addUsuario(docente);
        chat.addUsuario(docente2);

        e1.send("hola 1", "todos");

    }
}
