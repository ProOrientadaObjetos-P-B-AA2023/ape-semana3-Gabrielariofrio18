class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public EquivalenteHora() {}

    public EquivalenteHora(int horas) {
        this.horas = horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void calcularDias() {
        this.dias = (double) this.horas / 24;
    }
    public void calcularMinutos(){
        this.minutos = this.horas * 60;
    }
    public void calcularSegundos(){
        this.segundos = this.horas * 3600;
    }

    public int getMinutos() {

        return this.minutos;
    }

    public int getSegundos() {

        return this.segundos;
    }

    public double getDias() {

        return this.dias;
    }

    public String toString() {
        return  "DATOS EN HORAS,MINUTOS,SEGUNDOS Y DIAS" +
                "\n horas=" + horas +
                " \n minutos=" + minutos +
                " \n segundos=" + segundos +
                " \n dias=" + dias +
                '-';
    }
}
public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora equivalenteHora1 = new EquivalenteHora(20);
        equivalenteHora1.calcularMinutos();
        equivalenteHora1.calcularSegundos();
        equivalenteHora1.calcularDias();
        equivalenteHora1.getMinutos();
        equivalenteHora1.getSegundos();
        equivalenteHora1.getDias();
        System.out.println(equivalenteHora1);
    }
}
