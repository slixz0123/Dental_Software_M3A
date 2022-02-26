package Controller;

import Model.Model_Especialista;
import View.Vista_crud_especalista;

public class Controller_CrudEspecialista {

    private Model_Especialista modelo;
    private Vista_crud_especalista vista ;

    public Controller_CrudEspecialista(Model_Especialista modelo, Vista_crud_especalista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    


}
