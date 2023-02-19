import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario que ingrese el año, mes y día
        System.out.println("Ingresa el año:");
        int year = sc.nextInt();
        System.out.println("Ingresa el mes:");
        int month = sc.nextInt();
        System.out.println("Ingresa el día:");
        int day = sc.nextInt();

        // Crea un objeto Calendario
        Calendario fecha = new Calendario(year, month, day);

        // Muestra la fecha inicial
        fecha.mostrar();

        // Incrementa la fecha y la muestra después de cada incremento
        fecha.incrementarDia();
        fecha.mostrar();
        fecha.incrementarMes();
        fecha.mostrar();
        fecha.incrementarAño(1);
        fecha.mostrar();

        // Crea otra fecha para comparar
        System.out.println("Ingresa otra fecha para comparar:");
        System.out.println("Año:");
        int otherYear = sc.nextInt();
        System.out.println("Mes:");
        int otherMonth = sc.nextInt();
        System.out.println("Día:");
        int otherDay = sc.nextInt();
        Calendario otraFecha = new Calendario(otherYear, otherMonth, otherDay);

        // Compara las fechas
        boolean sonIguales = fecha.iguales(otraFecha);
        if (sonIguales) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son distintas.");
        }

        sc.close();
    }
}

