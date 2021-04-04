
package Graficos;

import Suelos.TiposDeSuelos;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Melanni Tzul
 */
//Heredamos de Jpanel
public class Granja extends JPanel{
    
    private Boton Botones[]= new Boton [25];//Creamos arreglo udimencional
    
    
    //Constructor
    public Granja(){
        this.setLayout(new GridLayout(5,0));//Permite ordenar los botones por defecto (o en una cuadricula)
        for (int i = 0; i <Botones.length; i++) {
            Botones [i]= new Boton();
            this.add(Botones[i]);    
            
        }
    }
    
    
    //Funcion agregar casilla
    public JButton[] AgregarCasilla( ){
        Boton Suelo   = new Boton();//Objeto de la clase boton
        JButton[] Arg = new JButton[Botones.length+1];/*Creamos un nuevo arreglo que nos almacena los anteriores botones más uno nuevo que vamos a comprar*/
        
    //Guardando los objetos del otro arreglo dentro del nuevo arreglo
        for (int i = 0; i <Botones.length; i++) {
            Arg[i]= Botones [i];
        }
        Arg[Botones.length]= Suelo;
        return Arg;//Devolvemos el arreglo generado por la función.        
    }
    
    
    
    
    //get y set del objeto boton
    public Boton[] getBotones() {
        return Botones;
    }

    public void setBotones(Boton[] Botones) {
        this.Botones = Botones;
    }
    
    
    
     
}
