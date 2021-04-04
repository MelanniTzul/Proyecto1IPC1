
package proyecto1;

import Graficos.Ventana;
import java.awt.Component;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Melanni Tzul
 */
public class HiloTiempoDeVida implements Runnable{
    
    private JLabel T;
    private Jugador M;//variable que almacena el tiempo de vida
    private Ventana HacerInvisibleVG;
    private int Opciones;
    private int TiempoDeEspera;
    
    //Costructor
    public HiloTiempoDeVida(JLabel a, Jugador b, Ventana c, int Op, int TimEspera) {
        T=a;
        M=b;
        HacerInvisibleVG=c;
        Opciones=Op;
        TiempoDeEspera=TimEspera;
        
        
    }
    //Metodo para cambiar el nombre a la etiqueta
    private void CambiarEtiqueta(int a){
        switch(Opciones){
            case(1):
                M.setTiempoDeVida(a);//Enviamos el nuevo valor como atributo cada vez que va cambiando
                T.setText("Tiempo de vida:  "+M.getTiempoDeVida());
                break;
            case(2):
                M.setComida(a);//Enviamos el nuevo valor como atributo cada vez que va cambiando
                T.setText("Comida:  "+M.getComida());
                break;
                
    
        
        }
    }

    //Metodo Run nos hace la acción de reducir la vida
    @Override
    public void run(){
             int a=M.getTiempoDeVida();
             switch(Opciones){
             case(1):a=M.getTiempoDeVida();
             break;
             case(2):a=M.getComida();
             break;
             
             }
        while (a!=0 ) {
        
            try {
                sleep (TiempoDeEspera);
                a--;
                CambiarEtiqueta(a);
                
            } catch (InterruptedException e) {
                
                System.out.println("dsfsdfs");             
            }       
            
        }
        switch(Opciones){
            case(1): HacerInvisibleVG.setVisible(false);
            break;
            case(2):
                 
                     try {
                         sleep(5000);
                         HacerInvisibleVG.setVisible(false);
                     } catch (InterruptedException ex) {
                        
                     }
                 
            break;

        }
                
                
    }
    
}
