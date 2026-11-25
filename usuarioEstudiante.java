public class usuarioEstudiante extends usuario {
    private boolean  fechaExpedicion ;
    public usuarioEstudiante (String usuario, int edad, String pin, String correo, int saldo, int documento, int numeroTarjeta, boolean  _fechaExpedicion) {
        super(usuario, edad, pin, correo, saldo, documento, numeroTarjeta);
        this.fechaExpedicion = _fechaExpedicion;

    }
    @Override
    public void descuento (){
        
    }

    
    
}
