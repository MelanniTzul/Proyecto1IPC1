
package proyecto1;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Melanni Tzul
 */
public class Jugador {
    //Atributos=caracteristicas.
    private String NombreDeLGranjero;
    private String NombreDeUsuario;
    private float  CantidadDeOro;
    private int    TiempoDeVida;
    private int Comida;
    
    

    

    //Constructor de la clase Jugador
    public Jugador(String NombreDeLGranjero, String NombreDeUsuario, float CantidadDeOro, int TiempoDeVida, int Com) {
        this.NombreDeLGranjero = NombreDeLGranjero;
        this.NombreDeUsuario = NombreDeUsuario;
        this.CantidadDeOro = CantidadDeOro;
        this.TiempoDeVida = TiempoDeVida;
        this.Comida=Com;
    }
    
 
    //creo get y set 
    public String getNombreDeLGranjero() {
        return NombreDeLGranjero;
    }

    public void setNombreDeLGranjero(String NombreDeLGranjero) {
        this.NombreDeLGranjero = NombreDeLGranjero;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String NombreDeUsuario) {
        this.NombreDeUsuario = NombreDeUsuario;
    }

    public float getCantidadDeOro() {
        return CantidadDeOro;
    }

    public void setCantidadDeOro(float CantidadDeOro) {
        this.CantidadDeOro = CantidadDeOro;
    }

    public int getTiempoDeVida() {
        return TiempoDeVida;
    }

    public void setTiempoDeVida(int TiempoDeVida) {
        this.TiempoDeVida = TiempoDeVida;
    }

    public int getComida() {
        return Comida;
    }

    public void setComida(int Comida) {
        this.Comida = Comida;
    }
     
    
}
