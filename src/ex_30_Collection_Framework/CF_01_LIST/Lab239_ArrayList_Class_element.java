package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {

        APIAutomation appvwoLogin = new APIAutomation("vwo","https://app.vwo.com");
        APIAutomation katalonStudio = new APIAutomation("katalon","https://cura.katalon.com");
        APIAutomation ttaBank = new APIAutomation("ttaBank","https://tta-bank-digital-973242068062.us-west1.run.app/");


        List<APIAutomation> apiAutomationList = new ArrayList<>();
        apiAutomationList.add(appvwoLogin);
        apiAutomationList.add(katalonStudio);
        apiAutomationList.add(ttaBank);

        appvwoLogin.printDetails();
        katalonStudio.printDetails();
        ttaBank.printDetails();



    }
}

class APIAutomation{
    private String appName;
    private String urls;

    public APIAutomation(String appName, String urls) {
        this.appName = appName;
        this.urls = urls;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public void printDetails(){
        System.out.println("Information : " +  this.appName +" - "+  this.urls);
    }



}