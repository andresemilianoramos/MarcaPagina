public class MarcaPagina {
    private int ultimaPaginaLeida;
    private int totalPaginas;

    public MarcaPagina(int totalPaginas) {
        this.totalPaginas = totalPaginas;
        this.ultimaPaginaLeida = 0;
    }

    public void incrementarPaginaLeida() {
        if (ultimaPaginaLeida < totalPaginas) {
            ultimaPaginaLeida++;
        }
    }

    public int obtenerUltimaPaginaLeida() {
        return ultimaPaginaLeida;
    }

    public void comenzarNuevaLectura() {
        ultimaPaginaLeida = 0;
    }
}
