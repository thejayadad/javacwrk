public class Recursion {


    public static void main(String[] args) {
        System.out.println("The Count has started!");
        countDown(10);
        System.out.println("DONE!");
    }

    public static void countDown(int count) {
        if(count == 0) return;
        System.out.println(count + "...");
        countDown( count -1);
    }
}
