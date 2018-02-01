import AdapterPattern.BonusAdapter.Adapter.LegacyProductAdapter;
import AdapterPattern.BonusAdapter.Interface.Product;
import AdapterPattern.BonusAdapter.LegacyCode.LegacyProductPOJO;
import AdapterPattern.BonusAdapter.LegacyCode.LegacyProductService;
import AdapterPattern.BonusAdapter.ProductService;
import org.junit.Assert;
import org.junit.Test;

public class BonusAdapterTest {

    @Test
    public void legacyServiceAdapterTest() {
        LegacyProductPOJO legacyProduct = new LegacyProductService()
                .findLegacyProduct();

        Product adapter = new LegacyProductAdapter(legacyProduct);

        ProductService productService = new ProductService();
        productService.processProduct(adapter);

        Assert.assertTrue(adapter.isProcessed());
    }
}
