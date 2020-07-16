package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchLine;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApplianceDAOImpl implements ApplianceDAO {

    private SearchLine line;
    private List<String> listWithResults;

    @Override
    public Appliance find(Criteria criteria) throws DAOException {

        FileReader reader = null;
        line = new SearchLine(criteria.getGroupSearchName());
        int[] numbersOfLine = line.receiveNumbersOfLine();
        listWithResults = new ArrayList<String>();
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
                            listWithResults.add(lineForRead);

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

        return new Appliance(criteria.getGroupSearchName(), listWithResults);
    }

    public SearchLine getLine() {
        return line;
    }

    public List<String> getListWithResults() {
        return listWithResults;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((line == null) ? 0 : line.hashCode());
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
        ApplianceDAOImpl other = (ApplianceDAOImpl) obj;
        if (line == null) {
            if (other.line != null)
                return false;
        } else if (!line.equals(other.line))
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
        return "ApplianceDAOImpl [line=" + line + ", listWithResults=" + listWithResults + "]";
    }
}