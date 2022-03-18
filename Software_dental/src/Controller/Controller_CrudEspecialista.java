package Controller;

import Model.Doctor;
import Model.Model_Especialista;
import Model.Model_Paciente;
import Model.Paciente;
import View.MenuPrincipal;
import View.Vista_crud_especalista;
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
import java.time.LocalDateTime;
import java.time.Period;
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
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
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
        vista.getBtnguardarEsp().addActionListener(l->crearDoctor());
        vista.getBtneliminar().addActionListener(l->eliminarPersonas());
        vista.getBtneditar().addActionListener(l-> llenartxtsobrantes());
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
            vista.getTxtIdDoctor().setText("00001");
        } else {
            int inc = Integer.parseInt(serie);
            inc++;
            vista.getTxtIdDoctor().setText("0000" + inc);

        }
    }
    
    public void crearDoctor(){
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
                limpiartxt();

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
            String id = vista.getTblEspecialista().getValueAt(xx, 0).toString();
            String esp = id ;
            vista.getTxtcedulaesp().setText(id);
            vistamenu.getLblCedulapac().setText(id);
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
            
            
            
          
       
            
              for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getCedula().equals(esp)) {
   
                    byte[] ft = lp.get(i).getFoto();
                    BufferedImage img = null;
                   
                     InputStream in = new ByteArrayInputStream(ft);
                     img = ImageIO.read(in);
          
                    Image j = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    Icon ic = new ImageIcon(j);
                    vista.getLblFotoEsp().setIcon(ic);
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
            System.out.println(esp.getTelefono());
            System.out.println(esp.getCorreo());
            System.out.println(esp.getProvincia());
            System.out.println(esp.getId_usuario());
            System.out.println(esp.getCargo());
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

    private void setKeyReleased(JTextField buscar){
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                buscarDoc(e);
            }
        });
    }
    
    
    
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
    
    public void limpiartxt(){
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
    vista.getcBoxespecialidad().setSelectedIndex(0);
    vista.getTxtCargoesp().setText("");
    vista.getTxtruta().setText("");
    }
}
