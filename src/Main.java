//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Color.basicString("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Color.brightString("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Color.basicBackground("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Color.brightBackground("Hello World", BasicColor.BLUE) + " Hello World");
        //System.out.println("\u001b[96mHello World!\u001b[39mtest");
        Color.toggleString(BasicColor.CYAN);
        Color.toggleBrightBackground(BasicColor.WHITE);
        System.out.print("Hello World!");
        Color.reset();
        System.out.println("Next line");
    }
}