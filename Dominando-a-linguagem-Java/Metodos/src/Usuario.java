public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.ligar();
    smartTv.aumentarSom();
    smartTv.mudarCanal(13);
    System.out.println("\nNovo Status -> tv ligada? " + smartTv.ligada);
    System.out.println("Volume da TV: " + smartTv.volume);
    System.out.println("Canal atual: " + smartTv.canal);
  }
  
}
