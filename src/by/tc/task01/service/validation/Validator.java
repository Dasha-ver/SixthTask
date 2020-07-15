package by.tc.task01.service.validation;

import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		if (criteria.getGroupSearchName().equals(Oven.class.getSimpleName())) {
			SearchCriteria.Oven[] properties = SearchCriteria.Oven.values();
			for (SearchCriteria.Oven name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}
			}
		}

		if (criteria.getGroupSearchName().equals(Laptop.class.getSimpleName())) {
			SearchCriteria.Laptop[] properties = SearchCriteria.Laptop.values();
			for (SearchCriteria.Laptop name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}

			}
		}

		if (criteria.getGroupSearchName().equals(TabletPC.class.getSimpleName())) {
			SearchCriteria.TabletPC[] properties = SearchCriteria.TabletPC.values();
			for (SearchCriteria.TabletPC name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}
			}
		}

		if (criteria.getGroupSearchName().equals(Refrigerator.class.getSimpleName())) {
			SearchCriteria.Refrigerator[] properties = SearchCriteria.Refrigerator.values();
			for (SearchCriteria.Refrigerator name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}
			}
		}

		if (criteria.getGroupSearchName().equals(Speakers.class.getSimpleName())) {
			SearchCriteria.Speakers[] properties = SearchCriteria.Speakers.values();
			for (SearchCriteria.Speakers name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}
			}
		}

		if (criteria.getGroupSearchName().equals(VacuumCleaner.class.getSimpleName())) {
			SearchCriteria.VacuumCleaner[] properties = SearchCriteria.VacuumCleaner.values();
			for (SearchCriteria.VacuumCleaner name : properties) {
				if (criteria.getSearchCriteria().equals(name.toString())) {
					return true;
				}
			}
		}

		return false;

	}
}

