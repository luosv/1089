/**
 * 计算num内符合abc...乘以9等于...cba条件的正整数
 * Created by LuoSw on 2016/11/1 0001.
 */
public class Main {

    public static void main(String[] args) {

        way1();
        way2();
        way3(99999999);

    }

    private static void way1() {

        System.out.println("方法一：");

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        if ((a * 1000 + b * 100 + c * 10 + d) * 9 == (d * 1000 + c * 100 + b * 10 + a)) {
                            if (!(a == 0 && d == 0)) {
                                System.out.print(a);
                                System.out.print(b);
                                System.out.print(c);
                                System.out.print(d);
                            }
                        }
                    }
                }
            }
        }

        System.out.println();

    }

    private static void way2() {

        System.out.println("方法二：");

        for (int i = 1000; i < 9999; i++) {
            int a = i / 1000;
            int b = (i / 100) % 10;
            int c = (i / 10) % 10;
            int d = i % 10;
            if (d * 1000 + c * 100 + b * 10 + a == i * 9) {
                System.out.print(i);
            }
        }

        System.out.println();

    }

    // 计算num内符合abc...乘以9等于...cba条件的正整数
    private static void way3(int num) {

        System.out.println("方法三：");

        for (int i = 10; i < num; i++) {
            StringBuffer result = new StringBuffer();
            reverse(result, i);
            int j = Integer.parseInt(String.valueOf(result));
            if (i * 9 == j) {
                System.out.println(i);
            }
        }

    }

    // 递归逆序输出数字
    private static void reverse(StringBuffer result, int num) {

        if (num != 0) {
            result.append(num % 10);
            reverse(result, num / 10);
        }

    }

}
