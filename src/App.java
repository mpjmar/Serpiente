public class App {

    public static final String CLEAN_SCREEN = "\033[H\033[2J";
    public static void main(String[] args) throws Exception {
        
        int pos = (int)(Math.random() * 3) - 1;
        int cabeza = 10;

        System.out.print("Intrduce la longitud de la serpiente: ");
        int longitud = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= cabeza; i++)
            System.out.print(i < cabeza ? ' ' : '@');
        System.out.println();
        do { 
            for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < cabeza + pos; j++) {
                    System.out.println('*');   
                    pos = (int)(Math.random() * 3) - 1;         
                }
            }
            Thread.sleep(100);
            System.out.println(CLEAN_SCREEN);
        } while (true);
    }
}
