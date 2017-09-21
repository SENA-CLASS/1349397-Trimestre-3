package co.edu.sena.programming.lesson06.dao.memoria;

import co.edu.sena.programming.lesson06.dao.Empleado;
import co.edu.sena.programming.lesson06.dao.EmpleadoDAO;

public class EmpleadoDAOMemoriaImpl implements EmpleadoDAO {
    @Override
    public void insertar(Empleado e) {
        System.out.println("guardo en la memoria");
    }

    @Override
    public void delete(Empleado e) {
        System.out.println("elimino de la memoria");
    }

    @Override
    public void findAll(Empleado e) {
        System.out.println("busco en la memoria");
    }

    @Override
    public void update(Empleado e) {
        System.out.println("actualizo la memoria");
    }
}
