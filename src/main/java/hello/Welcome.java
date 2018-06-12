package hello;

public class Welcome {

    

    public static void main(String[] args){
        Message myMessage = new Message();
        myMessage.setMessage("Welcome to CI/CD");
        System.out.println(myMessage.getMessage());
    }

}
