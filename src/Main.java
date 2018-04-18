
public class Main {

	public static void main(String[] args) {
		String[] params = new String[13];
		params[0] = "scimark.fft.small";
		params[1] = "-ict";
		params[2] = "-ikv";
		params[3] = "-crf";
		params[4] = "false";
		params[5] = "-bt";
		params[6] = "2";
		params[7] = "-wt";
		params[8] = "3";
		params[9] = "-i";
		params[10] = "1";
		params[11] = "-it";
		params[12] = "5";
		spec.harness.Launch.main(params);
	}
}
