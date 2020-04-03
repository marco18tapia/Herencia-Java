package Persona;
public class PersonaH {
    public static void main(String[] args) {
        System.out.println("\n Profesor \n");
         Maestro profesor1 = new Maestro ("Juan","Hernández"," García", 33);

        profesor1.setIdProfesor(" 22-387-11");
        profesor1.setAntiguedad(3);
        profesor1.setTipoContrato("Asalareado");
        profesor1.setMateria("Programacion Orientada a Objectos");
        
        profesor1.mostrarNombreApellidosYCarnet();
        //ALUMNO
        System.out.println("\n Alumno \n");
    //Alumno alum = new Alumno("Angelica","Rios"," Subdias", 23);
        Alumno asd =new Alumno("ANGELIC", "RIOS", "SUBDIAS", 23);
        asd.setMatricula(18680211);
        asd.setCarrera("Sistemas Computacionales");
        asd.setTipo("Maestria");
        asd.mostrarNombreApellidosYCarnet();
        //DIRECTIVO
         System.out.println("\n Directivo \n");
         Directivo Direc =new Directivo("LUIS", "GARCIA", "GARCIA", 54);
                 Direc.setDepartemanto("Sistemas Computacionales");
                 Direc.setFuncion("Administrador**");
                 Direc.setAntiguedad(5);
                 Direc.setIdMatricula(87987654);
                 Direc.mostrarNombreApellidosYCarnet();
    } 
    }
    
