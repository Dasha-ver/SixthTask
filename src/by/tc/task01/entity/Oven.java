import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance {

	private String allProperties;
	private float powerConsumption;
	private float weight;
	private float capacity;
	private float depth;
	private float height;
	private float width;

	public Oven(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public Oven(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] powerConsumptionValue = parseByComma[0].split("=");
		setPowerConsumption(Float.valueOf(powerConsumptionValue[1]));

		String[] weightValue = parseByComma[1].split("=");
		setWeight(Float.valueOf(weightValue[1]));

		String[] capacityValue = parseByComma[2].split("=");
		setCapacity(Float.valueOf(capacityValue[1]));

		String[] depthValue = parseByComma[3].split("=");
		setDepth(Float.valueOf(depthValue[1]));

		String[] heightValue = parseByComma[4].split("=");
		setHeight(Float.valueOf(heightValue[1]));

		String modified = parseByComma[5].replace(";", "");
		String[] widthValue = modified.split("=");
		setWidth(Float.valueOf(widthValue[1]));

	}

	public void print() {

		System.out.println(Oven.class.getSimpleName() + " " + SearchCriteria.Oven.POWER_CONSUMPTION.toString() + ":"
				+ getPowerConsumption() + " " + SearchCriteria.Oven.WEIGHT.toString() + ":" + getWeight() + " "
				+ SearchCriteria.Oven.CAPACITY.toString() + ":" + getCapacity() + " "
				+ SearchCriteria.Oven.DEPTH.toString() + ":" + getDepth() + " " + SearchCriteria.Oven.HEIGHT.toString()
				+ getHeight() + " " + SearchCriteria.Oven.WIDTH.toString() + ":" + getWidth());
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

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + Float.floatToIntBits(capacity);
		result = prime * result + Float.floatToIntBits(depth);
		result = prime * result + Float.floatToIntBits(height);
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
		Oven other = (Oven) obj;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (Float.floatToIntBits(capacity) != Float.floatToIntBits(other.capacity))
			return false;
		if (Float.floatToIntBits(depth) != Float.floatToIntBits(other.depth))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
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
		return "Oven [allProperties=" + allProperties + ", powerConsumption=" + powerConsumption + ", weight=" + weight
				+ ", capacity=" + capacity + ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
	}

}