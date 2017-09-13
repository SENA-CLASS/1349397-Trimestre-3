package co.edu.sena.programming.lesson04;

import org.omg.PortableInterceptor.INACTIVE;

public class Ejemplo02 {
    public static void main(String[] args) {

        Administrador a = new Administrador();
        a.setPeso(12);
        a.setSexo('M');

        imprimirEmpleado(a);


    }

    public static void imprimirEmpleado(Empleado e){

        if(e instanceof Ingeniero){
            Ingeniero it = (Ingeniero) e;
            System.out.println(it.getTargetaProfesional());
            System.out.println(it.getSexo());

        }else if (e instanceof Gerente){
            Gerente gt = (Gerente)e;
            System.out.println(gt.getEdad());
            System.out.println(gt.getSexo());

        }else if(e instanceof Administrador){
            Administrador at = (Administrador)e;
            System.out.println(at.getPeso());
            System.out.println(at.getSexo());

        }

    }


}
