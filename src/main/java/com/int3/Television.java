package com.int3;

public class Television extends Electrodomestico{

    // Constantes y Atributos
       
        Integer pulgadas = 20;
        Boolean sintonizadorTDT = false;
      
    // Constructores
    public Television(){
    }
   
    public Television(Double precioBase, Integer peso){

        this.precioBase = precioBase;
        this.peso = peso;
        
    }
   
    public Television(Double precioBase, Integer peso, char consumoW, Integer pulgadas, Boolean sintetizadorTDT){
        this.precioBase = precioBase; 
        this.peso = peso;
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintetizadorTDT;
        comprobarconsumoW(consumoW);
    }
   
    // Métodos
    @Override
    public Double calcularPrecio(){
                      
        super.calcularPrecio();

        if(pulgadas > 40){
            adicion += (precioBase * 0.30);
        } 

        if(sintonizadorTDT == true) adicion +=  50;
        
        return precioBase + adicion;

    }
   }
   
