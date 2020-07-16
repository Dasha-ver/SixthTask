package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {

	private List<String> listWithResults = new ArrayList<String>();
	private String groupName;

	public Appliance() {

	}

	public Appliance(String groupName, List<String> listWithResults) {

		this.groupName = groupName;
		this.listWithResults = listWithResults;
	}

	public void receiveTypeOfAppliance() {

		switch (getGroupName()) {

			case "Oven":

				for (int i = 0; i < listWithResults.size(); i++) {

					Appliance oven = new Oven(listWithResults.get(i));
					oven.print();
				}
				break;

			case "Laptop":

				for (int i = 0; i < listWithResults.size(); i++) {

					Appliance laptop = new Laptop(listWithResults.get(i));
					laptop.print();
				}
				break;

			case "Refrigerator":

				for (int i = 0; i < listWithResults.size(); i++) {
					Appliance refrigerator = new Refrigerator(listWithResults.get(i));
					refrigerator.print();
				}
				break;

			case "VacuumCleaner":
				for (int i = 0; i < listWithResults.size(); i++) {
					Appliance vacuumCleaner = new VacuumCleaner(listWithResults.get(i));
					vacuumCleaner.print();
				}
				break;

			case "TabletPC":

				for (int i = 0; i < listWithResults.size(); i++) {
					Appliance tabletPC = new TabletPC(listWithResults.get(i));
					tabletPC.print();
				}
				break;

			case "Speakers":

				for (int i = 0; i < listWithResults.size(); i++) {
					Appliance speakers = new Speakers(listWithResults.get(i));
					speakers.print();
					break;
				}
		}
	}

	public void print() {
		// TODO Auto-generated method stub

	}

	public List<String> getListWithResults() {
		return listWithResults;

	}

	public String getGroupName() {
		return groupName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		result = prime * result + ((listWithResults == null) ? 0 : listWithResults.hashCode());
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
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		if (listWithResults == null) {
			if (other.listWithResults != null)
				return false;
		} else if (!listWithResults.equals(other.listWithResults))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Appliance [listWithResults=" + listWithResults + ", groupName=" + groupName + "]";
	}
}
