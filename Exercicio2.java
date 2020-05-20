import java.util.Scanner;
public class Exercicio2
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner (System.in);

		System.out.println ("Digite um ano: ");
		int ano = entrada.nextInt();

		if (ano == 2020)
		{
			System.out.println (+ ano + " e o ano atual");
		
		}
		
		else if (ano >= 2021)
		{
			System.out.println (+ ano + " e do futuro");
		}
		
		else
		{
			System.out.println (+ ano + " e do passado");
		}
	}
}