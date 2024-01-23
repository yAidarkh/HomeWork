package Bugalteria;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();
        VATaxType vaTaxType = new VATaxType();
        IncomeTaxType incomeTaxType = new IncomeTaxType();

        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(BigDecimal.valueOf(200_000),progressiveTaxType,taxService),
                new Bill(BigDecimal.valueOf(90_000),progressiveTaxType,taxService),
                new Bill(BigDecimal.valueOf(100_000),vaTaxType,taxService),
                new Bill(BigDecimal.valueOf(100_000),incomeTaxType,taxService)

        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
