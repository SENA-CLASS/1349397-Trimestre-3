package co.edu.sena.programming.lesson06.dao.factory;

import co.edu.sena.programming.lesson06.dao.Empleado;
import co.edu.sena.programming.lesson06.dao.EmpleadoDAO;
import co.edu.sena.programming.lesson06.dao.memoria.EmpleadoDAOMemoriaImpl;
import co.edu.sena.programming.lesson06.dao.mysql.EmpleadoDAOMysqlImpl;
import co.edu.sena.programming.lesson06.dao.oracle.EmpleadoDAOOracleImpl;
import co.edu.sena.programming.lesson06.dao.postgresql.EmpleadoDAOPostgreSQLImpl;

public class EmpleadoDaoFactory {

    public  EmpleadoDAO createMylsq() {
        return new EmpleadoDAOMysqlImpl();
    }

    public  EmpleadoDAO createMemory(){
        return new EmpleadoDAOMemoriaImpl();
    }

    public  EmpleadoDAO createPostgreSQL(){
        return new EmpleadoDAOPostgreSQLImpl();
    }

    public  EmpleadoDAO createOracle(){
        return new EmpleadoDAOOracleImpl();
    }


}
