import java.util.Scanner;

public class LoginSystem {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String username = "admin";
      String password = "password";

      System.out.print("Digite o nome de usuário: ");
      String inputUsername = scanner.nextLine();

      System.out.print("Digite a senha: ");
      String inputPassword = scanner.nextLine();

      if(inputUsername.equals(username) && inputPassword.equals(password)) {
         System.out.println("Login bem sucedido.");
      } else {
         System.out.println("Nome de usuário ou senha incorretos.");
      }

      scanner.close();
   }
}
