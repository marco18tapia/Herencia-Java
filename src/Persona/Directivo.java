
package Persona;

import java.util.ArrayList;

public class Directivo extends Persona{
    private String Departemanto;
    private String Funcion;
    private int Antiguedad;
     private int IdMatricula;
    
     //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public Directivo (String Nombre, String ApellidoP,String ApellidoM, int edad) {

        super(Nombre, ApellidoP,ApellidoM, edad);
       
        String Departamento = "Unknown";
} //Cierre del constructor
    public String getDepartemanto () { return Departemanto;}
    //Métodos específicos de la subclase
    public void setDepartemanto(String Departemanto) {    this.Departemanto = Departemanto; }

    public int getAntiguedad() {    return Antiguedad;}

    public void setAntiguedad(int Antiguedad) {    this.Antiguedad = Antiguedad; }

    public String getFuncion() {    return Funcion; }

    public void setFuncion(String Funcion) {     this.Funcion = Funcion; }
 
    //Matricula
    public void setIdMatricula(int Matricula) {    this.IdMatricula = Matricula; }

    public int getIdMatricula () { return IdMatricula;   }

    public void mostrarNombreApellidosYCarnet() {


    System.out.println ("Directivo Nombre: " + getNombre() + " " +  getApellidoP() + getApellidoM() +" \n Edad: "+ getEdad()+
                " \n Departamento :"+ getDepartemanto()+"\n Funcion: "+getFuncion() +" \n Antiguedad: "+getAntiguedad() +

         "\n con Id de Directivo: " + getIdMatricula() ); }
}
