/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Saul
 */
public class odontograma {
    private String id_odontograma;
    private String id_pacien_odont;
    private int od_num_diente;
    private byte[] diente_11, d11_1,d11_2,d11_3,d11_4,d11_5;
    private byte[] diente_12, d12_1,d12_2,d12_3,d12_4,d12_5;
    private byte[] diente_13, d13_1,d13_2,d13_3,d13_4,d13_5;
    private byte[] diente_14, d14_1,d14_2,d14_3,d14_4,d14_5;
    private byte[] diente_15, d15_1,d15_2,d15_3,d15_4,d15_5;
    private byte[] diente_16, d16_1,d16_2,d16_3,d16_4,d16_5;
    private byte[] diente_17, d17_1,d17_2,d17_3,d17_4,d17_5;
    private byte[] diente_18, d18_1,d18_2,d18_3,d18_4,d18_5;
    private byte[] diente_21, d21_1,d21_2,d21_3,d21_4,d21_5;
    private byte[] diente_22, d22_1,d22_2,d22_3,d22_4,d22_5;
    private byte[] diente_23, d23_1,d23_2,d23_3,d23_4,d23_5;
    private byte[] diente_24, d24_1,d24_2,d24_3,d24_4,d24_5;
    private byte[] diente_25, d25_1,d25_2,d25_3,d25_4,d25_5;
    private byte[] diente_26, d26_1,d26_2,d26_3,d26_4,d26_5;
    private byte[] diente_27, d27_1,d27_2,d27_3,d27_4,d27_5;
    private byte[] diente_28, d28_1,d28_2,d28_3,d28_4,d28_5;
    private byte[] diente_31, d31_1,d31_2,d31_3,d31_4,d31_5;
    private byte[] diente_32, d32_1,d32_2,d32_3,d32_4,d32_5;
    private byte[] diente_33, d33_1,d33_2,d33_3,d33_4,d33_5;
    private byte[] diente_34, d34_1,d34_2,d34_3,d34_4,d34_5;
    private byte[] diente_35, d35_1,d35_2,d35_3,d35_4,d35_5;
    private byte[] diente_36, d36_1,d36_2,d36_3,d36_4,d36_5;
    private byte[] diente_37, d37_1,d37_2,d37_3,d37_4,d37_5;
    private byte[] diente_38, d38_1,d38_2,d38_3,d38_4,d38_5;
    private byte[] diente_41, d41_1,d41_2,d41_3,d41_4,d41_5;
    private byte[] diente_42, d42_1,d42_2,d42_3,d42_4,d42_5;
    private byte[] diente_43, d43_1,d43_2,d43_3,d43_4,d43_5;
    private byte[] diente_44, d44_1,d44_2,d44_3,d44_4,d44_5;
    private byte[] diente_45, d45_1,d45_2,d45_3,d45_4,d45_5;
    private byte[] diente_46, d46_1,d46_2,d46_3,d46_4,d46_5;
    private byte[] diente_47, d47_1,d47_2,d47_3,d47_4,d47_5;
    private byte[] diente_48, d48_1,d48_2,d48_3,d48_4,d48_5;
    private byte[] diente_fondo;
    private String od_descri;

    public odontograma() {
    }

    public odontograma(String id_odontograma, String id_pacien_odont, int od_num_diente, byte[] diente_fondo, byte[] diente_11, byte[] d11_1, byte[] d11_2, byte[] d11_3, byte[] d11_4, byte[] d11_5, byte[] diente_12, byte[] d12_1, byte[] d12_2, byte[] d12_3, byte[] d12_4, byte[] d12_5, byte[] diente_13, byte[] d13_1, byte[] d13_2, byte[] d13_3, byte[] d13_4, byte[] d13_5, byte[] diente_14, byte[] d14_1, byte[] d14_2, byte[] d14_3, byte[] d14_4, byte[] d14_5, byte[] diente_15, byte[] d15_1, byte[] d15_2, byte[] d15_3, byte[] d15_4, byte[] d15_5, byte[] diente_16, byte[] d16_1, byte[] d16_2, byte[] d16_3, byte[] d16_4, byte[] d16_5, byte[] diente_17, byte[] d17_1, byte[] d17_2, byte[] d17_3, byte[] d17_4, byte[] d17_5, byte[] diente_18, byte[] d18_1, byte[] d18_2, byte[] d18_3, byte[] d18_4, byte[] d18_5, byte[] diente_21, byte[] d21_1, byte[] d21_2, byte[] d21_3, byte[] d21_4, byte[] d21_5, byte[] diente_22, byte[] d22_1, byte[] d22_2, byte[] d22_3, byte[] d22_4, byte[] d22_5, byte[] diente_23, byte[] d23_1, byte[] d23_2, byte[] d23_3, byte[] d23_4, byte[] d23_5, byte[] diente_24, byte[] d24_1, byte[] d24_2, byte[] d24_3, byte[] d24_4, byte[] d24_5, byte[] diente_25, byte[] d25_1, byte[] d25_2, byte[] d25_3, byte[] d25_4, byte[] d25_5, byte[] diente_26, byte[] d26_1, byte[] d26_2, byte[] d26_3, byte[] d26_4, byte[] d26_5, byte[] diente_27, byte[] d27_1, byte[] d27_2, byte[] d27_3, byte[] d27_4, byte[] d27_5, byte[] diente_28, byte[] d28_1, byte[] d28_2, byte[] d28_3, byte[] d28_4, byte[] d28_5, byte[] diente_31, byte[] d31_1, byte[] d31_2, byte[] d31_3, byte[] d31_4, byte[] d31_5, byte[] diente_32, byte[] d32_1, byte[] d32_2, byte[] d32_3, byte[] d32_4, byte[] d32_5, byte[] diente_33, byte[] d33_1, byte[] d33_2, byte[] d33_3, byte[] d33_4, byte[] d33_5, byte[] diente_34, byte[] d34_1, byte[] d34_2, byte[] d34_3, byte[] d34_4, byte[] d34_5, byte[] diente_35, byte[] d35_1, byte[] d35_2, byte[] d35_3, byte[] d35_4, byte[] d35_5, byte[] diente_36, byte[] d36_1, byte[] d36_2, byte[] d36_3, byte[] d36_4, byte[] d36_5, byte[] diente_37, byte[] d37_1, byte[] d37_2, byte[] d37_3, byte[] d37_4, byte[] d37_5, byte[] diente_38, byte[] d38_1, byte[] d38_2, byte[] d38_3, byte[] d38_4, byte[] d38_5, byte[] diente_41, byte[] d41_1, byte[] d41_2, byte[] d41_3, byte[] d41_4, byte[] d41_5, byte[] diente_42, byte[] d42_1, byte[] d42_2, byte[] d42_3, byte[] d42_4, byte[] d42_5, byte[] diente_43, byte[] d43_1, byte[] d43_2, byte[] d43_3, byte[] d43_4, byte[] d43_5, byte[] diente_44, byte[] d44_1, byte[] d44_2, byte[] d44_3, byte[] d44_4, byte[] d44_5, byte[] diente_45, byte[] d45_1, byte[] d45_2, byte[] d45_3, byte[] d45_4, byte[] d45_5, byte[] diente_46, byte[] d46_1, byte[] d46_2, byte[] d46_3, byte[] d46_4, byte[] d46_5, byte[] diente_47, byte[] d47_1, byte[] d47_2, byte[] d47_3, byte[] d47_4, byte[] d47_5, byte[] diente_48, byte[] d48_1, byte[] d48_2, byte[] d48_3, byte[] d48_4, byte[] d48_5, String od_descri) {
        this.id_odontograma = id_odontograma;
        this.id_pacien_odont = id_pacien_odont;
        this.od_num_diente = od_num_diente;
        this.diente_fondo = diente_fondo;
        this.diente_11 = diente_11;
        this.d11_1 = d11_1;
        this.d11_2 = d11_2;
        this.d11_3 = d11_3;
        this.d11_4 = d11_4;
        this.d11_5 = d11_5;
        this.diente_12 = diente_12;
        this.d12_1 = d12_1;
        this.d12_2 = d12_2;
        this.d12_3 = d12_3;
        this.d12_4 = d12_4;
        this.d12_5 = d12_5;
        this.diente_13 = diente_13;
        this.d13_1 = d13_1;
        this.d13_2 = d13_2;
        this.d13_3 = d13_3;
        this.d13_4 = d13_4;
        this.d13_5 = d13_5;
        this.diente_14 = diente_14;
        this.d14_1 = d14_1;
        this.d14_2 = d14_2;
        this.d14_3 = d14_3;
        this.d14_4 = d14_4;
        this.d14_5 = d14_5;
        this.diente_15 = diente_15;
        this.d15_1 = d15_1;
        this.d15_2 = d15_2;
        this.d15_3 = d15_3;
        this.d15_4 = d15_4;
        this.d15_5 = d15_5;
        this.diente_16 = diente_16;
        this.d16_1 = d16_1;
        this.d16_2 = d16_2;
        this.d16_3 = d16_3;
        this.d16_4 = d16_4;
        this.d16_5 = d16_5;
        this.diente_17 = diente_17;
        this.d17_1 = d17_1;
        this.d17_2 = d17_2;
        this.d17_3 = d17_3;
        this.d17_4 = d17_4;
        this.d17_5 = d17_5;
        this.diente_18 = diente_18;
        this.d18_1 = d18_1;
        this.d18_2 = d18_2;
        this.d18_3 = d18_3;
        this.d18_4 = d18_4;
        this.d18_5 = d18_5;
        this.diente_21 = diente_21;
        this.d21_1 = d21_1;
        this.d21_2 = d21_2;
        this.d21_3 = d21_3;
        this.d21_4 = d21_4;
        this.d21_5 = d21_5;
        this.diente_22 = diente_22;
        this.d22_1 = d22_1;
        this.d22_2 = d22_2;
        this.d22_3 = d22_3;
        this.d22_4 = d22_4;
        this.d22_5 = d22_5;
        this.diente_23 = diente_23;
        this.d23_1 = d23_1;
        this.d23_2 = d23_2;
        this.d23_3 = d23_3;
        this.d23_4 = d23_4;
        this.d23_5 = d23_5;
        this.diente_24 = diente_24;
        this.d24_1 = d24_1;
        this.d24_2 = d24_2;
        this.d24_3 = d24_3;
        this.d24_4 = d24_4;
        this.d24_5 = d24_5;
        this.diente_25 = diente_25;
        this.d25_1 = d25_1;
        this.d25_2 = d25_2;
        this.d25_3 = d25_3;
        this.d25_4 = d25_4;
        this.d25_5 = d25_5;
        this.diente_26 = diente_26;
        this.d26_1 = d26_1;
        this.d26_2 = d26_2;
        this.d26_3 = d26_3;
        this.d26_4 = d26_4;
        this.d26_5 = d26_5;
        this.diente_27 = diente_27;
        this.d27_1 = d27_1;
        this.d27_2 = d27_2;
        this.d27_3 = d27_3;
        this.d27_4 = d27_4;
        this.d27_5 = d27_5;
        this.diente_28 = diente_28;
        this.d28_1 = d28_1;
        this.d28_2 = d28_2;
        this.d28_3 = d28_3;
        this.d28_4 = d28_4;
        this.d28_5 = d28_5;
        this.diente_31 = diente_31;
        this.d31_1 = d31_1;
        this.d31_2 = d31_2;
        this.d31_3 = d31_3;
        this.d31_4 = d31_4;
        this.d31_5 = d31_5;
        this.diente_32 = diente_32;
        this.d32_1 = d32_1;
        this.d32_2 = d32_2;
        this.d32_3 = d32_3;
        this.d32_4 = d32_4;
        this.d32_5 = d32_5;
        this.diente_33 = diente_33;
        this.d33_1 = d33_1;
        this.d33_2 = d33_2;
        this.d33_3 = d33_3;
        this.d33_4 = d33_4;
        this.d33_5 = d33_5;
        this.diente_34 = diente_34;
        this.d34_1 = d34_1;
        this.d34_2 = d34_2;
        this.d34_3 = d34_3;
        this.d34_4 = d34_4;
        this.d34_5 = d34_5;
        this.diente_35 = diente_35;
        this.d35_1 = d35_1;
        this.d35_2 = d35_2;
        this.d35_3 = d35_3;
        this.d35_4 = d35_4;
        this.d35_5 = d35_5;
        this.diente_36 = diente_36;
        this.d36_1 = d36_1;
        this.d36_2 = d36_2;
        this.d36_3 = d36_3;
        this.d36_4 = d36_4;
        this.d36_5 = d36_5;
        this.diente_37 = diente_37;
        this.d37_1 = d37_1;
        this.d37_2 = d37_2;
        this.d37_3 = d37_3;
        this.d37_4 = d37_4;
        this.d37_5 = d37_5;
        this.diente_38 = diente_38;
        this.d38_1 = d38_1;
        this.d38_2 = d38_2;
        this.d38_3 = d38_3;
        this.d38_4 = d38_4;
        this.d38_5 = d38_5;
        this.diente_41 = diente_41;
        this.d41_1 = d41_1;
        this.d41_2 = d41_2;
        this.d41_3 = d41_3;
        this.d41_4 = d41_4;
        this.d41_5 = d41_5;
        this.diente_42 = diente_42;
        this.d42_1 = d42_1;
        this.d42_2 = d42_2;
        this.d42_3 = d42_3;
        this.d42_4 = d42_4;
        this.d42_5 = d42_5;
        this.diente_43 = diente_43;
        this.d43_1 = d43_1;
        this.d43_2 = d43_2;
        this.d43_3 = d43_3;
        this.d43_4 = d43_4;
        this.d43_5 = d43_5;
        this.diente_44 = diente_44;
        this.d44_1 = d44_1;
        this.d44_2 = d44_2;
        this.d44_3 = d44_3;
        this.d44_4 = d44_4;
        this.d44_5 = d44_5;
        this.diente_45 = diente_45;
        this.d45_1 = d45_1;
        this.d45_2 = d45_2;
        this.d45_3 = d45_3;
        this.d45_4 = d45_4;
        this.d45_5 = d45_5;
        this.diente_46 = diente_46;
        this.d46_1 = d46_1;
        this.d46_2 = d46_2;
        this.d46_3 = d46_3;
        this.d46_4 = d46_4;
        this.d46_5 = d46_5;
        this.diente_47 = diente_47;
        this.d47_1 = d47_1;
        this.d47_2 = d47_2;
        this.d47_3 = d47_3;
        this.d47_4 = d47_4;
        this.d47_5 = d47_5;
        this.diente_48 = diente_48;
        this.d48_1 = d48_1;
        this.d48_2 = d48_2;
        this.d48_3 = d48_3;
        this.d48_4 = d48_4;
        this.d48_5 = d48_5;
        this.od_descri = od_descri;
    }

    public byte[] getDiente_11() {
        return diente_11;
    }

    public void setDiente_11(byte[] diente_11) {
        this.diente_11 = diente_11;
    }

    public byte[] getD11_1() {
        return d11_1;
    }

    public void setD11_1(byte[] d11_1) {
        this.d11_1 = d11_1;
    }

    public byte[] getD11_2() {
        return d11_2;
    }

    public void setD11_2(byte[] d11_2) {
        this.d11_2 = d11_2;
    }

    public byte[] getD11_3() {
        return d11_3;
    }

    public void setD11_3(byte[] d11_3) {
        this.d11_3 = d11_3;
    }

    public byte[] getD11_4() {
        return d11_4;
    }

    public void setD11_4(byte[] d11_4) {
        this.d11_4 = d11_4;
    }

    public byte[] getD11_5() {
        return d11_5;
    }

    public void setD11_5(byte[] d11_5) {
        this.d11_5 = d11_5;
    }

    public byte[] getDiente_12() {
        return diente_12;
    }

    public void setDiente_12(byte[] diente_12) {
        this.diente_12 = diente_12;
    }

    public byte[] getD12_1() {
        return d12_1;
    }

    public void setD12_1(byte[] d12_1) {
        this.d12_1 = d12_1;
    }

    public byte[] getD12_2() {
        return d12_2;
    }

    public void setD12_2(byte[] d12_2) {
        this.d12_2 = d12_2;
    }

    public byte[] getD12_3() {
        return d12_3;
    }

    public void setD12_3(byte[] d12_3) {
        this.d12_3 = d12_3;
    }

    public byte[] getD12_4() {
        return d12_4;
    }

    public void setD12_4(byte[] d12_4) {
        this.d12_4 = d12_4;
    }

    public byte[] getD12_5() {
        return d12_5;
    }

    public void setD12_5(byte[] d12_5) {
        this.d12_5 = d12_5;
    }

    public byte[] getDiente_13() {
        return diente_13;
    }

    public void setDiente_13(byte[] diente_13) {
        this.diente_13 = diente_13;
    }

    public byte[] getD13_1() {
        return d13_1;
    }

    public void setD13_1(byte[] d13_1) {
        this.d13_1 = d13_1;
    }

    public byte[] getD13_2() {
        return d13_2;
    }

    public void setD13_2(byte[] d13_2) {
        this.d13_2 = d13_2;
    }

    public byte[] getD13_3() {
        return d13_3;
    }

    public void setD13_3(byte[] d13_3) {
        this.d13_3 = d13_3;
    }

    public byte[] getD13_4() {
        return d13_4;
    }

    public void setD13_4(byte[] d13_4) {
        this.d13_4 = d13_4;
    }

    public byte[] getD13_5() {
        return d13_5;
    }

    public void setD13_5(byte[] d13_5) {
        this.d13_5 = d13_5;
    }

    public byte[] getDiente_14() {
        return diente_14;
    }

    public void setDiente_14(byte[] diente_14) {
        this.diente_14 = diente_14;
    }

    public byte[] getD14_1() {
        return d14_1;
    }

    public void setD14_1(byte[] d14_1) {
        this.d14_1 = d14_1;
    }

    public byte[] getD14_2() {
        return d14_2;
    }

    public void setD14_2(byte[] d14_2) {
        this.d14_2 = d14_2;
    }

    public byte[] getD14_3() {
        return d14_3;
    }

    public void setD14_3(byte[] d14_3) {
        this.d14_3 = d14_3;
    }

    public byte[] getD14_4() {
        return d14_4;
    }

    public void setD14_4(byte[] d14_4) {
        this.d14_4 = d14_4;
    }

    public byte[] getD14_5() {
        return d14_5;
    }

    public void setD14_5(byte[] d14_5) {
        this.d14_5 = d14_5;
    }

    public byte[] getDiente_15() {
        return diente_15;
    }

    public void setDiente_15(byte[] diente_15) {
        this.diente_15 = diente_15;
    }

    public byte[] getD15_1() {
        return d15_1;
    }

    public void setD15_1(byte[] d15_1) {
        this.d15_1 = d15_1;
    }

    public byte[] getD15_2() {
        return d15_2;
    }

    public void setD15_2(byte[] d15_2) {
        this.d15_2 = d15_2;
    }

    public byte[] getD15_3() {
        return d15_3;
    }

    public void setD15_3(byte[] d15_3) {
        this.d15_3 = d15_3;
    }

    public byte[] getD15_4() {
        return d15_4;
    }

    public void setD15_4(byte[] d15_4) {
        this.d15_4 = d15_4;
    }

    public byte[] getD15_5() {
        return d15_5;
    }

    public void setD15_5(byte[] d15_5) {
        this.d15_5 = d15_5;
    }

    public byte[] getDiente_16() {
        return diente_16;
    }

    public void setDiente_16(byte[] diente_16) {
        this.diente_16 = diente_16;
    }

    public byte[] getD16_1() {
        return d16_1;
    }

    public void setD16_1(byte[] d16_1) {
        this.d16_1 = d16_1;
    }

    public byte[] getD16_2() {
        return d16_2;
    }

    public void setD16_2(byte[] d16_2) {
        this.d16_2 = d16_2;
    }

    public byte[] getD16_3() {
        return d16_3;
    }

    public void setD16_3(byte[] d16_3) {
        this.d16_3 = d16_3;
    }

    public byte[] getD16_4() {
        return d16_4;
    }

    public void setD16_4(byte[] d16_4) {
        this.d16_4 = d16_4;
    }

    public byte[] getD16_5() {
        return d16_5;
    }

    public void setD16_5(byte[] d16_5) {
        this.d16_5 = d16_5;
    }

    public byte[] getDiente_17() {
        return diente_17;
    }

    public void setDiente_17(byte[] diente_17) {
        this.diente_17 = diente_17;
    }

    public byte[] getD17_1() {
        return d17_1;
    }

    public void setD17_1(byte[] d17_1) {
        this.d17_1 = d17_1;
    }

    public byte[] getD17_2() {
        return d17_2;
    }

    public void setD17_2(byte[] d17_2) {
        this.d17_2 = d17_2;
    }

    public byte[] getD17_3() {
        return d17_3;
    }

    public void setD17_3(byte[] d17_3) {
        this.d17_3 = d17_3;
    }

    public byte[] getD17_4() {
        return d17_4;
    }

    public void setD17_4(byte[] d17_4) {
        this.d17_4 = d17_4;
    }

    public byte[] getD17_5() {
        return d17_5;
    }

    public void setD17_5(byte[] d17_5) {
        this.d17_5 = d17_5;
    }

    public byte[] getDiente_18() {
        return diente_18;
    }

    public void setDiente_18(byte[] diente_18) {
        this.diente_18 = diente_18;
    }

    public byte[] getD18_1() {
        return d18_1;
    }

    public void setD18_1(byte[] d18_1) {
        this.d18_1 = d18_1;
    }

    public byte[] getD18_2() {
        return d18_2;
    }

    public void setD18_2(byte[] d18_2) {
        this.d18_2 = d18_2;
    }

    public byte[] getD18_3() {
        return d18_3;
    }

    public void setD18_3(byte[] d18_3) {
        this.d18_3 = d18_3;
    }

    public byte[] getDiente_fondo() {
        return diente_fondo;
    }

    public void setDiente_fondo(byte[] diente_fondo) {
        this.diente_fondo = diente_fondo;
    }

    public byte[] getD18_4() {
        return d18_4;
    }

    public void setD18_4(byte[] d18_4) {
        this.d18_4 = d18_4;
    }

    public byte[] getD18_5() {
        return d18_5;
    }

    public void setD18_5(byte[] d18_5) {
        this.d18_5 = d18_5;
    }

    public byte[] getDiente_21() {
        return diente_21;
    }

    public void setDiente_21(byte[] diente_21) {
        this.diente_21 = diente_21;
    }

    public byte[] getD21_1() {
        return d21_1;
    }

    public void setD21_1(byte[] d21_1) {
        this.d21_1 = d21_1;
    }

    public byte[] getD21_2() {
        return d21_2;
    }

    public void setD21_2(byte[] d21_2) {
        this.d21_2 = d21_2;
    }

    public byte[] getD21_3() {
        return d21_3;
    }

    public void setD21_3(byte[] d21_3) {
        this.d21_3 = d21_3;
    }

    public byte[] getD21_4() {
        return d21_4;
    }

    public void setD21_4(byte[] d21_4) {
        this.d21_4 = d21_4;
    }

    public byte[] getD21_5() {
        return d21_5;
    }

    public void setD21_5(byte[] d21_5) {
        this.d21_5 = d21_5;
    }

    public byte[] getDiente_22() {
        return diente_22;
    }

    public void setDiente_22(byte[] diente_22) {
        this.diente_22 = diente_22;
    }

    public byte[] getD22_1() {
        return d22_1;
    }

    public void setD22_1(byte[] d22_1) {
        this.d22_1 = d22_1;
    }

    public byte[] getD22_2() {
        return d22_2;
    }

    public void setD22_2(byte[] d22_2) {
        this.d22_2 = d22_2;
    }

    public byte[] getD22_3() {
        return d22_3;
    }

    public void setD22_3(byte[] d22_3) {
        this.d22_3 = d22_3;
    }

    public byte[] getD22_4() {
        return d22_4;
    }

    public void setD22_4(byte[] d22_4) {
        this.d22_4 = d22_4;
    }

    public byte[] getD22_5() {
        return d22_5;
    }

    public void setD22_5(byte[] d22_5) {
        this.d22_5 = d22_5;
    }

    public byte[] getDiente_23() {
        return diente_23;
    }

    public void setDiente_23(byte[] diente_23) {
        this.diente_23 = diente_23;
    }

    public byte[] getD23_1() {
        return d23_1;
    }

    public void setD23_1(byte[] d23_1) {
        this.d23_1 = d23_1;
    }

    public byte[] getD23_2() {
        return d23_2;
    }

    public void setD23_2(byte[] d23_2) {
        this.d23_2 = d23_2;
    }

    public byte[] getD23_3() {
        return d23_3;
    }

    public void setD23_3(byte[] d23_3) {
        this.d23_3 = d23_3;
    }

    public byte[] getD23_4() {
        return d23_4;
    }

    public void setD23_4(byte[] d23_4) {
        this.d23_4 = d23_4;
    }

    public byte[] getD23_5() {
        return d23_5;
    }

    public void setD23_5(byte[] d23_5) {
        this.d23_5 = d23_5;
    }

    public byte[] getDiente_24() {
        return diente_24;
    }

    public void setDiente_24(byte[] diente_24) {
        this.diente_24 = diente_24;
    }

    public byte[] getD24_1() {
        return d24_1;
    }

    public void setD24_1(byte[] d24_1) {
        this.d24_1 = d24_1;
    }

    public byte[] getD24_2() {
        return d24_2;
    }

    public void setD24_2(byte[] d24_2) {
        this.d24_2 = d24_2;
    }

    public byte[] getD24_3() {
        return d24_3;
    }

    public void setD24_3(byte[] d24_3) {
        this.d24_3 = d24_3;
    }

    public byte[] getD24_4() {
        return d24_4;
    }

    public void setD24_4(byte[] d24_4) {
        this.d24_4 = d24_4;
    }

    public byte[] getD24_5() {
        return d24_5;
    }

    public void setD24_5(byte[] d24_5) {
        this.d24_5 = d24_5;
    }

    public byte[] getDiente_25() {
        return diente_25;
    }

    public void setDiente_25(byte[] diente_25) {
        this.diente_25 = diente_25;
    }

    public byte[] getD25_1() {
        return d25_1;
    }

    public void setD25_1(byte[] d25_1) {
        this.d25_1 = d25_1;
    }

    public byte[] getD25_2() {
        return d25_2;
    }

    public void setD25_2(byte[] d25_2) {
        this.d25_2 = d25_2;
    }

    public byte[] getD25_3() {
        return d25_3;
    }

    public void setD25_3(byte[] d25_3) {
        this.d25_3 = d25_3;
    }

    public byte[] getD25_4() {
        return d25_4;
    }

    public void setD25_4(byte[] d25_4) {
        this.d25_4 = d25_4;
    }

    public byte[] getD25_5() {
        return d25_5;
    }

    public void setD25_5(byte[] d25_5) {
        this.d25_5 = d25_5;
    }

    public byte[] getDiente_26() {
        return diente_26;
    }

    public void setDiente_26(byte[] diente_26) {
        this.diente_26 = diente_26;
    }

    public byte[] getD26_1() {
        return d26_1;
    }

    public void setD26_1(byte[] d26_1) {
        this.d26_1 = d26_1;
    }

    public byte[] getD26_2() {
        return d26_2;
    }

    public void setD26_2(byte[] d26_2) {
        this.d26_2 = d26_2;
    }

    public byte[] getD26_3() {
        return d26_3;
    }

    public void setD26_3(byte[] d26_3) {
        this.d26_3 = d26_3;
    }

    public byte[] getD26_4() {
        return d26_4;
    }

    public void setD26_4(byte[] d26_4) {
        this.d26_4 = d26_4;
    }

    public byte[] getD26_5() {
        return d26_5;
    }

    public void setD26_5(byte[] d26_5) {
        this.d26_5 = d26_5;
    }

    public byte[] getDiente_27() {
        return diente_27;
    }

    public void setDiente_27(byte[] diente_27) {
        this.diente_27 = diente_27;
    }

    public byte[] getD27_1() {
        return d27_1;
    }

    public void setD27_1(byte[] d27_1) {
        this.d27_1 = d27_1;
    }

    public byte[] getD27_2() {
        return d27_2;
    }

    public void setD27_2(byte[] d27_2) {
        this.d27_2 = d27_2;
    }

    public byte[] getD27_3() {
        return d27_3;
    }

    public void setD27_3(byte[] d27_3) {
        this.d27_3 = d27_3;
    }

    public byte[] getD27_4() {
        return d27_4;
    }

    public void setD27_4(byte[] d27_4) {
        this.d27_4 = d27_4;
    }

    public byte[] getD27_5() {
        return d27_5;
    }

    public void setD27_5(byte[] d27_5) {
        this.d27_5 = d27_5;
    }

    public byte[] getDiente_28() {
        return diente_28;
    }

    public void setDiente_28(byte[] diente_28) {
        this.diente_28 = diente_28;
    }

    public byte[] getD28_1() {
        return d28_1;
    }

    public void setD28_1(byte[] d28_1) {
        this.d28_1 = d28_1;
    }

    public byte[] getD28_2() {
        return d28_2;
    }

    public void setD28_2(byte[] d28_2) {
        this.d28_2 = d28_2;
    }

    public byte[] getD28_3() {
        return d28_3;
    }

    public void setD28_3(byte[] d28_3) {
        this.d28_3 = d28_3;
    }

    public byte[] getD28_4() {
        return d28_4;
    }

    public void setD28_4(byte[] d28_4) {
        this.d28_4 = d28_4;
    }

    public byte[] getD28_5() {
        return d28_5;
    }

    public void setD28_5(byte[] d28_5) {
        this.d28_5 = d28_5;
    }

    public byte[] getDiente_31() {
        return diente_31;
    }

    public void setDiente_31(byte[] diente_31) {
        this.diente_31 = diente_31;
    }

    public byte[] getD31_1() {
        return d31_1;
    }

    public void setD31_1(byte[] d31_1) {
        this.d31_1 = d31_1;
    }

    public byte[] getD31_2() {
        return d31_2;
    }

    public void setD31_2(byte[] d31_2) {
        this.d31_2 = d31_2;
    }

    public byte[] getD31_3() {
        return d31_3;
    }

    public void setD31_3(byte[] d31_3) {
        this.d31_3 = d31_3;
    }

    public byte[] getD31_4() {
        return d31_4;
    }

    public void setD31_4(byte[] d31_4) {
        this.d31_4 = d31_4;
    }

    public byte[] getD31_5() {
        return d31_5;
    }

    public void setD31_5(byte[] d31_5) {
        this.d31_5 = d31_5;
    }

    public byte[] getDiente_32() {
        return diente_32;
    }

    public void setDiente_32(byte[] diente_32) {
        this.diente_32 = diente_32;
    }

    public byte[] getD32_1() {
        return d32_1;
    }

    public void setD32_1(byte[] d32_1) {
        this.d32_1 = d32_1;
    }

    public byte[] getD32_2() {
        return d32_2;
    }

    public void setD32_2(byte[] d32_2) {
        this.d32_2 = d32_2;
    }

    public byte[] getD32_3() {
        return d32_3;
    }

    public void setD32_3(byte[] d32_3) {
        this.d32_3 = d32_3;
    }

    public byte[] getD32_4() {
        return d32_4;
    }

    public void setD32_4(byte[] d32_4) {
        this.d32_4 = d32_4;
    }

    public byte[] getD32_5() {
        return d32_5;
    }

    public void setD32_5(byte[] d32_5) {
        this.d32_5 = d32_5;
    }

    public byte[] getDiente_33() {
        return diente_33;
    }

    public void setDiente_33(byte[] diente_33) {
        this.diente_33 = diente_33;
    }

    public byte[] getD33_1() {
        return d33_1;
    }

    public void setD33_1(byte[] d33_1) {
        this.d33_1 = d33_1;
    }

    public byte[] getD33_2() {
        return d33_2;
    }

    public void setD33_2(byte[] d33_2) {
        this.d33_2 = d33_2;
    }

    public byte[] getD33_3() {
        return d33_3;
    }

    public void setD33_3(byte[] d33_3) {
        this.d33_3 = d33_3;
    }

    public byte[] getD33_4() {
        return d33_4;
    }

    public void setD33_4(byte[] d33_4) {
        this.d33_4 = d33_4;
    }

    public byte[] getD33_5() {
        return d33_5;
    }

    public void setD33_5(byte[] d33_5) {
        this.d33_5 = d33_5;
    }

    public byte[] getDiente_34() {
        return diente_34;
    }

    public void setDiente_34(byte[] diente_34) {
        this.diente_34 = diente_34;
    }

    public byte[] getD34_1() {
        return d34_1;
    }

    public void setD34_1(byte[] d34_1) {
        this.d34_1 = d34_1;
    }

    public byte[] getD34_2() {
        return d34_2;
    }

    public void setD34_2(byte[] d34_2) {
        this.d34_2 = d34_2;
    }

    public byte[] getD34_3() {
        return d34_3;
    }

    public void setD34_3(byte[] d34_3) {
        this.d34_3 = d34_3;
    }

    public byte[] getD34_4() {
        return d34_4;
    }

    public void setD34_4(byte[] d34_4) {
        this.d34_4 = d34_4;
    }

    public byte[] getD34_5() {
        return d34_5;
    }

    public void setD34_5(byte[] d34_5) {
        this.d34_5 = d34_5;
    }

    public byte[] getDiente_35() {
        return diente_35;
    }

    public void setDiente_35(byte[] diente_35) {
        this.diente_35 = diente_35;
    }

    public byte[] getD35_1() {
        return d35_1;
    }

    public void setD35_1(byte[] d35_1) {
        this.d35_1 = d35_1;
    }

    public byte[] getD35_2() {
        return d35_2;
    }

    public void setD35_2(byte[] d35_2) {
        this.d35_2 = d35_2;
    }

    public byte[] getD35_3() {
        return d35_3;
    }

    public void setD35_3(byte[] d35_3) {
        this.d35_3 = d35_3;
    }

    public byte[] getD35_4() {
        return d35_4;
    }

    public void setD35_4(byte[] d35_4) {
        this.d35_4 = d35_4;
    }

    public byte[] getD35_5() {
        return d35_5;
    }

    public void setD35_5(byte[] d35_5) {
        this.d35_5 = d35_5;
    }

    public byte[] getDiente_36() {
        return diente_36;
    }

    public void setDiente_36(byte[] diente_36) {
        this.diente_36 = diente_36;
    }

    public byte[] getD36_1() {
        return d36_1;
    }

    public void setD36_1(byte[] d36_1) {
        this.d36_1 = d36_1;
    }

    public byte[] getD36_2() {
        return d36_2;
    }

    public void setD36_2(byte[] d36_2) {
        this.d36_2 = d36_2;
    }

    public byte[] getD36_3() {
        return d36_3;
    }

    public void setD36_3(byte[] d36_3) {
        this.d36_3 = d36_3;
    }

    public byte[] getD36_4() {
        return d36_4;
    }

    public void setD36_4(byte[] d36_4) {
        this.d36_4 = d36_4;
    }

    public byte[] getD36_5() {
        return d36_5;
    }

    public void setD36_5(byte[] d36_5) {
        this.d36_5 = d36_5;
    }

    public byte[] getDiente_37() {
        return diente_37;
    }

    public void setDiente_37(byte[] diente_37) {
        this.diente_37 = diente_37;
    }

    public byte[] getD37_1() {
        return d37_1;
    }

    public void setD37_1(byte[] d37_1) {
        this.d37_1 = d37_1;
    }

    public byte[] getD37_2() {
        return d37_2;
    }

    public void setD37_2(byte[] d37_2) {
        this.d37_2 = d37_2;
    }

    public byte[] getD37_3() {
        return d37_3;
    }

    public void setD37_3(byte[] d37_3) {
        this.d37_3 = d37_3;
    }

    public byte[] getD37_4() {
        return d37_4;
    }

    public void setD37_4(byte[] d37_4) {
        this.d37_4 = d37_4;
    }

    public byte[] getD37_5() {
        return d37_5;
    }

    public void setD37_5(byte[] d37_5) {
        this.d37_5 = d37_5;
    }

    public byte[] getDiente_38() {
        return diente_38;
    }

    public void setDiente_38(byte[] diente_38) {
        this.diente_38 = diente_38;
    }

    public byte[] getD38_1() {
        return d38_1;
    }

    public void setD38_1(byte[] d38_1) {
        this.d38_1 = d38_1;
    }

    public byte[] getD38_2() {
        return d38_2;
    }

    public void setD38_2(byte[] d38_2) {
        this.d38_2 = d38_2;
    }

    public byte[] getD38_3() {
        return d38_3;
    }

    public void setD38_3(byte[] d38_3) {
        this.d38_3 = d38_3;
    }

    public byte[] getD38_4() {
        return d38_4;
    }

    public void setD38_4(byte[] d38_4) {
        this.d38_4 = d38_4;
    }

    public byte[] getD38_5() {
        return d38_5;
    }

    public void setD38_5(byte[] d38_5) {
        this.d38_5 = d38_5;
    }

    public byte[] getDiente_41() {
        return diente_41;
    }

    public void setDiente_41(byte[] diente_41) {
        this.diente_41 = diente_41;
    }

    public byte[] getD41_1() {
        return d41_1;
    }

    public void setD41_1(byte[] d41_1) {
        this.d41_1 = d41_1;
    }

    public byte[] getD41_2() {
        return d41_2;
    }

    public void setD41_2(byte[] d41_2) {
        this.d41_2 = d41_2;
    }

    public byte[] getD41_3() {
        return d41_3;
    }

    public void setD41_3(byte[] d41_3) {
        this.d41_3 = d41_3;
    }

    public byte[] getD41_4() {
        return d41_4;
    }

    public void setD41_4(byte[] d41_4) {
        this.d41_4 = d41_4;
    }

    public byte[] getD41_5() {
        return d41_5;
    }

    public void setD41_5(byte[] d41_5) {
        this.d41_5 = d41_5;
    }

    public byte[] getDiente_42() {
        return diente_42;
    }

    public void setDiente_42(byte[] diente_42) {
        this.diente_42 = diente_42;
    }

    public byte[] getD42_1() {
        return d42_1;
    }

    public void setD42_1(byte[] d42_1) {
        this.d42_1 = d42_1;
    }

    public byte[] getD42_2() {
        return d42_2;
    }

    public void setD42_2(byte[] d42_2) {
        this.d42_2 = d42_2;
    }

    public byte[] getD42_3() {
        return d42_3;
    }

    public void setD42_3(byte[] d42_3) {
        this.d42_3 = d42_3;
    }

    public byte[] getD42_4() {
        return d42_4;
    }

    public void setD42_4(byte[] d42_4) {
        this.d42_4 = d42_4;
    }

    public byte[] getD42_5() {
        return d42_5;
    }

    public void setD42_5(byte[] d42_5) {
        this.d42_5 = d42_5;
    }

    public byte[] getDiente_43() {
        return diente_43;
    }

    public void setDiente_43(byte[] diente_43) {
        this.diente_43 = diente_43;
    }

    public byte[] getD43_1() {
        return d43_1;
    }

    public void setD43_1(byte[] d43_1) {
        this.d43_1 = d43_1;
    }

    public byte[] getD43_2() {
        return d43_2;
    }

    public void setD43_2(byte[] d43_2) {
        this.d43_2 = d43_2;
    }

    public byte[] getD43_3() {
        return d43_3;
    }

    public void setD43_3(byte[] d43_3) {
        this.d43_3 = d43_3;
    }

    public byte[] getD43_4() {
        return d43_4;
    }

    public void setD43_4(byte[] d43_4) {
        this.d43_4 = d43_4;
    }

    public byte[] getD43_5() {
        return d43_5;
    }

    public void setD43_5(byte[] d43_5) {
        this.d43_5 = d43_5;
    }

    public byte[] getDiente_44() {
        return diente_44;
    }

    public void setDiente_44(byte[] diente_44) {
        this.diente_44 = diente_44;
    }

    public byte[] getD44_1() {
        return d44_1;
    }

    public void setD44_1(byte[] d44_1) {
        this.d44_1 = d44_1;
    }

    public byte[] getD44_2() {
        return d44_2;
    }

    public void setD44_2(byte[] d44_2) {
        this.d44_2 = d44_2;
    }

    public byte[] getD44_3() {
        return d44_3;
    }

    public void setD44_3(byte[] d44_3) {
        this.d44_3 = d44_3;
    }

    public byte[] getD44_4() {
        return d44_4;
    }

    public void setD44_4(byte[] d44_4) {
        this.d44_4 = d44_4;
    }

    public byte[] getD44_5() {
        return d44_5;
    }

    public void setD44_5(byte[] d44_5) {
        this.d44_5 = d44_5;
    }

    public byte[] getDiente_45() {
        return diente_45;
    }

    public void setDiente_45(byte[] diente_45) {
        this.diente_45 = diente_45;
    }

    public byte[] getD45_1() {
        return d45_1;
    }

    public void setD45_1(byte[] d45_1) {
        this.d45_1 = d45_1;
    }

    public byte[] getD45_2() {
        return d45_2;
    }

    public void setD45_2(byte[] d45_2) {
        this.d45_2 = d45_2;
    }

    public byte[] getD45_3() {
        return d45_3;
    }

    public void setD45_3(byte[] d45_3) {
        this.d45_3 = d45_3;
    }

    public byte[] getD45_4() {
        return d45_4;
    }

    public void setD45_4(byte[] d45_4) {
        this.d45_4 = d45_4;
    }

    public byte[] getD45_5() {
        return d45_5;
    }

    public void setD45_5(byte[] d45_5) {
        this.d45_5 = d45_5;
    }

    public byte[] getDiente_46() {
        return diente_46;
    }

    public void setDiente_46(byte[] diente_46) {
        this.diente_46 = diente_46;
    }

    public byte[] getD46_1() {
        return d46_1;
    }

    public void setD46_1(byte[] d46_1) {
        this.d46_1 = d46_1;
    }

    public byte[] getD46_2() {
        return d46_2;
    }

    public void setD46_2(byte[] d46_2) {
        this.d46_2 = d46_2;
    }

    public byte[] getD46_3() {
        return d46_3;
    }

    public void setD46_3(byte[] d46_3) {
        this.d46_3 = d46_3;
    }

    public byte[] getD46_4() {
        return d46_4;
    }

    public void setD46_4(byte[] d46_4) {
        this.d46_4 = d46_4;
    }

    public byte[] getD46_5() {
        return d46_5;
    }

    public void setD46_5(byte[] d46_5) {
        this.d46_5 = d46_5;
    }

    public byte[] getDiente_47() {
        return diente_47;
    }

    public void setDiente_47(byte[] diente_47) {
        this.diente_47 = diente_47;
    }

    public byte[] getD47_1() {
        return d47_1;
    }

    public void setD47_1(byte[] d47_1) {
        this.d47_1 = d47_1;
    }

    public byte[] getD47_2() {
        return d47_2;
    }

    public void setD47_2(byte[] d47_2) {
        this.d47_2 = d47_2;
    }

    public byte[] getD47_3() {
        return d47_3;
    }

    public void setD47_3(byte[] d47_3) {
        this.d47_3 = d47_3;
    }

    public byte[] getD47_4() {
        return d47_4;
    }

    public void setD47_4(byte[] d47_4) {
        this.d47_4 = d47_4;
    }

    public byte[] getD47_5() {
        return d47_5;
    }

    public void setD47_5(byte[] d47_5) {
        this.d47_5 = d47_5;
    }

    public byte[] getDiente_48() {
        return diente_48;
    }

    public void setDiente_48(byte[] diente_48) {
        this.diente_48 = diente_48;
    }

    public byte[] getD48_1() {
        return d48_1;
    }

    public void setD48_1(byte[] d48_1) {
        this.d48_1 = d48_1;
    }

    public byte[] getD48_2() {
        return d48_2;
    }

    public void setD48_2(byte[] d48_2) {
        this.d48_2 = d48_2;
    }

    public byte[] getD48_3() {
        return d48_3;
    }

    public void setD48_3(byte[] d48_3) {
        this.d48_3 = d48_3;
    }

    public byte[] getD48_4() {
        return d48_4;
    }

    public void setD48_4(byte[] d48_4) {
        this.d48_4 = d48_4;
    }

    public byte[] getD48_5() {
        return d48_5;
    }

    public void setD48_5(byte[] d48_5) {
        this.d48_5 = d48_5;
    }
    

    public String getId_odontograma() {
        return id_odontograma;
    }

    public void setId_odontograma(String id_odontograma) {
        this.id_odontograma = id_odontograma;
    }

    public String getId_pacien_odont() {
        return id_pacien_odont;
    }

    public void setId_pacien_odont(String id_pacien_odont) {
        this.id_pacien_odont = id_pacien_odont;
    }

    public int getOd_num_diente() {
        return od_num_diente;
    }

    public void setOd_num_diente(int od_num_diente) {
        this.od_num_diente = od_num_diente;
    }

    public String getOd_descri() {
        return od_descri;
    }

    public void setOd_descri(String od_descri) {
        this.od_descri = od_descri;
    }
    
}
