
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu Error!!!");
		}
		
		/*
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(con != null) {
				con.close();	
			}
		}
		*/

	}

}
