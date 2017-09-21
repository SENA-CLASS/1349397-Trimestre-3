package co.edu.sena.programming.lesson06.dao.oracle;

import co.edu.sena.programming.lesson06.dao.Empleado;
import co.edu.sena.programming.lesson06.dao.EmpleadoDAO;

public class EmpleadoDAOOracleImpl implements EmpleadoDAO {
    @Override
    public void insertar(Empleado e) {
        System.out.println("inserte en oracle "+e.toString());
    }

    @Override
    public void delete(Empleado e) {
        System.out.println("delete de oracle "+e.toString());
    }

    @Override
    public void findAll(Empleado e) {
        System.out.println("select * de oracle" +e.toString());
    }

    @Override
    public void update(Empleado e) {
        System.out.println("update de oracle "+e.toString());
    }
}
