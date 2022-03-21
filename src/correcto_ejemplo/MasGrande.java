/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto_ejemplo;

/**
 *
 * @author Carlos Torres Liñán
 */
public class MasGrande {
    public static int max(int[] a ){
        int i,m = 0;
        //Creamos un try-catch para evitar la excepción de que a sea nulo
        try{
            //Comprobamos que la longitud de a es mayor a 0
            if(a.length > 0){
                m = a[0];
            }
            
            //Cambiamos i a 0 y que sea menor a a.length para que recorra
            //incluso cuando sea solo 1 valor
            for(i = 0 ; i < a.length; i++){
                if(a[i]>m)
                    m = a[i];
            }
            return m;
        }catch(NullPointerException ex){m = -99; return m;}
    }
}
