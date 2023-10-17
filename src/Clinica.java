import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Clinica {

    private PriorityQueue<Paciente> listaPacientes;


    public Clinica(){
        listaPacientes=new PriorityQueue<Paciente>();
    }


    public void encolar(Paciente dato){
        listaPacientes.add(dato);
    }
    public Paciente atender() throws Exception {
        if (listaPacientes.isEmpty())
            throw new Exception("No existen elementos");
        return listaPacientes.remove();
    }

    public List<Paciente> listarPaciente(){
        //return Arrays.stream(listaPacientes.stream().toArray()).toList()
        List<Paciente> pacientes=new LinkedList<>();

        for (Paciente p: listaPacientes){
            pacientes.add(p);
        }
        return pacientes;
    }

}
