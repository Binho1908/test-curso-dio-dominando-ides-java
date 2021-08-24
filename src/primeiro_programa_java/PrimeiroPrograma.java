package primeiro_programa_java;

import primeiro_programa_java.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("tulin", "regis", 15);
		Livros livros = new Livros();
		System.out.println(gato);
	}

}

class Livros {
	private String nome;
	private String npag;
}
