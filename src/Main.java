public class Main{
    public static void main(String[] args) {
        IDPassword idpassword = new IDPassword();
        LoginPage Loginpage = new LoginPage(idpassword.getLogininfo());
    }
}