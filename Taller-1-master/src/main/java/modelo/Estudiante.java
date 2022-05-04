
package modelo;

public class Estudiante {
    
    //Atributos Persona
    private String Nombre;
    private String Matricula;
    private String Carrera;
    private String Correo;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Matricula, String Carrera, String Correo) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Matricula=" + Matricula + ", Carrera=" + Carrera + ", Correo=" + Correo + '}';
    }
    
    
}
// para agreagar algunos estudiantes
 public class estudiantesej {
     
        Estudiante estudiante1 = new Estudiante("luciano", "20725234419", "ICII","l.castaneda01@ufromail.cl");
        Estudiante estudiante2 = new Estudiante("lucia", "20725234519", "ICII","l.castaneda02@ufromail.cl");
        Estudiante estudiante2 = new Estudiante("lucian", "20725234619", "ICII","l.castaneda03@ufromail.cl");
       ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
            System.out.println("------------------------------");
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase("Blas")) {
                estudiantes.remove(i);
            }
        }
        System.out.println("DESPUES DE LA ELIMINACION");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
            System.out.println("------------------------------");
        }
    }

     
       