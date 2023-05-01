
public class Problema3 {
public static class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;
    public void Problema3(){}

    public InstitucionEducativa() {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public int getNumDocentes() {
        return numDocentes;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public double getGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
    }
    public void setPresupuesto (){

        this.presupuesto = numAlumnos * gastosProyectadosPorEstudiante;
    }

    public double getPresupuesto() {

        return presupuesto;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTipo de institución: " + tipoInstitucion
                + "\nNúmero de alumnos: " + numAlumnos + "\nNúmero de docentes: " + numDocentes
                + "\nNúmero de sedes: " + numSedes + "\nGastos proyectados por estudiante: "
                + gastosProyectadosPorEstudiante + "\nPresupuesto: " + presupuesto;
    }

    public static void main(String[] args) {
        InstitucionEducativa insttucion1 = new InstitucionEducativa();
        insttucion1.setNombre("Carlos Lopez");
        insttucion1.setTipoInstitucion("San Gerardo");
        insttucion1.setNumAlumnos(45);
        insttucion1.setNumDocentes(60);
        insttucion1.setNumSedes(55);
        insttucion1.setGastosProyectadosPorEstudiante(200);
        insttucion1.setPresupuesto();
        System.out.println(insttucion1);
    }
}
}