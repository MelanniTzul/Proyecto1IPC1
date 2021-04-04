
package Graficos;

import Suelos.Agua;
import Suelos.Desierto;
import Suelos.Grama;
import Suelos.TiposDeSuelos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Melanni Tzul
 */

public class Boton extends JButton implements ActionListener{
    private TiposDeSuelos suelo;
    
    
    //Costructor
    public Boton() {
        setSize(100,50);
        setVisible(true);  
        Random Generarsuelos = new Random();//Genera un numero aleatorio entre 0 y 1
        float Probabilidad = Generarsuelos.nextFloat();
        if (Probabilidad<=0.25){
            suelo = new Desierto();        
        }
        if (Probabilidad>0.25 && Probabilidad<=0.60){
            suelo = new Agua();           
        }
        if (Probabilidad>0.60){
            suelo = new Grama();           
        }
        setBackground(suelo.getColor());//Agregamos color al boton
            setText(suelo.getNombres());//Agrego texto a JLabel
            this.addActionListener(this);//Agregar accion a la hora de presionar
    }
    
 
    
    //Metodo abstracto
    @Override
    public void actionPerformed(ActionEvent e) {
        if (suelo instanceof Agua) {
            System.out.println("fsfsd");  
            
        }
        
        if (suelo instanceof Desierto) {
            System.out.println("No puede realizar nada :D");        
        }
        
        if (suelo instanceof Grama) {
            System.out.println("dsfksdf");
        }
       
    }
   
}
