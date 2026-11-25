public class vehiculosMotoElectrica extends vehiculos{
    //$3.500 de desbloqueo + $500 por minuto + $400 por km + $1.000 de seguro por viaje.
    public vehiculosMotoElectrica( int kilometros, int tiempoUso, int bateria, int numeroViajes, int costo, int codigoVehiculo){
        super(kilometros, tiempoUso, bateria, numeroViajes, costo, codigoVehiculo);
        
    }

    public void requiereMantenimiento (){
    }

}
