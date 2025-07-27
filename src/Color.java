public abstract class Color {
    public static final char FOREGROUND = '3';
    public static final char FOREGROUND_BRIGHT = '9';
    public static final char BACKGROUND = '4';
    public static final String BACKGROUND_BRIGHT = "10";
    public static final String ESC = "\u001b[";
    public static final char SGR = 'm'; //Set Graphics mode
    public static final String RESET_FOREGROUND = ESC + FOREGROUND + BasicColor.DEFAULT.getCode() + SGR;
    public static final String RESET_BACKGROUND = ESC + BACKGROUND + BasicColor.DEFAULT.getCode() + SGR;

    /**Resets all applied attributes*/
    public static void reset(){
        System.out.print(ESC + "0" + SGR);
    }

    /**Returns a string with an applied color, from the basic color palette*/
    public static String basicString(String string, BasicColor color){
        return ESC + FOREGROUND + color.getCode() + SGR + string + RESET_FOREGROUND;
    }

    /**Returns a string with an applied color, from the basic bright color palette*/
    public static String brightString(String string, BasicColor color){
        return ESC + FOREGROUND_BRIGHT + color.getCode() + SGR + string + RESET_FOREGROUND;
    }

    /**Returns a string with an applied background color, from the basic color palette*/
    public static String basicBackground(String string, BasicColor color){
        return ESC + BACKGROUND + color.getCode() + SGR + string + RESET_BACKGROUND;
    }

    /**Returns a string with an applied background color, from the basic bright color palette*/
    public static String brightBackground(String string, BasicColor color){
        return ESC + BACKGROUND_BRIGHT + color.getCode() + SGR + string + RESET_BACKGROUND;
    }

    /**Toggles on a color from the basic color palette, to turn it off use toggleOffForeground() or reset()*/
    public static void toggleString(BasicColor color){
        System.out.print(ESC + FOREGROUND + color.getCode() + SGR);
    }

    /**Toggles on a color from the basic bright color palette, to turn it off use toggleOffForeground() or reset()*/
    public static void toggleBrightString(BasicColor color){
        System.out.print(ESC + FOREGROUND_BRIGHT + color.getCode() + SGR);
    }

    /**Toggles on a text background color from the basic color palette, to turn it off use toggleOffBackground() or reset()*/
    public static void toggleBackground(BasicColor color){
        System.out.print(ESC + BACKGROUND + color.getCode() + SGR);
    }

    /**Toggles on a text background color from the basic bright color palette, to turn it off use toggleOffBackground() or reset()*/
    public static void toggleBrightBackground(BasicColor color){
        System.out.print(ESC + BACKGROUND_BRIGHT + color.getCode() + SGR);
    }

    /**Turns off the applied text color attribute*/
    public static void toggleOffForeground() {
        System.out.print(RESET_FOREGROUND);
    }

    /**Turns off the applied text color background attribute*/
    public static void toggleOffBackground(){
        System.out.print(RESET_BACKGROUND);
    }
    
}
