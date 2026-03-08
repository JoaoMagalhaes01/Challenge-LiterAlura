
package com.literalura.service;

import org.springframework.stereotype.Service;
import java.util.Scanner;
import com.literalura.client.GutendexClient;

@Service
public class MenuService {

    private Scanner scanner = new Scanner(System.in);
    private GutendexClient client = new GutendexClient();

    public void exibirMenu(){

        int opcao = -1;

        while(opcao != 0){

            System.out.println("\n===== LiterAlura =====");
            System.out.println("1 - Buscar livro pela API");
            System.out.println("2 - Listar livros buscados (exemplo)");
            System.out.println("3 - Listar autores (exemplo)");
            System.out.println("4 - Buscar livros por idioma");
            System.out.println("5 - Estatísticas simples");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){

                case 1:
                    buscarLivro();
                    break;

                case 2:
                    System.out.println("Funcionalidade exemplo.");
                    break;

                case 3:
                    System.out.println("Funcionalidade exemplo.");
                    break;

                case 4:
                    System.out.println("Digite o idioma:");
                    String idioma = scanner.nextLine();
                    System.out.println("Filtro por idioma: " + idioma);
                    break;

                case 5:
                    System.out.println("Estatísticas simples.");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void buscarLivro(){

        System.out.println("Digite o nome do livro:");
        String nome = scanner.nextLine();

        String json = client.buscarLivro(nome);

        System.out.println("\nResposta da API:");
        System.out.println(json.substring(0, Math.min(json.length(), 500)));
    }
}
