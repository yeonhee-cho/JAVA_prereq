import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        // doorlock 키 if문 예제
        int answer = 2809;
        int input = 1234;
        if(input == answer){
            System.out.println("문이 열렸습니다.");
        } else {
            System.out.println("틀린 비밀번호입니다.");
        }

        // 교통수단 예제 : if, else if, else
        int myMoney = 10000;
        int kickBoard = 2000;
        int busFee = 3000;
        int taxiFee = 10000;

        if(myMoney >= taxiFee) {
            System.out.println("택시를 타세요.");
        } else if (myMoney >= busFee) {
            System.out.println("버스를 타세요.");
        } else if (myMoney >= kickBoard) {
            System.out.println("킥보드를 타세요.");
        } else {
            System.out.println("걸어가세요.");
        }

        // 삼항연산자 : if else 문을 간편하게 표현할 수 있는 방법
        // doorlockkey 예제
        int answer2 = 2809;
        int input2 = 1234;
        String result = (answer2 == input2) ? "문이 열렸습니다" : "잘못된 비밀번호입니다.";
        System.out.println(result);

        // switch 문
        Scanner sc = new Scanner(System.in);
        int myNumber = sc.nextInt();
        switch (myNumber) {
            case 1 :
                System.out.println("대출서비스입니다.");
                // break; 다음 내용 체크해야 할 경우 넣어주기
            case 2 :
                System.out.println("예금서비스입니다.");
            default:
                System.out.println("상담원을 연결합니다.");
        }


    }
}
/*
* 제어문
*   - 프로그래밍의 존재 이유와 목적을 꼽으라고 한다면 사용자의 input에 따라 달라지는 output을 자동화 하기 위함이라 할 수 있다.
*       - 이를 위해 필요한 것은 ~한 output을 만들어내는 조건문
*       - 그것이 반복되는 연산과정을 자동화하기 위한 반복문
*   - 조건문과 반복문을 포괄하는 명칭으로 프로그램의 순차적인 흐름을 제어하므로 이 때 사용되는 명령문을 제어문이라 함
*   - 제어문에 속하는 명령문들은 중괄호({})로 둘러싸여 있으며, 이러한 중괄호 영역은 블록(block)이라 불림
*   - 중괄호로 제어문의 범위를 지정하므로 줄바꿈 등은 무관
*   - 조건문 : if문, if/else 문, if/else/elseif문, switch문(가독성을 위해)
*       - if문
*       if(조건식) {
*           조건식의 결과가 참일 때 실행하고자 하는 명령문;
*       }
*       - if/else 문
*       if(조건식) {
*           조건식의 결과가 참일 때 실행하고자 하는 명령문;
*       } else {
*           조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
*       }
*           - if가 있다고 반드시 else가 있어야 하는 것은 아님
*       - if/else/elseif문
*       if(조건식 1) {
*           조건식1의 결과가 참일 때 실행하고자 하는 명령문;
*       } else if(조건식2) {
*           조건식1의 결과가 거짓이고 조건식2의 결과가 참일 때 실행하고자 하는 명령문;
*       } else {
*           조건식1과 조건식2의 결과가 거짓일 때 실행하고자 하는 명령문;
*       }
*           - if 조건이 참이면, 제어문 밖으로 나간다는 점에 유의
*       - if if와 if else if 의 차이 :
*               if if는 각각 독립적으로 조건을 검사하지만, if else if는 둘 중 하나만 참이 된다. 그래서 특히 금액의 범위 지정시 유의
*
*       - 삼항 연산자
*           - 문법 : 결과값 = 조건식 ? 반환값1 : 반환값2
*           - 물음표(?) 앞의 조건식에 따라 결과값이 참(true)이면 반환값1을 반환하고, 결과값이 거짓(false)이면 반환값2를 반환
*           - 자바에서는 간단한 if/else 문은 삼항연산자를 이용하여 간결하게 표현
*       - switch문
*           - 기본 문법
*               - switch(조건값){
*                   case 값1 : 조건 값이 값 1일 때 실행하고자 하는 명령문;
*                   break; // switch 문을 빠져나가는 문구
*                   case 값2 : 조건 값이 값 2일 때 실행하고자 하는 명령문;
*                   break; // switch 문을 빠져나가는 문구
*                   ...
*                   default : 조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
*                   break;
*                 }
*               - 일반적으로 break 문을 반드시 넣어줘야하고, 생략하는 경우는 그 다음 case 문도 비교하고자 할 때는 생략이 가능
*           - if/else if/else를 사용해도 동일하나, 가독성이 좋고 특정한 조건의 경우가 열거형으로 몇 가지로 정해져 있을 때 주로 사용
*               - 범위 지정은 안 됨에 유의
* 
*/
