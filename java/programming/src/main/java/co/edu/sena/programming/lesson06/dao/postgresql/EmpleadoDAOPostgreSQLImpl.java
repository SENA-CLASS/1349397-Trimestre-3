package co.edu.sena.programming.lesson06.dao.postgresql;

import co.edu.sena.programming.lesson06.dao.Empleado;
import co.edu.sena.programming.lesson06.dao.EmpleadoDAO;

public class EmpleadoDAOPostgreSQLImpl implements EmpleadoDAO{
    @Override
    public void insertar(Empleado e) {
        System.out.println("inserte en posgreSQL "+e.toString());
    }

    @Override
    public void delete(Empleado e) {
        System.out.println("delete de posgreSQL "+e.toString());
    }

    @Override
    public void findAll(Empleado e) {
        System.out.println("select * de posgreSQL" +e.toString());
    }

    @Override
    public void update(Empleado e) {
        System.out.println("update de posgreSQL "+e.toString());
    }
}
