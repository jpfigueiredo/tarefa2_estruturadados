public class Principal {

	public static void main(String[] args) {
		Listaligada lista = new Listaligada();
		Listaligada listaprioridade = new Listaligada();
		
        
        
        for(int i=1; i <= 200; i++){
            lista.adicionar(i);
        }
        
        System.out.println("Todos da fila:");
        
        for(int i=0; i<=200 ; i++) {
        	
        }
        
        	
        	
        	
        	
        for (int i=1; i<=100; i+=2) {
        
        	if (i%2!=0) { //VALIDA SE É IMPAR
        		
        		listaprioridade.adicionar(i); // ADICIONA A LISTA DE PRIORIDADE
        		lista.remover(i); //REMOVE DA LISTA NORMAL 
        			
        	}
        }
        
        
        System.out.println("Fila de Prioridade: "); // IMPRIME A LISTA DE PRIORIDADE        
        for(int i=0; i < listaprioridade.getTamanho(); i++) {
        	
        }
        
        }
        
    }

