package itemMenu;

public abstract class Minuman extends ItemMenu{
	
	private boolean isHot;
	private boolean addIce;
	
	public boolean isHot() {
		return isHot;
	}
	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}
	public boolean isAddIce() {
		return addIce;
	}
	public void setAddIce(boolean addIce) {
		this.addIce = addIce;
	}
	
	

}
