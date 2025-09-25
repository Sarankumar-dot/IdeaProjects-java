public class ValidPan {
    public static void main(String[] args) {
        String pan = "ABCDE7777K";
        String num = "763942829";
        String mail = "sarankumark22cb@psnacet.edu.in";
        String PassWord = "Saran=2004";

        String passCheck = "^[A-Z]{1}[a-z]{4}[@=#$!^&*]{1}[0-9]{4}";
        if(PassWord.matches(passCheck)){
            System.out.println("valid pass");
        }else{
            System.out.println("invalid pass");
        }

        String mailCheck = "^\\w+\\@\\w+\\.\\w+$";
        String mailcheck2 = "^\\w+\\@\\w+\\.\\w+\\.\\w+";
        if(mail.matches(mailCheck) || mail.matches(mailcheck2)){
            System.out.println("this is a valid mail");
        }else{
            System.out.println("this is an invalid mail");
        }
        String numCheck = "^[0-9]{10}$";
        if(num.matches(numCheck)){
            System.out.println("it is a phone number");
        }else {
            System.out.println("not a phone number");
        }

        String panCheck = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";

        if(pan.matches(panCheck)){
            System.out.println("valid pan");
        }else{
            System.out.println("invalid pan");
        }
    }
}
