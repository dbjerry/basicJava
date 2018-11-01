package i_collection;

public class CollectionBasic {
	public static void main(String[] args) {
		/*
		1. collection Framework
			1) 의미
				- collection은 다수의 데이터(데이터 그룹)
				Framework 표준화된 프로그램 방식
		
			2) 핵심interface
				- List
					: 순서가 있다, 데이터의 중복을 허용한다.(대기자명단)
					: *ArrayList, LinkedList, Stack, Vector
				- Set
					: 순서가 없다, 중복을 비허용한다.(양의 정수의 집합, 소수의 집합)
					: *HashSet, TreeSet..
				- Map
					: 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합
					: 키는 중복을 비허용, 값은 중복을 허용한다.(지역번호, 우편번호)
					: HashTable, *HashMap, TreeMap, Properties..
				
		2. List
			- Vector와 ArrayList // <= Collection_ArrayList.java
				: Vector는 동기화를 보장한다.
				: Object배열을 이용해서 데이터를 순차적으로 저장한다.
				(add하면 0번방부터 순차적으로 쌓인다는 의미)
				: 배열이 커져서 기존 배열크기로 안될 때 새로운 배열을 만들어
				배열을 복사하게 된다.
		
			- LinkedList
				: 배열의 단점을 보완하기 위해 만들어짐
			
			- DoubleLinkedList : 머리과 꼬리를 생성하여 머리와 꼬리로 연결
		
		3. Stack과 Queue
			- Stack
				: FILO, LIFO
				: 저장할 때는 push()
				: 추출할 때는 pop()
				: 맨 위 객체 반환 : peek()
				: 주어진 객체 찾기 : search()
				
			- Queue
				: FIFO
				: 저장할 때는 offer()
				: 추출할 때는 poll()
		
		4. HashMap과 HashTable
			- HashTable의 최신버전이 HashMap임으로 HashMap을 사용
			- Map의 특징은 키와 값으로 묶어 하나의 데이터로 저장된다.
			- Map<Object, Object> 일반적으로 key의 경우
			String으로 통일해서 사용한다.
			- key의 경우 유일해야한다.
		
		
		*/
	}
}
