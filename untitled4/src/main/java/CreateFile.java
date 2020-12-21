import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main() {
        try {
            File myObj = new File("Lista.txt");
            if (myObj.createNewFile()) {
                System.out.println("Plik utworzony: " + myObj.getName());
            } else {
                System.out.println("Plik już istnieje");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd");
            e.printStackTrace();
        }
    }
}