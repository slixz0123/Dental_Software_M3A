package Controller;

import Model.Doctor;
import Model.Model_Especialista;
import View.Vista_crud_especalista;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controller_CrudEspecialista {

    private Model_Especialista modelo;
    private Vista_crud_especalista vista;
    private JFileChooser jfc;
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");

    public Controller_CrudEspecialista(Model_Especialista modelo, Vista_crud_especalista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        iniciar();
        
    }
    
    public void iniciar(){
        generarSerie();
        vista.getBtnExaminar().addActionListener(l-> btnexaminar());
        vista.getBtnguardarEsp().addActionListener(l->per());
        vista.getBtneliminar().addActionListener(l->eliminarPersonas());
//        setKeyReleased(vista.getTxtBuscarEsp());
//        vista.getTxtBuscarEsp().addKeyListener(kl);
        cargarPersonas();
    }
    
    private void generarSerie() {
      String   serie = modelo.NumId();
        if (serie == null) {
            vista.getTxtIdDoctor().setText("00001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIdDoctor().setText("0000" + inc);

        }
    }
    
    public void per(){
        File ruta = new File(vista.getTxtruta().getText());
        System.out.println("creando persona 1");
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
     byte foto ;
     
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
     id_doctor=vista.getTxtIdDoctor().getText();
     id_usuario=vista.getTxtIdUsuario().getText();
     especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
     cargo=vista.getTxtCargoesp().getText();
//     cedula_doc=vista.getTxtcedulaesp().getText();
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
     try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
           mEsp.setFoto(icono);

            }catch(Exception ex){
                 System.out.println(ex);
           mEsp.setFoto(null);
        }
     mEsp.setId_doctor(id_doctor);
     mEsp.setId_usuario("2");
     mEsp.setEspecialidad(especialidad);
     mEsp.setCargo(cargo);
     mEsp.setCedula_doc(cedula);
    
    
     
     
     mEsp.crearPersonasByte();
//     mEsp.crearPersonas2();
        System.out.println("despues del metodo");
                cargarPersonas();
                generarSerie();

    }
    
    public void cargarPersonas(){
        
        vista.getTblEspecialista().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTblEspecialista().setRowHeight(100);
        //enlazar el modelo de tabla con mi controlador
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista.getTblEspecialista().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla

        List<Doctor> listadoc=modelo.listarDoctores();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listadoc.stream().forEach(pe->{
//           LocalDateTime fechaactual = LocalDateTime.now();
//           Period periodo = Period.between(pe.getFecha().toLocalDate(), fechaactual.toLocalDate());
           tblModel.addRow(new Object[16]);//Creo una fila vacia
                vista.getTblEspecialista().setValueAt(pe.getCedula(), i.value, 0);
                vista.getTblEspecialista().setValueAt(pe.getNombres(), i.value, 1);
                vista.getTblEspecialista().setValueAt(pe.getApellidos(), i.value, 2);
                vista.getTblEspecialista().setValueAt(pe.getCelular(), i.value, 3);
                vista.getTblEspecialista().setValueAt(pe.getTelefono(), i.value, 4);
                vista.getTblEspecialista().setValueAt(pe.getDireccion(), i.value, 5);
                vista.getTblEspecialista().setValueAt(pe.getCorreo(), i.value, 6);
                vista.getTblEspecialista().setValueAt(pe.getProvincia(), i.value, 7);
                vista.getTblEspecialista().setValueAt(pe.getCiudad(), i.value, 8);
                vista.getTblEspecialista().setValueAt(pe.getGenero(), i.value, 9);

                try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getTblEspecialista().setValueAt(new JLabel(imgi), i.value, 10);

                }catch(Exception ex){
                      vista.getTblEspecialista().setValueAt(new JLabel("No imagen"),i.value, 10);
  
                }
                vista.getTblEspecialista().setValueAt(pe.getId_doctor(), i.value, 11);
                vista.getTblEspecialista().setValueAt(pe.getId_usuario(), i.value, 12);
                vista.getTblEspecialista().setValueAt(pe.getEspecialidad(), i.value, 13);
                vista.getTblEspecialista().setValueAt(pe.getCargo(), i.value, 14);
                vista.getTblEspecialista().setValueAt(pe.getCedula_doc(), i.value, 15);

                i.value++;
//           String[] filap = {pe.getIdPersona(),pe.getNombre(),pe.getApellido(),String.valueOf(periodo.getYears()),pe.getTelefono(),pe.getSexo(),String.valueOf(pe.getSueldo()),String.valueOf(pe.getCupo())};
//           tblModel.addRow(filap);
        });
        
        
    }
    
    public void eliminar(){
        int seleccion = vista.getTblEspecialista().getSelectedRow();
        int resp=0;
        Component rootPane = null;
        Model_Especialista  eliminado = new Model_Especialista();
        if(seleccion != -1){
            String id = vista.getTblEspecialista().getValueAt(seleccion, 0).toString();
            JOptionPane.showMessageDialog(rootPane,( "¿Quieres eliminar este registro?"));
            if(resp==0){
                if(eliminado.removerPersonas(id)){
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                }
                
            }
        }
    }

    private void setKeyReleased(JTextField buscar){
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                buscarDoc(e);
            }
        });
    }
    KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //buscarPersonas(vista.getTxtBuscarEsp().getText());
            }
        };
    
    private void buscarDoc(java.awt.event.KeyEvent evt){
        DefaultTableModel tbPersonas;
        tbPersonas = (DefaultTableModel)vista.getTblEspecialista().getModel();
        tbPersonas.setNumRows(0);
        
        List<Doctor> listap=modelo.buscarPersonas(vista.getTxtBuscarEsp().getText());
        listap.stream().forEach(pe->{
//           LocalDateTime fechaactual = LocalDateTime.now();
//           Period periodo = Period.between(pe.getFecha().toLocalDate(), fechaactual.toLocalDate());
           String[] filap = {pe.getCedula(),pe.getNombres(),pe.getApellidos(),pe.getCelular(),pe.getTelefono(),pe.getDireccion(),pe.getCorreo(),pe.getProvincia(),pe.getCiudad(),pe.getGenero(),pe.getId_doctor(),pe.getId_usuario(),pe.getEspecialidad(),pe.getCargo(),pe.getCedula_doc()};
           tbPersonas.addRow(filap);
        });
    }

    public void eliminarPersonas(){
        int seleccion = vista.getTblEspecialista().getSelectedRow();
        int resp=0;
        Component rootPane = null;
        Model_Especialista  eliminado = new Model_Especialista();
        if(seleccion != -1){
            String ced = vista.getTblEspecialista().getValueAt(seleccion, 0).toString();
            JOptionPane.showMessageDialog(rootPane,( "¿Quieres eliminar este registro?"));
            if(resp==0){
                if(eliminado.removerPersonas(ced)){
                    JOptionPane.showMessageDialog(null, "El registro ha sido eliminado");
                    cargarPersonas();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                }
                
            }
        }
    }
    
    public  void btnexaminar (){
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        
        int s = j.showOpenDialog(this.jfc);
        if(s == JFileChooser.APPROVE_OPTION){
             try {
                 String ruta = j.getSelectedFile().getAbsolutePath();
                 vista.getTxtruta().setText(ruta);
                 Image imagen = ImageIO.read(j.getSelectedFile()).getScaledInstance(vista.getLblFotoEsp().getWidth(), vista.getLblFotoEsp().getHeight(), Image.SCALE_DEFAULT);
                 Icon ico = new ImageIcon (imagen);
                 vista.getLblFotoEsp().setIcon(ico);
             } catch (IOException ex) {
                 Logger.getLogger(Controller_CrudPaciente.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
}
