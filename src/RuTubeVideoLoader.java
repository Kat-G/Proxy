import java.util.ArrayList;

public class RuTubeVideoLoader implements VideoLoader{
    String url;
    ArrayList<String> playList;

    public RuTubeVideoLoader() {
        playList = new ArrayList<String>();
    }

    @Override
    public String load(String url) throws InterruptedException {
        if(playList.indexOf(url) == -1){
            playList.add(url);
        }
        System.out.println("Загрузка с сервера "+url);
        Thread.sleep(1000);
        return playList.get(playList.indexOf(url));
    }
}
