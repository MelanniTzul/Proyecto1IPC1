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
public class TiposDeSuelos {
    //Cree mis atributos de tipos de suelo
    	private boolean se_puede_sembrar;
	private boolean  se_puede_colocar_animales;
	private boolean si_se_puede_pescar;
	private float porcentaje_de_aparición;
	private Color color;  //para agregar imagen
        private String nombres;
    //Costructor 
    public TiposDeSuelos(boolean se_puede_sembrar, boolean se_puede_colocar_animales, boolean si_se_puede_pescar, float porcentaje_de_aparición, Color color) {
        this.se_puede_sembrar = se_puede_sembrar;
        this.se_puede_colocar_animales = se_puede_colocar_animales;
        this.si_se_puede_pescar = si_se_puede_pescar;
        this.porcentaje_de_aparición = porcentaje_de_aparición;
        this.color = color;
    }

    public TiposDeSuelos() {
    }
           
    public boolean isSe_puede_sembrar() {
        return se_puede_sembrar;
    }

    public void setSe_puede_sembrar(boolean se_puede_sembrar) {
        this.se_puede_sembrar = se_puede_sembrar;
    }

    public boolean isSe_puede_colocar_animales() {
        return se_puede_colocar_animales;
    }

    public void setSe_puede_colocar_animales(boolean se_puede_colocar_animales) {
        this.se_puede_colocar_animales = se_puede_colocar_animales;
    }

    public boolean isSi_se_puede_pescar() {
        return si_se_puede_pescar;
    }

    public void setSi_se_puede_pescar(boolean si_se_puede_pescar) {
        this.si_se_puede_pescar = si_se_puede_pescar;
    }

    public float getPorcentaje_de_aparición() {
        return porcentaje_de_aparición;
    }

    public void setPorcentaje_de_aparición(float porcentaje_de_aparición) {
        this.porcentaje_de_aparición = porcentaje_de_aparición;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
      
    
    
    
}
