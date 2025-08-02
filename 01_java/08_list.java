import java.util.*;

public class C08List {
    public static void main(String[] args) {
        ArrayList<String> pitch = new ArrayList<String>(); // 오른쪽 <> 안에 String은 생략 가능

        // 리스트 선언 방법1
        List<String> pitches = new ArrayList<>(); // 이게 많이 쓰임
        pitches.add("123");
        pitches.add("321");
        System.out.println(pitches);

        // 리스트 선언 방법2 -> 초기값을 세팅하고 시작할 경우
        // List<String> pictches2 = new ArrayList<>(); // 배열처럼{}은 안됨
        List<String> pictches2 = new ArrayList<>(List.of("123","321")); // 9에서 추가
        List<String> pictches3 = new ArrayList<>(Arrays.asList("123","321")); // 이 방법이 더 좋음

        // add
        List<Integer> aList = new ArrayList<>();
        aList.add(10); // 자동 형변환됨
        aList.add(20);
        aList.add(30);

        System.out.println(aList);

        // get(index)
        System.out.println(aList.get(2));

        // size
        System.out.println(aList.size());

        // remove : index로 remove (index가 기본!!!)
        // aList.remove(10); // value로 remove도 가능, 하지만 value로 삭제하고 싶을 때 Integer.valueOf
        aList.remove(Integer.valueOf(10));
        System.out.println(aList);

        List<String> bList = new ArrayList<>();
        bList.add("A");
        bList.add("B");
        bList.add("C");
        bList.add("D");
        bList.remove("D"); // 문자는 괜찮지만 숫자로 할 때는 자바가 헷갈려하니까 valueof 써주기

        // sort : 정렬 -> comparator.naturaOrder, comparator.reverseOrder
        bList.sort(Comparator.naturalOrder());
        System.out.println(bList);
         bList.sort(Comparator.reverseOrder());
        System.out.println(bList);
        // 컬렉션프레임 워크의 sort 기능도 활용할 수 있다. 하지만 위에가 낫다
        Collections.sort(bList); // 오름차순
        System.out.println(bList);
        Collections.sort(bList, Comparator.reverseOrder()); // 내림차순
        System.out.println(bList);

        // contains
        System.out.println(bList.contains("D"));

        // indexOf
        List<String> cList = new ArrayList<>();
        cList.add("java");
        cList.add("python");
        cList.add("javascript");
        cList.add("java");

        // 있으면 첫 번째 index를 return, 없으면 -1을 return
        System.out.println(cList.indexOf("C"));
    }
}
/*
* 자료형 - 컬렉션 프레임워크
*   - 다수의 데이터를 처리하는 클래스의 집합
*       - List 인터페이스, Set 인터페이스, Map 인터페이스 등
*   - 부모클래스의 기능을 상속받다 보니 유사한 메서드들을 많이 공유
*       - contains, equals, isEmpty, size toArray 등
*   - 컬렉션 프레임 워크에서는 자료 타입으로 기본형 타입을 쓸 수 없고 wrapper 클래스를 써야 함에 유의
*       - 객체 사용의 일관성 및 wrapper 클래스에서 제공하는 다양한 기능 사용을 위한 목적
*   - Array는 컬렉션프레임워크에 속하진 않으나, 배열과 컬렉션 프레임워크 간의 변환 및 작업을 위한 도우미 메서드를 제공
*       - Arrays.asList, sort 등
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
*  - 리스트 초기값 생성
*       - 빈 list 생성 후 add
*           - List<String> pitches = new ArrayList<>(Arrays.asList("123","213","321"));
*           - List<String> pitches = new ArrayList<>(List.of("123","213","321"));
*/
/*
* 자료형 리스트의 주요 메서드
*   - add(E element)
*       - 리스트 끛에 지정된 요소를 추가
*   - add(int index, E element)
*       - 특정 index 위치에 요소를 삽입
*   - addAll(Collection<? extends E> c)
*       - 특정 리스트에 다른 특정 리스트 요소를 모두 add
*   - get(int index)
*       - 특정 위치에 있는 요소를 반환
*   - size()
*       - 리스트 안에 있는 요소의 수를 반환
*   - isEmpty()
*       - 리스트가 비어 있는지 여부를 반환
*   - set(int index, E element)
*       - 특정 위치에 있는 요소를 지정된 요소로 대체
*   - contains
*       - contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean 으로 리턴
*   - remove
*       - remove(value)
*           - 리스트에서 해당 항목이 발견되는 맨 앞의 value를 삭제하고 삭제한 결과(true, false)를 리턴
*       - remove
*           - 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴
*   - clear()
*       - 모든 요소를 제거
*   - indexOf(E element)
*       - 지정된 요소가 위치한 인덱스 중 첫번째 값을 반환
*       - 리스트가 해당 요소를 포함하지 않으면 -1을 반환
*   - 리스트의 출력
*       - 이미 toString을 상속하여 내부적으로 호출하고 있으므로 리스트를 출력할 때는 배열과는 다르게 별도로 toString을 호출할 필요는 없음
*       - 그래서 리스트 객체 출렷 시 메모리 주소가 아닌 value 값이 문자열 형태로 출력
*/

/*
* 리스트의 정렬
*   - 컬렉션 클래스를 이용한 정렬
*       - Collection은 List,Set,Queue 등의 상위 인터페이스
*           - Collection에 내장된 메서드는 하위 객체에서 사용가능
*   - List<Integer> numbers = new ArrayList<>();
*       - 오름차순
*           - Collection.sort(numbers);
*       - 내림차순
*           - Collection.sort(numbers, Collection.reverseOrder());
*   - 리스트 내의 내장 함수 이용
*       - java9 이상부터 사용
*       - List<Integer> numbers = new ArrayList<>();
*           - 오름차순
*               - numbers.sort(Comparator.naturalOrder());
*           - 내림차순
*               - numbers.sort(Comparator.reverseOrder());
*       - Comparator
*           - JAVA 에서 두 객체를 비교하는 함수형 인터페이스
*           - 주로 객체들의 컬렉션을 정렬할 때 사용
*           - 주로 객체의 정렬을 customizing 할 때 사용
*               - 예를 들어, 학생 객체의 성적별 정렬
*               - 추후 학습
*/
/*
* 중요하진 않지만 알면 좋음!! (*코테*)
* 배열에서 리스트로
*   - String 배열 → String 리스트
*       - String[] data = {"138", "129", "142"};
*       - for 문으로 담는 방식
*       - Arrays.asList 사용하는 방식
*           - List<String> pitches = new ArrayList<>(Arrays.asList(data));
*       - Stream 방식
*           - 스트림의 경우 foreach 문을 좀 더 편하게 한 방식 정도로만 이해. 추후 학습
*           - List<String> pitches = Arrays.stream(data).collect(Collectors.toList());
*           - collect 메서드는 스트림의 요소를 수집(collect)하여 원하는 형식의 컬렉션으로 변환하는 데 사용
*   - int 배열 → Integer 리스트
*       - int[] data = {1,2,3};
*       - for 문으로 담는 방식
*           - 오토박싱 되어 문제 발생X
*       - stream 방식
*           - List<Integer> pitches = Arrays.stream(data).boxed().collect(Collectors.toList());
*           - int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해 boxed() 메소드 사용
*           - String은 형변환 이슈가 없지만 기본자료형은 wrapper 클래스를 사용해야 함에 유의
* 리스트에서 배열로
*   - String 리스트 → String 배열
*       - List<String> pitches = new ArrayList<>();
*         pitches.add("hello");
*         pitches.add("world");
*       - for 문으로 담는 방식
*           - String[] test1 = new String[pitches.size()];
*           - 배열에 담으려면 위와 같이 배열의 길이를 사전에 지정해야 함에 유의
*       - toArray 방식
*           - String[] test2 = pitches.toArray(new String[pitches.size()]);
*           - toArray를 사용하여 list를 array로 변환하되, new String을 통해 타입과 배열 길이를 지정한 것
*   - Integer 리스트 → int 배열
*       - List<Integer> pitches2 = new ArrayList<>(); pitches2.add(10); pitches2.add(20);
*       - for 문으로 담는 방식
*       - String 에서의 단순한 toArray 방식은 형변환 문제 발생함에 유의
*           - int[] new_arr = pitches2.toArray(new Integer[pitches2.size()]);
*       - stream 방식
*           - int[] new_data2 = pitches2.stream().mapToInt(a->a.intValue()).toArray();
*           - 스트림을 통해 Integer를 int로 변환한 후에 toArray
* 리스트와 Array 에서 문자열로
*   - String.join("구분자", 리스트객체 또는 배열)
*       - 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로
*       - 구분자에 공백을 넣을 경우 하나의 문자열로 합치는 효과
*/