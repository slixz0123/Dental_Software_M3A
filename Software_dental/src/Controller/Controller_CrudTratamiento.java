package Controller;

import Model.Model_Tratamiento;
import View.Vista_crud_Tratamiento;

public class Controller_CrudTratamiento {
    private Model_Tratamiento modelo;
    private Vista_crud_Tratamiento vista;

    public Controller_CrudTratamiento(Model_Tratamiento modelo, Vista_crud_Tratamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
}
