import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Sistem00{
	public static void main (String[] args){
		JFrame tela = new JFrame("Campo de seleção");
		tela.setSize(500,500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel labelNome = new JLabel("Nome");
		JLabel labelItens = new JLabel("Itens");

		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoEditar = new JButton("Editar");
		JButton botaoApagar = new JButton("Apagar");

		JTextField campoNome = new JTextField();
		JComboBox caixaDeSelecaoItens = new JComboBox();

		labelNome.setSize(50,20);
		labelItens.setSize(50,20);

		botaoCadastrar.setSize(150, 30);
		botaoEditar.setSize(150,30);
		botaoApagar.setSize(150,30);

		campoNome.setSize(406,20);
		caixaDeSelecaoItens.setSize(406,20);

		labelNome.setLocation(10,10);
		campoNome.setLocation(65,10);
		botaoCadastrar.setLocation(10,35);
		botaoEditar.setLocation(165,35);
		botaoApagar.setLocation(320,35);
		labelItens.setLocation(10,70);
		caixaDeSelecaoItens.setLocation(65,70);


		tela.add(labelNome);
		tela.add(labelItens);
		tela.add(botaoCadastrar);
		tela.add(botaoEditar);
		tela.add(botaoApagar);
		tela.add(campoNome);
		tela.add(caixaDeSelecaoItens);

		botaoCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e ){
				String nome = campoNome.getText();
				if(nome.isEmpty()){
					JOptionPane.showMessageDialog(null, "Informe um nome para cadastrar");
					return;
				}
				if(nome.length() < 3){
					JOptionPane.showMessageDialog(null, "O nome precisa ter no minimo 3 caracteres!");
				}
				caixaDeSelecaoItens.addItem(nome);
				campoNome.setText("");
				JOptionPane.showMessageDialog(null, nome + "Cadastrado com sucesso!");
			}

		});
		tela.setVisible(true);
	}
}