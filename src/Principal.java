import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import menuOpciones.Opciones;
import modelos.Moneda;
import modelos.MonedaExchangeApi;
import utilidades.GenerarLink;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Opciones opciones = new Opciones();
        GenerarLink generar = new GenerarLink();

        Gson gson =new GsonBuilder()
//                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                .setPrettyPrinting()
                .create();
        while (true){

            int op = opciones.seleccionarOpcion(teclado);

            if (op == 7){
                break;
            }else if (op > 0 && op < 7){
                System.out.print("ingresa la cantidad a convertir: ");
                Double cantidad = teclado.nextDouble();
                String link = generar.link(op);

                try{
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(link))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                    String json = response.body();


                    MonedaExchangeApi monedaExchangeApi = gson.fromJson(json, MonedaExchangeApi.class);

                    Moneda moneda = new Moneda(monedaExchangeApi);
                    System.out.println("");
                    System.out.println( moneda.salidaDeConversion(cantidad));
                    System.out.println("\n\n");
                }catch (Exception e){
                    System.out.println("ocurrio un error en clase principal.");
                    e.printStackTrace();
                }



            }

        }

        teclado.close();


    }
}
