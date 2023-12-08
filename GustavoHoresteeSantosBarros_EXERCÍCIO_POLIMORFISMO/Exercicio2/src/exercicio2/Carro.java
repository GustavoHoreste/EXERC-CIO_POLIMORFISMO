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

class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Inserir Dados do Carro ---");
        System.out.print("Modelo: ");
        modelo = input.nextLine();
        System.out.print("Preço: R$");
        preco = input.nextDouble();
        System.out.print("Quilometragem: ");
        km = input.nextDouble();
    }
}
