public class PessoaJuridica {

	Pessoa pessoa;

	PessoaJuridica() {

	}

	PessoaJuridica(String nome, Integer idade) {
		this.pessoa = new Pessoa(nome, idade);
	}

	public String getNome() {
		return pessoa.getNome();
	}

	public void setNome(String nome) {
		pessoa.setNome(nome);
	}

	public Integer getIdade() {
		return pessoa.getIdade();
	}

	public void setIdade(Integer idade) {
		pessoa.setIdade(idade);
	}

	public Documento getDocumento() {
		return pessoa.getDocumento();
	}

	public void setDocumento(Documento documento) {
		pessoa.setDocumento(documento);
	}

	void imprimirDadosPessoa() {
		System.out.println("CNPJ: "
				+ this.getDocumento().getDocumentoComMascara());
		System.out.println("Empresa: " + this.getNome());
	}

}
