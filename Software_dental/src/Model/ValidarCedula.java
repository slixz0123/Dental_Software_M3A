/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class ValidarCedula { 
    
    public static boolean validarcedula(String cedula) {
                
        boolean estado = false;
        try {
            //Colocamos el tamaño de la cedula de 10 digitos
            if (cedula.length() == 10) {               
                byte sum = 0;
    try {

        String[] data = cedula.split("");
        //Los dos primeros dígitos es un número no mayor a 24 ni menor. 
        byte verificador = Byte.parseByte(data[0] + data[1]);
        if (verificador < 1 || verificador > 24){
            JOptionPane.showMessageDialog(null, "El numero de cedula esta mal digitado");
            return false;}
        byte[] digitos = new byte[data.length];
        for (byte i = 0; i < digitos.length; i++)
            digitos[i] = Byte.parseByte(data[i]);
        //El tercer dígito es un número no mayor a 6 es decir es un número del 0 al 6. 
        if (digitos[2] > 6)
            return false;
         //Ejecutamos la operación de multiplicar por 2 los dígitos pares y 
        //por 1 los impares, por último realizamos la suma y resta final de la decena superior
        //y finalmente comprobamos que el último dígito sea igual a las operaciones realizadas
        for (byte i = 0; i < digitos.length - 1; i++) {
            if (i % 2 == 0) {
                verificador = (byte) (digitos[i] * 2);
                if (verificador > 9)
                    verificador = (byte) (verificador - 9);
            } else
                verificador = (byte) (digitos[i] * 1);
            sum = (byte) (sum + verificador);
        }
       
        if ((sum - (sum % 10) + 10 - sum) == digitos[9])
            return true;
    } catch (   HeadlessException | NumberFormatException e) {
        System.out.println(e);
    }
    //JOptionPane.showMessageDialog(null, "La cédula ingresada no pertenece a Ecuador");
    int input = JOptionPane.showConfirmDialog(null, 
                "La cédula ingresada no pertenece a Ecuador", "¿Desea guardarla de todos modos?",JOptionPane.YES_NO_CANCEL_OPTION);
    if(input==0){
        return true;
    }else{
    return false;
    }
            } else {///Fin Restricción 1
                estado = false;
                JOptionPane.showMessageDialog(null, "La cedula ingresada tiene menos de 10 caracteres");
            }
        } catch (NumberFormatException e) {
            estado = false;
            JOptionPane.showMessageDialog(null, "Error al intentar validar");
        }
        return estado;
    }
}
