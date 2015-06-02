import java.text.ParseException;

import javax.swing.text.MaskFormatter;


public class CNPJ implements Documento {

	private String cnpj;
	
	public CNPJ(String cnpj) {
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
	}
	
	

	@Override
	public String getDocumentoComMascara() {
		// TODO Auto-generated method stub
		try {
		
			MaskFormatter maskFormatter = new  MaskFormatter("##.###.###/####-##");
			maskFormatter.setValueContainsLiteralCharacters(false);
			return maskFormatter.valueToString(this.cnpj);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Não foi possivel adicionar a Mascara ao CNPJ");
		}
		
		return null;
		
		
	}



	@Override
	public String getDocumentoSemMascara() {
		// TODO Auto-generated method stub
		return this.cnpj;
	}

}
