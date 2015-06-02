import javax.swing.text.MaskFormatter;


public class CPF implements Documento {

	private String cpf;
	
	public CPF(String cpf) {
		// TODO Auto-generated constructor stub
		this.cpf = cpf;
	}

	@Override
	public String getDocumentoComMascara() {
		// TODO Auto-generated method stub
		try {
			
			MaskFormatter maskFormatter = new  MaskFormatter("###.###.###-##");
			maskFormatter.setValueContainsLiteralCharacters(false);
			return maskFormatter.valueToString(this.cpf);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Não foi possivel adicionar a Mascara ao CPF");
		}
		
		return null;
		
	}

	@Override
	public String getDocumentoSemMascara() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

}
