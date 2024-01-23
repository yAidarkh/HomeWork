package Bugalteria;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        // TODO override me!
        return BigDecimal.valueOf(0.13);
    }
}
