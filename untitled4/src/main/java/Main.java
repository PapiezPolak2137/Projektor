import org.jsoup.Jsoup;
import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Document doc = null;
        try{
            doc = Jsoup.connect("https://www.warframe.com/game/warframes").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element element1 = doc.getAllElements().first();

        Elements elements1 = element1.getAllElements();

        ArrayList<String> rama = new ArrayList<String>();

        for(int i = 0; i >= 0; i++) {

            try{
                rama.add(element1.getElementsByClass("InnerWfTitle").get(i).text().toUpperCase());
            } catch (IndexOutOfBoundsException e) {
                break;
            }

        }

        System.out.println(rama);
    }

}
