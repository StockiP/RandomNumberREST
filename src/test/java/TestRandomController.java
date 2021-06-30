import at.stockerer.RandomController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRandomController {

    @Test
    public void Test_maxValue(){
        RandomController random = new RandomController();
        int numb = random.randomNumber();
        Assertions.assertTrue(numb <= 100);
    }
    @Test
    public void Test_minValue(){
        RandomController random = new RandomController();
        int numb = random.randomNumber();
        Assertions.assertTrue(numb >= 0);
    }



}
