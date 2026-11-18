public class usuarioEstudiante extends usuario {
    private int fechaExpedicion = 0;
    public usuarioEstudiante (String usuario, int edad, int pin, String correo, int saldo, int documento, int numeroTarjeta, int _fechaExpedicion) {
        super(usuario, edad, pin, correo, saldo, documento, numeroTarjeta);

    }
    @Override
    public void descuento (){
        System.out.println("");
    }
}
