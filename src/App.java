public class App {
    public static void main(String[] args) throws InterruptedException {

        VideoLoader RuTube = new ProxyRuTubeVideoLoader();
        RuTube.load("www.rutube.ru/cats");
        RuTube.load("www.rutube.ru/dogs");
        System.out.println("_________________");
        RuTube.load("www.rutube.ru/hamsters");
        System.out.println("_________________");
        RuTube.load("www.rutube.ru/hamsters");
    }
}