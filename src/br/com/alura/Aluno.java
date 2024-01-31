package br.com.alura;

public class Aluno {

	private String nome;
	private String cpf;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {

		if(nome == null) {
			throw new NullPointerException("nome n pode ser nulo"); 
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}



	public String getCpf() {
		return cpf;
	}



	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

	//sempre que sobrescrever o equals, deve reescrever o hascode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	    Aluno outroAluno = (Aluno) obj;
	    return this.nome.equals(outroAluno.nome);
	}

	

}
