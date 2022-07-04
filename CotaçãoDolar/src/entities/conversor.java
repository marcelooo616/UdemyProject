package entities;

public class conversor {

	// public static double cotacaoDolar;
	// public static double Dolar;
	public static final double IOF = 6.38;

	public static double Converter(double cotacaoDolar, double Dolar) {

		double convert = Dolar * cotacaoDolar;
		double dd = IOF / 100;
		double result = convert * dd;
		convert += result;
		return convert;
	}

	public static double iof() {

		double iof = IOF / 100;
		return iof;

	};

}
