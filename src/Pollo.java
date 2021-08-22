
public class Pollo extends Uccello {
	
	private String nomeScientifico = "Gallus gallus domesticus";
	
	//peso in kg
	private float peso = 1.5f;

	//Il pollo non sa volare ne nuotare ma sa correre
	public Pollo() {
		super("Pollo",false,true,false);
	}
	
	public String getNomeScientifico() {
		return nomeScientifico;
	}
	
	public float getPeso() {
		return peso;
	}
	
}
