import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Programa = new Scanner(System.in);
        int pg = 0;
        System.out.println("Bem vindo aplicativo de Streaming, escolha as opções: ");
        System.out.println("1 - Netflix");
        System.out.println("2 - Crunchyroll");
        System.out.println("3 - Youtube");
        pg =Programa.nextByte();
        switch (pg) {
            case 1:
                System.out.println("É otimo pra ver séries! ");
                break;
            case 2:
                System.out.println("É ótimo para ver animes!! ");
                break;
            case 3:
                System.out.println("Eu uso para assistir podcast! ");
            default:
                System.out.println("É outro aplicativo de Streaming! ");
        }

    }
}