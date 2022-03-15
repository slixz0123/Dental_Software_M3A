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
    private String motiv_consul;
    private String proble_act;
    private String id_doctor;

    public Anamnesis() {
    }

    public Anamnesis(String id_anamnesis, String id_paciente, String embarazo, String motiv_consul, String proble_act, String id_doctor) {
        this.id_anamnesis = id_anamnesis;
        this.id_paciente = id_paciente;
        this.embarazo = embarazo;
        this.motiv_consul = motiv_consul;
        this.proble_act = proble_act;
        this.id_doctor = id_doctor;
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

    public String getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(String id_doctor) {
        this.id_doctor = id_doctor;
    }

}
