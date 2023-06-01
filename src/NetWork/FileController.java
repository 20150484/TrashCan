package NetWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileController {
	
	
    public static void FileSet(int i) throws IOException {
        int key = i;
        String str = Integer.toString(key);
        OutputStream output = new FileOutputStream("bookmark.txt");
        byte[] by = str.getBytes();
        output.write(by);
     }
     public static int FileRead() throws IOException {
    	 Path path = Paths.get("bookmark.txt");
         String content = Files.readString(path);
         int key = Integer.parseInt(content);
        return key;
     }
}
