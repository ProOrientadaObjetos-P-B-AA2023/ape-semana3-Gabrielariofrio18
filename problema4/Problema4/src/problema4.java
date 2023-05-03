class Celulares{
        private String sistemaOperativo;
        private double tamPantalla;
        private double costoInicial;
        private double ivaPorcentaje;
        private double ivaCosto_inicial;
        private double costoFinal;
        private String direccMac;
        private String direccImei;
        public Celulares(){}
        public Celulares(String sistemaOperativo,
                         double tamPantalla,
                         double ivaPorcentaje,
                         String direccMac,
                         String direccImei,
                         double costoInicial){
            this.tamPantalla=tamPantalla;
            this.ivaPorcentaje=ivaPorcentaje;
            this.direccMac=direccMac;
            this.direccImei=direccImei;
            this.costoInicial=costoInicial;
        }
        public void setSistemaOperativo(String sistemaOperativo){
            this.sistemaOperativo=sistemaOperativo;
        }
        public void setTamPantalla(double tamPantalla){
            this.tamPantalla=tamPantalla;
        }
        public void setDireccMac(String direccMac){
            this.direccMac=direccMac;
        }
        public void setDireccImei(String direccImei){
            this.direccImei=direccImei;
        }
        public void setCostoInicial(double costoInicial){

            this.costoInicial=costoInicial;
        }
        public void setIvaPorcentaje(double ivaPorcentaje){
            this.ivaPorcentaje=ivaPorcentaje/100;
        }
        public void CalcularIvaCosto_inicial(){
            this.ivaCosto_inicial=this.costoInicial*this.ivaPorcentaje;
        }
        public void CalcularcostoFinal(){
            this.costoFinal=this.costoInicial+this.ivaCosto_inicial;
        }
        public String getSistemaOperativo(){
            return this.sistemaOperativo;
        }
        public double getTamPantalla(){
            return this.tamPantalla;
        }

        public String getDireccMac() {
            return this.direccMac;
        }
        public String getDireccImei(){
            return this.direccImei;
        }

        public double getCostoInicial() {
            return this.costoInicial;
        }
        public double getIvaPorcentaje(){
            return this.ivaPorcentaje;
        }
        public double getIvaCosto_inicial(){
            return this.ivaCosto_inicial;
        }
        public double getCostoFinal(){
            return this.costoFinal;
        }
        public String toString() {
            return "Sistema Operativo: " + sistemaOperativo + "\nTamaño de Pantalla: " + tamPantalla
                    + " Pulgadas"+"\nDireccion Mac: " + direccMac+ "\nDireccion Imei: " + direccImei
                    + "\nCosto Inicial del telefono: " + costoInicial + " $ dolares"+"\nIva en Porcentaje: "
                    + ivaPorcentaje +" %"+"\nIva del costo Inicial: " + ivaCosto_inicial + " $ dolares"+"\nCosto Final: "+costoFinal+" $ dolares";
        }
}



public class problema4{
    public static void main(String[] args) {
        Celulares celulares1=new Celulares();
        celulares1.setSistemaOperativo("Android");
        celulares1.setTamPantalla(11.2);
        celulares1.setDireccMac( "00-10-fa-c2-bf-d5");
        celulares1.setDireccImei("125690760011345");
        celulares1.setCostoInicial(300);
        celulares1.setIvaPorcentaje(16);
        celulares1.CalcularIvaCosto_inicial();
        celulares1.CalcularcostoFinal();
        System.out.println(celulares1.toString());
    }


}

