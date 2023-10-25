package bytebank_composto;

public class TestaBanco {

		public static void main(String[] args) {
			Cliente gabriel = new Cliente();
			gabriel.nome = "Gabriel Enrique";
			gabriel.cpf = "123.456.789-00";
			gabriel.profissao = "Estudante";
			
			Conta contaDoGabriel = new Conta();
			contaDoGabriel.deposita(100);
			
			contaDoGabriel.titular = gabriel;
			System.out.println(contaDoGabriel.titular.nome);
		}
}
