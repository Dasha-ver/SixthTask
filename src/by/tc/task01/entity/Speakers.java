package by.tc.task01.entity;

import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance {

	private String allProperties;
	private float powerConsumption;
	private float numberOfSpeakers;
	private String freaquencyRange;
	private float cordLength;

	public Speakers(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public Speakers(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] powerConsumptionValue = parseByComma[0].split("=");
		setPowerConsumption(Float.valueOf(powerConsumptionValue[1]));

		String[] numberOfSpeakersValue = parseByComma[1].split("=");
		setNumberOfSpeakers(Float.valueOf(numberOfSpeakersValue[1]));

		String[] freaquencyRangeValue = parseByComma[2].split("=");
		setFreaquencyRange(freaquencyRangeValue[1]);

		String modified = parseByComma[3].replace(";", "");
		String[] cordLengthValue = modified.split("=");
		setCordLength(Float.valueOf(cordLengthValue[1]));

	}

	public void print() {

		System.out.println(Speakers.class.getSimpleName() + " " + SearchCriteria.Speakers.POWER_CONSUMPTION.toString()
				+ ":" + getPowerConsumption() + " " + SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString() + ":"
				+ getNumberOfSpeakers() + " " + SearchCriteria.Speakers.FREQUENCY_RANGE.toString() + ":"
				+ getFreaquencyRange() + " " + SearchCriteria.Speakers.CORD_LENGTH.toString() + ":" + getCordLength());
	}

	public String getAllProperties() {
		return allProperties;
	}

	public float getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(float powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public float getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(float numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFreaquencyRange() {
		return freaquencyRange;
	}

	public void setFreaquencyRange(String freaquencyRange) {
		this.freaquencyRange = freaquencyRange;
	}

	public float getCordLength() {
		return cordLength;
	}

	public void setCordLength(float cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + Float.floatToIntBits(cordLength);
		result = prime * result + ((freaquencyRange == null) ? 0 : freaquencyRange.hashCode());
		result = prime * result + Float.floatToIntBits(numberOfSpeakers);
		result = prime * result + Float.floatToIntBits(powerConsumption);
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
		Speakers other = (Speakers) obj;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (Float.floatToIntBits(cordLength) != Float.floatToIntBits(other.cordLength))
			return false;
		if (freaquencyRange == null) {
			if (other.freaquencyRange != null)
				return false;
		} else if (!freaquencyRange.equals(other.freaquencyRange))
			return false;
		if (Float.floatToIntBits(numberOfSpeakers) != Float.floatToIntBits(other.numberOfSpeakers))
			return false;
		if (Float.floatToIntBits(powerConsumption) != Float.floatToIntBits(other.powerConsumption))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [allProperties=" + allProperties + ", powerConsumption=" + powerConsumption
				+ ", numberOfSpeakers=" + numberOfSpeakers + ", freaquencyRange=" + freaquencyRange + ", cordLength="
				+ cordLength + "]";
	}

}
