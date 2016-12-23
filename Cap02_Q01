package Cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cap02_Q01 {
	
	public static void main(String[] args) {
		String s;
		float ValorDoProduto, DescontoSobreProduto;
		BufferedReader dado;
		try {
			System.out.println("Digite o Valor do produto: ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			ValorDoProduto = Float.parseFloat(s);
			
			System.out.println("Digite o desconto sobre o valor total (0-100): ");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			DescontoSobreProduto = Float.parseFloat(s);
			
			float precoFinal = ValorDoProduto - (ValorDoProduto * (DescontoSobreProduto/100));
			System.out.println("O preço final do produto foi igual a: "+ precoFinal + ".");
		}
		
		catch(IOException erro) {
			
			System.out.println("Houve erro na entrada de dados. " + erro.toString());
			
		}
		
		catch (NumberFormatException erro) {
			
			System.out.println("Houve erro na conversao, digite apenas caracteres numéricos. " + erro.toString());
		}
	}

}
