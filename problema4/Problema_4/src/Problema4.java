class EquipoCelular {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String direccionImei;

    public EquipoCelular() {
    }

    public EquipoCelular(String sistemaOperativo,
                         double tamañoPantalla,
                         double costoInicial,
                         double ivaPorcentaje,
                         String direccionMac,
                         String direccionImei) {
        this.sistemaOperativo =sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.direccionImei = direccionImei;

    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void setDirecciomMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setDireccionImei(String direccionImei) {
        this.direccionImei = direccionImei;
    }

    public void calcularIvaPorcentaje() {
        this.ivaPorcentaje = this.ivaPorcentaje / 100;
    }

    public void calcularIvaCostoInicial() {
        this.ivaCostoInicial = this.costoInicial * this.ivaPorcentaje;
    }

    public void calcularcostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public double getTamañoPantalla() {
        return this.tamañoPantalla;
    }

    public double getCostoInicial() {
        return this.costoInicial;
    }

    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return this.ivaCostoInicial;
    }

    public double getCostoFinal() {
        return this.costoFinal;
    }

    public String getDireccionMac() {
        return this.direccionMac;
    }

    public String getDireccImei() {
        return this.direccionImei;
    }

    public String toString() {
        return  " \nSistema Operativo: " + sistemaOperativo +
                " \nTamaño de Pantalla: " + tamañoPantalla +
                " \nCosto Inicial del telefono: " + costoInicial +
                " \nIva en Porcentaje: " + ivaPorcentaje +
                " \nIva del costo Inicial: " + ivaCostoInicial +
                " \nCosto Final: " + costoFinal +
                " \nDireccion Mac: " + direccionMac +
                " \nDireccion Imei: " + direccionImei + "-";
    }

}
public class Problema4 {
    public static void main(String[] args) {
        EquipoCelular equipoCelular1 = new EquipoCelular("Ios",10.5,500,12,"00:1B:44:11:3A:B7","158453132215353");
        equipoCelular1.calcularIvaPorcentaje();
        equipoCelular1.calcularIvaCostoInicial();
        equipoCelular1.calcularcostoFinal();
        equipoCelular1.getSistemaOperativo();
        equipoCelular1.getTamañoPantalla();
        equipoCelular1.getCostoInicial();
        equipoCelular1.getIvaPorcentaje();
        equipoCelular1.getIvaCostoInicial();
        equipoCelular1.getCostoFinal();
        equipoCelular1.getDireccionMac();
        equipoCelular1.getDireccImei();
        System.out.println(equipoCelular1);
    }
}
