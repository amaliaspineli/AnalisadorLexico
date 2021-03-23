package analisador;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.Set;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class tabela {

	JFrame frame1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tabela window = new tabela();
					window.frame1.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the application.
	 */
	public tabela() {
		initialize();
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 1293, 598);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		frame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JLabel lblTabelaDeTokens = new JLabel("Tabela de Tokens");
		lblTabelaDeTokens.setBounds(10, 11, 190, 23);
		frame1.getContentPane().add(lblTabelaDeTokens);
		lblTabelaDeTokens.setFont(new java.awt.Font("Verdana", 1, 18));
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 45, 1257, 503);
		frame1.getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 1213, 481);
		panel.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"TOKEN", "LEXEMA", "EXPRESS\u00C3O REGULAR"},
				{"Variavel", "a, b, var, x1, y2", "Letra(Letra|Digito)"},
				{"FinalLinha", ";", ";"},
				{"DoisPontos", ":", ":"},
				{"aspas", "'", "'"},
				{"AbParentese", "(", "("},
				{"FchParentese", ")", ")"},
				{"AbColchete", "[", "["},
				{"FchColchete", "]", "]"},
				{"OpRelacional", "<, <=, >, >=, ==, !=", "( < | <= | > | >= | == | != )"},
				{"AbChave", "{", "{"},
				{"FchChave", "}", "}"},
				{"se", "se", "se"},
				{"senao", "senao", "senao"},
				{"num", "3.1416, -1, 10", "Digito.* | -Digito.*"},
				{"literal", "'exemplo1'", "Letra(Letra|Digito)"},
				{"enquanto", "enquanto", "enquanto"},
				{"para", "para", "para"},
				{"caso", "caso", "caso"},
				{"break", "break", "break"},
				{"switch", "switch", "switch"},
				{"escreva", "escreva", "escreva"},
				{"leia", "leia", "leia"},
				{"comentario", "//", "(//letra*|digito*)"},
				{"OpMatematica", "subtracao, divisao, multiplicacao, soma, raizquadrada, potencia, porcentagem, fatorial, logaritmo", "(subtracao | divisao | multiplicacao | soma | raizquadrada | potencia | porcentagem | fatorial | logaritmo)"},
				{"trigonometria", "cosseno, seno, tangente", "(cosseno | seno | tangente)"},
				{"retorna", "retorna", "retorna"},
				{"atribuicao", "=", "="},
				{"tipo", "int, double, string, float, bool", "(int | double| string | float | bool)"},
				{"virgula", ",", ","},
			},
			new String[] {
				"TOKEN", "LEXEMA", "EXPRESS\u00C3O REGULAR"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(0).setMinWidth(90);
		table.getColumnModel().getColumn(0).setMaxWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(510);
		table.getColumnModel().getColumn(1).setMinWidth(510);
		table.getColumnModel().getColumn(1).setMaxWidth(540);
		table.getColumnModel().getColumn(2).setPreferredWidth(510);
		table.getColumnModel().getColumn(2).setMinWidth(510);
		table.getColumnModel().getColumn(2).setMaxWidth(580);
	}
}
