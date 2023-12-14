/**
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 * 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myString) {
        return IntStream.range(0, myString.length()) // 0부터 length -1 까지 정수 스트림 생성 ex) 0,1,2,3 ...
                .mapToObj(myString::substring) // 각 인덱스 별 문자열의 끝까지 자른 문자열 생성
                .sorted().toArray(String[]::new); // 정렬 후 배열로 변환
    }
}
