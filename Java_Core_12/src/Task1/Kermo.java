package Task1;

public class Kermo {

	public int diametr;
	public String material;

	public Kermo(int diametr, String material) {
		super();
		this.diametr = diametr;
		this.material = material;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Kermo [diametr=" + diametr + ", material=" + material + "]";
	}

}
