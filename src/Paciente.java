public class Paciente implements Comparable<Paciente> {
    private int Prioridad;
    private String nombre;
    private String sintomas;
    

    public Paciente(int prioridad, String nombre, String sintomas) {
        Prioridad = prioridad;
        this.nombre = nombre;
        this.sintomas = sintomas;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int prioridad) {
        Prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Prioridad=" + Prioridad +
                ", nombre='" + nombre + '\'' +
                ", sintomas='" + sintomas + '\'' +
                '}';
    }

    @Override
    public int compareTo(Paciente o) {
        if (this.Prioridad<o.getPrioridad())
            return -1;
        else
            return -1;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

