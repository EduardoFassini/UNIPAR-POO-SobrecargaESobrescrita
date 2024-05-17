package br.unipar;

public class Main {

    public static void main(String args[]){
        Calculadora calc = new Calculadora();

        //Operações de mais herdadas co overriding
        System.out.println("Operações de mais herdadas co overriding");
        System.out.println(calc.calculadoraMais(5,9));
        System.out.println(calc.calculadoraMais(5,5,5));
        System.out.println(calc.calculadoraMais(3.5,6.5));
        System.out.println(calc.calculadoraMais("Calcu","ladora"));
        System.out.println();

        // Operações de menos herdadas com overriding
        System.out.println("Operações de menos herdadas com overriding");
        System.out.println(calc.calculadoraMenos(17,6));
        System.out.println(calc.calculadoraMenos(50,30));
        System.out.println();

        // Operações de vezes herdadas com overriding
        System.out.println("Operações de vezes herdadas com overriding");
        System.out.println(calc.calculadoraVezes(5,5));
        System.out.println(calc.calculadoraVezes(10,50));
        System.out.println();

        // Operações de divisão herdadas com overrding;
        System.out.println("Operações de divisão herdadas com overrding");
        System.out.println(calc.calculadoraDividir(10,5));
        System.out.println(calc.calculadoraDividir(5,5));
    }

}
