public class Ex12 {
    public static void main(String[] args){
        //variable
        int answer = 0;
        //input
        //process
//        for(int i = 1; i <= 100; i++ ){
//            if(i % 7 == 0){
//                answer += i;
//            }
//        }
        for(int i = 1; i <= 100 / 7; i++ ){
            answer += i * 7;
        }
        //output
        System.out.println("The sum of numbers that are multiples of 7 is " + answer);

    }
}//tìm kiếm thêm các thuật toán
// W01Ex12
