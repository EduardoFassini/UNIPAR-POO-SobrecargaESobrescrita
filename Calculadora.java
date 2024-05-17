package br.unipar;

public class Calculadora extends Operacoes{

    //Exemplo de Overloading (Sobrecarga/sobrecarregar)
    public int calculadoraMais(int a, int b){
        return a+b;
    }

    public int calculadoraMais(int a, int b, int c){
        return a+b+c;
    }

    public String calculadoraMais(String a, String b){
        return a+b;
    }

    // Exemplo de OverRiding (Sobreescrever) - Continuação do código
    @Override
    public double calculadoraMenos(double valorA, double valorB){
         double resultado = valorA - valorB;
         return resultado;
    }

    @Override
    public double calculadoraMais(double valorA, double valorB){
        double resultado = valorA + valorB;
        return resultado;
    }

    @Override
    public double calculadoraVezes(double valorA, double valorB){
        double resultado = valorA * valorB;
        return resultado;
    }

    @Override
    public double calculadoraDividir(double valorA, double valorB){
        double resultado = valorA / valorB;
        return resultado;
    }
}


