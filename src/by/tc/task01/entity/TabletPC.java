package by.tc.task01.entity;

import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance {

	private String allProperties;
	private float batteryCapacity;
	private float displayInches;
	private float memoryROM;
	private float flashMemoryCapacity;
	private String color;

	public TabletPC(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public TabletPC(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] batteryCapacityValue = parseByComma[0].split("=");
		setBatteryCapacity(Float.valueOf(batteryCapacityValue[1]));

		String[] displayInchesValue = parseByComma[1].split("=");
		setDisplayInches(Float.valueOf(displayInchesValue[1]));

		String[] memoryROMValue = parseByComma[2].split("=");
		setMemoryROM(Float.valueOf(memoryROMValue[1]));

		String[] flashMemoryCapacityValue = parseByComma[3].split("=");
		setFlashMemoryCapacity(Float.valueOf(flashMemoryCapacityValue[1]));

		String modified = parseByComma[4].replace(";", "");
		String[] colorValue = modified.split("=");
		setColor(colorValue[1]);

	}

	public void print() {

		System.out.println(TabletPC.class.getSimpleName() + " " + SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()
				+ ":" + getBatteryCapacity() + " " + SearchCriteria.TabletPC.DISPLAY_INCHES.toString() + ":"
				+ getDisplayInches() + " " + SearchCriteria.TabletPC.MEMORY_ROM.toString() + ":" + getMemoryROM() + " "
				+ SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString() + ":" + getFlashMemoryCapacity() + " "
				+ SearchCriteria.TabletPC.COLOR.toString() + ":" + getColor());
	}

	public String getAllProperties() {
		return allProperties;
	}

	public float getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(float batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public float getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(float displayInches) {
		this.displayInches = displayInches;
	}

	public float getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(float memoryROM) {
		this.memoryROM = memoryROM;
	}

	public float getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(float flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + Float.floatToIntBits(batteryCapacity);
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(displayInches);
		result = prime * result + Float.floatToIntBits(flashMemoryCapacity);
		result = prime * result + Float.floatToIntBits(memoryROM);
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
		TabletPC other = (TabletPC) obj;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (Float.floatToIntBits(batteryCapacity) != Float.floatToIntBits(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Float.floatToIntBits(displayInches) != Float.floatToIntBits(other.displayInches))
			return false;
		if (Float.floatToIntBits(flashMemoryCapacity) != Float.floatToIntBits(other.flashMemoryCapacity))
			return false;
		if (Float.floatToIntBits(memoryROM) != Float.floatToIntBits(other.memoryROM))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [allProperties=" + allProperties + ", batteryCapacity=" + batteryCapacity + ", displayInches="
				+ displayInches + ", memoryROM=" + memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity
				+ ", color=" + color + "]";
	}

}