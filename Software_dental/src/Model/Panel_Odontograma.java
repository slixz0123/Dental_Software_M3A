/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import static View.Odontograma.btnCirculoAzul;
import static View.Odontograma.btnTriangulo;
import static View.Odontograma.btnS;
import static View.Odontograma.btnAstericoAzul;
import static View.Odontograma.btnAstericoRojo;
import static View.Odontograma.btnlineaentrecortada;
import static View.Odontograma.btnlineacontinua;
import static View.Odontograma.btnXazul;
import static View.Odontograma.btnXrojo;
import static View.Odontograma.selecOpcion;
import static View.Odontograma.btnCirculoRojo;
import static View.Odontograma.btnnuevo;

/**
 *
 * @author Saul
 */
public class Panel_Odontograma extends JPanel implements MouseListener{
    ArrayList <Cuadrado> ListaCuadrados=null;
    ArrayList <Linea> Listalinea=null;
    ArrayList <Linea_entrecortada> linea_ent=null;
    ArrayList <odon> Listaod=null;
    ArrayList <Circulo> Listacir=null;
    ArrayList <Triangulo> Listatri=null;
    ArrayList <Asterisco> Listaast=null;
    ArrayList <X_clase> Listax=null;
    ArrayList <S_clase> Listas=null;
    String opcion="caries";
    Color micol=Color.RED;
    public static Color selec= Color.GRAY;
    public Panel_Odontograma() {
        setListaCuadrados(new ArrayList<>());
        setListaod(new ArrayList<>());
        setLinea_ent(new ArrayList<>());
        setListalinea(new ArrayList<>());        
        setListaast(new ArrayList<>());
        setListacir(new ArrayList<>());
        setListatri(new ArrayList<>());
        setListax(new ArrayList<>());
        setListas(new ArrayList<>());
        addMouseListener(this);
        this.setBackground(Color.white);
        this.setBounds(0, 0, 1000, 600);
         eventocombo(selecOpcion);
         eventocirculorojo(btnCirculoRojo);
         eventocirculoazul(btnCirculoAzul);
         eventoasteriscoazul(btnAstericoAzul);
         eventoasteriscorojo(btnAstericoRojo);
         eventotriangulo(btnTriangulo);
         eventocliccombo(selecOpcion);
         eventolinea(btnlineacontinua);
         eventolineaent(btnlineaentrecortada);
         eventoXazul(btnXazul);
         eventoXrojo(btnXrojo);
         eventoS(btnS);
    }
    
 @Override
    public void paint (Graphics g){
        super.paint(g);
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/View/icons/iconos_odonto/dientes numerados.jpg"));
        g.drawImage(Img.getImage(), 0, 0, height.width, 498, null);
        setOpaque(false);
        
        getListaCuadrados().forEach((objCuad) -> {
            objCuad.pintar(g);
        });
        
        getListaod().forEach((objod) -> {
            objod.pintarod(g);
        });
        
        getListacir().forEach((obcir) -> {
            obcir.pintaCirculo(g);
        });
        
        getListaast().forEach((ast) -> {
            ast.pintarasterisco(g);  
        });
        
        getListatri().forEach((tria) -> {
            tria.pintartriangulo(g);
        });
        
        getListalinea().forEach((linea) -> {
            linea.pintarlinea(g);
        });
        
        getLinea_ent().forEach((linea_entr) -> {
            linea_entr.pintarlineaent(g);
        });
        
        getListax().forEach((equis) -> {
            equis.pintarX(g);
        });
        
        getListas().forEach((ese) -> {
            ese.pintarS(g);
        });
    }

    public ArrayList<S_clase> getListas() {
        return Listas;
    }

    public void setListas(ArrayList<S_clase> Listas) {
        this.Listas = Listas;
    }

    public ArrayList<X_clase> getListax() {
        return Listax;
    }

    public void setListax(ArrayList<X_clase> Listax) {
        this.Listax = Listax;
    }

    public ArrayList<Asterisco> getListaast() {
        return Listaast;
    }

    public void setListaast(ArrayList<Asterisco> Listaast) {
        this.Listaast = Listaast;
    }
    public ArrayList<Cuadrado> getListaCuadrados() {
        return ListaCuadrados;
    }

    public void setListaCuadrados(ArrayList<Cuadrado> ListaCuadrados) {
        this.ListaCuadrados = ListaCuadrados;
    }

    public ArrayList<Linea> getListalinea() {
        return Listalinea;
    }

    public void setListalinea(ArrayList<Linea> Listalinea) {
        this.Listalinea = Listalinea;
    }

    public ArrayList<odon> getListaod() {
        return Listaod;
    }

    public void setListaod(ArrayList<odon> Listaod) {
        this.Listaod = Listaod;
    }

    public ArrayList<Linea_entrecortada> getLinea_ent() {
        return linea_ent;
    }

    public void setLinea_ent(ArrayList<Linea_entrecortada> linea_ent) {
        this.linea_ent = linea_ent;
    }

    public ArrayList<Circulo> getListacir() {
        return Listacir;
    }

    public void setListacir(ArrayList<Circulo> Listacir) {
        this.Listacir = Listacir;
    }

    public ArrayList<Triangulo> getListatri() {
        return Listatri;
    }

    public void setListatri(ArrayList<Triangulo> Listatri) {
        this.Listatri = Listatri;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    if(e.getButton()==1 && opcion.equals("caries")){
        //Cuadrados
            getListaCuadrados().add(new Cuadrado(color_elegido(),e.getX()-7, e.getY()-7));
            repaint();
    }
       //figura
    else if(e.getButton()==1 && opcion.equals("odon")){
            getListaod().add(new odon(color_elegido(),e.getX()+37, e.getY()+47));
            repaint();
    }
       //circulo Rojo
    else if(e.getButton()==1 && (opcion.equals("cir_rojo")||opcion.equals("cir_azul"))){
         
        getListacir().add(new Circulo(micol,e.getX()-29, e.getY()-29));
            repaint();
    }

     //circulo Triangulo
    else if(e.getButton()==1 && opcion.equals("triangulo")){
         
        getListatri().add(new Triangulo(Color.GREEN,e.getX()+13, e.getY()-13));
            repaint();
    }
     // Triangulo
    else if(e.getButton()==1 && (opcion.equals("asterisco_azul")||opcion.equals("asterisco_rojo"))){
         
        getListaast().add(new Asterisco(micol,e.getX()+20, e.getY()+20));
            repaint();
    }
     //Linea Continua
    else if(e.getButton()==1 && opcion.equals("linea")){
         
        getListalinea().add(new Linea(Color.BLUE,e.getX()-25, e.getY()-5));
            repaint();
    }
    //Linea Entrecortada
    else if(e.getButton()==1 && opcion.equals("linea_entre")){
         
        getLinea_ent().add(new Linea_entrecortada(Color.BLUE,e.getX()-25, e.getY()));
            repaint();
    }
    // X
    else if(e.getButton()==1 && (opcion.equals("x_azul")||opcion.equals("x_rojo"))){
         
        getListax().add(new X_clase(micol,e.getX()+20, e.getY()+20));
            repaint();
    }
    // S
    else if(e.getButton()==1 && opcion.equals("s")){
         
        getListas().add(new S_clase(Color.BLUE,e.getX()-10, e.getY()+12));
            repaint();
    }
    //Borrar
     if(e.getButton()==3 && opcion.equals("caries")){
        if(getListaCuadrados().size()-1<0){
         repaint();
         } else{
            getListaCuadrados().remove(getListaCuadrados().size()-1);
            repaint();
            }}
     //
     else if(e.getButton()==3 && opcion.equals("odon")){
        if(getListaod().size()-1<0){
         repaint();
         } else{    
        getListaod().remove(getListaod().size()-1);
            repaint();} }
     //
    else if(e.getButton()==3 && (opcion.equals("cir_rojo")||opcion.equals("cir_azul"))){
        if(getListacir().size()-1<0){
         repaint();
         } else{    
            getListacir().remove(getListacir().size()-1);
            repaint();} }
    //
    else if(e.getButton()==3 && opcion.equals("triangulo")){
        if(getListatri().size()-1<0){
         repaint();
         } else{    
        getListatri().remove(getListatri().size()-1);
            repaint();} }
     // //
    else if(e.getButton()==3 && (opcion.equals("asterisco_rojo")||opcion.equals("asterisco_azul"))){
        if(getListaast().size()-1<0){
         repaint();
         } else{    
            getListaast().remove(getListaast().size()-1);
            repaint();} }
    // 
    else if(e.getButton()==3 && opcion.equals("linea")){
        if(getListalinea().size()-1<0){
         repaint();
         } else{    
            getListalinea().remove(getListalinea().size()-1);
            repaint();} }
    //
    else if(e.getButton()==3 && opcion.equals("linea_entre")){
        if(getLinea_ent().size()-1<0){
         repaint();
         } else{    
            getLinea_ent().remove(getLinea_ent().size()-1);
            repaint();} }
    //
    else if(e.getButton()==3 && (opcion.equals("x_azul")||opcion.equals("x_rojo"))){
        if(getListax().size()-1<0){
         repaint();
         } else{    
            getListax().remove(getListax().size()-1);
            repaint();} }
    //
    else if(e.getButton()==3 && opcion.equals("s")){
        if(getListas().size()-1<0){
         repaint();
         } else{    
            getListas().remove(getListas().size()-1);
            repaint();} }
    //
 }
    //
    

    @Override
    public void mousePressed(MouseEvent e) {
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    //Metodos
    private void eventocombo(JComboBox cbx){
    cbx.addItemListener((ItemEvent ie) -> {
        
        color_elegido();
    });
    }
    //
    private void eventobtn(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="odon";
    }
    });
    }
    private void eventocirculorojo(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="cir_rojo";
     micol=Color.RED;
    }
    });
    }
    private void eventocirculoazul(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="cir_azul";
     micol=Color.BLUE;
    }
    });
    }
    //
    private void eventoasteriscorojo(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="asterisco_rojo";
     micol=Color.RED;
    }
    });
    }
    private void eventoasteriscoazul(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="asterisco_azul";
     micol=Color.BLUE;
    }
    });
    }
    //
    private void eventotriangulo(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="triangulo";
    }
    });
    }
    //
    private void eventocliccombo(JComboBox combobx){
    combobx.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mousePressed(MouseEvent e){
        opcion="caries";
    }
    });
    }
    ////
    private void eventolinea(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="linea";
    }
    });
    }
    //
    private void eventolineaent(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="linea_entre";
    }
    });
    }
    //
    private void eventoXazul(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="x_azul";
     micol=Color.BLUE;
    }
    });
    }
    //
    private void eventoXrojo(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="x_rojo";
     micol=Color.RED;
    }
    });
    }
    //
    private void eventoS(JButton btn){
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
     opcion="s";
    }
    });
    }
    public Color color_elegido() {                                             
        int indiceC=selecOpcion.getSelectedIndex();
        selec=AsignaColor(indiceC,selec);
        
        return selec;
    } 
    private Color AsignaColor(int indice,Color selec){
       
        if(indice==0)
            selec = Color.RED;
        
        else if(indice==1)
            selec = Color.BLUE;

        else if(indice==2)
            selec = Color.BLUE;
        else if(indice==3)
            selec = Color.CYAN;
        else if(indice==4)
            selec = Color.WHITE;
        else if(indice==5)
            selec = Color.LIGHT_GRAY;
        else if(indice==6)
            selec = Color.GRAY;
        else if(indice==7)
            selec = Color.DARK_GRAY;
        else if(indice==8)
            selec = Color.MAGENTA;
        else if(indice==9)
            selec = Color.BLACK;
        else if(indice==10)
            selec = Color.RED;
        else if(indice==11)
            selec = Color.PINK;
        else if(indice==12)
            selec = Color.GREEN;
        return selec;
    }

}
