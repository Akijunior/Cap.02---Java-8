package Cap02;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cap02_Q02 {
	
	public static void main(String[] args) {
		
		long qtdDePontosDoLiderDoCampeonado, qtdDePontosDoTimeLanterna;
		long Vitoria = 3;
		qtdDePontosDoLiderDoCampeonado = Long.parseLong(JOptionPane.showInputDialog("Digite a qtd de pontos do Líder do Campeonato: "));
		qtdDePontosDoTimeLanterna = Long.parseLong(JOptionPane.showInputDialog("Digite a qtd de pontos do time lanterna: "));
		long diferenca = (qtdDePontosDoLiderDoCampeonado - qtdDePontosDoTimeLanterna)/Vitoria;
		JOptionPane.showMessageDialog(null, "A qtd de vitórias necessárias será igual a: " + diferenca);
	}

}
