package alguma;


public class App {
    public static void main(String[] args) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        Token t = null;       
        while((t=lex.proximoToken()).nome != TipoToken.Fim) {
            System.out.println(t);
        }
    }
}