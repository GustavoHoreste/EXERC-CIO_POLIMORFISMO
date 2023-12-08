/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício_polimorfismo_exercicio1;

/**
 *
 * @author gustavohorestee
 */
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        ItemDeMidia[] lista = new ItemDeMidia[10];
        int opcao;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite 1 para CD e 2 para DVD");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();

            if (opcao == 1) {
                lista[i] = new CD();
            } else if (opcao == 2) {
                lista[i] = new DVD();
            }

            lista[i].inserirDetalhes(); // Inserir dados no objeto criado seja CD ou DVD.
        }

        // Impressão da lista como tabela
        System.out.println("\n---------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Tipo", "Código", "Preço", "Nome");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 2; i++) {
            System.out.printf("%-15s %-15d %-15.2f %-15s%n",
                              lista[i].getTipoDeMidia(),
                              lista[i].getCodigoDoItem(),
                              lista[i].getPreco(),
                              lista[i].getNomeDoItem());
        }

        System.out.println("---------------------------------------------");
    }
}
