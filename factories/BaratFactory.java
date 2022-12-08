package factories;

import itemMenu.Makanan;
import itemMenu.MakananBarat;
import itemMenu.Minuman;
import itemMenu.MinumanBarat;

public class BaratFactory implements ItemMenuFactories{

	@Override
	public Makanan makeMakanan() {
		
		return new MakananBarat();
	}

	@Override
	public Minuman makeMinuman() {
		
		return new MinumanBarat();
	}

}
