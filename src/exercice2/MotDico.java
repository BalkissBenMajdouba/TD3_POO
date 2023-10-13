package exercice2;

public class MotDico {
	private int num;
	private static int count=0;
	private String mot;
	private String definition;
	
	
	public MotDico(String mot, String definition) {
		this.num=count++;
		this.mot = mot;
		this.definition = definition;
	}
	public String getMot() {
		return mot;
	}
	public String getDefinition() {
		return definition;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public boolean Syno(MotDico m) {
	    return this.definition.equals(m.getDefinition());
	}
	@Override
	public String toString() {
		return "MotDico [num=" + num + ", mot=" + mot + ", definition=" + definition + "]";
	}
	
	

	
	
}
