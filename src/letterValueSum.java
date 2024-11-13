import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class letterValueSum {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("enable1.txt"));
            String line;

            HashMap<Integer, Integer> map = new HashMap<>();

            while ((line = br.readLine()) != null) {
                map.compute(letterSum(line), (key, value) -> (value == null) ? 1 : value + 1);
            }
            br.close();


            System.out.println("Num: " + maxKey(map) + " Occurances: " + map.get(maxKey(map)));

        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }

    public static Integer letterSum(String str) {
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            ans += (str.charAt(i) - 'a' + 1);
        }

        return ans;
    }

    public static Integer maxKey (HashMap<Integer, Integer> map) {
        int maxKey = 0;
        int maxValue = 0;

        for (int i : map.keySet()) {
            if (map.get(i) > maxValue) {
                maxKey = i;
                maxValue = map.get(i);
            }
        }

        return maxKey;
    }
}
