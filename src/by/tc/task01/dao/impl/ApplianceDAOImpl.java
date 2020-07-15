package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchLine;

public class ApplianceDAOImpl implements ApplianceDAO {

	private SearchLine line;
	private String result = " ";
	private List<String> listWithResult;

	@Override
	public Appliance find(Criteria criteria) throws DAOException {

		FileReader reader = null;
		line = new SearchLine(criteria.getGroupSearchName());
		int[] numbersOfLine = line.receiveNumbersOfLine();
		listWithResult = new ArrayList<String>();
		Map<String, Object> criteriaForSearch = criteria.getCriteria();

		try {

			reader = new FileReader("resources/appliances_db.txt");
			BufferedReader br = new BufferedReader(reader);
			String lineForRead = "";
			int lineCounter = 0;

			while ((lineForRead = br.readLine()) != null) {
				lineCounter++;
				for (Entry<String, Object> item : criteriaForSearch.entrySet()) {
					for (int i = 0; i < numbersOfLine.length; i++) {

						if (lineCounter == numbersOfLine[i]
								&& lineForRead.contains(item.getKey() + "=" + item.getValue().toString() + ",")
								&& lineForRead.contains(
										item.getKey() + "=" + item.getValue().toString().toUpperCase() + ",")) {
							listWithResult.add(lineForRead);

						}
					}

				}
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);

		} catch (Exception e) {
			throw new DAOException(e);

		} finally {

			if (reader != null) {
				try {

					reader.close();

				} catch (Exception e) {
					// log - error
					System.err.println(e);

				}
			}
		}

		return new Appliance(listWithResult);
	}

	public SearchLine getLine() {
		return line;
	}

	public void setLine(SearchLine line) {
		this.line = line;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<String> getListWithResult() {
		return listWithResult;
	}

	public void setListWithResult(List<String> listWithResult) {
		this.listWithResult = listWithResult;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((line == null) ? 0 : line.hashCode());
		result = prime * result + ((listWithResult == null) ? 0 : listWithResult.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
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
		ApplianceDAOImpl other = (ApplianceDAOImpl) obj;
		if (line == null) {
			if (other.line != null)
				return false;
		} else if (!line.equals(other.line))
			return false;
		if (listWithResult == null) {
			if (other.listWithResult != null)
				return false;
		} else if (!listWithResult.equals(other.listWithResult))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApplianceDAOImpl [line=" + line + ", result=" + result + ", listWithResult=" + listWithResult + "]";
	}

}
