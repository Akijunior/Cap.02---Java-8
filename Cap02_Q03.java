package Cap02;

import javax.swing.JOptionPane;

public class Cap02_Q03 {
	
	public static void main(String[] args) {
		
		double ITBIOuValorNegociado, valorVenal, percentualDeImposto, maior = 0;
		
		ITBIOuValorNegociado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Negociado(ITBI): "));
		valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Venal: "));
		percentualDeImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de imposto: "));
		
		if (ITBIOuValorNegociado > valorVenal) {
			maior = ITBIOuValorNegociado;
		}
		else if (ITBIOuValorNegociado < valorVenal) {
			maior = valorVenal;
		}
		
		double valor_do_imposto = maior * percentualDeImposto / 100;
		JOptionPane.showMessageDialog(null, "O valor total do imposto foi igual a "+ valor_do_imposto+ ".");
		
	}
}
