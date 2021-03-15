package TaskPackage;

import java.text.DecimalFormat;

public class Converter {

	public String convert(double input) {
		DecimalFormat decimalFormat = new DecimalFormat("0.##");
		double res = (input * 1.609344 / 4.54609188);
		return decimalFormat.format(res);
	}
}