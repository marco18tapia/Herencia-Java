
package Persona;


public class Maestro extends Persona{
 private String IdProfesor;
 private String Materia;
 private int Antiguedad;
 private String TipoContrato;
 
    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public Maestro (String Nombre, String ApellidoP,String ApellidoM, int edad) {

        super(Nombre, ApellidoP,ApellidoM, edad);

        IdProfesor = "Unknown";   } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }

    public String getIdProfesor () { return IdProfesor;   }

    public String getMateria() {
        return Materia;
    }
    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }
    

    public void mostrarNombreApellidosYCarnet() {


        System.out.println ("Profesor de nombre: " + getNombre() + " " +  getApellidoP() + getApellidoM() +"\n Edad:"+getEdad()+

         "\n con Id de profesor: " + getIdProfesor()+ "\n Antiguedad :"+ getAntiguedad() +"años"+" \n Tipo de Contrato :"+ 
                getTipoContrato() +"\n Materia que imparte :"+ getMateria() ); }
    
}
