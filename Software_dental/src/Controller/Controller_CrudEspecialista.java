package Controller;

import Model.Doctor;
import Model.Model_Especialista;
import Model.ValidarCedula;
import View.MenuPrincipal;
import View.Vista_crud_especalista;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controller_CrudEspecialista {

    private Model_Especialista modelo;
    private Vista_crud_especalista vista;
    private JFileChooser jfc;
    private String accion="guardar";
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
        vista.getBtnguardarEsp().addActionListener(l->ValidarDoctor());
        vista.getBtneliminar().addActionListener(l->eliminarPersonas());
        vista.getBtneditar().addActionListener(l-> limpiartxt());
//        setKeyReleased(vista.getTxtBuscarEsp());
//        vista.getTxtBuscarEsp().addKeyListener(kl);
        cargarPersonas();
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                buscarDoctor(vista.getTxtBuscarEsp().getText());
            }
        };
        vista.getTxtBuscarEsp().addKeyListener(kl);
        setEventoMouseClicked(vista.getTblEspecialista());
    }
    
    private void generarSerie() {
      String   serie = modelo.NumId();
        if (serie == null) {
            vista.getTxtIdDoctor().setText("1");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIdDoctor().setText("" + inc);

        }
    }
    
    private boolean validarCorreo(String email){
      if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".es")
          || email.endsWith(".edu.ec")|| email.endsWith(".net"))){
        return true;
      } else{
        return false;
        }
      }
    
    public void crearDoctor(){
        if(accion.equals("guardar")){ 
        File ruta = new File(vista.getTxtruta().getText());
   
     String cedula=vista.getTxtcedulaesp().getText();
     String nombres=vista.getTxtnombreesp().getText();
     String apellido=vista.getTxtapellidoesp().getText();
     String celular=vista.getTxtCelularesp().getText();
     String telefono=vista.getTxttelfesp().getText();
     String direccion=vista.getTxtdirecesp().getText();
     String correo=vista.getTxtcorreoesp().getText();
     String provincia=vista.getTxtprovinciaesp().getText();
     String ciudad=vista.getTxtciudadesp().getText();
     String genero=vista.getCboxGeneroEsp().getModel().getSelectedItem().toString();
     String id_doctor=vista.getTxtIdDoctor().getText();
     String id_usuario=vista.getTxtIdUsuario().getText();
     String especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
     String cargo=vista.getTxtCargoesp().getText();
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
     
     Model_Especialista mEsp= new Model_Especialista();
     
     mEsp.setCedula(cedula);
     mEsp.setNombres(nombres);
     mEsp.setApellidos(apellido);
     mEsp.setCelular(celular);
     mEsp.setTelefono(telefono);
     mEsp.setDireccion(direccion);
     if(correo.isEmpty()){
           mEsp.setCorreo(correo);
           } else {
           if(validarCorreo(correo)){
           mEsp.setCorreo(correo);
           } else {
           JOptionPane.showMessageDialog(null, "Correo Electronico no valido");
           mEsp.setCorreo("");
            }
           }
     mEsp.setProvincia(provincia);
     mEsp.setCiudad(ciudad);
     if(genero.equals("Masculino")){
           mEsp.setGenero("M");
=======
>>>>>>> Stashed changes
     Model_Especialista doc= new Model_Especialista();
     doc.setCedula(cedula);
           doc.setNombres(nombres);
           doc.setApellidos(apellido);
           doc.setCelular(celular);
           doc.setTelefono(telefono);
           doc.setDireccion(direccion);
            if(correo.isEmpty()){
           doc.setCorreo(correo);
           } else {
           if(validarCorreo(correo)){
           doc.setCorreo(correo);
           } else {
           JOptionPane.showMessageDialog(null, "Correo Electronico no valido");
           doc.setCorreo("");
            }
           }
           doc.setProvincia(provincia);
           doc.setCiudad(ciudad);
           if(genero.equals("Masculino")){
           doc.setGenero("M");
<<<<<<< Updated upstream
=======
>>>>>>> 105b8edc80dcedd94e384a3911d2fa20c0fbc1a2
>>>>>>> Stashed changes
           } else if(genero.equals("Femenino")){
           doc.setGenero("F");
           }
             try{
             if(vista.getTxtruta().getText().trim().length()!=0){ 
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
           doc.setFoto(icono);}

            }catch(IOException ex){
           doc.setFoto(null);
        }
            doc.setId_doctor(id_doctor);
            doc.setCedula_doc(cedula);
     doc.setId_usuario("1");
     doc.setEspecialidad(especialidad);
     doc.setCargo(cargo);  
     
<<<<<<< Updated upstream
     if(doc.crearPersonasByte()){
=======
<<<<<<< HEAD
     
//     if(mEsp.crearPersonasByte()){
//
//           cargarPersonas();
//           generarSerie();
//           accion="editar";
//           vista.getBtnguardarEsp().setText("Editar");
//           limpiartxt();} else {
//     JOptionPane.showMessageDialog(vista, "No se pudo crear");
//     }
=======
     if(doc.crearPersonasByte()){
>>>>>>> 105b8edc80dcedd94e384a3911d2fa20c0fbc1a2
>>>>>>> Stashed changes

        if(ValidarCedula.validarcedula(cedula)){
             if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
             mEsp.crearPersonasByte();
             generarSerie();
             cargarPersonas();
             accion="editar";
             vista.getBtnguardarEsp().setText("Editar");
             limpiartxt();}  
             else {JOptionPane.showMessageDialog(null, "Debe elegir el genero y el tipo de sangre");
             }
             }
             } else if(accion.equals("editar")){
             editarDoctor2();
             }
        }
    
<<<<<<< HEAD
    public void editarDoctor2(){
=======
    
    private boolean validarCorreo(String email){
      if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".es")
          || email.endsWith(".edu.ec")|| email.endsWith(".net"))){
        return true;
      } else{
        return false;
        }
      }
    
    
    private boolean validarCorreo(String email){
      if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".es")
          || email.endsWith(".edu.ec")|| email.endsWith(".net"))){
        return true;
      } else{
        return false;
        }
      }
    
    public void editarDoctor(){
>>>>>>> 105b8edc80dcedd94e384a3911d2fa20c0fbc1a2
        File ruta = new File(vista.getTxtruta().getText());
     String cedula = vista.getTxtcedulaesp().getText();//txtcedulaesp
     String nombres=vista.getTxtnombreesp().getText();//txtnombreesp
     String apellido=vista.getTxtapellidoesp().getText();//txtapellidoesp
     String celular=vista.getTxtCelularesp().getText();//txtCelularesp
     String telefono=vista.getTxttelfesp().getText();//txttelfesp
     String direccion=vista.getTxtdirecesp().getText();
     String correo=vista.getTxtcorreoesp().getText();
     String provincia=vista.getTxtprovinciaesp().getText();
     String ciudad=vista.getTxtciudadesp().getText();
     String genero=vista.getCboxGeneroEsp().getModel().getSelectedItem().toString();
     String id_doctor=vista.getTxtIdDoctor().getText();
     String id_usuario=vista.getTxtIdUsuario().getText();
     String especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
     String cargo=vista.getTxtCargoesp().getText();
     
     Model_Especialista mEsp= new Model_Especialista();
     
     mEsp.setCedula(cedula);
     mEsp.setNombres(nombres);
     mEsp.setApellidos(apellido);
     mEsp.setCelular(celular);
     mEsp.setTelefono(telefono);
     mEsp.setDireccion(direccion);
     if(correo.isEmpty()){
           mEsp.setCorreo(correo);
           } else {
           if(validarCorreo(correo)){
           mEsp.setCorreo(correo);
           } else {
           JOptionPane.showMessageDialog(null, "Correo Electronico no valido");
           mEsp.setCorreo("");
            }
           }
     mEsp.setProvincia(provincia);
     mEsp.setCiudad(ciudad);
     if(genero.equals("Masculino")){
           mEsp.setGenero("M");
           } else if(genero.equals("Femenino")){
           mEsp.setGenero("F");
           }
     try{
          if(vista.getTxtruta().getText().trim().length()!=0){ 
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
           mEsp.setFoto(icono);}

            }catch(Exception ex){
 
           mEsp.setFoto(null);
        }
     mEsp.setId_doctor(id_doctor);
     mEsp.setId_usuario("1");
     mEsp.setEspecialidad(especialidad);
     mEsp.setCargo(cargo);
    
    
     
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
     
//     if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
//
//            cargarPersonas();
//            generarSerie();
//            accion="guardar";
//            vista.getBtnguardarEsp().setText("Guardar");
//            limpiartxt();} else {
//     JOptionPane.showMessageDialog(vista, "No se pudo modificar");
//     }
=======
>>>>>>> Stashed changes
     if(vista.getTxtruta().getText().trim().length()!=0){ 
     if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
>>>>>>> 105b8edc80dcedd94e384a3911d2fa20c0fbc1a2

        if(vista.getTxtruta().getText().trim().length()!=0){ 
            if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
            if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
            JOptionPane.showMessageDialog(null, "Se modifico con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            generarSerie();
<<<<<<< HEAD
            cargarPersonas();
            limpiartxt();}  else {JOptionPane.showMessageDialog(null, "Debe elegir el genero y el tipo de sangre");}
            } else{JOptionPane.showMessageDialog(null, "No se pudo modificar");}
             } else {
            
            if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
            if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
            JOptionPane.showMessageDialog(null, "Se modifico con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            generarSerie();
<<<<<<< Updated upstream
=======
            cargarPersonas();
            limpiartxt();} else {JOptionPane.showMessageDialog(null, "Debe elegir el genero y el tipo de sangre");}
            }else{JOptionPane.showMessageDialog(null, "No se pudo modificar");}
            }

=======
>>>>>>> Stashed changes
             JOptionPane.showMessageDialog(vista, "Modificado con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            limpiartxt();} else {
     JOptionPane.showMessageDialog(vista, "No se pudo modificar");
     }} else if(mEsp.modificarPersonasinfoto() && mEsp.modificarEspecialista()){}
            cargarPersonas();
            generarSerie();
             JOptionPane.showMessageDialog(vista, "Modificado con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            limpiartxt();
<<<<<<< Updated upstream
=======
>>>>>>> 105b8edc80dcedd94e384a3911d2fa20c0fbc1a2
>>>>>>> Stashed changes
    }
    
//    public void editarDoctor(){
//        File ruta = new File(vista.getTxtruta().getText());
//
//     String nombres=vista.getTxtnombreesp().getText();
//     String apellido=vista.getTxtapellidoesp().getText();
//     String celular=vista.getTxtCelularesp().getText();
//     String telefono=vista.getTxttelfesp().getText();
//     String direccion=vista.getTxtdirecesp().getText();
//     String correo=vista.getTxtcorreoesp().getText();
//     String provincia=vista.getTxtprovinciaesp().getText();
//     String ciudad=vista.getTxtciudadesp().getText();
//     String genero=vista.getCboxGeneroEsp().getModel().getSelectedItem().toString();
//     String id_doctor=vista.getTxtIdDoctor().getText();
//     String id_usuario=vista.getTxtIdUsuario().getText();
//     String especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
//     String cargo=vista.getTxtCargoesp().getText();
//     Model_Especialista mEsp= new Model_Especialista();
//     
//     mEsp.setNombres(nombres);
//     mEsp.setApellidos(apellido);
//     mEsp.setCelular(celular);
//     mEsp.setTelefono(telefono);
//     mEsp.setDireccion(direccion);
//     mEsp.setCorreo(correo);
//     mEsp.setProvincia(provincia);
//     mEsp.setCiudad(ciudad);
//     if(genero.equals("Masculino")){
//           mEsp.setGenero("M");
//           } else if(genero.equals("Femenino")){
//           mEsp.setGenero("F");
//           }
//     try{
//          if(vista.getTxtruta().getText().trim().length()!=0){ 
//            byte[] icono = new byte[(int) ruta.length()];
//            InputStream input = new FileInputStream(ruta);
//            input.read(icono);
//           mEsp.setFoto(icono);}
//
//            }catch(Exception ex){
// 
//           mEsp.setFoto(null);
//        }
//     mEsp.setId_doctor(id_doctor);
//     mEsp.setId_usuario("2");
//     mEsp.setEspecialidad(especialidad);
//     mEsp.setCargo(cargo);
//    
//    
//     
//     
//     if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
//
//            cargarPersonas();
//            generarSerie();
//            accion="guardar";
//            vista.getBtnguardarEsp().setText("Guardar");
//            limpiartxt();} else {
//     JOptionPane.showMessageDialog(vista, "No se pudo modificar");
//     }
//
//    }
    
//    public void editarDoctor(){
//        File ruta = new File(vista.getTxtruta().getText());
//
//     String nombres=vista.getTxtnombreesp().getText();
//     String apellido=vista.getTxtapellidoesp().getText();
//     String celular=vista.getTxtCelularesp().getText();
//     String telefono=vista.getTxttelfesp().getText();
//     String direccion=vista.getTxtdirecesp().getText();
//     String correo=vista.getTxtcorreoesp().getText();
//     String provincia=vista.getTxtprovinciaesp().getText();
//     String ciudad=vista.getTxtciudadesp().getText();
//     String genero=vista.getCboxGeneroEsp().getModel().getSelectedItem().toString();
//     String id_doctor=vista.getTxtIdDoctor().getText();
//     String id_usuario=vista.getTxtIdUsuario().getText();
//     String especialidad=vista.getcBoxespecialidad().getModel().getSelectedItem().toString();
//     String cargo=vista.getTxtCargoesp().getText();
//     Model_Especialista mEsp= new Model_Especialista();
//     
//     mEsp.setNombres(nombres);
//     mEsp.setApellidos(apellido);
//     mEsp.setCelular(celular);
//     mEsp.setTelefono(telefono);
//     mEsp.setDireccion(direccion);
//     mEsp.setCorreo(correo);
//     mEsp.setProvincia(provincia);
//     mEsp.setCiudad(ciudad);
//     if(genero.equals("Masculino")){
//           mEsp.setGenero("M");
//           } else if(genero.equals("Femenino")){
//           mEsp.setGenero("F");
//           }
//     try{
//          if(vista.getTxtruta().getText().trim().length()!=0){ 
//            byte[] icono = new byte[(int) ruta.length()];
//            InputStream input = new FileInputStream(ruta);
//            input.read(icono);
//           mEsp.setFoto(icono);}
//
//            }catch(Exception ex){
// 
//           mEsp.setFoto(null);
//        }
//     mEsp.setId_doctor(id_doctor);
//     mEsp.setId_usuario("2");
//     mEsp.setEspecialidad(especialidad);
//     mEsp.setCargo(cargo);
//    
//    
//     
//     
//     if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
//
//            cargarPersonas();
//            generarSerie();
//            accion="guardar";
//            vista.getBtnguardarEsp().setText("Guardar");
//            limpiartxt();} else {
//     JOptionPane.showMessageDialog(vista, "No se pudo modificar");
//     }
//
//    }
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
//                vista.getTblEspecialista().setValueAt(pe.getTelefono(), i.value, 4);
                vista.getTblEspecialista().setValueAt(pe.getDireccion(), i.value, 4);
//                vista.getTblEspecialista().setValueAt(pe.getCorreo(), i.value, 6);
//                vista.getTblEspecialista().setValueAt(pe.getProvincia(), i.value, 7);
                vista.getTblEspecialista().setValueAt(pe.getCiudad(), i.value, 5);
                vista.getTblEspecialista().setValueAt(pe.getGenero(), i.value, 6);

                try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getTblEspecialista().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getTblEspecialista().setValueAt(new JLabel("No imagen"),i.value, 7);
  
                }
                vista.getTblEspecialista().setValueAt(pe.getId_doctor(), i.value, 8);
//                vista.getTblEspecialista().setValueAt(pe.getId_usuario(), i.value, 12);
                vista.getTblEspecialista().setValueAt(pe.getEspecialidad(), i.value, 9);
//                vista.getTblEspecialista().setValueAt(pe.getCargo(), i.value, 10);
//                vista.getTblEspecialista().setValueAt(pe.getCedula_doc(), i.value, 15);

                i.value++;
//           String[] filap = {pe.getIdPersona(),pe.getNombre(),pe.getApellido(),String.valueOf(periodo.getYears()),pe.getTelefono(),pe.getSexo(),String.valueOf(pe.getSueldo()),String.valueOf(pe.getCupo())};
//           tblModel.addRow(filap);
        });
        
        
    }
    
    public void buscarDoctor(String busqueda){
        
        vista.getTblEspecialista().setDefaultRenderer(Object.class, new ImagenTabla());
        vista.getTblEspecialista().setRowHeight(100);
        //enlazar el modelo de tabla con mi controlador
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista.getTblEspecialista().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla

        List<Doctor> listadoc=modelo.tablamostrarbusqueda(busqueda);//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listadoc.stream().forEach(pe->{
//           LocalDateTime fechaactual = LocalDateTime.now();
//           Period periodo = Period.between(pe.getFecha().toLocalDate(), fechaactual.toLocalDate());
           tblModel.addRow(new Object[16]);//Creo una fila vacia
                vista.getTblEspecialista().setValueAt(pe.getCedula(), i.value, 0);
                vista.getTblEspecialista().setValueAt(pe.getNombres(), i.value, 1);
                vista.getTblEspecialista().setValueAt(pe.getApellidos(), i.value, 2);
                vista.getTblEspecialista().setValueAt(pe.getCelular(), i.value, 3);
//                vista.getTblEspecialista().setValueAt(pe.getTelefono(), i.value, 4);
                vista.getTblEspecialista().setValueAt(pe.getDireccion(), i.value, 4);
//                vista.getTblEspecialista().setValueAt(pe.getCorreo(), i.value, 6);
//                vista.getTblEspecialista().setValueAt(pe.getProvincia(), i.value, 7);
                vista.getTblEspecialista().setValueAt(pe.getCiudad(), i.value, 5);
                vista.getTblEspecialista().setValueAt(pe.getGenero(), i.value, 6);

                try{
                    byte[] bi = pe.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                   DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                 render.setIcon(imgi);
                   vista.getTblEspecialista().setValueAt(new JLabel(imgi), i.value, 7);

                }catch(Exception ex){
                      vista.getTblEspecialista().setValueAt(new JLabel("No imagen"),i.value, 7);
  
                }
                vista.getTblEspecialista().setValueAt(pe.getId_doctor(), i.value, 8);
//                vista.getTblEspecialista().setValueAt(pe.getId_usuario(), i.value, 12);
                vista.getTblEspecialista().setValueAt(pe.getEspecialidad(), i.value, 9);
//                vista.getTblEspecialista().setValueAt(pe.getCargo(), i.value, 10);
//                vista.getTblEspecialista().setValueAt(pe.getCedula_doc(), i.value, 15);

                i.value++;
//           String[] filap = {pe.getIdPersona(),pe.getNombre(),pe.getApellido(),String.valueOf(periodo.getYears()),pe.getTelefono(),pe.getSexo(),String.valueOf(pe.getSueldo()),String.valueOf(pe.getCupo())};
//           tblModel.addRow(filap);
        });
        
        
    }
    
    private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                cargardatosTxt(e);
                cargardatosTxt(e);
                accion="editar";
                vista.getBtnguardarEsp().setText("Editar");
                vista.getTxtcedulaesp().setBackground(new Color (56, 224, 210));
                vista.getTxtcedulaesp().setForeground(Color.BLACK);
            } catch (IOException ex) {
                Logger.getLogger(Controller_CrudEspecialista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        });
    }
    private void cargardatosTxt (java.awt.event.MouseEvent evt) throws IOException{

        List<Doctor> lp = modelo.listarDoctores();
         MenuPrincipal vistamenu = new MenuPrincipal();
        int xx = vista.getTblEspecialista().getSelectedRow();
        if (xx != -1) {
            String cedula = vista.getTblEspecialista().getValueAt(xx, 0).toString();
            String esp = cedula ;
            vista.getTxtcedulaesp().setText(cedula);
            vista.getTxtcedulaesp().setEditable(false);
            vistamenu.getLblCedulapac().setText(cedula);
            String nom = vista.getTblEspecialista().getValueAt(xx, 1).toString();
            vista.getTxtnombreesp().setText(nom);
             vistamenu.getLblnombrescomp().setText(nom);
            String apellido = vista.getTblEspecialista().getValueAt(xx, 2).toString();
            vista.getTxtapellidoesp().setText(apellido);
             vistamenu.getLabelapellido().setText(apellido);
            String celular = vista.getTblEspecialista().getValueAt(xx, 3).toString();
            vista.getTxtCelularesp().setText(celular);
            String direccion = vista.getTblEspecialista().getValueAt(xx, 4).toString();
            vista.getTxtdirecesp().setText(direccion);
            String ciudad = vista.getTblEspecialista().getValueAt(xx, 5).toString();
            vista.getTxtciudadesp().setText(ciudad);
            String genero = vista.getTblEspecialista().getValueAt(xx, 6).toString();
            vista.getCboxGeneroEsp().setSelectedItem(genero);
            if(genero.equals("M")){
           vista.getCboxGeneroEsp().setSelectedItem("Masculino");
           } else if(genero.equals("F")){
           vista.getCboxGeneroEsp().setSelectedItem("Femenino");
           }
              for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCedula().equals(esp)) {
                    if(lp.get(i).getFoto()!=null){
                    byte[] ft = lp.get(i).getFoto();
                    BufferedImage img = null;
                   
                     InputStream in = new ByteArrayInputStream(ft);
                     img = ImageIO.read(in);
          
                    Image j = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    Icon ic = new ImageIcon(j);
                    vista.getLblFotoEsp().setIcon(ic);
                    } else {
                    vista.getLblFotoEsp().setIcon(null);
                    }
            String id_doc = vista.getTblEspecialista().getValueAt(xx, 8).toString();
            vista.getTxtIdDoctor().setText(id_doc);      
            String especialidad = vista.getTblEspecialista().getValueAt(xx, 9).toString();
            vista.getcBoxespecialidad().setSelectedItem(especialidad);
                    
                }
            }
            llenartxtsobrantes ();
            }
         
        
        else {
            JOptionPane.showMessageDialog(vista, "error seleccione una fila");
            
            }
    }

    public void llenartxtsobrantes () {
           Model_Especialista esp = new Model_Especialista();
       
            String id2 = vista.getTxtcedulaesp().getText();
           // pac.cargartxtsobrantes(id2);
            List<Doctor> milistapaci =  esp.cargartxtsobrantes(id2);
            for(int i = 0 ; i < milistapaci.size() ; i++){
            vista.getTxttelfesp().setText(milistapaci.get(i).getTelefono()) ;
            vista.getTxtcorreoesp().setText(milistapaci.get(i).getCorreo()) ;
            vista.getTxtprovinciaesp().setText(milistapaci.get(i).getProvincia()) ;
            vista.getTxtIdUsuario().setText(milistapaci.get(i).getId_usuario()) ;
            vista.getTxtCargoesp().setText(milistapaci.get(i).getCargo()) ;

            }          
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
    
    public void limpiartxt(){
    accion="guardar";
    vista.getBtnguardarEsp().setText("Guardar");
    vista.getTxtcedulaesp().setBackground(new Color (255, 255, 255));
    vista.getTxtcedulaesp().setEditable(true);
    vista.getTxtIdDoctor().setText("");
    vista.getTxtcedulaesp().setText("");
    vista.getTxtCelularesp().setText("");
    vista.getTxttelfesp().setText("");
    vista.getTxtnombreesp().setText("");
    vista.getTxtapellidoesp().setText("");
    vista.getTxtdirecesp().setText("");
    vista.getTxtcorreoesp().setText("");
    vista.getTxtprovinciaesp().setText("");
    vista.getTxtciudadesp().setText("");
    vista.getCboxGeneroEsp().setSelectedIndex(0);
   
    vista.getLblFotoEsp().setText("");
    vista.getLblFotoEsp().setText("");
    vista.getcBoxespecialidad().setSelectedIndex(0);
    vista.getTxtCargoesp().setText("");
    vista.getTxtruta().setText("");
    generarSerie();
    }
    
    Icon advert;
          void ValidarDoctor(){
    //validaciones
        if (vista.txtnombreesp.getText().equals("")&& vista.txtapellidoesp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre y apellido del Especialista","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.txtcedulaesp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cedula del Especialista","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.txtdirecesp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la direccion del Especialista","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.txtprovinciaesp.getText().equals("")&& vista.txtciudadesp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la provincia y ciudad del Especialista","Error", JOptionPane.PLAIN_MESSAGE, advert);
        }  else if (vista.cboxGeneroEsp.getSelectedItem().toString().equals("Seleccione genero")) {
            JOptionPane.showMessageDialog(null, "Seleccione el genero valida","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.cBoxespecialidad.getSelectedItem().toString().equals("Seleccione la especialidad")) {
            JOptionPane.showMessageDialog(null, "Seleccione la especialidad","error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.txtIdDoctor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el id del Especialista","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else if (vista.txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese id del Usuario","Error", JOptionPane.PLAIN_MESSAGE, advert);
        } else{crearDoctor();}
         }
    
}
