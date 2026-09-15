public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("El mejor equipo del mundo");
        libro1.setAutor("Mauricio Silva Guzmán");
        libro1.setDisponible(true);

        Libro libro2 = new Libro();
        libro2.setTitulo("El mas grande");
        libro2.setAutor("Diego Caldas");
        libro2.setDisponible(true);

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        System.out.println("\n Pruebas de Préstamo");
        libro1.prestar(); 
        libro1.prestar(); 

        System.out.println("\n Pruebas de Devolución");
        libro1.devolver(); 

        System.out.println("\n Pruebas de Validación");
        libro2.setTitulo(""); 
    }
}