import java.math.BigDecimal;

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
        // float 에서 표현 가능한 범위를 넘어서게 되면 오버플로우 발생
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

        // BigDecimal에 원리는 10진수 정수로 변환하여 연산을 한 뒤에 다시 소수점자리로 되돌리는 것 이를 통해 소수점자리 연산의 오차를 해결
        System.out.println((myDouble2*10 + myDouble3*10)/10);

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println(a.add(b)); // 더하기
        System.out.println(a.subtract(b)); // 빼기
        System.out.println(a.multiply(b)); // 곱하기
        System.out.println(a.divide(b)); // 나누기

        // 문자형 타입
        char ch1 = '하'; // 하나의 문자
        System.out.println(ch1);
        // 명시적 형 변환
        System.out.println((int)ch1);
        System.out.println((char)54616);
        // 문자열
        String st1 = "하하하"; // 1개 이상의 문자열, 많이 사용됨
        System.out.println(st1);

        // 논리형 타입 - 조건문에서 많이 사용
        boolean myBool = true;
        System.out.println(myBool);
        if(myBool) {
            System.out.println("참입니다.");
        } else {
            System.out.println("거짓입니다.");
        }

        int num11 = 10;
        int num22 = 20;
        if(num11 > num22){
            System.out.println("num1은 num2보다 큽니다.");
        } else {
            System.out.println("num2은 num1보다 큽니다.");
        }

        // 명시적 타입과 명시적 타입 변환
        char ch11 = 'a';
        // 명시적 타입 변환도 가능하고 묵시적 타입 변환도 가능하다.
        int int1 = ch11; // 묵시적 타입 변환
        int int2 = (int)ch11; // 명시적 타입 변환
        System.out.println(int1); // 97
        System.out.println(int2); // 97

        // double을 int에 넣는 것은 불가능 
        double myDouble = 10.123;
        // int myInt = myDouble; // 소수점으로 인한 오류!
        int myInt = (int)myDouble; // 강제 형 변환은 가능
        System.out.println(myInt);

        // int를 double에 넣는 것은 문제 없음 -> 묵시적 타입 변환
        int myInt2 = 10;
        double myDouble22 = myInt2;
        System.out.println(myDouble22);

        // 실수 앞에 int를 통해 강제형변환을 하면 소수점 뒷자리는 절사
        System.out.println((int)0.25);

        // 나눗셈에서 명시적 타입 변환의 필요성
        int num111 = 1;
        int num222 = 4;

        System.out.println(num111/num222);
        /*
        * 아래와 같이 int / int를 하게 되면 결과값을 int로 추론하여 소수점자리를 절사하게 된다.
        * 그래서 둘 중 하나에 double 로 강제 형변환을 시켜줘야한다.
        */
        double double1 = num111/num222;
        System.out.println(double1);

        double double2 = num111/(double)num222; // 둘 줄 하나만 형 변환해주면 됨!
        System.out.println(double2);

        String mySt = "할머니";
        mySt = "할아버지";

        // 상수의 이름은 일반적으로 대문자 사용
        final String MYFINALST = "할머니";
        // final 키워드가 붙은 상수는 값을 재할당(변경) 불가능
        // MYFINALST = "할아버지"; // 오류
        final String PaymentMethod = "card";
        // PaymentMethod = "apple pay"; // 안 됨, 고치면 안되는 것에 쓰이면 좋다

        // null 이란? 자바에서 값이 없는 상태 그자체를 의미한다.
        String mySt1 = null; // 값이 없더라도 이렇게 해주는 것이 좋음
        System.out.println(mySt1); // null
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
*           - long 형의 경우 1234556789L 이렇게 L을 붙여 해당 리터러르이 타입을 명시
*       - 실수형 : float, double
*           - 3.14, -45.6과 같이 소수 부분을 가지는 아라비아 숫자
*           - 1.234567F (float 쓰고 싶을 때!)
*           - 1.2345D
*       - 문자형 : char
*           - 'a', 'Z'와 같이 작은따옴표('')로 감싸진 문자
*           - 문자열(String)은 "자바", "홍길동"과 같이 큰따옴표("")
*       - 논리형 : boolean
*           - true, false
*       - null 이란 아무런 값도 가지고 있지 않은 빈 값
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
* - 대부분 실수값의 사칙연산과정에서 오차가 발생
* - BigDecimal
*       - BigDecimal은 Java 에서 숫자를 정밀하게 저장하고 표현할 수 있는 방법
*       - 돈과 소수점을 다룬다면 BigDecimal은 선택이 아니라 필수
*       - BigDecimal의 유일한 단점은 느린 속도, 사용의 번거로움
*       - 원리
*           - BigDecimal 타입은 내부적으로 수를 십진수 정수로 저장
*           - 예를들어 1.03에 10의 제곱을 곱해 103을 만들어 계산
* - BigDecimal이 싫다면
*       - 계산할 때 10의 거듭제곱을 통해 정수로 만들어준 다음 계산하고 다시 10의 거듭제곱으로 나눠주면 된다.
*           - 실수의 오차는 모든 언어의 문제이므로, 다른 언어를 사용하게 될 때 참고
*       - 예를들어, 0.1 + 0.2 = 0.3
*       - (0.1 * 10 + 0.2 * 10)/10;
*/

/*
 * 문자형 타입
 * - char
 * - 컴퓨터는 2진수 밖에 인식하지 못하므로 문자도 숫자로 표현해야 인식
 * - 예전에는 아스키코드(ASCII) 표준을 사용하여 문자를 표현
 *      - 아스키코드(ASCII)는 영문 대소문자를 사용하는 (1바이트)7비트의 문자 인코딩 방식
 *          (1바이트 : 8비트 -> 7비트만 사용 + 1비트(오류검출이나 음/양 검증용))
 *      - 총 128개의 문자
 * - 현재는 uth-8(유니코드)가 대부분 웹서비스의 표준
 *      - 2바이트
 * char : 2바이트
 *
 * - 2진법 >> 1바이트 >> 8비트 >> 7비트 >> 2의 7승 = 128
 * - 일반적으로 왼쪽 첫 번째 비트는 패리티비트(오류검출)용으로 사용되거나, 부호비트(음수/양수 구분)용으로 사용
 * - 1024바이트(1KB), 1024KB(1MB), 1024MB(1GB) ...
 */

/*
* 타입변환
* - 하나의 타입을 다른 타입으로 바꾸는 것
* - 묵시적(자동)타입 변환
*       - Java 에서 자동으로 상황에 맞게 타입을 변환해주는 것
*       - 바이트의 크기가 작은 타입으로 타입 변환을 할 경우는 데이터의 손실이 발생하므로 컴파일러가 오류를 발생. 큰 타입으로의 변환은 가능
* - 명시적 타입 변환
*       - 명시적으로 개발자가 타입 변환을 지정하는 것 (강제로 변환)
*       - (변환할 타입) 변환할 데이터
*/

/*
* 상수
* - 한 번 할당된 변수의 값을 변경할 수 없는 값, 메모리에 저장된 데이터를 변경할 수 없는 값
* - final 키워드를 사용하여 선언하고, 선언과 동시에 반드시 초기화해야 함
*       - java8 이후부터는 초기화 하지 않아도 됨
* - final int AGES = 30;
* - 자바에서 상수의 이름은 일반적으로 모두 대문자를 사용
*/