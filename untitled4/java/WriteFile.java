import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public static void main(ArrayList x) {
        try {
            FileWriter myWriter = new FileWriter("Lista.txt");
            myWriter.write("Lista postaci" + "\n");
            for(int i =0; i < 75;i++){
                myWriter.write("---" + "\n");
                myWriter.write(x.get(i).toString() + "\n");
            }

            myWriter.close();
            System.out.println("Zapis udany");
        } catch (IOException e) {
            System.out.println("Błąd");
            e.printStackTrace();
        }
    }
}