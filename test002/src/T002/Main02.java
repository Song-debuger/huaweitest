package T002;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String ch = scanner.nextLine();
//        char c = ch.toCharArray()[0];
        int n = getNumFromString(st,ch);
        System.out.println(n);

    }

    public static int getNumFromString(String string,String ch){
        int n = 0;
        //将字符串统一转成小写
        String St = string.toLowerCase();
//        String st = String.valueOf(ch).toLowerCase();
        String st = ch.toLowerCase();
        //获取一个正则表达式适配器
        Pattern p = Pattern.compile(st);//编译一个正则表达式
        Matcher m = p.matcher(St);//正则表达式适配器
        //查找
        while(m.find()){
            n++;
        }

        return n;
    }
}
