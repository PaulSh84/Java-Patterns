package AdapterPattern.BonusAdapter.Interface;

import java.math.BigDecimal;

public interface Product {

    String getName();
    BigDecimal getPrice();
    String productType();
    void processProduct();
    boolean isProcessed();
}
