package aplication;

import entities.NotaFinal;
import java.util.*;

public class TesteAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		NotaFinal aluno = new NotaFinal();
		
		aluno.Nota1 = 17.00;
		aluno.Nota2 = 20.00;
		aluno.Nota3 = 15.00;

		aluno.MediaFinal();
	}
}
