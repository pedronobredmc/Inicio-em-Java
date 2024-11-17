package util;

public class CurrencyConverter {
    public static double dollarToReal(double quantidadeDolar, double precoDolar) {
        return (quantidadeDolar * precoDolar)+(6*(quantidadeDolar * precoDolar)/100);
    }
}
