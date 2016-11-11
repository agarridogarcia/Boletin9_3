
package boletin9_3;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Positivo {
    private float base, altura, num;
    
    public Positivo(){
        
    }
    public Positivo (float b, float h){
        base=b;
        altura=h;
    }
    public void calcularArea (){
        
       
        
        do{
          base=Float.parseFloat(JOptionPane.showInputDialog("Introduza a base"));
        }while(base<0);
           
       
        do{
          altura=Float.parseFloat(JOptionPane.showInputDialog("Introduza a altura"));
      }while(altura<0);
      System.out.println(base+ "*"+ altura + "=" + base*altura);
    }
       
    }
    
    
    
    

