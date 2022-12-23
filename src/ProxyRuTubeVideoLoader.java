import java.util.ArrayList;
import java.util.List;

public class ProxyRuTubeVideoLoader implements VideoLoader {
    String url;
    RuTubeVideoLoader ruTubeVideoLoader;
    ArrayList<String> playList;

    public ProxyRuTubeVideoLoader() {
        playList = new ArrayList<String>();
        ruTubeVideoLoader = new RuTubeVideoLoader();

        playList.add("www.rutube.ru/cats");
        playList.add("www.rutube.ru/dogs");
    }

    @Override
    public String load(String url) throws InterruptedException {
        if(playList.indexOf(url) == -1) {
            playList.add(ruTubeVideoLoader.load(url));
        }
        System.out.println("Загрузка из кэша "+url);
        Thread.sleep(500);
        System.out.println("Загружено "+url);
        return playList.get(playList.indexOf(url));
    }
}
