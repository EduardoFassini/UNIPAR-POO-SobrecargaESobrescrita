package br.unipar;

public abstract class Operacoes {

    // Exemplo de OverRiding (Sobreescrever) - Continuação do código
    public double calculadoraMenos() {
        return 0;
    }

    public double calculadoraMais(){
        return 0;
    }

    public double calculadoraVezes(){
        return 0;
    }

    public double calculadoraDividir(){
        return 0;
    }

    public abstract double calculadoraMenos(double valorA, double valorB);

    public abstract double calculadoraMais(double valorA, double valorB);

    public abstract double calculadoraVezes(double valorA, double valorB);

    public abstract double calculadoraDividir(double valorA, double valorB);
}
