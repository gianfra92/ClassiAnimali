
public class Uccello extends Animale {

	private String classe = "Aves";
	private boolean vola;
	private boolean corre;
	private boolean nuota;
	
	public Uccello(String nome, boolean vola, boolean corre, boolean nuota) {
		super(nome,2);
		this.vola = vola;
		this.corre = corre;
		this.nuota = nuota;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public boolean saVolare() {
		return vola;
	}
	
	public boolean saCorrere() {
		return corre;
	}
	
	public boolean saNuotare() {
		return nuota;
	}
	
}
