
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creo un pollo!");
		Pollo pollo = new Pollo();
		
		if (pollo.saVolare()) {
			System.out.println("Il " + pollo.getNome() + " sa volare!");
		} else {
			System.out.println("Il " + pollo.getNome() + " non sa volare!");
		}
		
		System.out.println("Creo un pinguino!");
		Pinguino pinguino = new Pinguino();
		
		if (pinguino.saVolare()) {
			System.out.println("Il " + pinguino.getNome() + " sa volare!");
		} else {
			System.out.println("Il " + pinguino.getNome() + " non sa volare!");
		}

	}

}
