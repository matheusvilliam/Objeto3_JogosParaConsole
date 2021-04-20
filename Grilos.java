
public class Grilos  extends Thread{

	private String nome;
	float pulo, distanciaPercorrida;
	int grupo, qtdPulos, distanciaTotal = 300;
	
	public Grilos (String nome, int grupo) {
		this.nome=nome;
		this.grupo=grupo;
		start();
	}
	
	public void run() {
		
		while (distanciaPercorrida < distanciaTotal) {
			
			try {
				
					pulo = Math.round(Math.random() * 50);
					distanciaPercorrida += pulo;
					qtdPulos++;
					System.out.println(nome + " pulou " + pulo + "cm e j� percorreu " + distanciaPercorrida + "cm");	
					Thread.sleep(1000);
					
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		
		Main.position++;
		System.out.println("O " + nome + " foi o " + Main.position + "� colocado com " + qtdPulos + " pulos ");
		
		if(grupo == 1) {
			Main.somaPulosGrupo1 += qtdPulos;
			Main.somaDistanciaGrupo1 += distanciaPercorrida;
		}
		
		if(grupo == 2) {
			Main.somaPulosGrupo2 += qtdPulos;
			Main.somaDistanciaGrupo2 += distanciaPercorrida;
		}
		
		if(Main.position == 6) {
			System.out.println("Time 1: Total de Pulos: " + Main.somaPulosGrupo1 + " - Dist�ncia Percorrida: " + Main.somaDistanciaGrupo1);
			System.out.println("Time 2: Total de Pulos: " + Main.somaPulosGrupo2 + " - Dist�ncia Percorrida: " + Main.somaDistanciaGrupo2);
			
			if(Main.somaPulosGrupo1 < Main.somaPulosGrupo2) {
				System.out.println("Time 1 foi o vencedor");
			}else {
				System.out.println("Time 2 foi o vencedor");
			}
		}
	}
	
}

