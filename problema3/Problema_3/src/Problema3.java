class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosEstudiante;
    private double presupuesto;

    public InstitucionEducativa(){}
    public InstitucionEducativa(String nombre,String tipoInstitucion,
                                int numeroAlumnos, int numeroDocentes,
                                int numeroSedes,double gastosProyectadosEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosEstudiante = gastosProyectadosEstudiante;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }
    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    public void setGastosProyectadosEstudiante(double gastosProyectadosEstudiante) {
        this.gastosProyectadosEstudiante = gastosProyectadosEstudiante;
    }
    public void calcularPresupuesto (){
        this.presupuesto = this.numeroAlumnos * this.gastosProyectadosEstudiante;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipoInstitucion() {
        return tipoInstitucion;
    }
    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }
    public int getNumeroDocentes() {
        return numeroDocentes;
    }
    public int getNumeroSedes() {
        return numeroSedes;
    }
    public double getGastosProyectadosEstudiante() {
        return gastosProyectadosEstudiante;
    }
    public double getPresupuesto() {
        return presupuesto;
    }
    public String toString() {
        return "Nombre: " + nombre +
                "\n Tipo de institución: " + tipoInstitucion +
                "\n Número de alumnos: " + numeroAlumnos +
                "\n Número de docentes: " + numeroDocentes +
                "\n Número de sedes: " + numeroSedes +
                "\n Gastos proyectados por estudiante: " + gastosProyectadosEstudiante +
                "\n Presupuesto: " + presupuesto;
    }
}
public class Problema3 {
    public static void main(String[] args) {
        InstitucionEducativa institucionEducativa1 = new InstitucionEducativa("Pedro","Ficomisonal",400,20,40,800);
        institucionEducativa1.calcularPresupuesto();
        institucionEducativa1.getNombre();
        institucionEducativa1.getTipoInstitucion();
        institucionEducativa1.getNumeroAlumnos();
        institucionEducativa1.getNumeroDocentes();
        institucionEducativa1.getNumeroSedes();
        institucionEducativa1.getGastosProyectadosEstudiante();
        institucionEducativa1.getPresupuesto();
        System.out.println(institucionEducativa1);
    }
}
