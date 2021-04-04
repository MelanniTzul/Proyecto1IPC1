/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import proyecto1.HiloTiempoDeVida;
import proyecto1.Jugador;


//Heredamos de la clase JPanel
//Con implements Action Listener, tambien implementar los metodos abstractos
public class DatosUsuario extends JPanel implements ActionListener{
    
    private JLabel NombreUsuario      = new JLabel("Nombre");//Con esto creo los botones
    private JLabel Nick_Del_Jugador   = new JLabel("Nick del jugador");
    private JTextField  GuardarNombre = new JTextField();//Escribir dentro del boton
    private JTextField  GuardarNick   = new JTextField();
    private JButton BotonParaJugar    = new JButton ("Jugar");
    private JFrame Ventana;//Cree un obejto de la clase JFrame para manipular la ventana Datos Usuario
            

    //Costructor de datos de usuario
    public DatosUsuario(JFrame Ventana1) {
        Ventana = Ventana1;//Traer el objeto ventana para poder hacerlo invisible a la hora de darle la accion jugar
        NombreUsuario.setOpaque(true);//Colocar marco a la etiqueta nombre de usuario
        Nick_Del_Jugador.setOpaque(true);//Colocar marco
        this.setLayout(null);//Desactivar setLayaut (ordenamiento por defecto)       
        this.setBackground(Color.gray);//Color al panel Datos Usuario
        NombreUsuario.setBounds(50,50,100,30);//Colocar posición y tamaño al boton
        NombreUsuario.setVisible(true);//Mostrar etiquetas en el panel2
        NombreUsuario.setForeground(Color.BLUE);
        Nick_Del_Jugador.setBounds(50,150,100,30);
        Nick_Del_Jugador.setVisible(true);
        Nick_Del_Jugador.setForeground(Color.blue);
        GuardarNombre.setBounds(200,50,100,30);
        GuardarNombre.setVisible(true);
        GuardarNick.setBounds(200,150,100,30);
        GuardarNick.setVisible(true);
        /*BotonParaJugar.setOpaque(true);*/
        BotonParaJugar.setBounds(400,100,100,30);
        BotonParaJugar.setVisible(true);     
        BotonParaJugar.addActionListener(this);//Designarle una acción al boton.
        this.add(NombreUsuario);
        this.add(Nick_Del_Jugador); 
        this.add(GuardarNombre);
        this.add(GuardarNick);
        this.add(BotonParaJugar);
        
    }
    
    //Metodo que utlizo para generalizar la creación de los hilos
    private void AgregarHilo(JLabel Etiqueta, Jugador jugador, Ventana ventana,int a, int b){
        Runnable Hilo = new HiloTiempoDeVida(Etiqueta,jugador,ventana,a,b);//polimorfismo instaciar una clase apartir de su hijo
        Thread HiloPadre = new Thread(Hilo);//Llamamos a nuestra clase Thread que ejecuta al hijo
        HiloPadre.start();//Inicia a funcionar el hijo
          
    }
    
    
    
    //Metodo abstracto implementado de ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        Jugador CrearJugador     = new Jugador(GuardarNombre.getText(),GuardarNick.getText(),50,100,50); //Gurdo los datos ingresados y asigno puntos de vida      
        Opciones MostrarOpciones = new Opciones(CrearJugador);
      
        //Menu    Panel3      = new Menu   ();//Creamos el panel menu
        Granja PanelM         = new Granja();
        Ventana VentanaGranja = new Ventana();//Creamos la ventana Menu
        VentanaGranja.setLayout(null);//Desactivamos el setLayout a la venta granja par cambiar de tamaño el panel
        VentanaGranja.setExtendedState(MAXIMIZED_BOTH);
       
        PanelM.setBounds(0,100,VentanaGranja.getWidth()*2,(VentanaGranja.getHeight()-65)*2);//Cambiar el tamaño del panel
        MostrarOpciones.setSize(VentanaGranja.getWidth()*2,90);
        
        //VentanaGranja.setSize(VentanaGranja.getWidth()+145,VentanaGranja.getHeight()+145);
        //PanelM.setLocation(0,100);
        VentanaGranja.AgregarVentana((JPanel) MostrarOpciones);
        VentanaGranja.AgregarVentana(PanelM);//Llamar al metodo constructor (ventana) y mandar como argumento al Panel3 que estamos llamados al PanelMenu
       
        AgregarHilo(MostrarOpciones.getTiemvida(), CrearJugador,VentanaGranja,1,500);
        AgregarHilo(MostrarOpciones.getComida(), CrearJugador, VentanaGranja,2,250);
        Ventana.setVisible(false);//Hacemos que la ventana datos usuario se desaparesca
        //Runnable HiloTiempoDeVida = new Opciones(CrearJugador);
    }         
    
}
