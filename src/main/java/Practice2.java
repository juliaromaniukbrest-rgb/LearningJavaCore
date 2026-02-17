public class Practice2 {

  public static void main(String[] args) {
    getMax(7, 7);
    getMax(3, 4);
    getMax(1, 2);
    isOld(45);
    isOld(25);
  }

  public static void getMax(int a, int b) {
    if (a > b) {
      System.out.println(a);
    } else if (a < b) {
      System.out.println(b);
    } else {
      System.out.println(b);
    }
  }

  public static void isOld(int age) {
    if (age > 35) {
      System.out.println("old");
    } else {
      System.out.println("young");
    }
  }
}
