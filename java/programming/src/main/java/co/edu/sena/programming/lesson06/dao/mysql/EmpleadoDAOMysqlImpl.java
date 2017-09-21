package co.edu.sena.programming.lesson06.dao.mysql;

import co.edu.sena.programming.lesson06.dao.Empleado;
import co.edu.sena.programming.lesson06.dao.EmpleadoDAO;

public class EmpleadoDAOMysqlImpl implements EmpleadoDAO {
    @Override
    public void insertar(Empleado e) {
        System.out.println("inserte en mysql "+e.toString());
    }

    @Override
    public void delete(Empleado e) {
        System.out.println("delete de mysql "+e.toString());
    }

    @Override
    public void findAll(Empleado e) {
        System.out.println("select * de mysql "+e.toString());
    }

    @Override
    public void update(Empleado e) {
        System.out.println("update de mysql "+e.toString());
    }
}
