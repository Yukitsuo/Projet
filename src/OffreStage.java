
public class OffreStage {
	private int id;
	private String descriptif;
	private String titre;
	private String dateDeb;
	private double duree;
	
	
	public OffreStage(int id, String descriptif, String titre, String dateDeb, double duree) {
		this.id = id;
		this.descriptif = descriptif;
		this.titre = titre;
		this.dateDeb = dateDeb;
		this.duree = duree;
	}


	public int getId() {
		return id;
	}

	public String getDescriptif() {
		return descriptif;
	}




	public String getTitre() {
		return titre;
	}




	public String getDateDeb() {
		return dateDeb;
	}




	public double getDurée() {
		return duree;
	}



}
