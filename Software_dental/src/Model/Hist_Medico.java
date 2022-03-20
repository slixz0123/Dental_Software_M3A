/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Saul
 */
public class Hist_Medico {
    private String id_his_med;
    private String id_medico_his;
    private String id_paciente_his;
    private String enfermedad_act;
    private String ant_fam;
    private String trat_med;
    private String aler_med;
    private String med_hab;
    private String fum_b;
    private String pro_card;
    private String ulc_gas;
    private String presion;
    private String hepat;
    private String diabetes;
    private String epilepsia;
    private String do_cab;
    private String al_endo;
    private String vih;
    private String pro_coagu;
    private String fre_res;
    private String fre_car;
    private String pre_art;
    private String tem;
    private String oxim;
    private Date fecha_his;
    private String hora_his;

    public Hist_Medico() {
    }

    public Hist_Medico(String id_his_med, String id_medico_his, String id_paciente_his, String enfermedad_act, String ant_fam, String trat_med, String aler_med, String med_hab, String fum_b, String pro_card, String ulc_gas, String presion, String hepat, String diabetes, String epilepsia, String do_cab, String al_endo, String vih, String pro_coagu, String fre_res, String fre_car, String pre_art, String tem, String oxim, Date fecha_his, String hora_his) {
        this.id_his_med = id_his_med;
        this.id_medico_his = id_medico_his;
        this.id_paciente_his = id_paciente_his;
        this.enfermedad_act = enfermedad_act;
        this.ant_fam = ant_fam;
        this.trat_med = trat_med;
        this.aler_med = aler_med;
        this.med_hab = med_hab;
        this.fum_b = fum_b;
        this.pro_card = pro_card;
        this.ulc_gas = ulc_gas;
        this.presion = presion;
        this.hepat = hepat;
        this.diabetes = diabetes;
        this.epilepsia = epilepsia;
        this.do_cab = do_cab;
        this.al_endo = al_endo;
        this.vih = vih;
        this.pro_coagu = pro_coagu;
        this.fre_res = fre_res;
        this.fre_car = fre_car;
        this.pre_art = pre_art;
        this.tem = tem;
        this.oxim = oxim;
        this.fecha_his = fecha_his;
        this.hora_his = hora_his;
    }

    

    public String getId_his_med() {
        return id_his_med;
    }

    public void setId_his_med(String id_his_med) {
        this.id_his_med = id_his_med;
    }

    public String getId_medico_his() {
        return id_medico_his;
    }

    public void setId_medico_his(String id_medico_his) {
        this.id_medico_his = id_medico_his;
    }

    public String getId_paciente_his() {
        return id_paciente_his;
    }

    public void setId_paciente_his(String id_paciente_his) {
        this.id_paciente_his = id_paciente_his;
    }

    public String getEnfermedad_act() {
        return enfermedad_act;
    }

    public void setEnfermedad_act(String enfermedad_act) {
        this.enfermedad_act = enfermedad_act;
    }

    public String getAnt_fam() {
        return ant_fam;
    }

    public void setAnt_fam(String ant_fam) {
        this.ant_fam = ant_fam;
    }

    public String getTrat_med() {
        return trat_med;
    }

    public void setTrat_med(String trat_med) {
        this.trat_med = trat_med;
    }

    public String getAler_med() {
        return aler_med;
    }

    public void setAler_med(String aler_med) {
        this.aler_med = aler_med;
    }

    public String getMed_hab() {
        return med_hab;
    }

    public void setMed_hab(String med_hab) {
        this.med_hab = med_hab;
    }

    public String getFum_b() {
        return fum_b;
    }

    public void setFum_b(String fum_b) {
        this.fum_b = fum_b;
    }

    public String getPro_card() {
        return pro_card;
    }

    public void setPro_card(String pro_card) {
        this.pro_card = pro_card;
    }

    public String getUlc_gas() {
        return ulc_gas;
    }

    public void setUlc_gas(String ulc_gas) {
        this.ulc_gas = ulc_gas;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getHepat() {
        return hepat;
    }

    public void setHepat(String hepat) {
        this.hepat = hepat;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(String epilepsia) {
        this.epilepsia = epilepsia;
    }

    public String getDo_cab() {
        return do_cab;
    }

    public void setDo_cab(String do_cab) {
        this.do_cab = do_cab;
    }

    public String getAl_endo() {
        return al_endo;
    }

    public void setAl_endo(String al_endo) {
        this.al_endo = al_endo;
    }

    public String getVih() {
        return vih;
    }

    public void setVih(String vih) {
        this.vih = vih;
    }

    public String getPro_coagu() {
        return pro_coagu;
    }

    public void setPro_coagu(String pro_coagu) {
        this.pro_coagu = pro_coagu;
    }

    public String getFre_res() {
        return fre_res;
    }

    public void setFre_res(String fre_res) {
        this.fre_res = fre_res;
    }

    public String getFre_car() {
        return fre_car;
    }

    public void setFre_car(String fre_car) {
        this.fre_car = fre_car;
    }

    public String getPre_art() {
        return pre_art;
    }

    public void setPre_art(String pre_art) {
        this.pre_art = pre_art;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getOxim() {
        return oxim;
    }

    public void setOxim(String oxim) {
        this.oxim = oxim;
    }

    public Date getFecha_his() {
        return fecha_his;
    }

    public void setFecha_his(Date fecha_his) {
        this.fecha_his = fecha_his;
    }

    public String getHora_his() {
        return hora_his;
    }

    public void setHora_his(String hora_his) {
        this.hora_his = hora_his;
    }
    
}
