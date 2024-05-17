import br.unipar.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {

    @Test
    public void TestCalculadoraMenos(){
        Calculadora calc = new Calculadora();
        double diminuir = calc.calculadoraMenos(5.0,2.0);
        assertEquals(diminuir,3);
    }

    @Test
    public void TesteCalculadoraMais(){
        Calculadora calc = new Calculadora();
        double soma = calc.calculadoraMais(3,5);
        assertEquals(soma,8);
    }

    @Test
    public void TesteCalculadoraVezes(){
        Calculadora calc = new Calculadora();
        double vezes = calc.calculadoraVezes(5,5);
        assertEquals(vezes,25);
    }

    @Test
    public void TesteCalculadoraDividir(){
        Calculadora calc = new Calculadora();
        double divisao = calc.calculadoraDividir(10,5);
        assertEquals(divisao, 2);
    }


}
