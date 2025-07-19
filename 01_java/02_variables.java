public class C02Variables {
    public static void main(String[] args) {
        /*
        * 변수는 변할 수 있는 변하는 수,
        *
        * 메모리 관점에서는
        * 컴퓨터 안에는 CPU와 메모리가 있는데
        * 메모리는 임시 기억 장치여서
        * 첫 번째 라인에서는 words가 할머니였지만
        * 두 번째 라인에서 아버지를 words에 다시 셋팅했기 때문에
        * 세 번쨰 라인에서는 words 부분이 아버지로 나오게 됨
        */
        // 문자열
        String words = "할머니";
        words ="아버지";
        System.out.println(words + " 안녕하세요");

        // 정수
        int num1 = 10;
        System.out.println(num1);

        int num2; // int 는 선언만 하고 별도의 값 할당이 없으면 선언 시 0이 할당이 된다.
        // System.out.println(num2); // 값이 없어서 오류가 뜨지만 0이 할당되어져 있다.
        num2 = 20;
        System.out.println(num2);

        // 정수
        byte byte1 = 127;
        byte byte2 = -128;
        System.out.println(byte1);
        System.out.println(byte2);

        /*
        * byte 범위를 넘어서면 오버플로우 또는 언더플로우가 발생할 수 있다.
        * 원하는 값이 아닌 이상한 값이 나올 수 있다.
        */
        byte1++;
        byte2--;
        System.out.println(byte1);
        System.out.println(byte2);

        // 실수
        // float에서 표현 가능한 범위를 넘어서게 되면 오버플로우 발생
        float myFloat1 = 1.23456789F;
        double myDouble1 = 1.234567;
        System.out.println(myFloat1); // 1.2345679
        System.out.println(myDouble1);

        // 부동소수점으로 인해 실수 연산에서 미세한 오차가 발생할 수 있다.
        double myDouble2 = 0.1;
        double myDouble3 = 0.2;
        System.out.println(myDouble2 + myDouble3); // 0.30000000000000004

        // i는 0 이고 i가 1000번 미만일 때까지 myDouble4에 0.1를 더해주기
        double myDouble4 = 0;
        for(int i = 0; i < 1000; i++) {
            myDouble4 += 0.1;
        }
        System.out.println(myDouble4); // 100이 되어야하는데  99.9999999999986가 나옴
    }
}
/*
* 변수란?
* 어떤 값을 저장하는 저장공간, 저장값을 담는 상자
* - 변수(variable)란 데이터(data)를 저장하기 위해 프로그램에 의해 이름을 할당
* - 데이터(data)를 저장할 수 있는 메모리 공간을 의미
* - 변수의 명명규칙
*       - 영문자(대소문자), 숫자 등으로만 구성, 한글x
*       - 숫자로 시작할 수 없음
*       - 이름 사이에는 공백을 포함할 수 없음
*       - 자바에서 미리 정의된 키워드(keyword)는 사용할 수 없음(타입명 금지!)
*           - int, String 등
* - 기본형 변수
*       - 정수형 : int, long 등
*           - 123, -456과 같이 아라비아 숫자와 부호
*           - long형의 경우 1234556789L 이렇게 L을 붙여 해당 리터러르이 타입을 명시
*       - 실수형 : float, double
*           - 3.14, -45.6과 같이 소수 부분을 가지는 아라비아 숫자
*           - 1.234567F (float 쓰고 싶을 때!)
*           - 1.2345D
*       - 문자형 : char
*           - 'a', 'Z'와 같이 작은따옴표('')로 감싸진 문자
*           - 문자열(String)은 "자바", "홍길동"과 같이 큰따옴표("")
*       - 논리형 : boolean
*           - true, flase
*       - null이란 아무런 값도 가지고 있지 않은 빈 값
*/
/*
* 정수
* - 해당 타입이 표현할 수 있는 범위를 벗어난 데이터를 저장하면, 오버플로우(overflow) 또는 언더플로우가 발생
* - 자바에서 정수형 타입 중 기본이 되고 가장 많이 쓰이는 타입은 int형
*   byte : 1바이트(8비트)
*   short : 2바이트
*   int : 4바이트(32비트)
*   long : 8바이트
*/

/*
* 실수
* - 실수형 타입 중 기본이 되는 타입은 double임
* - D 또는 d는 생략 가능합
* - 부동 소수점(floating point)방식이 표준
*       - ±(1.가수부)x2^지수부의 표현식
*       - 예를들어, 1001.1011 이란 수가 있다면, 부동소수점에선 1.0011011*2^3으로 표현
*       - 많은 수를 표현할 수 있다는 장점
*       - 그러나, 이진수의 근사치를 저장하다보니, 미세한 오차가 발생하여 10진수를 완벽하게 표현할 수 없다는 것은 단접(현업에서는 중요한 부분!!)
* 실수형타입 : 지수의 길이 : 가수의 길이 : 유효 자릿수
* float : 8비트 : 23비트 : 소수 부분 6자리까지 오차없이 표현할 수 있음
* double : 11비트 : 52비트 : 소수 부분 15자리까지 오차없이 표현할 수 있음
*/