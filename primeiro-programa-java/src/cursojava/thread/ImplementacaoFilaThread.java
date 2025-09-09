package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {
	
	
	
	private static ConcurrentLinkedDeque<ObjetoFilaThread> pilha_fila =
							new ConcurrentLinkedDeque<ObjetoFilaThread>();
	
	
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	

	
	@Override
	public void run() {  
		
		
		System.out.println("Fila rodando");
		
		
		while (true) {
		
		
		
		synchronized (pilha_fila) {  /* Bloquear o acesso a esta lista por outros processos */
			
			
			Iterator iteracao = pilha_fila.iterator();
			while (iteracao.hasNext()) {  /* Enquanto conter dados na lista irá processar */
				
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/* Processar 10.0000 Notas Fiscais */
				/* Gerar uma lista enorme de PDF`s*/
				/* Gerar envio em massa de email */
				System.out.println("-----------------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
			
				iteracao.remove();
				
				try {
					Thread.sleep(1000);  /* Dar um tempo para descarga de memoria */
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				
				
				
		   }
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}	
	
		
		
		
			
	}
	
	

}
