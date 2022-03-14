package Controller;

import Model.Model_Especialista;
import View.Vista_crud_especalista;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Controller_CrudEspecialista {

    private Model_Especialista modelo;
    private Vista_crud_especalista vista;
    private JFileChooser jfc;
    private FileNameExtensionFilter filtro= new FileNameExtensionFilter("Imagen .jpg .png .jpeg","jpg","png","jpeg");

    public Controller_CrudEspecialista(Model_Especialista modelo, Vista_crud_especalista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciar(){
    
    }
    
    


}
