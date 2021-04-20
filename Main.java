
public class Main {

	static int grilosPorGrupo = 3;
	static int position;
	static int somaPulosGrupo1, somaPulosGrupo2;
	static int somaDistanciaGrupo1, somaDistanciaGrupo2;
	
	public static void main(String[] args) {
		

		for (int i=0; i<grilosPorGrupo; i++) {

			Grilos grupo1 = new Grilos("Grilo_"+ i, 1);
			Grilos grupo2 = new Grilos("Grilo_"+ (grilosPorGrupo + i), 2);
		}
	}

}
