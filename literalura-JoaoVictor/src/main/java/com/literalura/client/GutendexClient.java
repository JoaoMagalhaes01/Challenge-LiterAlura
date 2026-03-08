
package com.literalura.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GutendexClient {

    public String buscarLivro(String nome) {
        try {
            String endereco = "https://gutendex.com/books/?search=" + nome.replace(" ", "%20");
            URL url = new URL(endereco);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                response.append(linha);
            }

            reader.close();
            return response.toString();

        } catch (Exception e) {
            return "Erro ao consumir API";
        }
    }
}
