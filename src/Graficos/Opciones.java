
package Graficos;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import proyecto1.Jugador;
/**
 *
 * @author Melanni Tzul
 */

//Clase Opciones donde tengo una erencia del Jpanel y uso implements Runnable para usar hilos
public class Opciones extends JPanel{
         
    private Jugador DatosJugador; //Crear un atributo de la clase jugador
    private JLabel NombGranj          = new JLabel();//JLabel son etiquetas o textos en una ventana
    private JLabel Usuario            = new JLabel();
    private JLabel CantOro            = new JLabel();
    private JLabel Tiemvida           = new JLabel();
    private JButton Mercado           = new JButton("Mercado");
    private JButton Bodega            = new JButton("Bodega");
    private JLabel Comida             = new JLabel ();    
    
    //Costructor
    public Opciones(Jugador G) {
        setLayout(new GridLayout(1,0));// Acomodar los componentes gráficos(JLabel y JButton)
        DatosJugador=G;
        NombGranj.setText("Nombre:  "+DatosJugador.getNombreDeLGranjero());
        Usuario.setText("Nickname:  "+DatosJugador.getNombreDeUsuario());
        CantOro.setText("Cantidad de Oro:  "+DatosJugador.getCantidadDeOro());
        Tiemvida.setText("Tiempo de vida:  "+DatosJugador.getTiempoDeVida());
        Comida.setText("Comida: "+DatosJugador.getComida());
        
        NombGranj.setLayout(null);//Desactivar seLayout de la etiqueta para poder modificarlo
        NombGranj.setFont(new Font("Times New Roman",3,18));//Tipo de letra,(cursi,negrita o subrayado) y tamaño de letra
        Usuario.setLayout(null);
        Usuario.setFont(new Font("Times New Roman",3,18));
        CantOro.setLayout(null);
        CantOro.setFont(new Font("Times New Roman",3,18));
        Tiemvida.setLayout(null);
        Tiemvida.setFont(new Font("Times New Roman",3,18));
        Mercado.setLayout(null);
        Mercado.setFont(new Font("Times New Roman",3,18));
        Mercado.setBackground(Color.PINK);//con setBackground coloco color
      
        
        //Agregar los 5 objetos al panel
        this.add(NombGranj);
        this.add(Usuario);
        this.add(CantOro);
        this.add(Tiemvida);
        this.add(Comida);
        this.add(Mercado);
        this.add(Bodega);
        
        //NombGranj.setBounds(50,50,100,30);
       // NombGranj.setVisible(true);
       // NombGranj.setForeground(Color.MAGENTA);  
    }  

    public Jugador getDatosJugador() {
        return DatosJugador;
    }

    public void setDatosJugador(Jugador DatosJugador) {
        this.DatosJugador = DatosJugador;
    }

    public JLabel getNombGranj() {
        return NombGranj;
    }

    public void setNombGranj(JLabel NombGranj) {
        this.NombGranj = NombGranj;
    }

    public JLabel getUsuario() {
        return Usuario;
    }

    public void setUsuario(JLabel Usuario) {
        this.Usuario = Usuario;
    }

    public JLabel getCantOro() {
        return CantOro;
    }

    public void setCantOro(JLabel CantOro) {
        this.CantOro = CantOro;
    }

    public JLabel getTiemvida() {
        return Tiemvida;
    }

    public void setTiemvida(JLabel Tiemvida) {
        this.Tiemvida = Tiemvida;
    }

    public JButton getMercado() {
        return Mercado;
    }

    public void setMercado(JButton Mercado) {
        this.Mercado = Mercado;
    }

    public JButton getBodega() {
        return Bodega;
    }

    public void setBodega(JButton Bodega) {
        this.Bodega = Bodega;
    }

    public JLabel getComida() {
        return Comida;
    }

    public void setComida(JLabel Comida) {
        this.Comida = Comida;
    }
    
  

}
