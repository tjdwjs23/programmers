/**
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 */

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.iterate(0, i -> i + 1)
                        .limit(num_list.length + 1)
                        .map(i -> i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i])
                        .toArray();
    }
}
