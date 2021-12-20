package projetoM1;

public class Exercicios implements InterIMC {

	private double peso, altura, idade;

// ATRIBUTOS
/// arrays

	@Override
	public String txt() {

		return ("\n!!!Vamos recomendar uma lista de exercícios para você\n");
	}

	@Override
	public String along() {

		return ("n1° Faça o Alongamento\n: 25 Agachamentos, 25 polichinelos e uma caminhada de 15 min.  Pronto?!\n");
	}

	@Override
	public String mAbaixo() {// Para Pessoas muito abaixo do peso
		System.out.println("\nSeu IMC está muito baixo. Recomendamos que procure um especialista em Nutrição \n");
		return null;

	}

	@Override
	public String mAlto() {// Para pessoas com obesidade II e III

		System.out.println("\nSeu IMC está muito Alto. Recomendamos que procure um especialista em Nutrição\n");
		return null;
	}

	@Override
	public String imcAbx() {// Para pessoa abaixo do peso
		
		System.out.println(
				"\nRecomendamos que você faça os seguintes exercicios:\n10 Flexões| (Descanso 1min) |25 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |20 Agachamentos. Repita isso 2 vezes!!\n");
		return null;
	}

	@Override
	public String imcNormal() {// para pessoa de peso normal

		System.out.println(
				"\nRecomendamos que você faça os seguintes exercicios:\n25 Flexões| (Descanso 1min) |30 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |25 Agachamentos."
						+ "\n Repita isso 3 vezes e faça esses exercícios no mínimo 2 vezes por semana!!\n");
		return null;
	}

	@Override
	public String imcAcimaN() {// para pessoas acima do peso

		System.out.println(
				"\nRecomendamos que você faça os seguintes exercicios:\n15 Flexões| (Descanso 1min) |30 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |30 Agachamentos."
						+ "\nRepita isso 4 vezes e faça esses exercícios no mínimo 3 vezes por semana!!\n");
		return null;
	}

	@Override
	public String imcObsidade1() {// para pessoas com obesidade 1

		System.out.println(
				"\nRecomendamos que você faça os seguintes exercicios:\n10 Flexões| (Descanso 1min) |20 Abdominais| (Descanso 1min) |1 min de prancha| (Descanso 1min) |30 Agachamentos."
						+ "\nRepita isso 3 vezes e faça esses exercícios no mínimo 3 vezes por semana!!\n");
		return null;
	}

	@Override
	public String notif() {
		System.out.println(
				"\n!!!!Todas as informações contidas aqui e produzidas pelo sistema JINCAL são fornecidas apenas com propósitos educacionais.\n"
				+"Estas informações não devem ser usadas para diagnóstico ou tratamento de quaisquer problemas de saúde ou doenças.\n"
				+"\nESTAS INFORMAÇÕES NÃO DEVEM SUBSTITUIR O JULGAMENTO CLÍNICO OU ORIENTAR DE ALGUMA FORMA O TRATAMENTO INDIVIDUAL DOS PACIENTES.\n");
		return null;
	}

	// Area de Métodos para Alimentação
	@Override
	public String mAbaixoN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, você está um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cenário, e você terá ainda mais saúde!\nUse produtos lácteos desnatados ou semidesnatados de boa procedência. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, adicionando pouco óleo, apenas no final do preparo. \n Inclua sempre lanches saudáveis no intervalo das refeições. Prefira frutas inteiras com casca e bagaço \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, linguiça, mortadela, salame, paio).\nConsumo de preparações pesadas como: feijoada, buchada, pirão, mão-de-vaca, rabada.\n");
		return null;
	}

	@Override
	public String normalN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, você está um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cenário, e você terá ainda mais saúde!\nUse produtos lácteos desnatados ou semidesnatados de boa procedência. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, adicionando pouco óleo, apenas no final do preparo. \n Inclua sempre lanches saudáveis no intervalo das refeições. Prefira frutas inteiras com casca e bagaço \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, linguiça, mortadela, salame, paio).\nConsumo de preparações pesadas como: feijoada, buchada, pirão, mão-de-vaca, rabada.\n");
		return null;
	}

	@Override
	public String acimaN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, você está um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cenário, e você terá ainda mais saúde!\nUse produtos lácteos desnatados ou semidesnatados de boa procedência. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, adicionando pouco óleo, apenas no final do preparo. \nInclua sempre lanches saudáveis no intervalo das refeições. Prefira frutas inteiras com casca e bagaço \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, linguiça, mortadela, salame, paio).\nConsumo de preparações pesadas como: feijoada, buchada, pirão, mão-de-vaca, rabada.\n");

		return null;
	}

	@Override
	public String obesN() {
		System.out.println("DICA DA NUTRI!\r\n"
				+ "Opa, você está um pouco acima do peso esperado! Mas calma, ainda podemos reverter este cenário, e você terá ainda mais saúde!\nUse produtos lácteos desnatados ou semidesnatados de boa procedência. \nConsuma carnes magras, de boi, frango sem pele ou peixe, preferindo preparações grelhadas, assadas ou cozidas, adicionando pouco óleo, apenas no final do preparo. \n Inclua sempre lanches saudáveis no intervalo das refeições. Prefira frutas inteiras com casca e bagaço \n(para aumentar o teor de fibras de sua dieta), sucos, saladas de frutas e iogurtes light, no lugar de chocolates, sorvetes, tortas, biscoitos recheados, salgadinhos e frituras. \r\n"
				+ "\nEVITE: Alimentos ricos em gorduras, como enlatados (ervilha, milho verde, salsicha) e embutidos (presunto, linguiça, mortadela, salame, paio).\nConsumo de preparações pesadas como: feijoada, buchada, pirão, mão-de-vaca, rabada.\n");
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
