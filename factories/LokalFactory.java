package factories;

import itemMenu.Makanan;
import itemMenu.MakananLokal;
import itemMenu.Minuman;
import itemMenu.MinumanLokal;

public class LokalFactory implements ItemMenuFactories{

	@Override
	public Makanan makeMakanan() {
		
		return new MakananLokal();
	}

	@Override
	public Minuman makeMinuman() {
		
		return new MinumanLokal();
	}

}
