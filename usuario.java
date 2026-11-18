public class usuario {
        private String usuario = "";
        private int edad = 0;
        private int pin = 0;
        private String correo = "";
        private int saldo = 0;
        private int documento = 0;
        private int numeroTarjeta = 0;

        public usuario(String _usuario, int _edad, int _pin, String _correo, int _saldo, int _documento, int _numeroTarjeta ){
                this.usuario = _usuario;
                this.edad = _edad;
                this.pin = _pin;
                this.correo = _correo;
                this.saldo = _saldo;
                this.documento = _documento;
                this.numeroTarjeta = _numeroTarjeta;
        }

        public String getUsuario() {
        return usuario;
        }

        public void setUsuario(String usuario) {
        this.usuario = usuario;
        }

        public int getEdad() {
        return edad;
        }

        public void setEdad(int edad) {
        this.edad = edad;
        }

        public int getPin() {
        return pin;
        }

        public void setPin(int pin) {
        this.pin = pin;
        }

        public String getCorreo() {
        return correo;
        }

        public void setCorreo(String correo) {
        this.correo = correo;
        }

        public int getSaldo() {
        return saldo;
        }

        public void setSaldo(int saldo) {
        this.saldo = saldo;
        }

        public int getDocumento() {
        return documento;
        }

        public void setDocumento(int documento) {
        this.documento = documento;
        }

        public int getNumeroTarjeta() {
        return numeroTarjeta;
        }

        public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        }



}
