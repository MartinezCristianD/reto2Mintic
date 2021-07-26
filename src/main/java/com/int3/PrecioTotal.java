package com.int3;

public class PrecioTotal {
    
    Double totalElectrodomesticos = 0.0;
    Double totalLavadoras = 0.0;
    Double totalTelevisiones = 0.0;
    Electrodomestico listaElectrodomesticos[];

    // Constructor
    PrecioTotal(Electrodomestico[] pElectrodomesticos) {

        this.listaElectrodomesticos = pElectrodomesticos;
        
    }
    // Metodos
    public void mostrarTotales() {
        
        for (Electrodomestico i : listaElectrodomesticos) {
            
            if(i instanceof Electrodomestico)
                totalElectrodomesticos += i.calcularPrecio();

            if(i instanceof Television)
                totalTelevisiones += i.calcularPrecio();

            if(i instanceof Lavadora)
                totalLavadoras += i.calcularPrecio();
        } 
        
    // Mostramos los resultados
        System.out.println("La suma del precio de los electrodomésticos es de " + String.valueOf(totalElectrodomesticos));
        System.out.println("La suma del precio de las lavadoras es de " +String.valueOf(totalLavadoras));
        System.out.println("La suma del precio de las televisiones es de " +String.valueOf(totalTelevisiones));
    
   }
}
   