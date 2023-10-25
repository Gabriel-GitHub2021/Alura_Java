package bytebank;

public class testaMetodo {

		public static void main(String[] args) {
			Conta contaDoGabriel = new Conta();
			contaDoGabriel.saldo = 100;
			contaDoGabriel.deposita(50);
			System.out.println(contaDoGabriel.saldo);
			
			boolean conseguiuRetirar = contaDoGabriel.saca(20);
			System.out.println(contaDoGabriel.saldo);
			System.out.println(conseguiuRetirar);
			
			Conta contaDoNilson = new Conta();
			contaDoNilson.deposita(1000);
			
			if (contaDoNilson.transfere(300, contaDoGabriel)) {
				System.out.println("Transferência feita com sucesso!");
			} else {
				System.out.println("Transferência recusada!");
			}
			System.out.println(contaDoNilson.saldo);
			System.out.println(contaDoGabriel.saldo);
			
			contaDoGabriel.titular = "Gabriel Enrique";
			System.out.println(contaDoGabriel.titular);
		}
}
