package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public Appliance find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new ServiceException("Not valid criteria!");
		}

		DAOFactory factory;
		ApplianceDAO applianceDAO;
		Appliance appliance = null;

		try {

			factory = DAOFactory.getInstance();
			applianceDAO = factory.getApplianceDAO();
			appliance = applianceDAO.find(criteria);

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		if (appliance == null) {

			throw new ServiceException("Not valid criteria!");
		}

		return appliance;
	}

}
