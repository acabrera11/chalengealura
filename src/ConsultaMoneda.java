import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscaMoneda(String base_code, String target_code){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/946776a781a6ff23b9c7709f/pair/"+base_code+"/"+ target_code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return new Gson().fromJson(json, Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró esa moneda");
        }

    }

    public double dolarAOtraMoneda(Double cantidadDolares, Double conversion_rate){
        Double total = cantidadDolares * conversion_rate;
        return total;
    }
    public double OtraMonedaADolar(Double cantidadOtraMoneda, Double conversion_rate){
        Double total = cantidadOtraMoneda / conversion_rate;
        return total;
    }
}
