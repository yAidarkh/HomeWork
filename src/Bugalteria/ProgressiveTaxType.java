package Bugalteria;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        // TODO override me!
        if (amount.compareTo(BigDecimal.valueOf(100_000))==0||amount.compareTo(BigDecimal.valueOf(100_000))<0){
            return BigDecimal.valueOf(0.1);
        }else{
            return BigDecimal.valueOf(0.15);
        }
    }
}
