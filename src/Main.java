import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> player = new HashMap<>();
        player.put("飯田", "3秒04");
        player.put("蛙吹", "5秒58");
        player.put("麗日", "7秒15");
        player.put("爆豪", "4秒13");
        player.put("緑谷", "7秒02");

        System.out.println("50m走順位結果");
        player.entrySet().stream().sorted(java.util.Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}