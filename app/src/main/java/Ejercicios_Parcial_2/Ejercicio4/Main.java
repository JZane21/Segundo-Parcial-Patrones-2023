package Ejercicios_Parcial_2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        BD bd = new BD();


        bd.addLibros(new Libros(111, "aaaa", "bbbbb"));
        bd.addLibros(new Libros(112, "bbbb", "afagf"));
        bd.addLibros(new Libros(115, "aaaa", "fasdf"));
        bd.addLibros(new Libros(116, "eeee", "afdas"));
        bd.addLibros(new Libros(114, "cccc", "hdrth"));
        bd.addLibros(new Libros(113, "aaaa", "ineio"));
        bd.addLibros(new Libros(117, "qqqq", "odfkd"));
        

        System.out.println("alg 1:");
        bd.setStrategy(new Alg1());
        bd.buscarLibros();

        System.out.println("\nalg 2:");
        bd.setStrategy(new Alg2());
        bd.buscarLibros();

        System.out.println("\nalg 3:");
        bd.setStrategy(new Alg3());
        bd.buscarLibros();
    }
}
