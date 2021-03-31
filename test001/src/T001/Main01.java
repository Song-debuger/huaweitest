package T001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String str = scanner.nextLine();
//            int len = strLen(str);
//            System.out.println(len);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = strLen(br.readLine());
        System.out.println(len);

    }

    /**
     * 计算字符串最后一个单词的长度
     * @param str
     * @return 字符串最后一个单词的长度
     */
    public static int strLen(String str) {
        if (str == "" || str == null) {
            return 0;
        }
        String[] words = str.split(" ");
        return words[words.length - 1].length();
    }

}
