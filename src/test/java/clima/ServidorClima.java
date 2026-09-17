package clima;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorClima {

    public static HttpServer crearServidor() throws IOException {
        HttpServer servidor = HttpServer.create(
                new InetSocketAddress("localhost", 0), 0
        );

        servidor.createContext("/clima", (HttpExchange exchange) -> {
            String respuesta = """
                    {
                      "ciudad": "Melipilla",
                      "temperatura": 18,
                      "estado": "Despejado"
                    }
                    """;

            exchange.getResponseHeaders().set(
                    "Content-Type", "application/json"
            );

            byte[] datos = respuesta.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, datos.length);

            try (OutputStream salida = exchange.getResponseBody()) {
                salida.write(datos);
            }
        });

        return servidor;
    }

    public static void main(String[] args) throws IOException {
        HttpServer servidor = crearServidor();
        servidor.start();

        System.out.println(
                "Servidor de clima iniciado en http://localhost:"
                        + servidor.getAddress().getPort() + "/clima"
        );
    }
}