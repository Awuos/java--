import java.util.Scanner;
import java.util.Random;

class Program{
    public static void main(String[] args) {
        System.out.println("数当てゲームを始めます\n数字を入力してください");
        //答え
        Random random = new Random();
        int ans = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        //一つ目の数字
        int num1 = scanner.nextInt();
        judge(ans, num1);

        //二つ目の数字
        int num2 = scanner.nextInt();
        judge(ans, num2);

        //三つ目の数字
        int num3 = scanner.nextInt();
        judge(ans, num3);

        //四つ目の数字
        int num4 = scanner.nextInt();
        judge(ans, num4);

        scanner.close();
    }

    //答えの判断
    static void judge(int ans, int num){
        if (ans == num){
            System.out.println("正解！");
        }else if (ans < num){
            System.out.println("数が大きすぎ！");
        }else{
            System.out.println("数が小さすぎ！");
        }
    }
}