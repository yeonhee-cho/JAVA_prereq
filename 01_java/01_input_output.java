import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
        // 출력
        /*
         * println은 출력이 완료된 이후에 줄바꿈이 들어가는 것
         *
         * println과 print은 줄바꿈의 차이,
         * ln을 지워주면 줄바꿈처리가 되지 않음
         */
        System.out.println(7);
        System.out.print("Hellow");
        System.out.println("World");

        System.out.println("문자열끼리의" + "연결도 가능합니다.");
        System.out.println("숫자" + 3 + "과 문자열의 연결도 가능합니다.");

        // 입력
        // Java 에서 입력은 Scanner 클래스를 많이 사용한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("아무 문자열이나 입력해주세요.");
        /*
        * 문자열의 입력은 nextLine 에서도 사용하고,
        * 숫자의 입력은 nextInt를 많이 사용한다
        */
        // 문자열
        String input_st = sc.nextLine();
        System.out.println("입력하신 문자열은 " + input_st + "입니다.");

        // 숫자열
        System.out.println("숫자 2개를 입력해주세요.");
        System.out.println("첫 번째 정수를 입력해주세요.");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력해주세요.");
        int num2 = sc.nextInt();
        System.out.println("입력하신 두 수의 합은 " + (num1 + num2) + "입니다.");

        // boolean : nextBoolean();
        System.out.println("true / false를 입력해주세요.");
        Boolean input_bool = sc.nextBoolean();
        System.out.println(input_bool);

        /*
        * 입출력은 JAVA를 벗어난 외부자원을 사용하는 행위이기 때문에
        * 자원 사용 후 자원 반납을 해주는 것이 좋다.
        * */
        sc.close();
    }
}
/*
* [자바의 표준 입출력 클래스]
* - 프로그램은 사용자의 입력(input)에 따른 출력(output)을 해주는 역할
* - 자바에서는 System 이라는 표준 입출력 클래스를 정의하여 제공
* - 출력은 System.out
*       - 사용자가 보는 모니터에 개발자가 요청한 내용을 컴퓨터가 출력
*       - System.out.println();
*       - System.out.print();
* - 입력은 system.in
*       - 사용자의 키보드를 통한 입력
*       - 보통 java에 내장된 Scanner 클래스를 사용
*  - 입력시 자료형 별 변환
*       - 문자열 입력 변환
*       - 정수형 입력 변환
*       - 실수형 입력 변환
*  - 메모리 해제
*       - Scanner는 시스템의 리소스를 사용하므로 별도로 메모리 해제 필요
*         sc.close();를 이용해 끝내줘야 함
* */

