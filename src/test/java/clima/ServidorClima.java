package clima;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorClima {

    public static void main(String[] args) throws IOException {

        HttpServer servidor = HttpServer.create(
                new InetSocketAddress(8080), 0
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

            exchange.sendResponseHeaders(
                    200,
                    respuesta.getBytes().length
            );

            try (OutputStream salida = exchange.getResponseBody()) {
                salida.write(respuesta.getBytes());
            }
        });

        servidor.start();

        System.out.println(
                "Servidor de clima iniciado en http://localhost:8080/clima"
        );
    }
}