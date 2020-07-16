package by.tc.task01.entity;

import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner extends Appliance {

	private String allProperties;
	private float powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private float motorSpeedRegulation;
	private float cleaningWidth;

	public VacuumCleaner(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public VacuumCleaner(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] powerConsumptionValue = parseByComma[0].split("=");
		setPowerConsumption(Float.valueOf(powerConsumptionValue[1]));

		String[] filterTypeValue = parseByComma[1].split("=");
		setFilterType(filterTypeValue[1]);

		String[] bagTypeValue = parseByComma[2].split("=");
		setBagType(bagTypeValue[1]);

		String[] wandTypeValue = parseByComma[3].split("=");
		setWandType(wandTypeValue[1]);

		String[] motorSpeedRegulationValue = parseByComma[4].split("=");
		setMotorSpeedRegulation(Float.valueOf(motorSpeedRegulationValue[1]));

		String modified = parseByComma[5].replace(";", "");
		String[] cleaningWidthValue = modified.split("=");
		setCleaningWidth(Float.valueOf(cleaningWidthValue[1]));

	}

	public void print() {

		System.out.println(
				VacuumCleaner.class.getSimpleName() + " " + SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()
						+ ":" + getPowerConsumption() + " " + SearchCriteria.VacuumCleaner.FILTER_TYPE.toString() + ":"
						+ getFilterType() + " " + SearchCriteria.VacuumCleaner.BAG_TYPE.toString() + ":" + getBagType()
						+ " " + SearchCriteria.VacuumCleaner.WAND_TYPE.toString() + ":" + getWandType() + " "
						+ SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString() + getMotorSpeedRegulation()
						+ " " + SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString() + ":" + getCleaningWidth());
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

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public float getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(float motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public float getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(float cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + Float.floatToIntBits(cleaningWidth);
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + Float.floatToIntBits(motorSpeedRegulation);
		result = prime * result + Float.floatToIntBits(powerConsumption);
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (Float.floatToIntBits(cleaningWidth) != Float.floatToIntBits(other.cleaningWidth))
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (Float.floatToIntBits(motorSpeedRegulation) != Float.floatToIntBits(other.motorSpeedRegulation))
			return false;
		if (Float.floatToIntBits(powerConsumption) != Float.floatToIntBits(other.powerConsumption))
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [allProperties=" + allProperties + ", powerConsumption=" + powerConsumption
				+ ", filterType=" + filterType + ", bagType=" + bagType + ", wandType=" + wandType
				+ ", motorSpeedRegulation=" + motorSpeedRegulation + ", cleaningWidth=" + cleaningWidth + "]";
	}

}