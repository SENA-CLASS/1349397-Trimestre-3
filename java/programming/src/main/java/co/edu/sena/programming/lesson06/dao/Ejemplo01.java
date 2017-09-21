package co.edu.sena.programming.lesson06.dao;

import co.edu.sena.programming.lesson06.dao.factory.EmpleadoDaoFactory;
import co.edu.sena.programming.lesson06.dao.mysql.EmpleadoDAOMysqlImpl;
import co.edu.sena.programming.lesson06.dao.oracle.EmpleadoDAOOracleImpl;
import co.edu.sena.programming.lesson06.dao.postgresql.EmpleadoDAOPostgreSQLImpl;

public class Ejemplo01 {
    public static void main(String[] args) {





        Empleado e1 = new Empleado();
        e1.setTipoDocumento("CC");
        e1.setNumeroDocumento("123456");
        e1.setPrimerNombre("hernando");
        e1.setSegundoNombre("enrique");
        e1.setPrimerApellido("moreno");
        e1.setSegundoApellido("moreno");


        EmpleadoDaoFactory fabrica = new EmpleadoDaoFactory();
        EmpleadoDAO dao = fabrica.createPostgreSQL();
        dao.insertar(e1);


    }
}
