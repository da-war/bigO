public class Main {
    public static void main(String[] args) {
//        0(n) time complexity because it's running numbers.length time
        //by adding two print statements the time complexity should be O(2+n) but in such cases we drop the constants and it becomes O(n)
        System.out.println("something");
        int[] numbers= {1,2,3,4,5};
        for (int number :numbers){
            System.out.println(number);
        }
        System.out.println("something");
    }
}



//        O(1) time complexity because it's running  in the constant time
//        System.out.println("Hello world!");
//        System.out.println(" hello world 2");