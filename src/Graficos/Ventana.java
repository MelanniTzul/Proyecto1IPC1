/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame; // Llamando a una libreria
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Melanni Tzul
 */

// Erencia de la clase JFrame
public class Ventana extends JFrame{
    
    private JPanel Hojadeventana;//Permite crear la hoja donde voy a escribir mi menu    
    // crear cosntructor=metodo
    public Ventana(){        
        //Menu Panel          = new Menu ();//crear objeto de la clase menu
        // DatosUsuario Panel2 = new DatosUsuario(); 
        // Hojadeventana.setLayout(null);   
        //Dimenciones de la pantalla
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tPantalla = pantalla.getScreenSize();
        int Altura = tPantalla.height;
        int Ancho  = tPantalla.width;
        //Agrenando tamaño, visibilidad y tutulo
        setSize(Ancho/2,Altura/2);
        
        setTitle("MyFarm");
        setLocationRelativeTo(null);//Me centra la ventana
        // Hojadeventana.setBackground(Color.GRAY);//Agreagar color a la hoja
        setResizable(false);//Para que el usuario no pueda cambiar la pantalla
        //JLabel Nombre_del_jugador = new JLabel("Nombre"); //Agregar texto dentro de mi hoja
        //Nombre_del_jugador.setBounds(20, 20, 100, 20);//Poscion en la que quiero que aparesca lo que escribie en JLabel
        //Hojadeventana.add(Nombre_del_jugador);// A mi panel le agrego el texto que designe
              
    }
    
    //metodo para agregar le panel
    public void AgregarVentana(JPanel PanelAuxiliar){
    this.getContentPane().add(PanelAuxiliar);//Le digo a mi ventana que le ponga el panel
        setVisible(true);
    }
}


