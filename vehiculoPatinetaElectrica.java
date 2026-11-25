public class vehiculoPatinetaElectrica extends vehiculos {
    //$2.000 de desbloqueo + $350 por minuto + $200 por km.
    public vehiculoPatinetaElectrica( int kilometros, int tiempoUso, int bateria, int numeroViajes, int costo, int codigoVehiculo, String formato){
        super(kilometros, tiempoUso, bateria, numeroViajes, costo, codigoVehiculo,formato);
        
    }
    
    public void requiereMantenimiento (){
    }

}
