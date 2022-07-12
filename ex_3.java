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

	public static double salario(int n, float salarioM, int pe�as) {
		switch(n) {
		case 1:
			return salarioM;
		case 2:
			return salarioM+(1+(0.03*pe�as));
		case 3:
			return salarioM+(1+(0.05*pe�as));
		}
	}
	
	public static void main(String[] args) {
		int nFuncionarios = 15;
		float salarioMinimo = scanFloat("Qual o salario minimo?");
		double maiorSalario = 0;
		int pe�asFHomens = 0, pe�asFMulheres = 0, pe�asTotal = 0, maiorSalarioOperario;
		for(int x=1; x<=nFuncionarios; x++) {
			int numero = scanInt("Qual o numero do operario("+x+")?");
			int classe = scanInt("Qual a classe do operario("+x+")?");
			int nPe�as = scanInt("Qual o numero de pe�as fabricadas("+x+")?");
			String sexo = scan("Qual a idade do jogador("+x+")?");
			print("Salario("+numero+"): "+(salario(classe, salarioMinimo, nPe�as)));
			if(String.valueOf(sexo.charAt(0)) == "M" || String.valueOf(sexo.charAt(0)) == "m") {
				pe�asFMulheres+=nPe�as;
			}else {
				pe�asFHomens+=nPe�as;
			}
			pe�asTotal +=nPe�as;
			if(salario(classe, salarioMinimo, nPe�as)>maiorSalario) {
				maiorSalarioOperario = numero;
				maiorSalario = salario(classe, salarioMinimo, nPe�as);
			}
		}
		print("Total pe�as: "+pe�asTotal);
		print("Media pe�as homens: "+(pe�asFHomens/nFuncionarios));
		print("Media pe�as mulheres: "+(pe�asFMulheres/nFuncionarios));
		print("Operario com maior salario: "+(maiorSalarioOperario));
		sc.close();
	}

}
