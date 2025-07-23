import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

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

        // 검색 알고리즘 구현
        // 배열에서 어떤 숫자 찾기
        int[] arr6 = {3, 4, 7, 9, 7, 10};
        // 방법1 for 문과 break 문을 이용한 직접 구현
        int answer = 0;
        for (int i = 0; i < arr6.length; i++) {
            if(arr6[i] == 7){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

        // 방법2 : binarySearch
        // 배열이 오름차순 정렬되어 있어야 한다는게 전제
        Arrays.sort(arr6);
        System.out.println(Arrays.binarySearch(arr6,7));

        // index 값을 찾는 알고리즘은 아니지만, 원하는 값이 해당 배열 안에 들어있는지 찾기 위한 방법
        // 방법3 : StreamApi 와 Optional 객체를 활용
        OptionalInt result = Arrays.stream(arr).filter(a -> a==7).findFirst(); // filter(a -> a==7): 7 하고 같은 애와 필터링
        // Arrays.stream(arr) 복사본 만들기
        if(result.isPresent()) {
            System.out.println(result.getAsInt());
            System.out.println("원하는 값이 존재합니다.");
        }

        // 배열의 요소 비교 : equals
        // 값의 내용 뿐만 아니라 순서까지 동일해야 true가 나옴
        int[] arr7 = {10,20,30};
        int[] arr8 = {20,30,10};
        // if 배열이 같은지 확인
        System.out.println(Arrays.equals(arr7, arr8)); // false

        // 배열 복사 : copyOf
        int[] arr9 = {3,4,7,8,10};
        int[] new_arr = Arrays.copyOf(arr, 4);

        System.out.println(Arrays.toString(new_arr));

        // 배열 복사 : copyOfRange 1부터 3미만
        int[] new_arr9 = Arrays.copyOfRange(arr,1,3);
        System.out.println(Arrays.toString((new_arr9)));

        // 2차원 배열
        int[][] arr10 = new int[2][3]; // {{10,20,30},{40,50,60}}
        arr10[0][0] = 10;
        arr10[0][1] = 20;
        arr10[0][2] = 30;
        arr10[1][0] = 40;
        arr10[1][1] = 50;
        arr10[1][2] = 60;
        System.out.println(Arrays.deepToString(arr10)); // {{},{}}는 deep을 붙여줘야함


        // 2차원 배열 내 각 요소를 평균값을 배열로 만들어 출력
        int[] arr_new2 = new int[arr10.length];
        for (int i = 0; i < arr10.length; i++) {
            int total = 0;
            for (int j = 0; j < arr10[i].length; j++) {
                total += arr10[i][j];
            }

            arr_new2[i] = total/arr10[i].length;
        }

        // 가변 배열
        int[][] arr12 = {{1,2,3},{10,20,30},{100,200,300,400},{1000,2000,3000,4000,5000}};
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
*   - 배열의 특징
*       - 배열의 길이는 고정
*       - 동일한 데이터 타입
*       - 인덱스에 의한 접근
*
*   - String[] weeks = {"월","화","수","목","금","토","일"};
*   - 배열의 길이 : weeks.length
*   - weeks[i]은 weeks 배열의 i번째 항목의 값을 의미
*   - 이와 관련돼 자주 발생하는 오류
*       - index에 접근 시 ArrayIndexOutOfBoundsException (배열에 숫자 잘 못 적었을 때)
*           - weeks[7]
*   - 배열의 index에 대한 접근은 for 문과 함께 많이 사용
*       - for (int i = 0; i < weeks.length; i++){
*           System.out.println(weeks[i]);
*         }
*   - 배열의 활용
*       - 배열 합계와 평균 계산
*       - 최대값과 최소값 찾기
*       - 배열 뒤집기
*       - 배열에서 k 번째로 큰 또는 작은 요소 찾기
*           - Arrays의 sort 기능을 활용
*   - Arrays 클래스
*       - 배열을 다루기 위한 다양한 메소드가 포함
*       - Arrays 클래스의 모든 메소드는 클래스 메소드(static method), new 필요 없음
*   - 대표적인 메소드
*       - 출력
*           - Arrays.toString()
*       - 정렬
*           - 오름차순
*               - Arrays.toString()
*           - 내림차순
*               - 오름차순 정렬 후 배열 뒤집기
*               - Comparator 사용
*                   - Arrays.sort(arr, Collections.reverseOrder());
*                   - 해당 내용은 추후 lambda part에서 심화학습 예정
*           - sort 알고리즘 직접 구현 해보기
*               - 선택 정렬
*               - 버블 정렬
*   - 검색
*       - for 문 + break를 통한 직접구현
*       - 이진 검색
*           - 이진 검색 알고리즘이란 가운데에 있는 항목을 키값과 비교하여 다음 탐색 위치를 결정
*           - binarySearch()
*           - sort() 메소드 등을 사용하여 미리 정렬되어 있어야만 이진 검색 제대로 동작
*       - Stream API 활용
*           - 추후 Stream API 파트에서 심화 학습
*   - 비교
*       - equals()
*       - 두 배열의 모든 요소가 동일한지 확인(순서까지 일치해야함)
*   - 배열 복사
*       - copyOf(대상배열, endIndex)
*           - 처음부터 endindex 까지
*           - 대상 배열을 넘어서는 경우 초기값으로 세팅되어 endindex 만큼의 배열의 길이로 세팅
*       - copyOfRange(대상배열, startIndex,endIndex)
*   - 2차원 배열
*       - 배열 안에 또 다른 배열이 있는 경우
*   - 선언 방법 예시
*       - int[][] arr = new int[2][3];
*       - int[][] arr2 = new int[2][]; // 가변 배열, 첫 번째는 없이 쓸 수 없음
*       - int[][] arr3 = {{1,2,3},{1,2,3}};
*       - int[][] arr4 = {{10,20},{10,20,30},{10,20,30,40}};
*/

