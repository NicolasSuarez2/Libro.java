public class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponible;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.equals("")) {
            System.out.println("Error: El título no puede estar vacío.");
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
        System.out.println("----- INFORMACIÓN DEL LIBRO -----");
        System.out.println("Título: " + titulo);
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
            System.out.println("El libro '" + titulo + "' ya está prestado, no se puede prestar.");
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