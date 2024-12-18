package modelos;

import calculos.ConversionMoneda;

public class Moneda {
    String base_code;
    String target_code;
    Double conversion_rate;

//    public Moneda(String base_code, String target_code, Double conversion_rate) {
//        this.base_code = base_code;
//        this.target_code = target_code;
//        this.conversion_rate = conversion_rate;
//    }

    public Moneda(MonedaExchangeApi monedaExchangeApi) {
        this.base_code = monedaExchangeApi.base_code();
        this.target_code = monedaExchangeApi.target_code();
        this.conversion_rate = monedaExchangeApi.conversion_rate();
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String salidaDeConversion(Double valorInicial){
        ConversionMoneda conversionMoneda = new ConversionMoneda();
        Double valorFinal = conversionMoneda.convirtiendo(valorInicial, getConversion_rate());
        valorFinal = Math.round(valorFinal * 100.0) / 100.0;
        return "El valor " + valorInicial + " [" + getBase_code() + "]" + " corresponde al valor final de ===> "+ valorFinal + " [" + getTarget_code() + "] ";
    }
}
