import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        // 참조자료형의 특성
        int a; // 0이 할당
        String st; // null이 할당
        // 오류!! String 이 null 인 경우에 String의 메서드를 사용하려고 할 때 nullPointerException이 빈번하게 발생
        // System.out.println(st.length());

        // 원시 자료형과 참조 자료형의 생성 차이
        int a1 = 10;
        int b1 = 10;
        String st_a = "Hello"; // 리터럴
        String st_b = new String("Hello"); // 기본 규칙
        String st_c = "Hello";

        System.out.println(a1=b1); // true
        System.out.println(st_a == st_b); // false
        System.out.println(st_a == st_c); // true

        // Wrapper 클래스 : 기본형 타입에 없는 다양한 기능을 위해 참조형 자료인 wrapper 클래스가 사용
        int a11 = 10;
        // 원칙적인 방법
        Integer int_a = new Integer(a11);
        Integer wrappedNum = Integer.valueOf(a11);
        System.out.println(int_a.getClass().getName()); // 타입을 출력하기 위한 방법

        // 묵시적 형변환 -> auto boxing
        Integer int_a2 = a11;
        System.out.println(int_a2.getClass().getName()); // 타입을 출력하기 위한 방법

        // auto unBoxing
        int b = int_a2;
        System.out.println(int_a2.getClass().getName());


        List<Integer> myList = new ArrayList<>(); // 리스트 선언
        myList.add(10);
        myList.add(20);

        // 리터럴 방식을 사용하는 것이 최적화에 도움이 된다.
        String mySt = "hello";

        String mySt1 = new String("hello");
        String mySt2 = new String("hello");

        System.out.println(mySt == mySt2); // false
        System.out.println(mySt.equals(mySt2)); // true, 비교시 반드시 .equals!!

        // indexOf : 몇 번째 index에 특정 문자열이 위치하는지 return 해주는 함수(메서드)
        String a111 = "hello java";
        System.out.println(a111.indexOf("java")); // 6

        // contains : 특정 문자열이 특정 문자열 안에 존재하는지 안하는지를 true/false
        System.out.println(a111.contains("goodbye")); // false

        // charAt() : 문자열에 n번째 문자를 return 하는 함수
        System.out.println(a111.charAt(4));

        String b11 = "abcdefaabaadf";
        // 반복문을 활욜해서 문자열 b 안에 문자 a가 몇 개 들어가 있는지 알아내기
        int count = 0;
        for (int i = 0; i < b11.length(); i++) {
            if(b11.charAt(i) =='a'){
                count++;
            }
        }
        System.out.println(count);

        // replace의 원시적인 방법
        String str ="01abc123한글1234";
        // 알파벳을 다 제거하고 새로운 str를 만들기
        String new_str = "";
        // System.out.println((int)'a'); // 확인용
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) < 97 || str.charAt(i) > 122){
                new_str += Character.toString(str.charAt(i));
            }
        }
        System.out.println(new_str);

        // replace 메서드 사용
        String textChange = "Hello Java";
        System.out.println(textChange.replace("Java","Python"));

        // replaceAll 은 정규표현식(메타문자)을 적용할 수 있는 메서드이다.
        String str2 = str.replaceAll("[a-z]",""); // 한글 [가-힣]
        System.out.println(str2);

        // 정규 표현식 활용 : 전화번호 형식 검사
        // boolean matcher = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-1234-1234"); // d는 숫자의 약자
        // if(matcher){
        //     System.out.println("적합한 전화번호 형식입니다.");
        // } else {
        //     System.out.println("다시 입력해주세요.");
        // }

        while (true){
            System.out.println("회원가입입니다. 전화번호를 입력해주세요.");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            boolean matcher = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$",input); // d는 숫자의 약자
            if(matcher){
                System.out.println("적합한 전화번호 형식입니다.");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }

        // substring(a,b) : a부터 b 미만까지 문자열 잘라내기
        String st1 = "    Hello World  ";
        System.out.println(st1.substring(0,5));

        // 대소문자 변경
        System.out.println(st1.toUpperCase()); // 전부 대문자로
        System.out.println(st1.toLowerCase()); // 전부 소문자로

        // trim()은 문자열 양 끝에 공백을 제거. strip도 마찬가지.
        System.out.println(st1.trim());
        System.out.println(st1.strip());

        // split 기법
        String a1111 = "a b c d";
        String[] aArr = a1111.split(" "); // 공백을 기준으로 자르겠다., 규칙적일 경우
        System.out.println(Arrays.toString(aArr));

        String b111 = "a  b c   d";
        // String[] bArr = b111.split(" "); // 불가, 불규칙 -> 정규 표현식을 활용해서 공백을 제거하고 배열로 잘라내기
        String[] bArr = b111.split("\\s+"); // "\\s"는 공백문자를 의미하고 +를 넣음으로 여러개 공백도 모두 잘라낸다.
        System.out.println(Arrays.toString(bArr));

        // isEmpty 는 비어있는지 확인하는 함수
        String nullString = null;
        String emptyString = "";
        System.out.println(nullString == null); // true
        System.out.println(emptyString == null); // false

        System.out.println(emptyString.length()); // 0
        // null은 문자열이 아니므로 문자열의 메서드를 사용시에 에러가 발생 -> nullPointerException
        // System.out.println(nullString.length()); // ?

        // join
        String[] strArr = {"Java", "Python", "C", "JavaScript"};
        String myStr = String.join("   ", strArr); // join(사이에 넣어줄 값, 어레이)
        System.out.println(myStr);

        System.out.println(Arrays.toString(strArr)); // [Java, Python, C, JavaScript]

        // String <-> int
        String intSt = "123";
        // Integer.toString과 parseInt가 가장 많이 사용된다.
        int myInt = Integer.parseInt(intSt);
        String intSt2 = Integer.toString(myInt);
        String intSt3 = String.valueOf(myInt);

        // 문자열 더하기
        String firstStr = "hello";
        String secondStr = " world";
        String thirdStr = firstStr + secondStr;

        // String 기본적으로 immutable 이기 때문에, 값을 더한 것이 아닌 재정의한 것이다. => 성능이 다소 떨어진다.
        String result = "";
        result += "hello";
        result += " world";
        System.out.println(result);

        // String의 수정/추가를 위해 나온 별도의 클래스 -> StringBuffer,StringBuilder
        // 이게 더 좋음
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" world");
        System.out.println(sb);
        String myResult = sb.toString();
        System.out.println(myResult);

        // StringBuilder가 StringBuffer에 비해 성능이 더 좋음
        // 다만, 멀티스레드 환경에서 thread-safe 하지 않는다.
        // 스레드 : 작업의 주체
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" world");
        String myResult2 = sb2.toString();
        System.out.println(myResult2);

        //
    }
}

/*
* 참조 자료형
* - Java 에서 기본(원시) 자료형을 제외한 자료형은 "참조 자료형" 이라 함
*       - 원시 자료형은 Java 에서 제공하는 기본 데이터 타입
*       - int, long, double, float, boolean, char, null
* - 대표적인 참조 자료형은 String, List, Set, Map, 배열 등
*/

/*
* 원시(primitive)타입과 참조타입의 차이
* - 원시 자료형은 변수에 직접 값을 저장(스택메모리)
*       - 참조형 변수는 객체의 주소(reference)를 저장, 실제객체는 힙(heap)메모리에 할당
* - 원시 자료형 변수는 자동으로 기본값으로 초기화
*       - 참조형 변수는 null로 초기화
* 
* - 원시 자료형 변수는 new 키워드 없이 리터럴(literal)로만 세팅
*       - 참조형 변수는 new 키워드를 사용하여 값 세팅
*       - String은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해주는 참조 자료형
*           - 그 외에도 배열, wrapper 클래스도 리터럴 세팅 가능
* - 원시 자료형의 비교시에는 값 자체를 비교
*       - 참조형 변수는 객체 주소를 비교함으로서 동일한 객체인지를 비교
*/

/*
* 자료형 - String
* - 문자형 자료형
* - 사용방법
*       - 리터럴 방식
*           - String a = "Happy Java";
*       - 객체 사용 방식
*           - String a = new String("Happy Java");
* - 리터럴 방식을 사용하는 최적화에 도움
* */

/*
* Wrapper 클래스
* - Wrapper 클래스는 기본 자료형(primitive types)의 참조형 변수 즉, 객체 버전을 의미
*       - 클래스란 다양한 기능들을 내장하고 있는 프로그램 묶음
* - 원시자료형의 Wrapper 클래스
*       - 클래스에서 정의한 다양한 기능들을 추가적으로 사용하기 위해 원시 자료형을 Wrapping한 클래스가 나오게 되었다.
*       - 사용예시
*           - Integer.toString(),Integer.parseInt()등
* - ArrayList<Integer>, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신 그에 대응하는 Wrapper 클래스들을 사용
*
* 원시자료형 : Wrapper 클래스(참조 자료형)
* int : Integer
* long : Long
* double : Double
* float : Float
* boolean : Boolean
* char : Character
*/

/*
* Wrapper 클래스 - 박식 언박싱
* - 박싱
*       - 기본 자료형을 래퍼 클래스로 변환하는 과정
*       - int num = 10;
*         Integer wrappedNum = Integer.valueOf(num);
* - 언박싱
*       - 래퍼 클래스를 기본 자료형으로 변환하는 과정
*       - Integer wrappedNum = Integer.valueOf(20);
*         int num = wrappedNum.intValue();
* - 오토 박싱/언박싱
*       - 자바5부터 자동으로 형변환지원
*       - int num = 10;
*         Integer wrappedNum = num; // Auto-Boxing
*         Integer wrappedNum = 20;
*         int num = wrappedNum; // Auto-Unboxing
*/

/*
* 자료형 - String
* - 주요 내장 메서드(기능)
* - equals
*       - true / false 리턴
*       - ==은 주소를 비교함으로서 동일한 객체인지까지 판별하므로 되도록 사용하지 않도록 유의
*       - 기본형 자료형은 == 관계 성립
*           - String 중에서도 리터럴 객체는 == 관계 성립
* - indexOf
*       - 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
* - contains
*       - 문자열에서 특정 문자열이 포함되어 잇는지의 여부를 리턴
*       - true / false 리턴
* - charAt
*       - 문자열에서 특정 위치(index)의 문자(char)를 리턴
* - replace
*       - 문자열 중에 특정 문자열을 바꿔 새로운 문자열을 return
* - replaceAll
*       - replace와 동일한 기능
*       - 다만 정규 표현식을 활용할 수 있음
*/

/*
* 정규표현식
* - 정규 표현식이란 특정한 문자열의 패턴을 표현하기 위해 쓰이는 형식
* - 주로 전화번호, 주민등록번호, 이메일 등과 같이 정해진 형식을 검증하기 위해 사용
* - 정규표현식에서 표현하는 기호를 Meta 문자라고 한다.
*
* 대표적인 메타문자
* - ^와 $는 문자열의 시작과 끝을 명시적으로 알림
*       - 굳이 써주지 않아도 되나, 메타문자가 섞일 경우 시작과 끝을 구분짓는 용도
* - [xy]는 x,y 문자 중 하나, [x-y]는 x ~ z 사이의 문자 중 하나
* - 대표적인 정규표현식
*       - [0-9]는 0 ~ 9까지의 숫자를 의미
*       - [a-zA-Z]는 영문자를 의미
*       - [가-힣]는 한글을 의미
*/

/*
* - substring
*       - 문자열 중 특정 부분을 뽑아낼 경우 사용
* - toUpperCase/toLowerCase
*       - 대소문자 변환 리턴
*       - 그러나, 원본은 변하지 않음에 유의
* - Trim
*       - 왼쪽에 있는 공백, 오른쪽에 있는 공백을 다 제거
*       - 문자열을 입력받거나 문자열을 합칠 경우 쓸데없는 공백 제거를 위해 사용
*       - strip은 같은 기능을 하나, 더 안정성이 높음(java11 부터 추가됐음)
* - split
*       - 특정 문자열을 특정 구분자로 분리하는 메소드
*       - 리턴값은 String 배열
* - isEmpty()
*       - 문자열이 비어있는지 여부
*       - null 과는 다름에 유의!!
* - join
*       - 여러 문자열을 하나로 결합하며, 각 문자열 사이에는 지정한 구분자가 삽입
*       - 클래스 메서드이므로 String.join()로 사용해야함에 유의
*       - 문법 : String.join(지정구분자, 문자배열);
*/

/*
 * 자료형 - String 과 정수의 형변환
 *  - String -> int
 *       - int n = Integer.parseInt(num);
 *  - int -> String
 *       - String num1 = String.valueOf(n);
 *          - null 조차 문자로 받는다.
 *       - String num2 = String.toString(n);
 *          - 대체적으로 이 방식
 *          - toString은 Integer 외에 Character, Double, StringBuffer 등의 대부분이 Object 객체에 있는 메서드
 */
/*
* 자료형 - StringBuffer
*  - StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 객체
*  - 기본 문법
*       - StringBuffer buf = new StringBuffer("hello");
*       - buf.append("java") // 문자열 추가
*       - buf.append("world") // 문자열 추가
*       - String new_st = buf.toString(); // 새로운 String 문자열로 변환
*  - String과 StringBuffer의 차이
*       - String은 immutable, StringBuffer는 mutable
*       - String은 +=을 사용해서 문자열을 추가가 가능하지만, 추가가 아닌 재선언인 것
*       - 성능면에서 StringBuffer가 우수
*  - 주요 메서드
*       - append
*           - append 메소드를 사용하여 계속해서 문자열을 추가
*           - 문자열의 경우 +=를 통해 추가하는 것처럼 보이나, 추가가 아닌 재선언
*       - insert
*           - insert 메소드는 특정 n 번째 위치에 원하는 문자열을 삽입
*           - sb.insert(5,"hello");
*       - substring
*           - String 자료형의 substring 메소드와 동일하게 사용
*       - 그 외 상당한 메서드는 String과 동일
*  - StringBuilder
*       - StringBuilder와 같은 기능을 하는 객체로서 성능이 더 뛰어남
*       - 그러나, 멀티스레드 상황에서 동기화 문제가 발생
*           - StringBuffer Thread-Safe(내부적으로 동기화처리 - synchronized)
*/