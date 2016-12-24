package Cap02;

import javax.swing.JOptionPane;

public class Cap02_Q05 {
	public static void main(String[] args) {
			
			long idade, qtdMinimaAnosContribuicao = 30;
			String Sexo;
			idade = Long.parseLong(JOptionPane.showInputDialog("Digite a sua idade: "));
			Sexo = JOptionPane.showInputDialog("Digite seu sexo: ");
			long qtdAnosContribuicao = Long.parseLong(JOptionPane.showInputDialog("Digite a qtd de anos de contribuição: "));
			long diferenca = qtdMinimaAnosContribuicao - qtdAnosContribuicao;
			if (idade >= 60 && Sexo.equals("F") && diferenca <= 0) {
				System.out.println("você já tem o direito a aposentadoria.");
			}
			else if (idade < 60 && Sexo.equals("F") || diferenca > 0) {
				System.out.println("A aposentadoria é inválida. Faltam ainda %d anos de contribuição para que a aposentadoria seja validada.");
				
			}
			
			if (idade >= 65 && Sexo.equals("M") && diferenca <= 0) {
				System.out.println("Você já tem o direito a aposentadoria.");
			}
			else if (idade < 65 && Sexo.equals("M") || diferenca > 0) {
				System.out.println("A aposentadoria é inválida. Faltam ainda %d anos de contribuição para que a aposentadoria seja validada.");
			}
			
			
		}

}
