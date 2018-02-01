package AdapterPattern.BonusAdapter;

import AdapterPattern.BonusAdapter.Interface.Product;

public class ProductService {

    public void processProduct(Product product) {
        product.processProduct();
    }
}
