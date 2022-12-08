package itemMenu;

import singleton.IdGenerator;

public class MinumanBarat extends Minuman{
	
	private IdGenerator genId;

	public MinumanBarat() {
		genId = IdGenerator.getInstance();
		
		this.setType("Minuman Barat");
		this.setId("MIB-"+ genId.generateNum());
	}

}
