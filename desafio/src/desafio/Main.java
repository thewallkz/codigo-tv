package desafio;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int aux=0;
		Tv tv = new Tv();
		while(true) {
			System.out.println(" - TV MENU -\n(1) - Ligar\n(2) - Desligar\n(3) - Aumentar volume\n(4) - Diminuir volume\n(5) - Trocar canal\n(6) - Mudo\n(7) - Status\n");
			int entrada = input.nextInt();
			switch (entrada) {
			case 1: {
				tv.ligar();
				break;
			}
			case 2: {
				tv.desligar();
				break;
			}
			case 3: {
				tv.aumentarVolume(aux);
				break;
			}
			case 4: {
				tv.diminuirVolume(aux);
				break;
			}
			case 5: {
				int novoCanal;
				if(tv.ligada) {
					System.out.println("Digite o canal desejado(1-999): ");
					entrada = input.nextInt();
					novoCanal = entrada;
					tv.trocarCanal(novoCanal);
				}
				break;
			}
			case 6: {
				if(tv.volumeMudo!=true) { // se o mudo nao estiver ativo...
					aux=tv.volume;
				}
				tv.mudo(aux);
				break;
			}
			case 7: {
				tv.status();
				break;
			}
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
	}
}
