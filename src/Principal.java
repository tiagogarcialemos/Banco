public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pf = new PessoaFisica("TriadWorks", 7);
		CPF cpf = new CPF("65322878593");
		pf.setDocumento(cpf);
		
		PessoaJuridica pj = new PessoaJuridica("Handerson Frota", 32);
		CNPJ cnpj = new CNPJ("08478999000187");
		pj.setDocumento(cnpj);
		
		pj.imprimirDadosPessoa();
		pf.imprimirDadosPessoa();
		
		System.out.println(pj.getDocumento().getDocumentoComMascara());
		System.out.println(pf.getDocumento().getDocumentoComMascara());

	}

}
