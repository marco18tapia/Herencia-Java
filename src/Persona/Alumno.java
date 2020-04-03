
package Persona;

public class Alumno extends Persona{
 
     //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
private int Matricula;
private String Carrera;
private String Tipo;
    public Alumno (String Nombre, String ApellidoP,String ApellidoM, int edad) {

        super(Nombre, ApellidoP,ApellidoM, edad);

          } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setMatricula (int Matricula) { this.Matricula = Matricula;   }

    public int getMatricula () { return Matricula;   }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
    public void mostrarNombreApellidosYCarnet() {


        System.out.println ("Nombre Alumno: " + getNombre() + " " +  getApellidoP() +" "+ getApellidoM() + "\n Edad:"+getEdad()+

         "\n con Matricula: " + getMatricula()+ "\n Carrera: "+getCarrera()+"\n Tipo:"+getTipo() ); }
    
}


