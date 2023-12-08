/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author gustavohorestee
 */
import java.util.Scanner;

class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Inserir Dados da Moto ---");
        System.out.print("Modelo: ");
        modelo = input.nextLine();
        System.out.print("Preço: R$");
        preco = input.nextDouble();
        System.out.print("Ano: ");
        ano = input.nextInt();
    }
}
