
package Controller;

import Model.Model_CitasTratamiento;
import View.Vista_Citas_Tratamiento;


public class Controller_CitasTratamiento {
    private Model_CitasTratamiento modelo;
    private Vista_Citas_Tratamiento vista;

    public Controller_CitasTratamiento(Model_CitasTratamiento modelo, Vista_Citas_Tratamiento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
}
