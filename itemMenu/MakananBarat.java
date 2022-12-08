package itemMenu;

import singleton.IdGenerator;

public class MakananBarat extends Makanan{
	
	private IdGenerator genId;
	
	public MakananBarat() {
		genId = IdGenerator.getInstance();
		
		this.setType("Makanan Barat");
		this.setId("MAB-"+ genId.generateNum());
	}

}
