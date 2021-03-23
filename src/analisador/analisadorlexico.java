package analisador;

import java.io.File;

public class analisadorlexico {
	public static void main(String[] args){
		String path = "C:\\Users\\amali\\workspace\\AnalisadorLexico\\src\\analisador\\Lexer.flex";
		GerarLexer(path);
	}

	private static void GerarLexer(String path) {
		File file = new File(path);
		JFlex.Main.generate(file);
		
	}

}
