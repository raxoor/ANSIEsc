public enum BasicColor {
    BLACK('0'),
    RED('1'),
    GREEN('2'),
    YELLOW('3'),
    BLUE('4'),
    MAGENTA('5'),
    CYAN('6'),
    WHITE('7'),
    DEFAULT('9');

    private final char code;

    BasicColor(char code) {
        this.code = code;
    }

    public char getCode(){
        return this.code;
    }
}
