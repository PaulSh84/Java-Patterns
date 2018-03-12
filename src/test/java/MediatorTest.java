import MediatorPattern.Product;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MediatorTest {


    @Test
    public void mediatorTest() {
        BigDecimal productValueWithDiscount = new Product(
                new BigDecimal("50")).calculateDiscount();

        Assert.assertEquals(productValueWithDiscount, new BigDecimal("45.00"));
    }
}
