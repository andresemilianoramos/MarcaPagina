public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha no válida");
        }
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasEnMes(mes, año)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    public void mostrar() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, año);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año &&
                this.mes == otraFecha.mes &&
                this.dia == otraFecha.dia;
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (año < 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(mes, año)) {
            return false;
        }
        return true;
    }

    private int diasEnMes(int mes, int año) {
        switch (mes) {
            case 2:
                return (esAñoBisiesto(año)) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private boolean esAñoBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }
}
