package desafio;
/*String marca
int volume
int canalAtual
boolean ligada (indica se a TV está ligada ou desligada)
E os seguintes métodos:void ligar(): Liga a TV e exibe a mensagem "TV ligada".
void desligar(): Desliga a TV e exibe a mensagem "TV desligada".
void aumentarVolume(): Aumenta o volume em 1, mas o volume não pode ultrapassar 100.
void diminuirVolume(): Diminui o volume em 1, mas o volume não pode ser menor que 0.
void trocarCanal(int novoCanal): Troca para o canal informado como parâmetro, mas o canal deve ser entre 1 e 999.
String status(): Retorna o status atual da TV. 
Se a TV estiver ligada, deve exibir "TV ligada no canal X com volume Y", onde X é o canal atual e Y é o volume. 
Caso contrário, deve exibir "TV desligada".
Desafio adicional: Adicione um método void mudo() que, ao ser chamado, deve silenciar a TV (volume deve ser 0), mas sem alterar o estado de "ligada" ou "desligada". O método também deve exibir a mensagem "TV no mudo".*/
public class Tv {
	
	String marca;
	int volume=0;
	int canalAtual;
	boolean ligada;
	boolean volumeMudo;
	
	void ligar() { // Liga a TV e exibe a mensagem "TV ligada".
		this.ligada=true;
		System.out.println("Tv ligada.");
	}
	void desligar() { //  Desliga a TV e exibe a mensagem "TV desligada".
		this.ligada=false;
		System.out.println("Tv desligada.");
	}
	void aumentarVolume(int aux) { // Aumenta o volume em 1, mas o volume não pode ultrapassar 100.
		if(ligada) {
			if(volumeMudo) { // se estiver no mudo
				this.volumeMudo=false; // desativa o mudo
				this.volume=aux; // retorna ao volume que estava antes
			}
			if(this.volume+1<=100) {
				this.volume+=1;
				//System.out.println("Volume "+this.volume);
			}
		}
	}
	void diminuirVolume(int aux) { // Diminui o volume em 1, mas o volume não pode ser menor que 0.
		if(ligada) {
			if(volumeMudo) { // se estiver no mudo
				this.volumeMudo=false; // desativa o mudo
				this.volume=aux; // retorna ao volume que estava antes
			}
			if(this.volume-1>=0) {
				this.volume-=1;
				//System.out.println("Volume "+this.volume);
			}
		}
	}
	void trocarCanal(int novoCanal) { // Troca para o canal informado como parâmetro, mas o canal deve ser entre 1 e 999.
		if(ligada) {
			if(novoCanal>0 && novoCanal<1000) {
				this.canalAtual=novoCanal;
			} else {
				System.out.println("Canal inexistente.");
			}
		}
	}
	void mudo(int aux) { /* deve silenciar a TV (volume deve ser 0), mas sem alterar o estado de "ligada" ou "desligada". 
					O método também deve exibir a mensagem "TV no mudo*/
		if(ligada) {
			if(volumeMudo!=true) { // ativando o mudo
				this.volumeMudo=true;
				this.volume=0;
				System.out.println("TV no mudo.");
			}
			else { // desativando mudo
				this.volumeMudo=false;
				this.volume=aux; // retorna ao volume que estava antes
			}
		}
	}
	void status() { //  Retorna o status atual da TV. 
		if(ligada) { // Se a TV estiver ligada, deve exibir "TV ligada no canal X com volume Y", onde X é o canal atual e Y é o volume.
			System.out.println("TV ligada no canal "+this.canalAtual+" com volume "+this.volume);
		}
		else { // Caso contrário, deve exibir "TV desligada".
			System.out.println("TV Desligada");
		}
	}
}
