import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
public class ExemploJButtton02{
	public static void main(String[] args){

		JFrame tela = new JFrame("HOVER");
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton("Não venha aqui!");
		botao.setSize(400, 300);
		botao.setLocation(45, 140);

		botao.addMouseListner(new MouseAdapter(){
			@Override
			public void MouseEntered(MouseEvent e ){
				botao.setBackground(Color.decode(""));
			}
			@Override
			public void mouseExited(MouseEvent e){
				botao.setBackground(Color.decode("#23dd3f"));
				//remove a borda ao redor do texto
				botao.setFocusPainted(false);
				//remove a borda ao redor do botão
				botao.setBorderPainted(false);
				botao.addMouseListner(new MouseAdapter(){

				});
			}
		});

		tela.add(botao);
		tela.setVisible(true);

	}	
}