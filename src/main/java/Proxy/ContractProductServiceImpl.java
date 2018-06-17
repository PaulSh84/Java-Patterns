package Proxy;

public class ContractProductServiceImpl implements ContractProductService {
    @Override
    public String contractProduct(Long idProduct) {
        if (idProduct < 0) {
            throw new InvalidProductException();
        }
        return  "Product contracted!";
    }
}
