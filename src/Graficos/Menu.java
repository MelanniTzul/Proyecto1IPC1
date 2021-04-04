
package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Melanni Tzul
 */
//Extends estoy heredando de la clase JPanel lo que produce que mi clase se aun panel
public class Menu extends JPanel implements ActionListener{
    //Creo botones
    JButton Jugar          = new JButton("Jugar");
    JButton ReglasDelJuego = new JButton("Reglas del juego");
    JButton Reportes       = new JButton("Reportes");
    JButton CrearAnimales  = new JButton("Crear Animales");
    JButton CrearPlantas   = new JButton("Crear Plantas");
    JButton CrearProductos = new JButton("Crear Productos");
    JFrame A;// Para hacer invisible la pantalla
    
    
   
    
    //Costructor de mi clase menu
    public Menu(JFrame Invisible) {
        A = Invisible;
        //this.setLayout(null);
        this.setLayout(new GridLayout(6,2));//Nospermite ordenar los botones, metodo de ordenamiento
        this.setBackground(Color.gray);//Cambiar color al panel
        //Agregamos pasición y tamañano la boton
        /*Jugar.setBounds(100, 50, 100, 50);
        ReglasDelJuego.setBounds(220,50, 150, 50);
        Reportes.setBounds(400,50, 100,50);
        CrearAnimales.setBounds(100,200, 150,50);
        CrearPlantas.setBounds(250,200,150,50);
        CrearProductos.setBounds(400,200,150,50);*/
        
        //Colocarle Accion a los botones.
        Jugar.addActionListener(this);
        ReglasDelJuego.addActionListener(this);
        Reportes.addActionListener(this);
        
        ReglasDelJuego.setLayout(null);
        ReglasDelJuego.setBackground(Color.lightGray);
        ReglasDelJuego.setFont(new Font("Times New Roman",3,18));
        Jugar.setLayout(null);
        Jugar.setBackground(Color.yellow);
        Jugar.setFont(new Font("Times New Roman",3,18));
        Reportes.setLayout(null);
        Reportes.setBackground(Color.GREEN);
        Reportes.setFont(new Font("Times New Roman",3,18));
        CrearAnimales.setLayout(null);
        CrearAnimales.setBackground(Color.orange);
        CrearAnimales.setFont(new Font("Times New Roman",3,18));
        CrearPlantas.setLayout(null);
        CrearPlantas.setBackground(Color.yellow);
        CrearPlantas.setFont(new Font("Times New Roman",3,18));
        CrearProductos.setLayout(null);
        CrearProductos.setBackground(Color.orange);
        CrearProductos.setFont(new Font("Times New Roman",3,18));
        
        //Hacer visible los bonotes al panel 
        this.add(ReglasDelJuego);
        this.add(Jugar);
        this.add(CrearAnimales);
        this.add(CrearPlantas);
        this.add(CrearProductos);
        this.add(Reportes);
        
    }

    public JButton getJugar() {
        return Jugar;
    }

    public void setJugar(JButton Jugar) {
        this.Jugar = Jugar;
    }

    public JButton getReglasDelJuego() {
        return ReglasDelJuego;
    }

    public void setReglasDelJuego(JButton ReglasDelJuego) {
        this.ReglasDelJuego = ReglasDelJuego;
    }

    public JButton getReportes() {
        return Reportes;
    }

    public void setReportes(JButton Reportes) {
        this.Reportes = Reportes;
    }

    public JButton getCrearAnimales() {
        return CrearAnimales;
    }

    public void setCrearAnimales(JButton CrearAnimales) {
        this.CrearAnimales = CrearAnimales;
    }

    public JButton getCrearPlantas() {
        return CrearPlantas;
    }

    public void setCrearPlantas(JButton CrearPlantas) {
        this.CrearPlantas = CrearPlantas;
    }

    public JButton getCrearProductos() {
        return CrearProductos;
    }

    public void setCrearProductos(JButton CrearProductos) {
        this.CrearProductos = CrearProductos;
    }

    public JFrame getA() {
        return A;
    }

    public void setA(JFrame A) {
        this.A = A;
    }
    
    
    
    
    
    
    
    //Metodo abstracto
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Jugar) {
          // Granja nuevoobjeto  = new Granja ();  
           Ventana VentanaDatosUsuario = new Ventana ();
           DatosUsuario M = new DatosUsuario(VentanaDatosUsuario);
           VentanaDatosUsuario.AgregarVentana(M);
          // A.setVisible(false);
        }
        
        if (e.getSource()==ReglasDelJuego) {
          
        }
        
        if (e.getSource()==Reportes) {
            
        }      
    }
}
