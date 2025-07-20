import java.util.Arrays;

public class C05LoopStatements {
    public static void main(String[] args) {
        // while 문 예제
        int test = 10;
        while(test > 5){
            System.out.println("반복됩니다.");
            test -= 1;
        }
        
        // for 문 예제
        for (int i = 0; i < 10; i++) {
            System.out.println("반복됩니다. 반복숫자 : " + i);
        }

        // while 문  구구단 예제
        int n = 2;
        int num = 1;
        while(num < 10){
            System.out.println(n + "X" + num + "=" + n*num);
            num += 1;
        }

        // do/while 문 예제
        int n2 = 2;
        int num2 = 1;
        do{
            System.out.println(n2 + "X" + num2 + "=" + n2*num2);
            num2 += 1;
        } while(num2 < 10);

        // break 키워드는 반복문을 강제 종료시키는 키워드
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i >= 50) {
                break;
            }
        }

        // continue : 반복문에서 조건문 검사로 다시 올라가도록 하는 키워드
        // 코드의 가독성을 위해서 continue 를 사용
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // 배열 확인
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        // Enhanced for 문 예시
        for(int a: arr) {
            System.out.println(a); // 값이 담김
        }

        // Enhanced for 문에서 배열의 값 변경 예시
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        System.out.println(Arrays.toString(arr)); // 값 한번에 보는 법
        // ** Enhanced for 문에서 가져오는 값은 원본이 아니라 원본의 복사본이기 때문에 직접 접근해서 원본값을 변경하는 것응 불가.
        for(int a : arr){
            a += 1;
        }
        System.out.println(Arrays.toString(arr)); // 변경이 안 됨

        // java의 메모리 구조
        // int는 기본형 변수로서 스택영역에 그 값이 담긴다.
        int a = 10;
        System.out.println(a);
        // arr은 객체로서 스택영역에는 힙영역에 있는 주소 값만을 담고 있다.
        System.out.println(arr);
        // 힙영역에 있는 값을 출력할 때에는 스택 영역 주소 값을 활용하여 그 값을 찾아오는 메소드를 사용한다.
        System.out.println(Arrays.toString(arr));
        /*
        * 자바에서는 크게 메모리가 세개가 있다.
        * 스택 메모리, 힙 메모리, 메소드 영역
        */
        
        
        // 자바 변수 유효 범위
        int num1 = 10;
        if(num1 >1){
            int abc = 100;
            num = 20;
        }
        // System.out.println(abc); // 오류!! if문 블록 안에서 정의된 값은 if문 밖에서는 인지하지 못한다.
        System.out.println(num1); // 확인 가능, 내용도 변경가능, if문 밖에서 정의된 값을 if문 안에서 변경하는 것은 가능하다.

        // 지역 변수를 재선언하는 것은 불가능
        // int num = 20;
        
        // for문 안에서 선언된 i값은 해당 for문 밖에 다른 for문에서는 인지하지 못하기 때문에 편리하게 계속해서 int i를 재선언 가능하다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for문 안에서의 for문 i는 재선언 안됨!
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {

            }
        }
    }
}
/*
* 제어문 - 반복문(loop)
*   - while 문
*       while(조건식) {
*           조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
*       }
*       - while 문은 특정 조건을 만족할 때까지 계속해서 주어진 명령문을 반복
*           - while 문 내부에 조건을 false로 만드는 로직이 존재하지 않을 경우엔 프로그램이 무한 루프(infinite loop)
*           - 무한 loop가 default
*
*   - do/while 문
*       - do/while 문은 일단 루프를 한 번 실행한 후에 조건식을 검사
*       - do {
*           조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
*         } while (조건식);
*       - do while의 경우 많이 사용되지 않는 구문. for/while로 대체가 가능하기 때문에.
*           - 다만, 무조건 1번은 실행이 되므로 첫 번째 입력값을 검증하는데 사용되기도 함.
*
*   - for 문 (**중요!!**)
*       - for 문은 while 문과는 달리 자체적으로 초기식, 조건식, 증감식을 모두 포함
*       - 반복문이 종료가 될 수 있도록 기본 설계가 되어 있다는 점에서 while 문과의 차이
*       - for(초기식;조건식;증감식) {
*           조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
*         }
*
*   - break 문, continue 문
*       - break;
*           - 반복문을 완전히 빠져나가고 싶을 때 사용
*       - continue;
*           - 반복문 내에서 조건문 검사로 다시 올라가도록 하는 구문
*           - 다른 구문으로도 대체가 가능하므로 반드시 사용해야하는 구문은 아님. 코드의 가독성을 위해 많이 사용.
*
*   - Enhanced for 문 (**중요!!**)
*       - 배열과 컬렉션에서 매우 많이 사용되는 문법으로서 index로 배열이나 리스트 등을 가져오는 것이 아닌, 배열의 값 그대로를 가져오는 방식.
*           - 배열과 컬렉션이 무엇인지는 현재 단계에서는 동일한 여러 자료형을 집합적으로 관리하는 자료 구조라고만 생각하고 추후 학습.
*       - 기본 문법
*           - for(타입 변수 이름: 배열이나 컬렉션 이름) {
*               배열의 길이만큼 반복적으로 실행하고자 하는 명령문
*             }
*       - Enhanced for 문은 명시한 배열이나 컬렉션의 길이만큼 반복되어 실행
*       - Enhanced for 문은 요소를 참조할 때만 사용하는 것
*           - 요소의 값을 변경하는 작업에는 불가
*           - 배열 요소는 배열 요소 그 자체가 아닌 배열 요소의 복사본이기 떄문
*/

/*
* 자바의 메모리 구조
*   - 배열 출력시 toString()을 써야하는 이유
*   - 메소드 영역
*       - 빌드되어 만들어진 소스코드(클래스 등), 정적변수(static)등이 저장되어 코드 전역에서 사용 가능한 공간
*   - 스택 영역
*       - 지역변수, 매개변수, 기본형 자료, 객체의 주소값 등을 저장
*       - 기본형 변수는 스택 영역에 저장
*   - 힙 영역
*       - Heap 메모리는 애플리케이션 실행 동안 생성되는 모든 클래스 인스턴스와 배열을 저장하는 곳
*       - 참조형 변수인 객체 변수 등은 스택메모리에는 힙메모리의 주소만 저장해두고 실질적인 값은 힙메모리에 저장
*/

/*
* 지역 변수, 전역 변수
*   - 자바 변수 유효 범위
*       - 자바에서의 if문 블록, for문 블록 등 안에서 선언된 변수는 블록 밖에서 참고 할 수가 없고 해당 블록 내에서만 유효
*   - 지역 변수 : {}로 구분되는 영역에서만 유효한 변수
*       - 현재 단계에서는 {}열고, 닫는 영역까지만 변수의 범위가 유효하다는 것 숙지
*   - 전역 변수 : 클래스 전역에 접근할 수 있는 변수
*/