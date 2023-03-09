package Ejercicios_Parcial_2.Ejercicio4;

public class Libros {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String titulo;
    private String categoria;
    private int t1;
    private int c1;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public Libros(int id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.t1 = titulo.toLowerCase().toCharArray()[0] - 'a';
        this.c1 = categoria.toLowerCase().toCharArray()[0] - 'a';
    }

    public void info(){
        System.out.println("--- Libro---");
        System.out.println(getId());
        System.out.println(getTitulo());
        System.out.println(getCategoria());
        System.out.println("------------");
    }
}
