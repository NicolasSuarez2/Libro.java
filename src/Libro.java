public class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.equals("")) {
            System.out.println("Error: El titulo no puede estar vacio.");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("----- INFORMACION DEL LIBRO -----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        if (disponible) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Prestado (No disponible)");
        }
        System.out.println("---------------------------------");
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Has prestado el libro: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' ya esta prestado, no se puede prestar.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Has devuelto el libro: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible en la biblioteca.");
        }
    }
}