package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {

	private List<String> listWithResult = new ArrayList<String>();

	public Appliance(List<String> listWithResult) {
		this.listWithResult = listWithResult;
	}

	public List<String> getlistWithResult() {
		return listWithResult;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listWithResult == null) ? 0 : listWithResult.hashCode());
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
		Appliance other = (Appliance) obj;
		if (listWithResult == null) {
			if (other.listWithResult != null)
				return false;
		} else if (!listWithResult.equals(other.listWithResult))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [listWithResult=" + listWithResult + "]";
	}

}
