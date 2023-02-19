import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número total de páginas del libro: ");
        int totalPaginas = scanner.nextInt();

        MarcaPagina marca = new MarcaPagina(totalPaginas);

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Incrementar página leída");
            System.out.println("2. Obtener última página leída");
            System.out.println("3. Comenzar nueva lectura");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    marca.incrementarPaginaLeida();
                    System.out.println("====== Página leída: " + marca.obtenerUltimaPaginaLeida()+" ======");
                    break;
                case 2:
                    System.out.println("====== Última página leída: " + marca.obtenerUltimaPaginaLeida()+" ======");
                    break;
                case 3:
                    marca.comenzarNuevaLectura();
                    System.out.println("====== Se ha comenzado una nueva lectura ======");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("====== Opción inválida ======");
            }
        }
    }
}
