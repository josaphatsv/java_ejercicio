/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
//Importar la Clase Scanner

import java.util.Scanner;

/**
 *
 * @author josaphat
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    
            //Creamos el objeto Scanner para leer entrada del usuario
            Scanner scanner = new Scanner(System.in);
            
            //Mostramos el mensaje de Bienvenida
            System.out.println("Bienvenido a la calculadora basica");
            
            //Variable Bandera 
            boolean continuar= true;
            
            while (continuar) {
    
                //llamamos la funcion Mostrar Menu
                mostrarMenu();
                
                //Capturando posibles errors
                try {
                    
                    //Capturar operacion que desea realiar 
                    int operacion=scanner.nextInt();
  
                    //Se valida si la operacion es salir 
                    if (operacion==5) {
                        continuar= false;
                        System.out.println("cerrando calculadora");
                        
                    }
                    
                    if (operacion>=1 || operacion<=4) {
                        
                        ejecutarOperacion(operacion, scanner);
                            
                    } else {
                      System.err.println("Opcion Erronea: "+ operacion);
                    }
                    System.out.println();
                    
                } catch (Exception e) {
                    System.out.println("Ocurrio un error" + e.getMessage());
                }
            
        }
            
            
            
    }
    
    //Funcion Mostrar Menu
    private static void mostrarMenu(){
        //Mostramos el Menu de Opciones 
            System.out.println("""
                               |1. Suma
                               |2. Resta
                               |3. Multiplicacion
                               |4. Division
                               |5. Salir
                               """);
            
            System.out.print("Operacion a realizar ? ");
    }
    
    private static void ejecutarOperacion(int operacion, Scanner scanner){
        
        //Capturamos los operadores
        System.out.println("Proporcione valor numero1");
        
        double num1= scanner.nextDouble();
        
        System.out.println("Proporcione valor numero2");
        
        double num2=scanner.nextDouble();
        
        //variable de resultado
        double resultado;
        
        //Switch para poder realizar la operacion
        switch (operacion) {
            
            case 1->{
                
               resultado=suma(num1, num2);
               
               System.out.println("Resultado de Suman: "+resultado);
            }
            case 2->{
               
                resultado=resta(num1, num2);
                
                System.out.println("Resultado de Resta: "+resultado);
            }
            case 3->{
            
                resultado=multiplicacion(num1, num2);
                
                System.out.println("Resultado de Multiplicacion: "+resultado);
            }
            case 4->{
            
                if(num2==0){
                    System.err.println("Error: No se puede dividir entre 0");
                }
                
                resultado=division(num1, num2);
                
                System.out.println("Resultado de la division es: "+resultado);
            }
            default->
                throw new AssertionError();
        }
        
    }
    
    //Funcion de Suma 
    private static double suma(double num1, double num2){
        return num1+num2;
    }
    
    //funcion de Resta
    private static double resta(double num1, double num2){
        return num1-num2;
    }
    
    //Funcion de Multiplicacion
    private static double multiplicacion(double num1, double num2){
        return num1*num2;
    }
    
    //Funcion de division
    private static double division(double num1, double num2){
        return num1/num2;
    }
    
    
    
}
