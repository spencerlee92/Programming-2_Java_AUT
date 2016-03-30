import java.io.File;

public class FileTester {
	
	public void  readDirectoryContents(File file) {
		File files[] = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
			if (f.isDirectory()) {
				readDirectoryContents(f);
			}
		}
	}

	public static void fileStats(String filename) {
		File file = new File(filename);
		if (file.exists()) {
			System.out.println("Location: " + file.getAbsolutePath());
			System.out.println("File name: " + file.getName());
			if (file.isFile()) {
				System.out.println("Size: " + file.length() + " Bytes");
			}
			if (file.isDirectory()) {
				File[] contents = file.listFiles();
				for (File f : contents)
					System.out.println(f.getName());
			}
		}

	}

	public static void main() {
		fileStats("H:/prog2/textfile.txt");
	}
}
