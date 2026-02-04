package ex_25_ENUM;

public enum Locators {
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private String locator;
    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}
