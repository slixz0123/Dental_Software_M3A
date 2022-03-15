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
        iniciar();
    }
    
    public void iniciar(){
        vista.getBtnguardarEsp().addActionListener(l->per());
    }
    
    public void per(){
        System.out.println("creando persona");
     String cedula;
     String nombres;
     String apellidos;
     String celular;
     String telefono;
     String direccion;
     String correo;
     String provincia;
     String ciudad;
     String genero;
     String id_doctor;
     String id_usuario;
     String especialidad;
     String cargo;
     String cedula_doc;
     
     cedula=vista.getTxtcedulaesp().getText();
     nombres=vista.getTxtnombreesp().getText();
     apellidos=vista.getTxtapellidoesp().getText();
     celular=vista.getTxtCelularesp().getText();
     telefono=vista.getTxttelfesp().getText();
     direccion=vista.getTxtdirecesp().getText();
     correo=vista.getTxtcorreoesp().getText();
     provincia=vista.getTxtprovinciaesp().getText();
     ciudad=vista.getTxtciudadesp().getText();
     genero=vista.getCboxGeneroEsp().getModel().getSelectedItem().toString();
        System.out.println(genero);
//     id_doctor=vista.getTxtIdDoctor().getText();
//     id_usuario=vista.getTxtIdUsuario().getText();
     especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
     cargo=vista.getTxtCargoesp().getText();
     cedula_doc=vista.getTxtcedulaesp().getText();
        System.out.println("antes del metodo");
     Model_Especialista mEsp= new Model_Especialista();
     
     mEsp.setCedula(cedula);
     mEsp.setNombres(nombres);
     mEsp.setApellidos(apellidos);
     mEsp.setCelular(celular);
     mEsp.setTelefono(telefono);
     mEsp.setDireccion(direccion);
     mEsp.setCorreo(correo);
     mEsp.setProvincia(provincia);
     mEsp.setCiudad(ciudad);
     mEsp.setGenero(genero);
     
     mEsp.setId_doctor("1");
    mEsp.setId_usuario("1");
     mEsp.setEspecialidad(especialidad);
     mEsp.setCargo(cargo);
     mEsp.setCedula_doc(cedula_doc);
     
     mEsp.crearPersonasByte();
        System.out.println("despues del metodo");
    }
    
    


}
