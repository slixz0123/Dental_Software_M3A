/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saul
 */
public class Anamnesis {
    private String id_anamnesis;
    private String id_paciente;
    private String embarazo;
    private String proble_rad;
    private String motiv_consul;
    private String proble_act;
    private String nomb_repre;
    private String ape_repre;
    private String ced_repre;
    private String ficha_fis;
    private String contrato;
    private String foto_anam;

    public Anamnesis() {
    }

    public Anamnesis(String id_anamnesis, String id_paciente, String embarazo, String proble_rad, String motiv_consul, String proble_act, String nomb_repre, String ape_repre, String ced_repre, String ficha_fis, String contrato, String foto_anam) {
        this.id_anamnesis = id_anamnesis;
        this.id_paciente = id_paciente;
        this.embarazo = embarazo;
        this.proble_rad = proble_rad;
        this.motiv_consul = motiv_consul;
        this.proble_act = proble_act;
        this.nomb_repre = nomb_repre;
        this.ape_repre = ape_repre;
        this.ced_repre = ced_repre;
        this.ficha_fis = ficha_fis;
        this.contrato = contrato;
        this.foto_anam = foto_anam;
    }

    public String getId_anamnesis() {
        return id_anamnesis;
    }

    public void setId_anamnesis(String id_anamnesis) {
        this.id_anamnesis = id_anamnesis;
    }

    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getProble_rad() {
        return proble_rad;
    }

    public void setProble_rad(String proble_rad) {
        this.proble_rad = proble_rad;
    }

    public String getMotiv_consul() {
        return motiv_consul;
    }

    public void setMotiv_consul(String motiv_consul) {
        this.motiv_consul = motiv_consul;
    }

    public String getProble_act() {
        return proble_act;
    }

    public void setProble_act(String proble_act) {
        this.proble_act = proble_act;
    }

    public String getNomb_repre() {
        return nomb_repre;
    }

    public void setNomb_repre(String nomb_repre) {
        this.nomb_repre = nomb_repre;
    }

    public String getApe_repre() {
        return ape_repre;
    }

    public void setApe_repre(String ape_repre) {
        this.ape_repre = ape_repre;
    }

    public String getCed_repre() {
        return ced_repre;
    }

    public void setCed_repre(String ced_repre) {
        this.ced_repre = ced_repre;
    }

    public String getFicha_fis() {
        return ficha_fis;
    }

    public void setFicha_fis(String ficha_fis) {
        this.ficha_fis = ficha_fis;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getFoto_anam() {
        return foto_anam;
    }

    public void setFoto_anam(String foto_anam) {
        this.foto_anam = foto_anam;
    }
    
    
}
