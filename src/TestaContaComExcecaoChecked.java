
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();

		try {
			c.deposita();	
		} catch (Exception e) {
			System.out.println("Minha Excecao");
		}

	}

}
