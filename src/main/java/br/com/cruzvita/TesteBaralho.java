package br.com.cruzvita;

import java.util.Scanner;

public class TesteBaralho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        int option;
        
        do {
            System.out.println("\nBaralho Cruz Vita:");
            System.out.println("\n[1] Mostrar baralho completo");
            System.out.println("[2] Embaralhar");
            System.out.println("[3] Dar carta");
            System.out.println("[4] Verificar se ainda existem cartas no baralho");
            System.out.println("[5] Sair");
            System.out.print("\nDigite a op��o desejada:");
            
            option = scanner.nextInt();
            
            switch (option) {
            case 1:
                System.out.println("\nMostrando baralho completo:");
                baralho.imprimeBaralho();
                break;
                
            case 2:
                baralho.embaralharCartas();
                System.out.println("\nCartas embaralhadas!");
                System.out.println("Se deseja ver a disposi��o das cartas ap�s embaralhar digite a op��o 1");
                break;
            
            case 3:
                Carta carta = baralho.darCarta();
                if (carta == null) {
                    System.out.println("\nN�o h� cartas no baralho!");
                } else {
                    System.out.println("\nCarta retirada: " + carta.getNome() + " de " + carta.getNaipe());
                }
                break;
                
            case 4:
                if (baralho.temCarta()) {
                    System.out.println("\nAinda h� cartas no baralho!");
                } else {
                    System.out.println("\nN�o h� mais cartas no baralho!");
                }
                break;
                
            case 5:
                System.out.println("\nEncerrando o programa.");
                break;
                
            default:
                System.out.println("\nOp��o inv�lida! Digite uma op��o v�lida.");
                break;
            }
            
        } while (option != 5);
        
        scanner.close();
    }
}
