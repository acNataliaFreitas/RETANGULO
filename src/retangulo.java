import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura,altura,ContaArea,ContaPerimetro, opcao;
		int fim;
		fim=0;
	
		//LARGURA
		System.out.println("Digite a largura do retangulo:");
		largura=sc.nextDouble();
		while(largura< 0.0) {
			System.out.println("O valor deve ser positivo. Tente novamente:");
			largura=sc.nextDouble();
		}
		
		//ALTURA
		System.out.println("Digite a alturado retangulo:");
		altura=sc.nextDouble();
		while(altura< 0.0) {
			System.out.println("O valor deve ser positivo. Tente novamente:");
			altura=sc.nextDouble();
		}	
		
		//MENU

		while(fim == 0) {
		System.out.println("MENU");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		
		System.out.println("Digite uma opçao :");
		opcao=sc.nextDouble();
		
			if(opcao==1) {
				ContaArea= largura *altura;
				System.out.printf("AREA = %.2f%n",ContaArea);
				System.out.println("Digite uma opçao :");
				opcao=sc.nextDouble();
			}
			
			else if(opcao==2) {
				ContaPerimetro = 2*largura + 2*altura;
				System.out.printf("PERIMETRO = %.2f%n", ContaPerimetro);
				System.out.println("Digite uma opçao :");
				opcao=sc.nextDouble();
			}
			
			else if(opcao==3){
				System.out.println("OPÇAO INVALIDA");
				fim=1;
			}
			
			else {
				System.out.println("FIM DO PROGRAMA!");
			}
		
		}
			
		sc.close();
		
}	
	}

