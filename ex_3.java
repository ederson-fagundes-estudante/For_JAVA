import java.util.Scanner;
public class ex_3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}

	public static String scan(String text) {
		print(text);
		return sc.next();
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static int scanInt(String text) {
		print(text);
		return sc.nextInt();
	}

	public static double salario(int n, float salarioM, int peças) {
		switch(n) {
		case 1:
			return salarioM;
		case 2:
			return salarioM+(1+(0.03*peças));
		case 3:
			return salarioM+(1+(0.05*peças));
		}
	}
	
	public static void main(String[] args) {
		int nFuncionarios = 15;
		float salarioMinimo = scanFloat("Qual o salario minimo?");
		double maiorSalario = 0;
		int peçasFHomens = 0, peçasFMulheres = 0, peçasTotal = 0, maiorSalarioOperario;
		for(int x=1; x<=nFuncionarios; x++) {
			int numero = scanInt("Qual o numero do operario("+x+")?");
			int classe = scanInt("Qual a classe do operario("+x+")?");
			int nPeças = scanInt("Qual o numero de peças fabricadas("+x+")?");
			String sexo = scan("Qual a idade do jogador("+x+")?");
			print("Salario("+numero+"): "+(salario(classe, salarioMinimo, nPeças)));
			if(String.valueOf(sexo.charAt(0)) == "M" || String.valueOf(sexo.charAt(0)) == "m") {
				peçasFMulheres+=nPeças;
			}else {
				peçasFHomens+=nPeças;
			}
			peçasTotal +=nPeças;
			if(salario(classe, salarioMinimo, nPeças)>maiorSalario) {
				maiorSalarioOperario = numero;
				maiorSalario = salario(classe, salarioMinimo, nPeças);
			}
		}
		print("Total peças: "+peçasTotal);
		print("Media peças homens: "+(peçasFHomens/nFuncionarios));
		print("Media peças mulheres: "+(peçasFMulheres/nFuncionarios));
		print("Operario com maior salario: "+(maiorSalarioOperario));
		sc.close();
	}

}
