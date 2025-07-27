public abstract class Graphics {

    private static final String ESC = "\u001b[";
    private static final char SGR = 'm'; //Set Graphics mode


    /**Resets all applied attributes*/
    public static void reset(){
        System.out.print(ESC + "0" + SGR);
    }


    public static class Style{
        private static final char BOLD = '1';
        private static final char DIM = '2';
        private static final String RESET_BOLD_DIM = ESC + "22" + SGR;
        private static final char ITALIC = '3';
        private static final String RESET_ITALIC = ESC + "23" + SGR;
        private static final char UNDERLINE = '4';
        private static final String RESET_UNDERLINE = ESC + "24" + SGR;
        private static final char BLINKING = '5';
        private static final String RESET_BLINKING = ESC + "25" + SGR;
        private static final char INVERSE_REVERSE = '7';
        private static final String RESET_INVERSE_REVERSE = ESC + "27" + SGR;
        private static final char HIDDEN_INVISIBLE = '8';
        private static final String RESET_HIDDEN_INVISIBLE = ESC + "28" + SGR;
        private static final char STRIKETHROUGH = '9';
        private static final String RESET_STRIKETHROUGH = ESC + "29" + SGR;


        /**Returns a string with the bold attribute applied*/
        public static String bold(String string){
            return ESC + BOLD + SGR + string + RESET_BOLD_DIM;
        }

        /**Enables bold for all output, turn off with disableBoldAndDim() or Graphics.reset()*/
        public static void enableBold(){
            System.out.print(ESC + BOLD + SGR);
        }

        /**Returns a string with the dim attribute applied.
         Might not work on terminals without full ANSI support.*/
        public static String dim(String string){
            return ESC + DIM + SGR + string + RESET_BOLD_DIM;
        }

        /**Enables dim for all output, turn off with disableBoldAndDim() or Graphics.reset()
         Might not work on terminals without full ANSI support.*/
        public static void enableDim(){
            System.out.print(ESC + DIM + SGR);
        }

        /**Disables the bold and dim attributes*/
        public static void disableBoldAndDim(){
            System.out.print(RESET_BOLD_DIM);
        }

        /**Returns a string with the italic attribute applied*/
        public static String italic(String string){
            return ESC + ITALIC + SGR + string + RESET_ITALIC;
        }

        /**Enables italic for all output, turn off with disableItalic() or Graphics.reset()*/
        public static void enableItalic(){
            System.out.print(ESC + ITALIC + SGR);
        }

        /**Disables the italic attribute*/
        public static void disableItalic(){
            System.out.print(RESET_ITALIC);
        }

        /**Returns a string with the underline attribute applied*/
        public static String underline(String string){
            return ESC + UNDERLINE + SGR + string + RESET_UNDERLINE;
        }

        /**Enables underline for all output, turn off with disableUnderline() or Graphics.reset()*/
        public static void enableUnderline(){
            System.out.print(ESC + UNDERLINE + SGR);
        }

        /**Disables the underline attribute*/
        public static void disableUnderline(){
            System.out.print(RESET_UNDERLINE);
        }

        /**Returns a string with the blinking attribute applied
         Might not work on terminals without full ANSI support.*/
        public static String blinking(String string){
            return ESC + BLINKING + SGR + string + RESET_BLINKING;
        }

        /**Enables blinking for all output, turn off with disableBoldAndDim() or Graphics.reset()
         Might not work on terminals without full ANSI support.*/
        public static void enableBlinking(){
            System.out.print(ESC + BLINKING + SGR);
        }

        /**Disables the blinking attribute*/
        public static void disableBlinking(){
            System.out.print(RESET_BLINKING);
        }

        /**Returns a string with the inverse/reverse attribute applied
         Might not work on terminals without full ANSI support.*/
        public static String inverseReverse(String string){
            return ESC + INVERSE_REVERSE + SGR + string + RESET_INVERSE_REVERSE;
        }

        /**Enables inverse/reverse for all output, turn off with disableInverseReverse() or Graphics.reset()
         Might not work on terminals without full ANSI support.*/
        public static void enableInverseReverse(){
            System.out.print(ESC + INVERSE_REVERSE + SGR);
        }

        /**Disables the inverse/reverse attribute*/
        public static void disableInverseReverse(){
            System.out.print(RESET_INVERSE_REVERSE);
        }

        /**Returns a string with the hidden/invisible attribute applied
         Might not work on terminals without full ANSI support.*/
        public static String hiddenInvisible(String string){
            return ESC + HIDDEN_INVISIBLE + SGR + string + RESET_HIDDEN_INVISIBLE;
        }

        /**Enables hidden/invisible for all output, turn off with disableHiddenInvisible() or Graphics.reset()
         Might not work on terminals without full ANSI support.*/
        public static void enableHiddenInvisible(){
            System.out.print(ESC + HIDDEN_INVISIBLE + SGR);
        }

        /**Disables the hidden/invisible attribute*/
        public static void disableHiddenInvisible(){
            System.out.print(RESET_HIDDEN_INVISIBLE);
        }

        /**Returns a string with the strikethrough attribute applied*/
        public static String strikethrough(String string){
            return ESC + STRIKETHROUGH + SGR + string + RESET_STRIKETHROUGH;
        }

        /**Enables strikethrough for all output, turn off with disableStrikethrough() or Graphics.reset()*/
        public static void enableStrikethrough(){
            System.out.print(ESC + STRIKETHROUGH + SGR);
        }

        /**Disables the strikethrough attribute*/
        public static void disableStrikethrough(){
            System.out.print(RESET_STRIKETHROUGH);
        }


    }

    public static class Color {
        private static final char FOREGROUND = '3';
        private static final char FOREGROUND_BRIGHT = '9';
        private static final char BACKGROUND = '4';
        private static final String BACKGROUND_BRIGHT = "10";
        private static final String RESET_FOREGROUND = ESC + FOREGROUND + BasicColor.DEFAULT.getCode() + SGR;
        private static final String RESET_BACKGROUND = ESC + BACKGROUND + BasicColor.DEFAULT.getCode() + SGR;

        /**
         * Returns a string with an applied color, from the basic color palette
         */
        public static String basicString(String string, BasicColor color) {
            return ESC + FOREGROUND + color.getCode() + SGR + string + RESET_FOREGROUND;
        }

        /**
         * Returns a string with an applied color, from the basic bright color palette
         */
        public static String brightString(String string, BasicColor color) {
            return ESC + FOREGROUND_BRIGHT + color.getCode() + SGR + string + RESET_FOREGROUND;
        }

        /**
         * Returns a string with an applied background color, from the basic color palette
         */
        public static String basicBackground(String string, BasicColor color) {
            return ESC + BACKGROUND + color.getCode() + SGR + string + RESET_BACKGROUND;
        }

        /**
         * Returns a string with an applied background color, from the basic bright color palette
         */
        public static String brightBackground(String string, BasicColor color) {
            return ESC + BACKGROUND_BRIGHT + color.getCode() + SGR + string + RESET_BACKGROUND;
        }

        /**
         * enables on a color from the basic color palette, to turn it off use disableForeground() or Graphics.reset()
         */
        public static void enableString(BasicColor color) {
            System.out.print(ESC + FOREGROUND + color.getCode() + SGR);
        }

        /**
         * enables on a color from the basic bright color palette, to turn it off use disableForeground() or Graphics.reset()
         */
        public static void enableBrightString(BasicColor color) {
            System.out.print(ESC + FOREGROUND_BRIGHT + color.getCode() + SGR);
        }

        /**
         * enables on a text background color from the basic color palette, to turn it off use disableBackground() or Graphics.reset()
         */
        public static void enableBackground(BasicColor color) {
            System.out.print(ESC + BACKGROUND + color.getCode() + SGR);
        }

        /**
         * enables on a text background color from the basic bright color palette, to turn it off use disableBackground() or Graphics.reset()
         */
        public static void enableBrightBackground(BasicColor color) {
            System.out.print(ESC + BACKGROUND_BRIGHT + color.getCode() + SGR);
        }

        /**
         * Turns off the applied text color attribute
         */
        public static void disableForeground() {
            System.out.print(RESET_FOREGROUND);
        }

        /**
         * Turns off the applied text color background attribute
         */
        public static void disableBackground() {
            System.out.print(RESET_BACKGROUND);
        }
    }
}
