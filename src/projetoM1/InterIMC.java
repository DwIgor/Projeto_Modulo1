package projetoM1;

public interface InterIMC {
	 //   SOMENTE METODOS
	public abstract String txt();
	public abstract String along();
	public abstract String mAbaixo();
	public abstract String mAlto();
	public abstract String imcAbx();
	public abstract String imcNormal();
	public abstract String imcAcimaN();
	public abstract String imcObsidade1();
	public abstract String notif();	
	
	//Alimenção
	
	public abstract String mAbaixoN();
	public abstract String normalN();
	public abstract String acimaN();
	public abstract String obesN();
	double calIMC(double peso, double altura);
	
	//Taxa Metabolica Basal
	
	double tmbHomem(double peso, double altura, int idade);
	double tmbSedentario(double peso, double altura, int idade);
	double tmbLeves(double peso, double altura, int idade);
	double tmbModerado(double peso, double altura, int idade);
	double tmbIntenso(double peso, double altura, int idade);
	double tmbAtleta(double peso, double altura, int idade);
	//#//
	double tmbMulher(double peso, double altura, int idade);
	double tmbSedentariom(double peso, double altura, int idade);
	double tmbLevesm(double peso, double altura, int idade);
	double tmbModeradom(double peso, double altura, int idade);
	double tmbIntensom(double peso, double altura, int idade);
	double tmbAtletam(double peso, double altura, int idade);
	
}
