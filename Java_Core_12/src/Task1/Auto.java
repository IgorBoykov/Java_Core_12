package Task1;

public class Auto {

	public int horsePower;
	public int year;
	public Kermo kermo;
	public Engine engine;

	public Auto(int horsePower, int year, Kermo kermo, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.year = year;
		this.kermo = kermo;
		this.engine = engine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Kermo getKermo() {
		return kermo;
	}

	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [horsePower=" + horsePower + ", year=" + year + ", kermo=" + kermo + ", engine=" + engine + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + horsePower;
		result = prime * result + ((kermo == null) ? 0 : kermo.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (horsePower != other.horsePower)
			return false;
		if (kermo == null) {
			if (other.kermo != null)
				return false;
		} else if (!kermo.equals(other.kermo))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
}
