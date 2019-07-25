package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("esto es un mensaje"),
    MENSAJE_TITULO("esto es un titulo"),
    MENSAJE_DOLAR_ALTO("el dólar esta muy caro"),
    MENSAJE_DOLAR_BAJO("el dólar esta super barato"),
    MENSAJE_INGRESO_VALOR("Ingrese un valor");


    private String mensaje;

    Constantes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
