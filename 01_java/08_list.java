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