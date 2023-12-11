/**
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 */


import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> filtered = IntStream.rangeClosed(l, r) // l부터 r까지의 정수 범위를 생성하는 스트림
                .filter(num -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5')) // 주어진 숫자가 "0"과 "5"로만 이루어진 숫자인지 확인하는 조건을 만족하는 숫자만 필터링
                .boxed() // 각 숫자를 Integer 객체로 박싱하여 스트림의 요소를 객체형으로 변경
                .collect(Collectors.toList()); // 스트림의 요소를 리스트로 수집
        return filtered.isEmpty() ? new int[] {-1} : filtered.stream().mapToInt(Integer::intValue).toArray(); : 비어있지 않으면 리스트를 배열로 변환하여 반환
    }
}
