import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void additionalSum(){
        assertEquals(2, calculator.Sum(1,1));
    }

    @Test
    void additionalSub(){
        assertEquals(3, calculator.Sub(6,3));
    }

    @Test
    void additionalMul(){
        assertEquals(6, calculator.Mul(2,3));
    }

    @Test
    void additionalDiv(){
        assertEquals(2, calculator.Div(6,3));
    }
}