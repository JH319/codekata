// 숫자 비교하기

// 문제 설명
// 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

// 제한사항
// 0 ≤ num1 ≤ 10,000
// 0 ≤ num2 ≤ 10,000

package day1;

// 내 풀이
//public class No5 {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 == num2){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//    }
//}

// 다른 사람의 풀이
// 삼항연산자를 사용해서 코드가 더 깔끔한 것 같다.

public class No5 {
        public int No5(int num1, int num2) {
            int answer = (num1 == num2) ? 1 : -1;
            return answer;
    }
}