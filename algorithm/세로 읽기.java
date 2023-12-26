/**
 * 문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
*/


import java.util.stream.*;

class Solution {
    public String solution(String myString, int m, int c) {
        return IntStream.range(0, myString.length())
            .filter(i -> i % m == c - 1)
            .mapToObj(i -> String.valueOf(myString.charAt(i))) // m의 배수 중에서 c - 1과 일치하는 인덱스만 필터링합니다. 이것은 세로로 c번째 열에 해당하는 문자의 인덱스를 찾는 조건입니다.
            .collect(Collectors.joining());
    }
}
