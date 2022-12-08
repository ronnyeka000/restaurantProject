package itemMenu;

import singleton.IdGenerator;

public class MakananLokal extends Makanan{
	
	private IdGenerator genId;

	public MakananLokal() {
		genId = IdGenerator.getInstance();
		this.setType("Makanan Lokal");
		this.setId("MAL-"+ genId.generateNum());
	}

}
