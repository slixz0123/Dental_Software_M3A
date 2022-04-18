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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        eventos();
        vista.getBtnExaminar().addActionListener(l-> btnexaminar());
        vista.getBtnguardarEsp().addActionListener(l->ValidarDoctor());
        vista.getBtneliminar().addActionListener(l->eliminarPersonas());
        vista.getBtnNuevo().addActionListener(l->Nuevo());
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
        vista.getTxtIdDoctor().setVisible(false);
        vista.getTxtIdUsuario().setVisible(false);
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
    
    //EVENTOS
 private void eventos(){
    KeyListener cedula=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtcedulaesp().getText().length()>9) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
    KeyListener nombre=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
      String str = vista.getTxtnombreesp().getText();
      StringBuffer strbf = new StringBuffer();
      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
      while(match.find()) {
         match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtnombreesp().setText(match.appendTail(strbf).toString()); 
        }
    };
    KeyListener apellido=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
      String str = vista.getTxtapellidoesp().getText();
      StringBuffer capital = new StringBuffer();
      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
      while(match.find()) {
         match.appendReplacement(capital, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtapellidoesp().setText(match.appendTail(capital).toString()); 
        }
    };
    KeyListener direccion=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
//            char car = e.getKeyChar();
//        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE) && (car<'0' || car>'9')){
//            e.consume();
//            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
      String dirmay = vista.getTxtdirecesp().getText();
      StringBuffer dir = new StringBuffer();
      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(dirmay);
      while(match.find()) {
         match.appendReplacement(dir, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtdirecesp().setText(match.appendTail(dir).toString()); 
        }
    };
    KeyListener provincia=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
      String cad = vista.getTxtprovinciaesp().getText();
      StringBuffer may = new StringBuffer();
      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(cad);
      while(match.find()) {
         match.appendReplacement(may, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtprovinciaesp().setText(match.appendTail(may).toString()); 
        }
    };
    KeyListener ciudad=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char car = e.getKeyChar();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE)){
            e.consume();
            }
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {
      String cadena = vista.getTxtciudadesp().getText();
      StringBuffer mayciu = new StringBuffer();
      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(cadena);
      while(match.find()) {
         match.appendReplacement(mayciu, match.group(1).toUpperCase() + match.group(2).toLowerCase());
      }
      vista.getTxtciudadesp().setText(match.appendTail(mayciu).toString()); 
        }
    };
    KeyListener telefono = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();   
        if(c>= '0' && c<='9' && vista.getTxttelfesp().getText().length()<=9){

       }else{
        e.consume();
       }
        }
        @Override
        public void keyPressed(KeyEvent e) {} 
        @Override
        public void keyReleased(KeyEvent e) {}
    };
    
    KeyListener celular=new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtCelularesp().getText().length()>9) e.consume();
        if(num<'0' || num>'9') e.consume(); 
        }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    };
    
    vista.getTxtcedulaesp().addKeyListener(cedula);
    vista.getTxtnombreesp().addKeyListener(nombre);
    vista.getTxtapellidoesp().addKeyListener(apellido);
    vista.getTxttelfesp().addKeyListener(telefono);
    vista.getTxtCelularesp().addKeyListener(celular);
    vista.getTxtdirecesp().addKeyListener(direccion);
    vista.getTxtprovinciaesp().addKeyListener(provincia);
    vista.getTxtciudadesp().addKeyListener(ciudad);
    vista.getTxtCargoesp().addKeyListener(ciudad);
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

            }catch(IOException ex){
           mEsp.setFoto(null);
        }
//     mEsp.
     mEsp.setId_doctor(id_doctor);
     mEsp.setId_usuario("2");
     mEsp.setEspecialidad(especialidad);
     mEsp.setCargo(cargo);
     mEsp.setCedula_doc(cedula);


        if(ValidarCedula.validarcedula(cedula)){
             if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
             mEsp.crearPersonasByte();
             generarSerie();
             cargarPersonas();
             limpiartxt();
//             accion="editar";
//             vista.getBtnguardarEsp().setText("Editar");
             }  
             else {JOptionPane.showMessageDialog(null, "Debe llenar los campos");
             }
             }
             } else if(accion.equals("editar")){
             editarDoctor2();
             limpiartxt();
             }
        }
    
    public void editarDoctor2(){
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

            }catch(IOException ex){
         System.out.println("no imagen");
           mEsp.setFoto(null);
        }
     mEsp.setId_doctor(id_doctor);
     mEsp.setId_usuario("1");
     mEsp.setEspecialidad(especialidad);
     mEsp.setCargo(cargo);

            if(vista.getTxtruta().getText().trim().length()!=0){ 
            if(mEsp.modificarPersonasbyte() && mEsp.modificarEspecialista()){
            if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
            JOptionPane.showMessageDialog(null, "Se modifico con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            generarSerie();
            cargarPersonas();
            } else {JOptionPane.showMessageDialog(null, "Debe elegir el genero");}
            } else{JOptionPane.showMessageDialog(null, "No se pudo modificar");}
            } else {
            
            if(mEsp.modificarPersonasSinfoto() && mEsp.modificarEspecialista()){
            if(vista.getCboxGeneroEsp().getSelectedIndex()!=0){
            JOptionPane.showMessageDialog(null, "Se modifico con exito");
            accion="guardar";
            vista.getBtnguardarEsp().setText("Guardar");
            generarSerie();
            cargarPersonas();
            } else {JOptionPane.showMessageDialog(null, "Debe elegir el genero");}
            }else{JOptionPane.showMessageDialog(null, "No se pudo modificar");}
            }

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
           tblModel.addRow(new Object[16]);//Creo una fila vacia
                vista.getTblEspecialista().setValueAt(pe.getCedula(), i.value, 0);
                vista.getTblEspecialista().setValueAt(pe.getNombres(), i.value, 1);
                vista.getTblEspecialista().setValueAt(pe.getApellidos(), i.value, 2);
                vista.getTblEspecialista().setValueAt(pe.getCelular(), i.value, 3);
                vista.getTblEspecialista().setValueAt(pe.getDireccion(), i.value, 4);
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
                vista.getTblEspecialista().setValueAt(pe.getEspecialidad(), i.value, 9);

                i.value++;
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
           tblModel.addRow(new Object[16]);//Creo una fila vacia
                vista.getTblEspecialista().setValueAt(pe.getCedula(), i.value, 0);
                vista.getTblEspecialista().setValueAt(pe.getNombres(), i.value, 1);
                vista.getTblEspecialista().setValueAt(pe.getApellidos(), i.value, 2);
                vista.getTblEspecialista().setValueAt(pe.getCelular(), i.value, 3);
                vista.getTblEspecialista().setValueAt(pe.getDireccion(), i.value, 4);
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
                vista.getTblEspecialista().setValueAt(pe.getEspecialidad(), i.value, 9);

                i.value++;
                
        });
        
        
    }
    
    private void setEventoMouseClicked(JTable tbl)
    {
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
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
            llenartxtsobrantes ();
              for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCedula().equals(esp)) {
                    if(lp.get(i).getFoto()!=null){
                    byte[] ft = lp.get(i).getFoto();
                    BufferedImage img = null;
                   
                     InputStream in = new ByteArrayInputStream(ft);
                     img = ImageIO.read(in);
                     if(img!=null){
                    Image j = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    Icon ic = new ImageIcon(j);
                    vista.getLblFotoEsp().setIcon(ic);
                    } else {
                    vista.getLblFotoEsp().setIcon(null);
                     }
                    } else if (lp.get(i).getFoto() == null) {
                   ImageIcon imgIcon = new ImageIcon(getClass().getResource("/View/icons/icono_hombre.png"));
                   Image imgEscalada = imgIcon.getImage().getScaledInstance(vista.getLblFotoEsp().getWidth(),
                   vista.getLblFotoEsp().getHeight(), Image.SCALE_SMOOTH);
                   Icon iconoEscalado = new ImageIcon(imgEscalada);
                   vista.getLblFotoEsp().setIcon(iconoEscalado);
                    
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

    public void Nuevo(){
        limpiartxt();
        cargarPersonas();
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
                    cargarPersonas();
                    limpiartxt();
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
                    limpiartxt();
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
    ImageIcon imgIcon = new ImageIcon(getClass().getResource("/View/icons/fondo_morado.jpg"));
    Image imgEscalada = imgIcon.getImage().getScaledInstance(vista.getLblFotoEsp().getWidth(),
    vista.getLblFotoEsp().getHeight(), Image.SCALE_SMOOTH);
    Icon iconoEscalado = new ImageIcon(imgEscalada);
    vista.getLblFotoEsp().setIcon(iconoEscalado);
    vista.getcBoxespecialidad().setSelectedIndex(0);
    vista.getTxtCargoesp().setText("");
    vista.getTxtruta().setText("");
    generarSerie();
    }
    
    Icon advert;
          void ValidarDoctor(){
    //validaciones
    
    String cedula=vista.getTxtcedulaesp().getText();
    String nombre=vista.getTxtnombreesp().getText();
    String apellido=vista.getTxtapellidoesp().getText();
    String direccion=vista.getTxtdirecesp().getText();
    String provincia=vista.getTxtprovinciaesp().getText();
    String genero=vista.getCboxGeneroEsp().getSelectedItem().toString();
    String espe=vista.getcBoxespecialidad().getSelectedItem().toString();
    String id=vista.getTxtIdDoctor().getText();
    
        if (cedula.equals("")||nombre.equals("")|| apellido.equals("")|| direccion.equals("")|| provincia.equals("")|| genero.equals("Seleccione genero")|| espe.equals("Seleccione la especialidad")|| id.equals("")) {
            JOptionPane.showMessageDialog(vista, "               Porfavor llene los campos necesarios del Especialista "
                    + "\n(Cedula, Nombres, Apellidos, Direccion, Provincia, Genero, Especialidad)");
        } else{crearDoctor();}
         }
    
}
