package com.int3;

public class Electrodomestico {
     double adicion;
 // Constantes y Atributos
    
     Double precioBase= 100.0;
     Integer peso = 5;
     char consumoW = 'F';
 
 // Constructores
 public Electrodomestico(){    
 }

 public Electrodomestico(Double precioBase, Integer peso){

     this.precioBase = precioBase;
     this.peso = peso;
 }

 public Electrodomestico(Double precioBase, Integer peso, char consumoW){
     this.precioBase = precioBase;
     this.peso = peso;
     this.consumoW = consumoW;
     comprobarconsumoW(consumoW);
 }

 // Metodos
 public void comprobarconsumoW(char consumoW){

     switch(consumoW){
         case 'A' : 
         case 'B' :
         case 'C' :
         case 'D' :
         case 'E' : 
         case 'F' : this.consumoW = consumoW;
         break;
         default : this.consumoW = 'F';

     }
 }
 public Double calcularPrecio(){
     
    switch(consumoW) {
         case 'A':
             adicion = 100;
             break;
         case 'B':
             adicion = 80;
             break;
         case 'C':
             adicion = 60;
             break;
         case 'D':
             adicion = 50;
             break;
         case 'E':
             adicion = 30;
             break;
         case 'F':
             adicion = 10; 
             break;
    }
 
     if(peso >= 0 && peso <= 17) adicion += 10;
     if(peso >= 18 && peso <= 48) adicion += 50;
     if(peso >= 50 && peso <= 79) adicion += 80;
     if(peso >= 80 && peso <=10000) adicion += 100;
 
 return precioBase + adicion;
 }
}
