import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main {
  public static void main(String[] args) {

    try {
      // creates a file object
      Path path = Paths.get("JavaFile.java");

      // deletes the file
      boolean value = Files.deleteIfExists(path);
      if(value) {
        System.out.println("JavaFile.java is successfully deleted.");
      }
      else {
        System.out.println("File doesn't exit");
      }
    } catch (Exception e) {
      e.getStackTrace();
    }

  }
}
