package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {

		List<String> listForPrint = appliance.getlistWithResult();

		if (listForPrint.size() == 0) {
			System.out.println("Nothing found!");

		} else {
			for (String result : listForPrint) {
				System.out.println(result);
			}
		}
	}

}
