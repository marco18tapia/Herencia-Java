package Persona;
public class Persona {
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private int Edad;

    //Constructor
    public Persona (String Nombre, String ApellidoP,String ApellidoM, int Edad) {

        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Edad = Edad;                   }

    //Métodos

    public String getNombre () { return Nombre;  }
    public String getApellidoP () { return ApellidoP;  }
    public String getApellidoM () { return ApellidoM;  }
    public int getEdad () { return Edad;   }
    
}
