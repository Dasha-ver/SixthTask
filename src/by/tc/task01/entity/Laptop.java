package by.tc.task01.entity;

import java.util.List;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance {

	private String allProperties;
	private float batteryCapacity;
	private String OS;
	private float memoryROM;
	private float systemMemory;
	private float CPU;
	private float displayInches;

	public Laptop(String allProperties) {

		this.allProperties = allProperties;
		receiveProperties();
	}

	public Laptop(String groupName, List<String> listWithResults) {

		super(groupName, listWithResults);
	}

	private void receiveProperties() {

		String[] parseByComma = allProperties.split(",");

		String[] batteryCapacityValue = parseByComma[0].split("=");
		setBatteryCapacity(Float.valueOf(batteryCapacityValue[1]));

		String[] OSName = parseByComma[1].split("=");
		setOS(OSName[1]);

		String[] memoryROMValue = parseByComma[2].split("=");
		setMemoryROM(Float.valueOf(memoryROMValue[1]));

		String[] systemMemoryValue = parseByComma[3].split("=");
		setSystemMemory(Float.valueOf(systemMemoryValue[1]));

		String[] CPUValue = parseByComma[4].split("=");
		setCPU(Float.valueOf(CPUValue[1]));

		String modified = parseByComma[5].replace(";", "");
		String[] displayInchesValue = modified.split("=");
		setDisplayInches(Float.valueOf(displayInchesValue[1]));

	}

	public void print() {

		System.out.println(Laptop.class.getSimpleName() + " " + SearchCriteria.Laptop.BATTERY_CAPACITY.toString() + ":"
				+ getBatteryCapacity() + " " + SearchCriteria.Laptop.OS.toString() + ":" + getOS() + " "
				+ SearchCriteria.Laptop.MEMORY_ROM.toString() + ":" + getMemoryROM() + " "
				+ SearchCriteria.Laptop.SYSTEM_MEMORY.toString() + ":" + getSystemMemory() + " "
				+ SearchCriteria.Laptop.CPU.toString() + getCPU() + " " + SearchCriteria.Laptop.DISPLAY_INCHS.toString()
				+ ":" + getDisplayInches());
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

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public float getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(float memoryROM) {
		this.memoryROM = memoryROM;
	}

	public float getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(float systemMemory) {
		this.systemMemory = systemMemory;
	}

	public float getCPU() {
		return CPU;
	}

	public void setCPU(float cPU) {
		CPU = cPU;
	}

	public float getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(float displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(CPU);
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		result = prime * result + ((allProperties == null) ? 0 : allProperties.hashCode());
		result = prime * result + Float.floatToIntBits(batteryCapacity);
		result = prime * result + Float.floatToIntBits(displayInches);
		result = prime * result + Float.floatToIntBits(memoryROM);
		result = prime * result + Float.floatToIntBits(systemMemory);
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
		Laptop other = (Laptop) obj;
		if (Float.floatToIntBits(CPU) != Float.floatToIntBits(other.CPU))
			return false;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (allProperties == null) {
			if (other.allProperties != null)
				return false;
		} else if (!allProperties.equals(other.allProperties))
			return false;
		if (Float.floatToIntBits(batteryCapacity) != Float.floatToIntBits(other.batteryCapacity))
			return false;
		if (Float.floatToIntBits(displayInches) != Float.floatToIntBits(other.displayInches))
			return false;
		if (Float.floatToIntBits(memoryROM) != Float.floatToIntBits(other.memoryROM))
			return false;
		if (Float.floatToIntBits(systemMemory) != Float.floatToIntBits(other.systemMemory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [allProperties=" + allProperties + ", batteryCapacity=" + batteryCapacity + ", OS=" + OS
				+ ", memoryROM=" + memoryROM + ", systemMemory=" + systemMemory + ", CPU=" + CPU + ", displayInches="
				+ displayInches + "]";
	}

}