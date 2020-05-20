import java.util.Scanner;
public class Exercicio3
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println ("Primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.println ("Segunda nota: ");
		float nota2 = entrada.nextFloat();

		float media = (nota1 + nota2) /2;
		
		if (media >= 0 && media <= 3.99)
		{
			System.out.println ("Nome: " + nome + " Media: " + media + "\n Situacao: Reprovado");
		
		}
		
		else if (media >= 4 && media <= 5.99)
		{
			System.out.println ("Nome: " + nome + " Media: " + media + "\n Situacao: Recuperacao");
		}
		
		else if (media >= 6 && media <= 10)
		{
			System.out.println ("Nome: " + nome + " Media: " + media + "\n Situacao: Aprovado");
		}
	}
}