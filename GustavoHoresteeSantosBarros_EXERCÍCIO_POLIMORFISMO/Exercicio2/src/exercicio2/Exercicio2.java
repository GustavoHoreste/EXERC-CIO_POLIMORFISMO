/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author gustavohorestee
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Veiculo> cadastro = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nEscolha o tipo de veículo:");
            System.out.println("1. Moto");
            System.out.println("2. Carro");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    Moto moto = new Moto("", 0, 0);
                    moto.insertData();
                    cadastro.add(moto);
                    break;
                case 2:
                    Carro carro = new Carro("", 0, 0);
                    carro.insertData();
                    cadastro.add(carro);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        System.out.println("\n--- Relatório de Veículos ---");
        for (Veiculo veiculo : cadastro) {
            veiculo.printDados();
        }

        double totalPreco = calcularTotalPreco(cadastro);
        System.out.println("\nTotal de Preços Antes dos Ajustes: R$" + totalPreco);

        ajustarPrecos(cadastro);

        double novoTotalPreco = calcularTotalPreco(cadastro);
        System.out.println("\nTotal de Preços Após Ajustes: R$" + novoTotalPreco);
    }

    private static double calcularTotalPreco(ArrayList<Veiculo> cadastro) {
        double totalPreco = 0;
        for (Veiculo veiculo : cadastro) {
            totalPreco += veiculo.getPreco();
        }
        return totalPreco;
    }

    private static void ajustarPrecos(ArrayList<Veiculo> cadastro) {
        for (Veiculo veiculo : cadastro) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.1;
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92; // 8% de desconto
                    carro.setPreco(novoPreco);
                }
            }
        }
    }
    
}
