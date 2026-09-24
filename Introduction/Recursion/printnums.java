
package Recursion;

public class printnums {
    public static void printNumbers(int n){
    if(n>10){
        return;
    }
    System.out.print(n+" ");
    printNumbers(n+1);
  }
  public static void main(String[] args) {
  printNumbers(0);
}
}
