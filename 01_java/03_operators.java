public class C03Operators {
    public static void main(String[] args) {
        // 산술연산자(사칙연산)
        int num1 = 8;
        int num2 = 3;
        System.out.println("+ 연산자에 의한 결과 : " + (num1 + num2));
        System.out.println("- 연산자에 의한 결과 : " + (num1 - num2));
        System.out.println("* 연산자에 의한 결과 : " + (num1 * num2)); // * 기호는 곱셈 또는 모든 것을 의미하는 all로 사용되기도 한다.
        System.out.println("/ 연산자에 의한 결과 : " + (num1 / num2)); // 2  int/int를 하다보니 결과값이 소수점일지라도 int를 묵시적변환되어 몫만 남게 된다.
        System.out.println("% 연산자에 의한 결과 : " + (num1 % num2)); // 2 나머지를 구하는 기호 %

        // 대입연산자
        int num11 = 7, num22 = 7, num33 = 7;
        // 첫 번째 방법
        num11 = num11 - 3;
        System.out.println(num11);

        // 두 번째 방법
        num22 -= 3;
        System.out.println(num22);

        num33 *= 3;
        System.out.println(num33);

        // 증감 연산자
        int a = 5;
        // b 값에 a에 1 더한 값 넣어주기
        // 첫 번째 방법
        // int b = a + 1;

        // 두 번째 방법
        // a += 1;
        // int b = a;

        // 세 번쨰 방법
        // ++a;
        // System.out.println(a);
        // int b = a;
        // System.out.println(b);

        // 세 번째 방법(2)
        // 전위 증감 연산을 할 경우에는 먼저 증감되고 명령문이 실행된다.
        // int b = ++a;
        // System.out.println(b);

        // 네 번째 방법
        // 후위 증감 연산을 할 경우에는 명령문이 먼저 실행되고 그 다음에 값이 증감된다.
        // int b = a++; // 실행되고 난 후 증가되어 입력되지 않음
        // System.out.println(b);
        // System.out.println(a);
        // 오류!! 값을 증감시킴과 동시에 세팅하지 않는다 먼저 증가시키고 값 넣기
        a++;
        int b = a;
        System.out.println(b);

        // a를 1만큼 증가 시키는 방법은 a = a+1, a+=1, a++, ++a 여러가지 방법이 있다.

        // 비교 연산자
        char ch1 = 'a', ch2 = 'A';
        System.out.println("==연산자에 의한 결과 : " + (ch1 == ch2));
        if(ch1 == ch2) {
            System.out.println("두 문자가 같습니다.");
        } else {
            System.out.println("두 문자가 같지 않습니다.");
        }

        // 논리 연산자
        int num111 = 10,num222 = 20;
        boolean result1;
        boolean result2;
        result1 = (num111 > 5) && (num111 < 20);
        result2 = (num111 < 10) && (num111 < 20);
        System.out.println("&&연산자에 의한 결과 : " + result1);
        System.out.println("&&연산자에 의한 결과 : " + result2);
        result2 = (num111 < 10) || (num111 < 20);
        System.out.println("||연산자에 의한 결과 : " + result2);
        System.out.println("!연산자에 의한 결과 : " + !result2);

        // 비트 연산자(&, AND 연산)
        int a1 = 15;
        int b1 = 21;
        int c1 = a1 & b1; // 5
        System.out.println(c1);

        int n1 = 5; // 0000101
        int n2 = 6; // 0000110
        
        // << 시프트 연산자 : 2진수 한자리씩 왼쪽으로 이동, 해당 숫자에 2을 곱하는 것과 같은 효과
        System.out.println(n1<<1); // 0001010 : 10

        // >> 시프트 연산자 : 2진수 한자리씩 오른쪽으로 이동, 해당 숫자에 2로 나눈 것과 같은 효과
        System.out.println(n2>>1); // 0000011 : 3

        // 비트 연산자(^, XOR 연산)
        // XOR 연산은 두 수의 각 자리 수가 다른 경우에만 1을 return
        // 실무에서 잘 안 쓰는 예시
        // 컴퓨터가 비트 연산자를 활용하여 덧셈을 하는 예시
        int num1111 = 13; // 00001101(13의 이진수)
        int num2222 = 9; // 00001001(9의 이진수)
        while(num2 != 0){
            int carry = num1111 & num2222; // 두 수를 더했을 때 2가 되는 자리를 찾기 위해
            num1111 = num1111 ^ num2222;
            num2222 = carry << 1;
        }
        System.out.println("덧셈 결과 : " + num1111);

    }
}
/*
* 연산자
* - 자바에서는 여러 종류의 연산을 수행하기 위한 다양한 연산자(operator)을 제공
*       - 산술 연산자(사칙연산)
*           - * 곱셈, / 나눗셈, & 나눗셈의 나머지
*           - 위 내용 정도만 유의
*       - 대입연산자
*           - 오른쪽의 값을 왼쪽에 대입이 원칙
*           - =, +=, -=, *=, /=, %= 등
*       - 증감연산자
*           - ++ 등
*           - 전위 증감 연산자와 후위 증감 연산자가 있음
*           - 전위 증감 연산자
*               - 현재 라인의 명령문이 실행되기 전에 값이 증감
*               - ++X, --X
*           - 후위 증감 연산자
*               - 현재 라인의 명령문이 실행되고 나서 값이 증감
*               - X++, X--
*       - 비교 연산자
*           - ==, !=, >, >=, <, <= 등
*           - 조건에 부합하면 true를 틀리면 false를 return
*       - 논리 연산자(참, 거짓)
*           - &&, ||, ! 등
*           - 참 / 거짓을 반환하는 연산자
*           - && : 논리식이 모두 참이면 참을 반환함.(AND 연산)
*           - || : 논리식 중에서 하나라도 참이면 참을 반환함.(OR 연산)
*           - ! : 논리식의 결과가 참이면 거짓을 거짓이면 참을 반환함.
*       - 비트 연산자
*           - 비트(bit) 단위로 논리 연산을 할 때 사용하는 연산자
*               - 실제로 컴퓨터가 계산을 하는 방식
*           - &, |, >>, <<, ^, ~ 등
*           - & : 대응되는 비트가 모두 1이면 1을 반환함.(비트 AND 연산)
*           - | : 대응되는 비트 중에서 하나라도 1이면 1을 반환함.(비트 OR 연산)
*           - ^ : 대응되는 비트가 서로 다르면 1을 반환함.(비트 XOR 연산)
*           - ~ : 비트 NOT 연산자는 해당 비트가 1이면 0을 반환하고, 0이면 1을 반환
*           - << : 시프트 연산자(<<)는 지정한 수 만큼 피연산자의 모든 비트를 전부 왼쪽으로 이동
*               - 2만큼 곱한 것과 같은 효과
*           - >> : 시프트 연산자(>>)는 지정한 수 만큼 피연산자의 모든 비트를 전부 오른쪽으로 이동
*               - 2만큼 나눈 것과 같은 효과
*           - 비트연산자의 활용
*               - XOR과 AND를 조합해 덧셈, 뺄셈으로 활용
*               - 시프트 연산자를 활용해 곱셈, 나눗셈으로 활용
*/