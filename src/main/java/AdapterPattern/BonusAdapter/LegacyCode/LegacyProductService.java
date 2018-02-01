package AdapterPattern.BonusAdapter.LegacyCode;

public class LegacyProductService {

    public LegacyProductPOJO findLegacyProduct() {
        return new LegacyProductPOJO().buildDefault();
    }


}
