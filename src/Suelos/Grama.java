
package Suelos;

import java.awt.Color;

/**
 *
 * @author Melanni Tzul
 */
//Llamo a mi clase Tipos de suelos para poder heredar a la clase Grama
public class Grama extends TiposDeSuelos{

    //Crear constructor
    public Grama(boolean se_puede_sembrar, boolean se_puede_colocar_animales, boolean si_se_puede_pescar, float porcentaje_de_aparición, Color color) {
        super(se_puede_sembrar, se_puede_colocar_animales, si_se_puede_pescar, porcentaje_de_aparición, color);
    }
//Costructor
    public Grama() {
        setColor(Color.GREEN);
        setNombres("Grama");
        
        
    }

    
}
