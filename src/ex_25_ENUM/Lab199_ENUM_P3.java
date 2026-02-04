package ex_25_ENUM;

public class Lab199_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_CODES.RED.getHexcode());



    }
}

// Automation we have store the hex code - colors

enum HEX_CODES{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    HEX_CODES(String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode(){
        return this.hexcode;
    }


}