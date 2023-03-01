/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora.De;

/**
 *
 * @author LENOVO
 */
public class CalculadoraDeBonos {
    int salario;
    String mensajebono;
    
    public void calcular () {
        salario=50000;
        mensajebono= " Bonos $s" + (0.2 * salario);
        System.out.println(mensajebono);
    }
    
    public static void main(String[] args) {
    CalculadoraDeBonos calcular = new CalculadoraDeBonos();
    calcular.calcular();
    }
} 

