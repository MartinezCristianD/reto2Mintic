package com.int3;

public class Lavadora extends Electrodomestico {

    // Constantes y Atributos
    Integer carga = 5;

    // Constructores
    public Lavadora() {
    }

    public Lavadora(Double precioBase, Integer peso) {

        this.precioBase = precioBase;
        this.peso = peso;
        
    }

    public Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga) {

        this.precioBase = precioBase;
        this.peso = peso;
        comprobarconsumoW(consumoW);

        if(carga != null)this.carga = carga;
            
    }

    // Métodos
    @Override
    public Double calcularPrecio() {

        super.calcularPrecio();
    
        if(carga > 30)adicion += 50;
               
        return precioBase + adicion;    

    }
}
