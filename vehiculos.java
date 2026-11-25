public class vehiculos {
    private int kilometros  = 0;
    private int tiempoUso = 0;
    private int bateria = 0;
    private int numeroViajes = 0;
    private int costo = 0;
    private int codigoVehiculo = 0;

    public vehiculos(int _kilometros, int _tiempoUso, int _bateria, int _numeroViajes, int _costo, int _codigoVehiculo){
        this.kilometros = _kilometros;
        this.tiempoUso = _tiempoUso;
        this.bateria = _bateria;
        this.numeroViajes = _numeroViajes;
        this.costo = _costo;
        this. codigoVehiculo = _codigoVehiculo;
    }
    
    public void requiereMantenimiento (){
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(int tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getNumeroViajes() {
        return numeroViajes;
    }

    public void setNumeroViajes(int numeroViajes) {
        this.numeroViajes = numeroViajes;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

}
