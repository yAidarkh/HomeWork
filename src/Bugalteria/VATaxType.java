package Bugalteria;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        // TODO override me!
        return BigDecimal.valueOf(0.18);
    }
}
