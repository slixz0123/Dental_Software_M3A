/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author slix0
 */
public class Model_Paciente extends Paciente {

    ConexionPg con = new ConexionPg();

    public Model_Paciente() {

    }

    public String NumSerie() {

        String sql = "SELECT MAX (CAST (id_paciente AS INTEGER)) FROM paciente ";
        String serie = "";
        try {
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                serie = rs.getString(1);
            }
            rs.close();

        } catch (SQLException e) {
            System.out.println("ERROR GENERAR SERIE");

        }
        return serie;
    }

    public boolean crearPersonaByte() {
        try {
            String sql;
            sql = "INSERT INTO persona (cedula,nombres,apellidos,celular,telefono,direccion,correo,provincia,ciudad,genero,fotos)";
            sql += "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombres());
            ps.setString(3, getApellidos());
            ps.setString(4, getCelular());
            ps.setString(5, getTelefono());
            ps.setString(6, getDireccion());
            ps.setString(7, getCorreo());
            ps.setString(8, getProvincia());
            ps.setString(9, getCiudad());
            ps.setString(10, getGenero());
            ps.setBytes(11, getFoto());
            ps.executeUpdate();
            ps.close();
            String sql2;
            sql2 = "INSERT INTO paciente (id_paciente,cedula_pac,fecha_nac,tipo_sang)";
            sql2 += "VALUES(?,(SELECT cedula FROM public.PERSONA WHERE cedula = ?),?,?)";
            PreparedStatement ps2 = con.getConnection().prepareStatement(sql2);
            ps2.setString(1, getId_paciente());
            ps2.setString(2, getCedula_pac());
            ps2.setDate(3, getFecha_nac());
            ps2.setString(4, getTipo_sang());

            ps2.executeUpdate();
            ps2.close();
            JOptionPane.showMessageDialog(null, "Paciente Guardado Con exito");
            con.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_ListadoPacientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Paciente> listarbuscarcita(String busc) {
        List<Paciente> milista = new ArrayList<Paciente>();
        String sql = "";
        if (busc.equals("")) {
            sql = "select p.cedula , p.nombres ,p.apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac";
        } else {
            try {
                sql = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac ";
                ResultSet rs = con.consulta(sql);

                // barremos el resulset
                while (rs.next()) {
                    Paciente pac = new Paciente();
                    pac.setCedula(rs.getString(1));
                    pac.setNombres(rs.getString(2));
                    pac.setApellidos(rs.getString(3));
                    pac.setCelular(rs.getString(4));
                    pac.setDireccion(rs.getString(5));
                    pac.setCiudad(rs.getString(6));
                    pac.setGenero(rs.getString(7));
                    pac.setFoto(rs.getBytes(8));

                    pac.setFecha_nac(rs.getDate(9));
                    pac.setTipo_sang(rs.getString(10));
                    milista.add(pac);
                    return milista;

                }
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex);
                Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return null;
    }

    public List<Paciente> listarpac() {
        List<Paciente> milistapac = new ArrayList<Paciente>();
        String sql3;

        try {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac  ";
            ResultSet rs = con.consulta(sql3);

            // barremos el resulset
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setCedula(rs.getString(1));
                pac.setNombres(rs.getString(2));
                pac.setApellidos(rs.getString(3));
                pac.setCelular(rs.getString(4));
                pac.setDireccion(rs.getString(5));
                pac.setCiudad(rs.getString(6));
                pac.setGenero(rs.getString(7));
                pac.setFoto(rs.getBytes(8));

                pac.setFecha_nac(rs.getDate(9));
                pac.setTipo_sang(rs.getString(10));

                milistapac.add(pac);

            }
            rs.close();
  
            return milistapac;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public List<Paciente> listarpacbuscar(String buscar) {
        List<Paciente> milistapac = new ArrayList<Paciente>();
        String sql3;
        if (buscar.equals(null)) {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac  WHERE p.cedula = pac.cedula_pac  ";
        } else {
            sql3 = "select p.cedula , p.nombres ,p. apellidos , p.celular, p.direccion , p.ciudad ,p.genero , p.fotos , pac.fecha_nac , pac.tipo_sang   from  persona p , paciente pac "
                    + " WHERE UPPER(p.nombres) LIKE UPPER('%" + buscar + "%') AND p.cedula = pac.cedula_pac OR ";
            sql3 += " UPPER(p.cedula) LIKE UPPER('%" + buscar + "%') AND ";
            sql3 += " p.cedula = pac.cedula_pac";
            try {
                ResultSet rs = con.consulta(sql3);

                // barremos el resulset
                while (rs.next()) {
                    Paciente pac = new Paciente();
                    pac.setCedula(rs.getString(1));
                    pac.setNombres(rs.getString(2));
                    pac.setApellidos(rs.getString(3));
                    pac.setCelular(rs.getString(4));
                    pac.setDireccion(rs.getString(5));
                    pac.setCiudad(rs.getString(6));
                    pac.setGenero(rs.getString(7));
                    pac.setFoto(rs.getBytes(8));

                    pac.setFecha_nac(rs.getDate(9));
                    pac.setTipo_sang(rs.getString(10));

                    milistapac.add(pac);

                }
                rs.close();
   

            } catch (SQLException ex) {
                System.out.println(ex);
                Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        }
        return milistapac;
    }

    public boolean ActualizarPersonas() {

        try {
            String sql;
            sql = "Update persona SET nombres=?, apellidos=?, celular=?,telefono=?, direccion=?, correo=?, provincia=?, ciudad=?, genero=?, fotos=? WHERE cedula=?";
            PreparedStatement actp = con.getConnection().prepareStatement(sql);
            actp.setString(1, getNombres());
            actp.setString(2, getApellidos());
            actp.setString(3, getCelular());
            actp.setString(4, getTelefono());
            actp.setString(5, getDireccion());
            actp.setString(6, getCorreo());
            actp.setString(7, getProvincia());
            actp.setString(8, getCiudad());
            actp.setString(9, getGenero());
            actp.setBytes(10, getFoto());
            actp.setString(11, getCedula());
            actp.executeUpdate();
         //   con.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //

    public boolean ActualizarPaciente() {

        try {
            String sql2;
            sql2 = "Update paciente SET fecha_nac=?, tipo_sang=? where cedula_pac=?";

            PreparedStatement ps2 = con.getConnection().prepareStatement(sql2);
            ps2.setDate(1, getFecha_nac());
            ps2.setString(2, getTipo_sang());
            ps2.setString(3, getCedula());
            ps2.executeUpdate();
         //   con.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //

    public boolean Actualizarsinfoto() {
        try {
            String sql;
            sql = "Update persona SET nombres=?, apellidos=?, celular=?,telefono=?, direccion=?, correo=?, provincia=?, ciudad=?, genero=? WHERE cedula=?";
            PreparedStatement actp = con.getConnection().prepareStatement(sql);
            actp.setString(1, getNombres());
            actp.setString(2, getApellidos());
            actp.setString(3, getCelular());
            actp.setString(4, getTelefono());
            actp.setString(5, getDireccion());
            actp.setString(6, getCorreo());
            actp.setString(7, getProvincia());
            actp.setString(8, getCiudad());
            actp.setString(9, getGenero());
            actp.setString(10, getCedula());
            actp.executeUpdate();
         //   con.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //

    public boolean borrarPersona(String Cedulaborrar) {
        String Sql;
        Sql = "DELETE FROM paciente WHERE cedula_pac ='" + Cedulaborrar + "'";
        return con.accion(Sql);
    }

    public List<Paciente> cargartxtsobrantes(String cedula) {
        List<Paciente> milistapaci = new ArrayList<Paciente>();
        String sql3;

        try {
            sql3 = "select * from  persona   WHERE cedula = '" + cedula + "'  ";
            ResultSet rs = con.consulta(sql3);

            // barremos el resulset
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setCedula(cedula);
                pac.setTelefono(rs.getString("telefono"));
                pac.setCorreo(rs.getString("correo"));
                pac.setProvincia(rs.getString("provincia"));

                milistapaci.add(pac);

            }
            rs.close();

            return milistapaci;
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(Model_Paciente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
