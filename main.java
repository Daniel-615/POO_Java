public class main{
    public static void main(String[] args){
        
        Alumno persona= new Alumno();
        persona.id=100;
        persona.nombre="Angel";
        persona.Apellidos="Suyan";
        persona.Edad=19;
        persona.Semestre="Quinto";
        persona.carrera="Ingenieria en Sistemas";
        persona.estudiando();
        persona.getApellidos();

        /*Catedratico */
        Catedratico persona1=new Catedratico();
        persona1.id=101;
        persona1.nombre="Enrique";
        persona1.Apellidos="Cerezo";
        persona1.Edad=40;
        persona1.anos_exp=10;
        persona1.enseñar();
        
    };
}