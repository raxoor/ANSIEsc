//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{

        ANSI.Color.enableString(ANSI.BasicColor.BLACK);
        ANSI.Color.enableBackground(ANSI.BasicColor.CYAN);
        ANSI.Style.enableBold();
        ANSI.Style.enableItalic();
        System.out.print("Hello World!");
        ANSI.Style.disableItalic();
        ANSI.Color.disableForeground();
        ANSI.Color.disableBackground();
        System.out.println("Next line");

        System.out.println(ANSI.Style.italic("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableItalic();
        System.out.println("Italic");
        ANSI.Style.disableItalic();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(ANSI.Style.underline("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableUnderline();
        System.out.println("Underline");
        ANSI.Style.disableUnderline();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(ANSI.Style.blinking("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableBlinking();
        System.out.println("This should blink.");
        ANSI.Style.disableBlinking();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(ANSI.Style.inverseReverse("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableInverseReverse();
        System.out.println("I don't know what to expect here.");
        ANSI.Style.disableInverseReverse();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(ANSI.Style.hiddenInvisible("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableHiddenInvisible();
        System.out.println("This will be our little secret.");
        ANSI.Style.disableHiddenInvisible();
        System.out.println("No attribute here");
        System.out.println("*****************************");

        System.out.println(ANSI.Style.strikethrough("Hello World!"));
        System.out.println("No pass.");
        ANSI.Style.enableStrikethrough();
        System.out.println("This is incorrect.");
        ANSI.Style.disableStrikethrough();
        System.out.println("No attribute here");
        System.out.println("*****************************");


        ANSI.Cursor.savePositionDEC();
        //ANSI.Cursor.moveUp(3);
        System.out.println(ANSI.Color.colorString("Hello world!", 5,61, 245));
        ANSI.Color.enableColor(200,21,232);
        System.out.println("Hello there!");
        ANSI.Color.disableForeground();
        ANSI.Color.enableBackground(238,228,240);
        System.out.println("Finished");
        //ANSI.Color.disableBackground();
        ANSI.reset();
        System.out.println("Hello World!");
        System.out.println("Another line");
        System.out.println("Another one");
        System.out.println(ANSI.Color.colorBackground("Orange", 245,152,12));
        //ANSI.saveScreen();


    }
}