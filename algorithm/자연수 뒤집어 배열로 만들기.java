/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */



class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}

// ==========================================

import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse()
          .chars() // 각 문자의 ASCII 코드 값을 얻습니다.
          .map(Character::getNumericValue) //  각 문자의 숫자 값을 얻습니다.
          .toArray();
    }
}

