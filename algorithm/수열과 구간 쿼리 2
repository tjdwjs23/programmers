/**
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 */

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        return IntStream.range(0, queries.length) // IntStream.range(0, queries.length): 0부터 queries.length-1까지의 인덱스를 생성하는 IntStream
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1]) // queries[q][0]부터 queries[q][1]까지의 인덱스를 생성하는 IntStream
                .map(i -> arr[i]) // .map(i -> arr[i]): 각 인덱스에 해당하는 arr의 값을 매핑
                .filter(i -> i > queries[q][2]) // arr의 값 중 queries[q][2]보다 큰 값들만 필터링
                .min().orElse(-1) // 필터링된 값들 중 최솟값을 찾아 반환하며 값이 없을 경우 -1을 반환
                ).toArray(); // 최종 결과를 배열로 변환
    }
}


        
        
        
        
        
        
