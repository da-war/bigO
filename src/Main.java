public class Main {
    public static void main(String[] args) {
//        0(n) time complexity because it's running numbers.length time
        int[] numbers= {1,2,3,4,5};
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}



//        O(1) time complexity because it's running in the constant time
//        System.out.println("Hello world!");
//        System.out.println("hello world 2");