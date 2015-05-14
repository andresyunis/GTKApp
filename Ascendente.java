/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ascendente;
import java.io.*;


/**
 *
 * @author andresyunis2
 */
public class Ascendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ingrese 3 numeros");
    double numero= Double.parseDouble(leer.readLine());
    double numero2= Double.parseDouble(leer.readLine());
    double numero3= Double.parseDouble(leer.readLine());
    
    if(numero>=numero2&&numero>=numero3&&numero2>=numero3)
    {
        System.out.println("orden del mas grande al mas chico" + numero +" "+numero2+" "+numero3+"" );
    }
    if(numero2>=numero&&numero2>=numero3&&numero>=numero3)
    {
        System.out.println("orden del mas grande al mas chico" + numero2 +" "+numero+" "+numero3+"" );
    }
    if(numero3>=numero2&&numero3>=numero2&&numero>=numero2)
    {
        System.out.println("orden del mas grande al mas chico" + numero3 +" "+numero+" "+numero2+"" );
    }
    if(numero2>=numero&&numero3>=numero2)
    {
        System.out.println("orden del mas grande al mas chico" + numero3 +" "+numero2+" "+numero+"" );
    }
    if(numero>=numero2&&numero3>=numero2)
    {
        System.out.println("orden del mas grande al mas chico" + numero +" "+numero3+" "+numero2+"" );
    }
    }
    
    }

    
