package com.kumar.Work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.math.BigDecimal;

import com.kumar.Work.RemoveDuplicate;

public class RemoveDuplicate {

	public static void method(ArrayList<String> f) throws IOException, ClassNotFoundException {

		
		RemoveDuplicate red = new RemoveDuplicate();

		System.out.println("\n\n");

		Object[] st = f.toArray();
		for (Object s : st) {
			if (f.indexOf(s) != f.lastIndexOf(s)) {
				f.remove(f.lastIndexOf(s));
				for (String str : f) {
					System.out.println("Distinct List " + str);
				}
			}

		}

		System.out.println("distinct elements");

		ArrayList<String> validFail = new ArrayList<String>();

		String value2[] = f.toArray(new String[f.size()]);

		for (String mack : value2) {
			String[] value = mack.split(",");

			BigDecimal bigDecimalCurrency1 = new BigDecimal(value[3]);
			BigDecimal bigDecimalCurrency2 = new BigDecimal(value[4]);
			BigDecimal bigDecimalCurrency3 = bigDecimalCurrency1.add(bigDecimalCurrency2);
			BigDecimal bigDecimalCurrency4 = new BigDecimal(value[5]);

			if (bigDecimalCurrency3.equals(bigDecimalCurrency4)) {

				System.out.println("\nRecord \nTransaction Reference : " + value[0]);

				System.out.println("Description: " + value[2]);

				 
			} else if (bigDecimalCurrency3 != bigDecimalCurrency4) {

				validFail.add("\nRecord\nTransaction Reference : " + value[0] + "\nAccount Number : " + value[1]
						+ "\nDescription  : " + value[2] + "\nstartBalance : " + value[3] + "\nEndBalance : " + value[4]
						+ "\nEnd Balance : " + value[5]);

			}

		}

		for (String s1 : validFail) {

			System.out.println("failed records" + s1);
			

		}

		
	}

}
