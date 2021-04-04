/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suelos;

import java.awt.Color;

/**
 *
 * @author Melanni Tzul
 */
public class Desierto extends TiposDeSuelos{

    public Desierto(boolean se_puede_sembrar, boolean se_puede_colocar_animales, boolean si_se_puede_pescar, float porcentaje_de_aparición, Color color) {
        super(se_puede_sembrar, se_puede_colocar_animales, si_se_puede_pescar, porcentaje_de_aparición, color);
    }

    public Desierto() {
        setColor(Color.YELLOW);
        setNombres("Desierto");     
    }
    
    
}
