class Terreno{
    private double costoTerreno;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;
    public Terreno (){}
    public Terreno(double anchoTerreno,
                   double largoTerreno,
                   double valorMetroCuadrado){
        this.anchoTerreno= anchoTerreno;
        this.largoTerreno=largoTerreno;
        this.valorMetroCuadrado=valorMetroCuadrado;
    }
    public void setAnchoTerreno(double anchoTerreno){
        this.anchoTerreno =anchoTerreno;
    }
    public  void setLargoTerreno(double largoTerreno){
        this.largoTerreno = largoTerreno;
    }
    public  void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado =valorMetroCuadrado;
    }
    public void calcularAreaTerreno(){
        this.areaTerreno=this.anchoTerreno*this.largoTerreno;
    }
    public void calcularCostoTerreno(){
        this.costoTerreno=this.areaTerreno*this.valorMetroCuadrado;
    }
    public double getCostoTerreno(){
        return this.costoTerreno;
    }
    public double getAnchoTerreno(){
        return this.anchoTerreno;
    }
    public double getLargoTerreno(){
        return this.largoTerreno;
    }
    public double getAreaTerreno(){
        return this.areaTerreno;
    }
    public double getValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }
    public String toString(){
        String msj = String.format("DATOS DE TERRENO"
                        +"\n Ancho del terreno: %.2f"
                        +"\n Largo del terreno: %.2f"
                        +"\n Valor del metro cuadrado del terreno: %.2f"
                        +"\n area del terreno: %.2f"
                        +"\n costo del terreno: %.2f",
                this.getAnchoTerreno(),this.getLargoTerreno(),
                this.getValorMetroCuadrado(), this.getAreaTerreno(),
                this.getCostoTerreno());
        return msj;
    }
}
public class Problema_1 {
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10,2,2);
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
    }
}