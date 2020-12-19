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
        //System.out.println(element1.toString());

        Elements elements1 = element1.getAllElements();

        ArrayList<String> rama = new ArrayList<String>();

        //System.out.println(elements1.get(1));
        //System.out.println(element1.getElementById("loginLightbox"));
        //System.out.println(element1.getElementById("jakiesid").text());
        //System.out.println(element1.getElementsByIndexEquals(4));
        //System.out.println(element1.select("td").get(10).text());
        //System.out.println(element1.select("td").attr("class","base_txt").first());

        boolean nwm = false;

        for(int i = 0; i >= 0; i++) {

            try{
                rama.add(element1.getElementsByClass("InnerWfTitle").get(i).text());
            } catch (IndexOutOfBoundsException e) {
                break;
            }

        }

        System.out.println(rama);
    }

}
