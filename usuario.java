public class usuario {
        private String usuario = "";
        private int edad = 0;
        private String pin = "";
        private String correo = "";
        private int saldo = 0;
        private int documento = 0;
        private int numeroTarjeta = 0;

        public usuario(String _usuario, int _edad, String _pin, String _correo, int _saldo, int _documento, int _numeroTarjeta ){
                this.usuario = _usuario;
                this.edad = _edad;
                this.pin = _pin;
                this.correo = _correo;
                this.saldo = _saldo;
                this.documento = _documento;
                this.numeroTarjeta = _numeroTarjeta;

        }
        public usuario(String _usuario, int _edad,  int _saldo){
                if (_usuario !=null && _edad>=16 && _saldo==0) {
                this.usuario = _usuario;
                this.edad = _edad;
                this.saldo = _saldo;
                }else{
                    System.out.println("--no cumple con los requisitos para crear tu usuario:");
                }


        }
        public void descuento(){

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

        public String getPin() {
        return pin;
        }

        public void setPin(String pin) {
            int tamaño = pin.length();
        if (tamaño == 4 && !pin.equals("1111") && !pin.equals("0000")){
            this.pin = pin;
        }else{
            System.out.println("--no cumple con los requisitos para crear tu pin:");
        }
        
        }

        public String getCorreo() {
        return correo;
        }

        public void setCorreo(String correo) {
        correo = correo.trim();//elimina espacios
        correo = correo.toLowerCase();//pasa todo a minusculas

        int posicionArroba = correo.indexOf('@');
        int posicionPunto = correo.lastIndexOf('.');

        if (posicionArroba > 0 && posicionPunto > posicionArroba) {
        this.correo = correo;
        } else {
            System.out.println("no siguio las instrucciones parce, tiene que repetir su correo para continuar:");
        }
        }

        public int getSaldo() {
        return saldo;
        }

        public void setSaldo(int saldo) {
        if(saldo >= 0 && saldo <= 200000){
            this.saldo = saldo;
        }else{
            System.out.println("su recarga tiene que ser mayor a 0 y menor que 200.000:");
        }
        }

        public int getDocumento() {
        return documento;
        }
        public String getDocumentoInteligente() {
            String docenmascarado = String.valueOf(documento);//el valueOf sitve para pasar de entero a cadema de texto.
            String ultimos = docenmascarado.substring(docenmascarado.length() - 4);
            
        return "**** **** **** " + ultimos;
        }

        public void setDocumento(int documento) {
        this.documento = documento;
        }

        public int getNumeroTarjeta() {
        return numeroTarjeta;
        }

        public String getDocumentoEnmascarado() {
        String texto = String.valueOf(documento);
        String ultimos = texto.substring(texto.length() - 3);
        return "*******" + ultimos;
        }

        public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        }



}