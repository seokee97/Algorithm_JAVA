package datastructure.list;

import java.util.Arrays;
import java.util.Collections;

/**
 * Arrays 클래스 : 배열을 쉽게 다루기 위한 클래스
 * -> import java.util.Arrays; 임포를 먼저 해줍니다.
 * <p>
 * 주로 사용하는 함수
 * 1. Arrays.binarySearch(배열, 검색할 단어)
 * 2. Arrays.copyOf(배열, 배열에서 카피할 요소의 갯수)
 * 3. Arrays.copyOfRange(배열, 시작할 인덱스, 끝 인덱스)
 * 4. Arrays.fill(배열, 초기화 할 값)
 * 5. Arrays.sort(배열)
 * 6. Arrays.toString(배열)
 */
public class List_Arrays {
    public static void main(String[] args) {
        Integer[] iArr = new Integer[]{5, 6, 4, 7, 3, 8, 2, 9, 1};

        //배열을 출력 -> Arrays.toString(배열)
        System.out.println(Arrays.toString(iArr));

        //배열을 오름차순으로 정렬
        Arrays.sort(iArr);
        System.out.println("sort : " + Arrays.toString(iArr));

        //검색할 요소의 위치를 반환 -> binarySearch(배열, 값)
        // 이 함수를 사용할 때에는 미리 정렬이 되어 있어야 한다!!
        System.out.println("binarySearch(7) : " + Arrays.binarySearch(iArr, 7));

        //내림차순으로 정렬
//        Arrays.sort(iArr, Comparator.reverseOrder());
        Arrays.sort(iArr, Collections.reverseOrder());
        System.out.println("sort - Reverse : "+Arrays.toString(iArr));

        //배열의 모든 요소를 특정 값으로 초기화
        //    ->  Arrays.fill(배열, 초기화 할 값)
        Arrays.fill(iArr, 3);
        System.out.println("fill : " + Arrays.toString(iArr));

    }
}
