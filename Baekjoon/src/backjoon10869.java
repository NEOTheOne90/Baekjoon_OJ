//백준 10869번문제 사칙연산 기본
import java.util.Scanner;

public class backjoon10869 {
//class명을 Main으로 수정 후 제출
public static void main(String[] args){
        Scanner in = new Scanner(System.in);
          int A = in.nextInt();
          int B = in.nextInt();
         
          in.close();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}
