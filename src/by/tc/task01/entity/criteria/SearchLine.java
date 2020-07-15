package by.tc.task01.entity.criteria;

import java.util.Objects;

public class SearchLine {

	private String productForSearch;
	private int[] numbersOfLine;

	public SearchLine(String productForSearch) {

		this.productForSearch = productForSearch;
	}

	public int[] receiveNumbersOfLine() {

		switch (productForSearch) {

		case "Oven":
			numbersOfLine = new int[] { 1, 2, 3 };
			break;

		case "Laptop":
			numbersOfLine = new int[] { 5, 6, 7 };
			break;

		case "Refrigerator":
			numbersOfLine = new int[] { 9, 10, 11 };
			break;

		case "VacuumCleaner":
			numbersOfLine = new int[] { 13, 14, 15 };
			break;

		case "TabletPC":
			numbersOfLine = new int[] { 17, 18, 19 };
			break;

		case "Speakers":
			numbersOfLine = new int[] { 21, 22, 23 };
			break;
		}
		return numbersOfLine;
	}

	public String getProductForSearch() {
		return productForSearch;
	}

	public int[] getNumbersOfLine() {
		return numbersOfLine;
	}

	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (!(o instanceof SearchLine)) {
			return false;
		}

		SearchLine line = (SearchLine) o;
		return Objects.equals(getNumbersOfLine(), line.getNumbersOfLine())
				&& Objects.equals(getProductForSearch(), line.getProductForSearch());
	}

	public int hashCode() {
		return Objects.hash(getNumbersOfLine(), getProductForSearch());
	}

	public String toString() {
		return "Line{" + " " + "NumbersOfLine = " + numbersOfLine.toString() + " " + "ProductForSearch = "
				+ productForSearch + ".";

	}

}
