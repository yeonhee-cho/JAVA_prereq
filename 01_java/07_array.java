import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class C07Array {
    public static void main(String[] args) {
        // 배열 표현 방식
        int[] intArr = {1, 2, 3, 4, 5}; // 가장 많이 씀
        int[] intArr2 = new int[5]; // 값은 모르고 길이만 정할 때
        intArr2[0] = 1;
        intArr2[1] = 2;
        intArr2[2] = 3;
        intArr2[3] = 4;
        intArr2[4] = 5;

        int[] intArr3 = new int[] {1, 2, 3, 4, 5};

        // 배열의 초기값
        int[] num = new int[5]; // 초기값 숫자 0
        char[] chArr = new char[5]; // 초기값 아스키코드 0을 가짐 -> 공백을 가진 문자
        String[] stArr = new String[5]; // 초기값 null
        System.out.println(num[0]);
        System.out.println(chArr[0]);
        System.out.println(stArr[0]);

        // 배열을 이용한 총 합, 평균
        int[] grade = {85, 65, 98};
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        System.out.println("총 합 : " + sum + "이고 평균은 " + (double)sum / grade.length);

        // 최대값, 최소값 구하기
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];
//        for (int a : arr) {
//            if(max < a) {
//                max = a;
//            }
//        }
//
//        for (int a : arr){
//            if(min > a) {
//                min = a;
//            }
//        }
        // for 문을 두 번 쓸 필요없다.
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }
        // 이렇게 합쳐도 괜찮음
        System.out.println(max);
        System.out.println(min);

        // 배열 뒤집기
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            reversedArr[i] = arr[arr1.length-i-1];
        }
        System.out.println(Arrays.toString(reversedArr));

        // 배열의 정렬
        int[] arr11 = {4, 2,9, 13, 1 ,9};
        // 오름차순
        Arrays.sort(arr11);
        System.out.println(Arrays.toString(arr11));
        // 내림차순
        // 방법1 - 일단 오름차순 정렬 -> 뒤에서 부터 배열 뒤집기
        int[] reversedArr2 = new int[arr11.length];
        for (int i = 0; i < arr11.length; i++) {
            reversedArr2[i] = arr11[arr11.length-i-1];
        }
        System.out.println(Arrays.toString(reversedArr2));

        arr11 = reversedArr2;
        System.out.println(Arrays.toString(arr11));

        // 내림차순 방법2
        int[] arr111 = {4, 2,9, 13, 1 ,9};
        Integer[] arr2 = new Integer[arr111.length];
        for (int i = 0; i < arr111.length; i++) {
            arr2[i] = arr111[i];
        }
        Arrays.sort(arr2, Collections.reverseOrder()); // 컴페러터
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr111.length; i++) {
             arr111[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr111));

        // sort (정렬) 오름차순 직접 구현해보기
        // selection sort(선택 정렬 알고리즘) ** 중요한 알고리즘
        int[] arr1111 = {2, 1, 3, 5, 1};
        for (int i = 0; i < arr1111.length - 1; i++) {
            for (int j = i+1; j < arr1111.length; j++) {
                if(arr1111[i] > arr1111[j]) {
                    int temp = arr[i];
                    arr1111[i] = arr1111[j];
                    arr1111[j] = temp; // arr1111[i]말고 저장해 둔 j값 temp
                }
            }
        }
        // 내림차순일 경우
        for (int i = 0; i < arr1111.length - 1; i++) {
            for (int j = i+1; j < arr1111.length; j++) {
                if(arr1111[i] < arr1111[j]) { // 여기만 바꾸면 됨
                    int temp = arr1111[i];
                    arr1111[i] = arr1111[j];
                    arr1111[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1111));

        // double sort(버블정렬 알고리즘) : 가장 큰 값을 오른쪽으로 보내는 것

        int[] arr5 = {2, 1, 3, 5, 1};

        for (int i = 0; i < arr5.length; i++) {
            boolean changed = false;// 자리가 체인지 되었는지 확인
            for (int j = 0; j < arr5.length - 1; j++) {
                if(arr5[j] > arr5[j + 1]){
                    int temp = arr5[j+1];
                    arr5[j+1] = arr5[j];
                    arr5[j] = temp;
                }
            }
            if(changed == false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr5));
     }
}
/*
* 배열(Array)
*   - 동일한 자료형의 데이터를 연속적으로 저장하고 관리하는 데이터 구조
*   - 배열은 자료형 타입 바로 옆에 [] 기호를 사용하여 표현
*   - 기본 문법
*       - 초기값이 정해지지 않았을 때
*           - String[] weeks = new String[7];
*           - weeks[0] = "월";
*           - ...
*           - 값이 아직 정해지지 않았을 때 사용하는 방식
*           - 초기값 없이 배열 변수를 만들 때에는 반드시 길이에 대한 숫자값이 필요
*           - 초기값 없이 배열의 변수를 만들면, 배열의 타입에 맞게 자동으로 초기화
*       - 초기값이 있을 때
*           - int[] odds = {1, 3, 5, 7, 9};
*           - String[] weeks = {"월", "화", "수", "목"};
*/
/* 
* 자료형 - 리스트(list)
*   - java 에서 LIST는 여러 개의 요소를 저장하는 자료구조로서 *배열과 다르게 요소의 추가/삭제가 가능*
*   - List는 인터페이스로서, ArrayList, LinkedList 등의 List 인터페이스를 구현한 자료형이 존재
*       - 인터페이스가 무엇인지는 추후 인터페이스에서 학습 예정
*       - 여기서는 ArrayList, LinkedList 등의 List 라는 큰 틀의 자료구조가 있고, 
*         세부 카테고리로서 ArrayList, LinkedList 등이 있다는 정도만 학습
* 
*   - 기본 문법
*       - ArrayList<String> pitches = new ArrayList<String>();
*           - 일반적으로 뒷부분의 자료형은 생략
*       - List<String> pitches = new ArrayList<>();
*           - 가장 일반적인 선언방식으로 앞부분의 ArrayList 대신에 더 큰 카테고리인 List 자료구조를 선언하고 
*             뒷부분에서 ArrayList를 선언. 
*             그 이유와 의미에 대해선 추후 인터페이스에서 학습
*           - ArrayList는 가장 많이 사용되는 List의 구현체
*/