/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ConexionPg;
import Model.Odontograma_datos;
import Model.Panel_Odontograma;
import Model.model_Odontograma;
import View.MenuPrincipal;
import View.Odontograma;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import static View.Odontograma.btnnuevo;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Saul
 */
public class Controller_odonto {
    private model_Odontograma modelo;
    private Odontograma vista;
    private MenuPrincipal vistaMenu ;
    public static Color selec= Color.GRAY;
    Panel_Odontograma miod=new Panel_Odontograma();
    public Controller_odonto(model_Odontograma modelo , Odontograma vista , MenuPrincipal vistaMenu) {
        this.modelo = modelo;
        this.vista = vista;
       this.vistaMenu = vistaMenu;
        iniciar ();
        vista.setVisible(true); 
    }
    
    public void iniciar (){
        agregarimagen();
        eventocombo(vista.getSelecOpcion());
        vista.getBtnguardar().addActionListener(l->guardarImagen());
        vista.getBtnimprimir().addActionListener(l->imprimir());
        btnnuevo.addActionListener(l->nuevo());
       comprobar();
        vista.getPruebalbl().setVisible(false);
        eventotabla(vista.getTblOdontograma());
    }
    
    
    private void comprobar(){
    if(vistaMenu.getLblCedulapac().getText().equals("")||vistaMenu.getLblCedulapac().getText().equals("...")){
       JOptionPane.showMessageDialog(null, "Debe elegir un paciente");
       } else {
        cargarOdontograma();
        }
    }
    private void agregarimagen(){
    vista.getPanelod().add(miod);            
    }
    
    private void nuevo(){
    vista.getPruebalbl().setVisible(false); 
    vista.getBtnguardar().setEnabled(true);
    vista.getTxtobservaciones().setEditable(true);
    }
    //
     private void eventocombo(JComboBox cbx){
    cbx.addItemListener((ItemEvent ie) -> {
        color_elegido();
    });
    }
    public Color color_elegido() {                                             
        int indiceC=vista.getSelecOpcion().getSelectedIndex();
        selec=AsignaColor(indiceC,selec);
        vista.getSelecOpcion().setBackground(selec);
        return selec;
    } 
    
    private Color AsignaColor(int indice,Color selec){
        if(indice==0){
            selec = Color.RED;
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
        else if(indice==1){
            selec = Color.BLUE;
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
        else if(indice==2){
            selec = new Color(204,0,0);
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
        else if(indice==3){
            selec = new Color(251,0,55);
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
        else if(indice==4){
            selec = new Color(153,0,155);
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
        else if(indice==5){
            selec = new Color(0,51,255);
            vista.getSelecOpcion().setForeground(Color.WHITE);
        }
       
        return selec;
    }
    //Elegir fecha
    private Date fecha(){
        String fechaactual = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        Date fecha=Date.valueOf(fechaactual);
        return fecha;
    }
    
     //Guardar imagen
   private void guardarImagen(){
       model_Odontograma odon=new model_Odontograma();
       if(vistaMenu.getLblCedulapac().getText().equals("")||vistaMenu.getLblCedulapac().getText().equals("...")){
       JOptionPane.showMessageDialog(null, "No existe un paciente en el menu superior");
       } else {
           odon.setId_odontograma(id_od());
           odon.setId_pacien_odont(modelo.idPac(vistaMenu.getLblCedulapac().getText()));
           odon.setOd_descri(vista.getTxtobservaciones().getText());
           odon.setFecha(fecha());
           
  // String format = "jpg";
    //    File saveFile = new File("savedimage."+format);
//        JFileChooser chooser = new JFileChooser();
//        chooser.setSelectedFile(saveFile);
//        int rval = chooser.showSaveDialog(miod);
//        if (rval == JFileChooser.APPROVE_OPTION) {
//            saveFile = chooser.getSelectedFile();
            try {
//                ImageIO.write(miod.createImage(miod), format, saveFile);
                File outputfile = new File("odontograma.jpg");
                ImageIO.write(miod.createImage(miod), "jpg", outputfile);
                String directorioRaiz = System.getProperty("user.dir")+"\\odontograma.jpg";
                File ruta = new File(directorioRaiz);
                if(directorioRaiz.trim().length()!=0){ 
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            odon.setImagenodontograma(icono);
             System.out.println("Convertido a bytes");
                }  
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo guardar la imagen");
                odon.setImagenodontograma(null);
             }
    if(odon.crearOdontograma()){
          JOptionPane.showMessageDialog(vistaMenu, "Odontograma creado");
          comprobar();
        } else { JOptionPane.showMessageDialog(vistaMenu, "No se pudo crear el odontograma");}
   }
   }
   
   public int id_od(){
        int id_odon;
        id_odon=modelo.id_odontograma("SELECT MAX(id_odontograma) FROM odontograma");
        return id_odon;
    }
   //Cargar tabla odontograma
    private void cargarOdontograma(){
    DefaultTableModel tblModel;
    tblModel=(DefaultTableModel)vista.getTblOdontograma().getModel();
    tblModel.setNumRows(0);
    String idPac=modelo.idPac(vistaMenu.getLblCedulapac().getText());
    List<Odontograma_datos> listaod= modelo.listarodon(idPac);
    Holder<Integer> i = new Holder<>(0);
    listaod.stream().forEach(an->{
    tblModel.addRow(new Object[3]);   
    vista.getTblOdontograma().setValueAt(an.getId_odontograma(), i.value, 0);
    vista.getTblOdontograma().setValueAt(an.getFecha(), i.value, 1);
    i.value++;
    });
    }
    
    private void selec_odonto(java.awt.event.MouseEvent e){
        vista.getBtnguardar().setEnabled(false);
        vista.getTxtobservaciones().setEditable(false);
        int filasel = vista.getTblOdontograma().getSelectedRow();
        int id=(int) vista.getTblOdontograma().getValueAt(filasel, 0);
       
        List<Odontograma_datos> listaod= modelo.listarodontograma(id);
        for (int a = 0; a < listaod.size(); a++) {
        if (listaod.get(a).getId_pacien_odont().equals(modelo.idPac(vistaMenu.getLblCedulapac().getText()))) {
           vista.getTxtobservaciones().setText(listaod.get(a).getOd_descri());
            
           if(listaod.get(a).getImagenodontograma()!=null){
                  vista.getPruebalbl().setVisible(true);
               try {
                   byte[] ft = listaod.get(a).getImagenodontograma();
                   BufferedImage img = null;
                   InputStream in = new ByteArrayInputStream(ft);
                   img = ImageIO.read(in);
                   if(img!=null){
                       Image j = img.getScaledInstance(1080, 488, Image.SCALE_DEFAULT);
                       Icon ic = new ImageIcon(j);
                       vista.getPruebalbl().setIcon(ic);
                   }  else {
                       vista.getPruebalbl().setIcon(null);}
               } catch (IOException ex) {
                   Logger.getLogger(Controller_odonto.class.getName()).log(Level.SEVERE, null, ex);
               }
                  
                 }

        }}
    }
    private void eventotabla(JTable tbl){
    tbl.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
        selec_odonto(e);
    }
    });
    }
    private void imprimir(){
   ConexionPg con= new ConexionPg();
    int filasel = vista.getTblOdontograma().getSelectedRow();
    if (filasel==-1){
    JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
    }else{
    int num=(int) vista.getTblOdontograma().getValueAt(filasel, 0);
        try {
            JasperReport listado = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/Odontograma.jasper"));
            
            Map parametros = new HashMap();
            parametros.put("id_od", num);
            JasperPrint impr= JasperFillManager.fillReport(listado, parametros, con.getConnection());
            JasperViewer ver= new JasperViewer(impr,false);
            ver.setVisible(true);
            
            nuevo();
        } catch (JRException ex) {
            Logger.getLogger(Controller_odonto.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
}
