package utilidades;

public class GenerarLink {
    public String link(int opcion){
        String code = switch (opcion) {
            case 1 -> "USD/ARS";
            case 2 -> "ARS/USD";
            case 3 -> "USD/BRL";
            case 4 -> "BRL/USD";
            case 5 -> "USD/COP";
            case 6 -> "COP/USD";
            default -> "";
        };

        return "https://v6.exchangerate-api.com/v6/ac4cb3f2f887699eb5263823/pair/"+code;
    }
}
