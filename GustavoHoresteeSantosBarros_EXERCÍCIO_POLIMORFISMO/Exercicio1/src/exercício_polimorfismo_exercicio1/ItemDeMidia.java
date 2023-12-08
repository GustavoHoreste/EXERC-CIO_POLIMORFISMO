/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício_polimorfismo_exercicio1;

/**
 *
 * @author gustavohorestee
 */
import java.util.Scanner;

public class ItemDeMidia {
    private int codigoDoItem;
    private double preco;
    private String nomeDoItem;

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public int getCodigoDoItem() {
        return codigoDoItem;
    }

    public double getPreco() {
        return preco;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public ItemDeMidia() {
        this(0, 0.0, "Nenhum");
    }

    public ItemDeMidia(int codigoDoItem, double preco, String nomeDoItem) {
        setCodigoDoItem(codigoDoItem);
        setPreco(preco);
        setNomeDoItem(nomeDoItem);
    }

    public String getTipoDeMidia() {
        return "Item de Mídia: ";
    }

    public String getDetalhes() {
        return "Código do Item: " + getCodigoDoItem() + "\n" +
               "Preço: " + getPreco() + "\n" +
               "Nome: " + getNomeDoItem() + "\n";
    }

    public void imprimirDados() {
        String saida = getTipoDeMidia() + "\n" + getDetalhes() + "\n";
        System.out.println(saida);
    }

    public void inserirDetalhes() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Inserir Detalhes do Item de Mídia ---");

        System.out.print("Digite o código do item: ");
        int codigo = input.nextInt();

        System.out.print("Digite o preço: ");
        double precoDoItem = input.nextDouble();
        input.nextLine();

        System.out.print("Digite o nome do item: ");
        String nome = input.nextLine();

        setCodigoDoItem(codigo);
        setPreco(precoDoItem);
        setNomeDoItem(nome);
    }
}

