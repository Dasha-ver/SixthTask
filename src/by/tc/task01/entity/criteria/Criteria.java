package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.Appliance;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	private String searchCriteria;

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		this.searchCriteria = searchCriteria;
		criteria.put(searchCriteria, value);
	}

	public String getSearchCriteria() {
		return searchCriteria;
	}

	public Map<String, Object> getCriteria() {

		return criteria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + ((groupSearchName == null) ? 0 : groupSearchName.hashCode());
		result = prime * result + ((searchCriteria == null) ? 0 : searchCriteria.hashCode());
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
		Criteria other = (Criteria) obj;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		if (groupSearchName == null) {
			if (other.groupSearchName != null)
				return false;
		} else if (!groupSearchName.equals(other.groupSearchName))
			return false;
		if (searchCriteria == null) {
			if (other.searchCriteria != null)
				return false;
		} else if (!searchCriteria.equals(other.searchCriteria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Criteria [groupSearchName=" + groupSearchName + ", criteria=" + criteria + ", searchCriteria="
				+ searchCriteria + "]";
	}

}
