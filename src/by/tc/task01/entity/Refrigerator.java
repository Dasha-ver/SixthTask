package by.tc.task01.entity;

import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance {

	private String allProperties;
	private float powerConsumption;
	private float weight;
	private float freezerCapacity;
	private float overAllCapacity;
	private float height;
	private float width;

	public Refrigerator(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public Refrigerator(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] powerConsumptionValue = parseByComma[0].split("=");
		setPowerConsumption(Float.valueOf(powerConsumptionValue[1]));

		String[] weightValue = parseByComma[1].split("=");
		setWeight(Float.valueOf(weightValue[1]));

		String[] freezerCapacityValue = parseByComma[2].split("=");
		setFreezerCapacity(Float.valueOf(freezerCapacityValue[1]));

		String[] overAllCapacityValue = parseByComma[3].split("=");
		setOverAllCapacity(Float.valueOf(overAllCapacityValue[1]));

		String[] heightValue = parseByComma[4].split("=");
		setHeight(Float.valueOf(heightValue[1]));

		String modified = parseByComma[5].replace(";", "");
		String[] widthValue = modified.split("=");
		setWidth(Float.valueOf(widthValue[1]));

	}

	public void print() {

		System.out.println(
				Refrigerator.class.getSimpleName() + " " + SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()
						+ ":" + getPowerConsumption() + " " + SearchCriteria.Refrigerator.WEIGHT.toString() + ":"
						+ getWeight() + " " + SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString() + ":"
						+ getFreezerCapacity() + " " + SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString() + ":"
						+ getOverAllCapacity() + " " + SearchCriteria.Oven.HEIGHT.toString() + getHeight() + " "
						+ SearchCriteria.Oven.WIDTH.toString() + ":" + getWidth());
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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(float freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public float getOverAllCapacity() {
		return overAllCapacity;
	}

	public void setOverAllCapacity(float overAllCapacity) {
		this.overAllCapacity = overAllCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + Float.floatToIntBits(freezerCapacity);
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + Float.floatToIntBits(overAllCapacity);
		result = prime * result + Float.floatToIntBits(powerConsumption);
		result = prime * result + Float.floatToIntBits(weight);
		result = prime * result + Float.floatToIntBits(width);
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
		Refrigerator other = (Refrigerator) obj;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (Float.floatToIntBits(freezerCapacity) != Float.floatToIntBits(other.freezerCapacity))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (Float.floatToIntBits(overAllCapacity) != Float.floatToIntBits(other.overAllCapacity))
			return false;
		if (Float.floatToIntBits(powerConsumption) != Float.floatToIntBits(other.powerConsumption))
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [allProperties=" + allProperties + ", powerConsumption=" + powerConsumption + ", weight="
				+ weight + ", freezerCapacity=" + freezerCapacity + ", overAllCapacity=" + overAllCapacity + ", height="
				+ height + ", width=" + width + "]";
	}

}