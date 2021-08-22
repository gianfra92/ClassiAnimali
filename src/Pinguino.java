
public class Pinguino extends Uccello{
	private String nomeScientifico = "Spheniscidae";
	private float peso = 1.5f;

	// Il pinguino non sa volare ne correre ma sa nuotare
	public Pinguino() {
		super("Pinguino",false,false,true);
	}

	public String getNomeScientifico() {
		return nomeScientifico;
	}
	
	public float getPeso() {
		return peso;
	}
}
