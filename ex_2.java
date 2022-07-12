import java.util.Scanner;
public class ex_2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static void main(String[] args) {
		int 	menoresDe18 = 0, 
				jogadores80KG = 0;
		float	idadeTotal = 0,
				alturaTotal = 0;
		for(int x=1; x<=22; x++) {
			float idade = scanFloat("Qual a idade do jogador?");
			float peso = scanFloat("Qual a idade do peso?");
			float altura = scanFloat("Qual a idade do jogador?");
			if(idade>18) 
				menoresDe18++;
			idadeTotal += idade;
			alturaTotal += altura;
			if(peso>80)
				jogadores80KG++;
		}
		print("Jogadores com menos de 18: "+(menoresDe18));
		print("Media de idade: "+(idadeTotal/22));
		print("Media de altura: "+(alturaTotal/22));
		print("Porcentagem com mais de 80kg: "+(jogadores80KG*100/22));
		sc.close();
	}

}
