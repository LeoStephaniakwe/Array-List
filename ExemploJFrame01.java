import javax.swing.JFrame;
import java.awt.Color;

public class ExemploJFrame01 {
	
	public static void main(String[] args) {

		//cria a tela
		JFrame tela = new JFrame();

		//define o tamaho da 
		//width ↔, heith ↕
		tela.setSize(500, 500);

		//diz que o layout é nulo
		tela.setLayout(null);

		//passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);

		//diz que quando o usuário fechar a aplicação, irá encerrar o aplicativo
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//define o título da janela
		tela.setTitle("HELLO WORLD");

		//import java.awt.Color;
		//tela.getContentPane().setBackground(Color.RED);

		tela.getContentPane().setBackground(Color.decode("#535d6d"));

		//apresenta a janela
		tela.show();




	}


}