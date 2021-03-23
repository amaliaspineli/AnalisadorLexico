package analisador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class lexico {

	private JFrame frame;
	private JTextArea textField;
	public JTextArea jText;
	private JTextArea textField_1;
	
	JFileChooser jfileChooser;
	private static Frame tela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lexico window = new lexico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lexico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public boolean AnaliseLexica() throws Exception{
		jText = textField;	
		String expr = (String) jText.getText();
		boolean retorno = false;
		    
		    analisador.Lexer lexer = new analisador.Lexer(new StringReader(expr));
		    
		    String resultado="";
		    
		    while(true){
			Token token = lexer.yylex();
			if(token == null){
				textField_1.setText(resultado);
				return retorno;
			}
			switch(token){
			case erro:
				resultado = resultado + "Simbolo não encontrado.\n";
				break;
			case virgula:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
                break;
			case num:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case FinalLinha:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;	
			case AbParentese:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case FchParentese:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case AbColchete:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case FchColchete:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case AbChave:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case FchChave:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case se:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case senao:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case enquanto:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case para:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case caso:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case escreva:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case leia:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case retorna:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case atribuicao:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case comentario:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case Variavel:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case OpRelacional:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case OpMatematica:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case trigonometria:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case tipo:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case literal:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case break1:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case DoisPontos:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case aspas:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
			case switch1:
				resultado = resultado + "Token: " + token + " " + lexer.lexeme + "\n";
				break;
				
				default:
					resultado = resultado + "<DESCONHECIDO>" + lexer.lexeme + "\n";
			}
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodigoFonte = new JLabel("C\u00F3digo Fonte");
		lblCodigoFonte.setBounds(10, 21, 109, 14);
		frame.getContentPane().add(lblCodigoFonte);
		lblCodigoFonte.setFont(new java.awt.Font("Verdana", 1, 12));
		
		JLabel lblAnaliseLexica = new JLabel("An\u00E1lise L\u00E9xica");
		lblAnaliseLexica.setBounds(10, 314, 109, 14);
		frame.getContentPane().add(lblAnaliseLexica);
		lblAnaliseLexica.setFont(new java.awt.Font("Verdana", 1, 12));
		
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					AnaliseLexica();
				} catch (Exception e) {
					Logger.getLogger(lexico.class.getName()).log(Level.SEVERE, null, e);
				}
			}
		});
		btnAnalisar.setBounds(376, 587, 89, 23);
		frame.getContentPane().add(btnAnalisar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnLimpar.setBounds(276, 587, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 455, 267);
		frame.getContentPane().add(scrollPane);
		
		textField = new JTextArea();
		scrollPane.setViewportView(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 331, 472, 245);
		frame.getContentPane().add(scrollPane_1);
		
		textField_1 = new JTextArea();
		scrollPane_1.setViewportView(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnSair = new JMenu("Programa");
		menuBar.add(mnSair);
		
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();  
		        panel.setLayout(null);  
		        Object source;  
		        source = e.getSource();  
		        System.exit(0);
			}
		});
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexico.this.jfileChooser = new JFileChooser("testes");
				//lexico.this.escolherExtensao();
				int retorno = lexico.this.jfileChooser.showSaveDialog(null);
				if (retorno == 0) {
					String caminho = lexico.this.jfileChooser.getSelectedFile().getAbsolutePath();
					File file = new File(caminho);
					try {
						PrintWriter pw = new PrintWriter(new FileWriter(file));
						pw.println(lexico.this.textField.getText());
						pw.close();
					} catch (IOException e1) {
						System.err.printf("Erro na abertura do arquivo", e1.getMessage());
					}
				}
			}
		});
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexico.this.jfileChooser = new JFileChooser("testes");
				lexico.this.jfileChooser.setDialogTitle("Selecione um Arquivo");
				//lexico.this.escolherExtensao();
				int retorno = lexico.this.jfileChooser.showOpenDialog(lexico.tela);
				if (retorno == 0)
					try {
						@SuppressWarnings("resource")
						BufferedReader br = new BufferedReader(new FileReader(new File(lexico.this.jfileChooser.getSelectedFile().getAbsolutePath())));
						String textoAbrir = "";
						String linha;
						while ((linha = br.readLine()) != null) {
							textoAbrir = textoAbrir + linha + "\n";
						}
						lexico.this.textField.setText(textoAbrir);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			}
		});
		mnSair.add(mntmAbrir);
		mnSair.add(mntmSalvar);
		mnSair.add(mntmSair);
		
		JMenu mnTokens = new JMenu("Tokens");
		menuBar.add(mnTokens);
		
		JMenuItem mntmTabela = new JMenuItem("Tabela");
		mntmTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabela window = new tabela();
				window.frame1.setVisible(true);
				
			}
		});
		mnTokens.add(mntmTabela);
		
		JMenu mnSobre = new JMenu("Sobre");
		menuBar.add(mnSobre);
		
		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mntmCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sobre s = new sobre();
				s.setVisible(true);
			}
		});
		mnSobre.add(mntmCalculadora);
	}
}
