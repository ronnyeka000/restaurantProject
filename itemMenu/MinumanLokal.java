package itemMenu;

import singleton.IdGenerator;

public class MinumanLokal extends Minuman{
	
	private IdGenerator genId;
	
	public MinumanLokal() {
		genId = IdGenerator.getInstance();
		this.setType("Minuman Lokal");
		
		this.setId("MIL-"+ genId.generateNum());
	}

}
