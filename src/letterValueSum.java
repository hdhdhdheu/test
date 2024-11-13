import java.io.BufferedReader;
import java.io.FileReader;

public class letterValueSum {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("enable1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                letterSum(line);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }

    public static void letterSum(String str) {
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            ans += (str.charAt(i) - 'a' + 1);
        }

        if (ans == 319) {
            System.out.println(str);
        }
    }
}
