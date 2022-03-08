package br.com.generation.metodos;

public class testaCliente {


		public static void main(String[] args){
	     
	        
	        cliente c1 = new cliente();
	        
	        c1.nome = "Angela";
	        c1.cpf = 000000;
	        c1.idade = 24;
	        c1.sexo = 'F';
	        c1.saldo = 1500.00;
	        c1.valorProduto = 1400.00;
	        
	        
	        c1.pagamento(c1.valorProduto);
	        if (c1.saldoRestante < 0) {
	            System.out.println("Voce nao tem dinheiro suficiente.Saldo disponivel : R$" + c1.saldo);
	        }
	        else {
	            System.out.println("O saldo restante foi R$" + c1.saldoRestante);
	        c1.recebe();
		
	}

	    }
	}


