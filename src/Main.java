public class Main {

	public static void main(String[] args) {
		try {
			String main_path = "C:\\Users\\antonela.mrkalj\\git\\xml_generate\\TEST";
			FileManipulation filegenerate = new FileManipulation(main_path);
			filegenerate.startMetadataExtraction();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
