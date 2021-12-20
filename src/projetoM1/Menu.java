package projetoM1;

import java.util.*;

public class Menu extends Exercicios {

	@SuppressWarnings({ "static-access", "resource" })
	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		Exercicios x = new Exercicios();
		Scanner sc = new Scanner(System.in);
		
		//COLLECTIONS 
		ArrayList<String> alimentos = new ArrayList<String> ();
		alimentos.add("Banana, Maça, Pêra, Melancia, Melão, Manga, Goiaba");
		
		System.out.println(" ======================================================= ");
		System.out.println("|| Developers:                      GitHub:            ||");
		System.out.println("||                                                     ||");
		System.out.println("|| Ariela Dimitria                  @arieladimitria    ||");
		System.out.println("|| Cássia Watanabe                  @cassiacfwatanabe  ||");
		System.out.println("|| Igor Mendes                      @DwIgor            ||");
		System.out.println("|| João Lucas                       @LuukasOo          ||");
		System.out.println("|| Larrisa Oliveira                 @larissa-oliv      ||");
		System.out.println("|| Nycolas Mendes                   @Nyckk1            ||");
		System.out.println("||                                                     ||");
		System.out.println("||                         Generation Brasil - Bloco I ||");
		System.out.println(" ======================================================= ");
		
		
		char escolhaA = 'S', escolhaB;
		System.out.print("\nDigite o peso: ");
		double peso =ler.nextDouble();
		System.out.print("Digite sua altura em Metros: ");
		double altura = ler.nextDouble();
		System.out.print("Digite a sua idade: ");
		int idade = ler.nextInt();
		System.out.println("Caso faça tratamento hormonal, procure um especialista para calcular sua taxa metabólica.");
		System.out.print("Seu Genero: (M) ou (F) ");
		char gen = ler.next().charAt(0);
		
		while(escolhaA == 'S') {
			System.out.println("\n");
			System.out.println(" ================================= ");
			System.out.println("||   O que você deseja calcular? ||");
			System.out.println("||      Selecione uma Opção:     ||");
			System.out.println("||                               ||");
			System.out.println("||            IMC  (A)           ||");
			System.out.println("||            TMB  (B)           ||");
			System.out.println("||            Sair (C)           ||");
			System.out.println("||                               ||");
			System.out.println(" ================================= ");
			escolhaB = sc.next().charAt(0);
			
			if(escolhaB == 'A' || escolhaB == 'a') {
				x.calIMC(peso, altura);
				
				System.out.println(String.format("Seu IMC é: %.2f",x.calIMC(peso, altura)));

				if (x.calIMC(peso, altura) < 17) {
					//x1
					System.out.println("Muito abaixo do peso");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.mAbaixo();
					x.notif();

				} else if (x.calIMC(peso, altura)< 18.49) {
					//x2
					System.out.println("Abaixo do peso");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.txt();
					x.along();
					x.imcAbx();
					x.mAbaixoN();
					x.notif();
				} else if (x.calIMC(peso, altura) < 24.99) {
					//x3
					System.out.println("Peso normal");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.txt();
					x.along();
					x.imcNormal();
					x.normalN();
					x.notif();
				} else if (x.calIMC(peso, altura) < 29.99) {
					//x4
					System.out.println("Acima do peso");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.txt();
					x.along();
					x.imcAcimaN();
					x.acimaN();
					x.notif();
				} else if (x.calIMC(peso, altura) < 34.99) {
				//x5
					System.out.println("Obesidade I");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.txt();
					x.along();
					x.imcObsidade1();
					x.obesN();
					x.notif();
				} else if (x.calIMC(peso, altura) < 39.99) {
					//x6
					System.out.println("Obesidade II (severa)");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.obesN();
					x.mAlto();
					x.notif();
				} else {
					//x7
					System.out.println("Obesidade III (morbida)");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					x.mAlto();
					x.notif();
				}
				System.out.println("Recomendamos as seguintes frutas para o seu dia a dia.");
				System.out.println(Arrays.toString(alimentos.toArray()));
				
				System.out.println("\n");
				System.out.println("Deseja calcular novamente? (S) ou (N)???\n");
				char resp=ler.next().charAt(0);
					if( resp == 'S'||  resp =='s') {	
				}
					else if(resp == 'N'||  resp =='n'){
						System.out.println("Fim do Programa!! Obrigado pela escolha!!");
						break;
					}	
			}
			else if(escolhaB == 'B' || escolhaB == 'b') {
				
				if (gen == 'm' || gen == 'M') 
				{
					x.tmbHomem(peso, altura, idade);
					System.out.println("\n");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					System.out.println("\n");
					System.out.print("Veja a seguir o cálculo do seu TMB (Taxa Metabólica Basal) \n");
					System.out.print(String.format("-----> %.2f", x.tmbHomem(peso, altura, idade))
							+ " KCAL diárias para manter o organismo funcionando <----- \n");
					System.out.println();
					System.out.println(
							String.format("-----> %.2f", x.tmbSedentario(peso, altura, idade)) + " KCAL necessárias para uma rotina considerada sedentária (pouco ou nenhum exercício)");
					System.out.println(
							String.format("-----> %.2f", x.tmbLeves(peso, altura, idade)) + " KCAL necessárias para uma rotina levemente ativa (exercício leve, prática de esportes 1-3 dias / semana) ");
					System.out.println(String.format("-----> %.2f", x.tmbModerado(peso, altura, idade))
							+ " KCAL necessárias para uma rorina moderada (exercício moderado, prática de esportes 3-5 dias / semana) ");
					System.out.println(String.format("-----> %.2f", x.tmbIntenso(peso, altura, idade))
							+ " KCAL necessárias para uma rotina intensa (exercício intenso, prática de esportes 6-7 dias / semana)");
					System.out.println(String.format("-----> %.2f", x.tmbAtleta(peso, altura, idade)) + " KCAL necessárias para uma rotina muito intensa (prática de esportes semi-profissional) ");
					System.out.println("\n");
					System.out.print("Equações utilizadas --> ");
					System.out.print("TMB HOMENS = 66.5 + (13.75 * Peso) + (5 * (Altura*100)) - (6.775 * Idade)");
				} 
				else if (gen == 'f' || gen == 'F') 
				{
					x.tmbMulher(peso, altura, idade);
					System.out.println("\n");
					System.out.println("Buscando Informações no Sistema... Aguarde!");
					Thread.currentThread().sleep(2000);
					System.out.println("...");
					Thread.currentThread().sleep(2000);
					System.out.print(String.format(" -----> %.2f", x.tmbMulher(peso, altura, idade))
							+ " KCAL diárias para manter o organismo funcionando <----- \n");
					System.out.println(
							String.format("-----> %.2f", x.tmbSedentariom(peso, altura, idade)) + " KCAL necessárias para uma rotina considerada sedentária (pouco ou nenhum exercício) ");
					System.out.println(
							String.format("-----> %.2f", x.tmbLevesm(peso, altura, idade)) + " KCAL necessárias para uma rotina levemente ativa (exercício leve, prática de esportes 1-3 dias / semana)");
					System.out.println(String.format("-----> %.2f", x.tmbModeradom(peso, altura, idade))
							+ " KCAL necessárias para uma rorina moderada (exercício moderado, prática de esportes 3-5 dias / semana)");
					System.out.println(String.format("-----> %.2f", x.tmbIntensom(peso, altura, idade))
							+ " KCAL necessárias para uma rotina intensa (exercício intenso, prática de esportes 6-7 dias / semana) ");
					System.out.println(String.format("-----> %.2f", x.tmbAtletam(peso, altura, idade)) + "  KCAL necessárias para uma rotina muito intensa (prática de esportes semi-profissional)");
					System.out.println();
					System.out.print("Equações utilizadas --> ");
					System.out.print("TMB MULHERES = 655.1 + (9.563 * Peso) + (1.85 * (Altura*100)) - (4.676 * Idade)");
					System.out.println();
					
				}
				System.out.println("\n");
				System.out.print("\nDeseja calcular novamente? (S) ou (N)???\n");
				char resp=ler.next().charAt(0);
					if( resp == 'S'||  resp =='s') {
					
				}
					else if(resp == 'N'||  resp =='n'){
						System.out.println("Fim do Programa!! Obrigado Pela Escolha!!");
						break;
					}		
			}
			else if(escolhaB == 'C' || escolhaB == 'c'){
				System.out.println("Fim do Programa!! Obrigado Pela Escolha!!");
				break;
			}
			else 
				System.out.println("Opção escolhida inexistente!! Informe uma opção valida!");
		}
	}
}
