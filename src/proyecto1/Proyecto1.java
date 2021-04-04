/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import Graficos.DatosUsuario;
import Graficos.Menu;
import Graficos.Ventana;
import Suelos.Desierto;
import javax.swing.JFrame;

/**
 *
 * @author Melanni Tzul
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
   
        //Crear objeto de tipo ventana
        Ventana VentanaMenu=new Ventana();//Creamos un objeto de la clase ventana
        VentanaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Me permite cerrar la ejecución. 
        //DatosUsuario PanelDatos = new DatosUsuario(VentanaPrincipal);
        Menu MenuDeOpciones = new Menu(VentanaMenu);
        VentanaMenu.AgregarVentana(MenuDeOpciones);//Agregar el panel de datos usuaruo a la clase ventana       
     
    }
    
}
