package by.tc.task01.entity;

import java.util.List;

public class Laptop extends Appliance {

	public Laptop(List<String> listWithResult) {
		super(listWithResult);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop []";
	}

}
