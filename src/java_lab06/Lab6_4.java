package java_lab06;

public class Lab6_4 {
    public static void main(String[] args) {
        String url = "https://sdetpro.com/";
        getInfor(url);
    }

    private static void getInfor(String url) {
        int checkProtocol = url.indexOf("https");
        int checkDomain = url.indexOf(".com");
        if (checkProtocol >= 0) {
            System.out.println("Protocol is: https");
        } else {
            System.out.println("Protocol is: http");
        }
        String domainName = url.substring(url.indexOf("/") + 2, url.indexOf("."));
        System.out.println("Domain name is: " + domainName);
        if (checkDomain >= 0) {
            System.out.println("Domain is: .com");
        } else {
            System.out.println("Domain is: .net");
        }
    }
}
