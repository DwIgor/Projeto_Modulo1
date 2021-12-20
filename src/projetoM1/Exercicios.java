package projetoM1;

public class Exercicios implements InterIMC {

	private double peso, altura, idade;

// ATRIBUTOS
/// arrays

	@Override
	public String txt() {

		return ("\n!!!Vamos recomendar uma lista de exerc�cios para voc�\n");
	}

	@Override
	public String along() {

		return ("n1� Fa�a o Alongamento\n: 25 Agachamentos, 25 polichinelos e uma caminhada de 15 min.  Pronto?!\n");
	}

	@Override
	public String mAbaixo() {// Para Pessoas muito abaixo do peso
		System.out.println("\nSeu IMC est� muito baixo. Recomendamos que procure um especialista em Nutri��o \n");
		return null;

	}

	@Override
	public String mAlto() {// Para pessoas com obesidade II e III

		System.out.println("\nSeu IMC est� muito Alto. Recomendamos que procure um especialista em Nutri��o\n");
		return null;
	}

	@Override
	public String imcAbx() {// Para pessoa abaixo do peso
		
		System.out.println(
				"\nRecomendamos que voc� fa�a os seguintes exercicios:\n10 Flex�es| (Descanso 1min) |25 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |20 Agachamentos. Repita isso 2 vezes!!\n");
		return null;
	}

	@Override
	public String imcNormal() {// para pessoa de peso normal

		System.out.println(
				"\nRecomendamos que voc� fa�a os seguintes exercicios:\n25 Flex�es| (Descanso 1min) |30 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |25 Agachamentos."
						+ "\n Repita isso 3 vezes e fa�a esses exerc�cios no m�nimo 2 vezes por semana!!\n");
		return null;
	}

	@Override
	public String imcAcimaN() {// para pessoas acima do peso

		System.out.println(
				"\nRecomendamos que voc� fa�a os seguintes exercicios:\n15 Flex�es| (Descanso 1min) |30 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |30 Agachamentos."
						+ "\nRepita isso 4 vezes e fa�a esses exerc�cios no m�nimo 3 vezes por semana!!\n");
		return null;
	}

	@Override
	public String imcObsidade1() {// para pessoas com obesidade 1

		System.out.println(
				"\nRecomendamos que voc� fa�a os seguintes exercicios:\n10 Flex�es| (Descanso 1min) |20 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |30 Agachamentos."
						+ "\nRepita isso 3 vezes e fa�a esses exerc�cios no m�nimo 3 vezes por semana!!\n");
		return null;
	}

	@Override
	public String notif() {
		System.out.println(
				"\n!!!!Todas as informa��es contidas aqui e produzidas pelo sistema JINCAL s�o fornecidas apenas com prop�sitos educacionais.\n"
				+"Estas informa��es n�o devem ser usadas para diagn�stico ou tratamento de quaisquer problemas de sa�de ou doen�as.\n"
				+"\nESTAS INFORMA��ES N�O DEVEM SUBSTITUIR O JULGAMENTO CL�NICO OU ORIENTAR DE ALGUMA FORMA O TRATAMENTO INDIVIDUAL DOS PACIENTES.\n");
		return null;
	}

	// Area de M�todos para Alimenta��o
	@Override
	public String mAbaixoN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, voc� est� um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cen�rio, e voc� ter� ainda mais sa�de!\nUse produtos l�cteos desnatados ou semidesnatados de boa proced�ncia. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo prepara��es grelhadas, assadas ou cozidas, adicionando pouco �leo, apenas no final do preparo. \n Inclua sempre lanches saud�veis no intervalo das refei��es. Prefira frutas inteiras com casca e baga�o \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, lingui�a, mortadela, salame, paio).\nConsumo de prepara��es pesadas como: feijoada, buchada, pir�o, m�o-de-vaca, rabada.\n");
		return null;
	}

	@Override
	public String normalN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, voc� est� um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cen�rio, e voc� ter� ainda mais sa�de!\nUse produtos l�cteos desnatados ou semidesnatados de boa proced�ncia. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo prepara��es grelhadas, assadas ou cozidas, adicionando pouco �leo, apenas no final do preparo. \n Inclua sempre lanches saud�veis no intervalo das refei��es. Prefira frutas inteiras com casca e baga�o \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, lingui�a, mortadela, salame, paio).\nConsumo de prepara��es pesadas como: feijoada, buchada, pir�o, m�o-de-vaca, rabada.\n");
		return null;
	}

	@Override
	public String acimaN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, voc� est� um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cen�rio, e voc� ter� ainda mais sa�de!\nUse produtos l�cteos desnatados ou semidesnatados de boa proced�ncia. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo prepara��es grelhadas, assadas ou cozidas, adicionando pouco �leo, apenas no final do preparo. \nInclua sempre lanches saud�veis no intervalo das refei��es. Prefira frutas inteiras com casca e baga�o \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, lingui�a, mortadela, salame, paio).\nConsumo de prepara��es pesadas como: feijoada, buchada, pir�o, m�o-de-vaca, rabada.\n");

		return null;
	}

	@Override
	public String obesN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, voc� est� um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cen�rio, e voc� ter� ainda mais sa�de!\nUse produtos l�cteos desnatados ou semidesnatados de boa proced�ncia. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo prepara��es grelhadas, assadas ou cozidas, adicionando pouco �leo, apenas no final do preparo. \n Inclua sempre lanches saud�veis no intervalo das refei��es. Prefira frutas inteiras com casca e baga�o \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, lingui�a, mortadela, salame, paio).\nConsumo de prepara��es pesadas como: feijoada, buchada, pir�o, m�o-de-vaca, rabada.\n");
		return null;
	}

	// Gets e Sets
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//
	@Override
	public double calIMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
		return peso / (altura * altura);
	}

	@Override
	// CALCULO TMB NECESSARIO PARA MULHER MANTER OS ORGAOS FUNCIONANDO NORMALMENTE
	public double tmbMulher(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return 655.1 + (9.56 * peso) + (1.85 *(altura*100)) - (4.68 * idade);

	}

	@Override
	// CALCULO TMB NECESSARIO PARA HOMEM MANTER OS ORGAOS FUNCIONANDO NROMALMENTE
	public double tmbHomem(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return 66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade);
	}

	@Override
	// CALCULO TMB ROTINA SEDENTARIA HOMEM
	public double tmbSedentario(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.2;
	}

	@Override
	// CALCULO TMB ROTINA LEVE HOMEM
	public double tmbLeves(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.375;
	}

	@Override
	// CALCULO TMB ROTINA MODERADA HOMEM
	public double tmbModerado(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 *(altura*100)) - (6.76 * idade)) * 1.55;
	}

	@Override
	// CALCULO TMB ROTINA INTENSO HOMEM
	public double tmbIntenso(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.725;
	}

	@Override
	// CALCULO TMB ROTINA MODERADA MULHER
	public double tmbModeradom(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 *(altura*100)) - (6.76 * idade)) * 1.55;
	}

	@Override
	// CALCULO TMB ROTINA INTENSA MULHER
	public double tmbIntensom(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.725;
	}

	@Override
	// CALCULO TMB ROTINA ATLETA MULHER
	public double tmbAtletam(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.9;
	}

	@Override
	// CALCULA TMB ROTINA ATLETA HOMEM
	public double tmbAtleta(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (66.47 + (13.75 * peso) + (5 * (altura*100)) - (6.76 * idade)) * 1.9;
	}

	@Override
	// CALCULO TAXA TMB SEDENTARIO MULHER
	public double tmbSedentariom(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (655.1 + (9.56 * peso) + (1.85 *(altura*100)) - (4.68 * idade)) * 1.2;
	}

	@Override
	// CALCULO TMB ROTINA LEVE MULHER
	public double tmbLevesm(double peso, double altura, int idade) {
		this.peso = peso;
		this.altura = altura;
		this.setIdade(idade);

		return (655.1 + (9.56 * peso) + (1.85 * (altura*100)) - (4.68 * idade)) * 1.375;

	}

	// DEVIDO A DIVERGENCIA ENTRE OS HORMONIOS RECOMENDAMOS QUE PROCURE UM ESPECIALISTA PARA REALIAZAR O CALCULO E DESCOBRIR SUA TAXA METABOLICA

}
