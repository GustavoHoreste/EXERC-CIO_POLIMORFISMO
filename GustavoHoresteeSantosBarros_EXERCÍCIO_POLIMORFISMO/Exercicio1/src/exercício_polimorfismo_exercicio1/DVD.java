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

public class DVD extends ItemDeMidia {
    private int numeroDeFaixas;

    public DVD() {
        this(0, 0.0, "Nenhum", 0);
    }

    public DVD(int codigoDoItem, double preco, String nomeDoItem, int numeroDeFaixas) {
        super(codigoDoItem, preco, nomeDoItem);
        setNumeroDeFaixas(numeroDeFaixas);
    }

    public String getTipoDoItem() {
        return "DVD: ";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
               "Número de Faixas: " + numeroDeFaixas + "\n";
    }

    public void setNumeroDeFaixas(int faixas) {
        numeroDeFaixas = (faixas > 0) ? faixas : 0;
    }

    public void inserirDetalhes() {
        super.inserirDetalhes();
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Inserir Detalhes do DVD ---");

        System.out.print("Digite o número de faixas: ");
        int faixas = input.nextInt();
        setNumeroDeFaixas(faixas);
    }
}


