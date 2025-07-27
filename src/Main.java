//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Graphics.basicString("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Graphics.brightString("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Graphics.basicBackground("Hello World", BasicColor.BLUE) + " Hello World");
//        System.out.println(Graphics.brightBackground("Hello World", BasicColor.BLUE) + " Hello World");
        //System.out.println("\u001b[96mHello World!\u001b[39mtest");

//        Graphics.Color.enableString(BasicColor.BLACK);
//        Graphics.Color.enableBackground(BasicColor.CYAN);
//        Graphics.Style.enableBold();
//        Graphics.Style.enableItalic();
//        System.out.print("Hello World!");
//        Graphics.Style.disableItalic();
//        Graphics.Color.disableForeground();
//        Graphics.Color.disableBackground();
//        System.out.println("Next line");

        System.out.println(Graphics.Style.italic("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableItalic();
        System.out.println("Italic");
        Graphics.Style.disableItalic();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(Graphics.Style.underline("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableUnderline();
        System.out.println("Underline");
        Graphics.Style.disableUnderline();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(Graphics.Style.blinking("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableBlinking();
        System.out.println("This should blink.");
        Graphics.Style.disableBlinking();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(Graphics.Style.inverseReverse("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableInverseReverse();
        System.out.println("I don't know what to expect here.");
        Graphics.Style.disableInverseReverse();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(Graphics.Style.hiddenInvisible("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableHiddenInvisible();
        System.out.println("This will be our little secret.");
        Graphics.Style.disableHiddenInvisible();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(Graphics.Style.strikethrough("Hello World!"));
        System.out.println("No pass.");
        Graphics.Style.enableStrikethrough();
        System.out.println("This is incorrect.");
        Graphics.Style.disableStrikethrough();
        System.out.println("No attribute here");
        System.out.println("*****************************");

    }
}