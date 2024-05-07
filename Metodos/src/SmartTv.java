public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarSom() {
    volume++;
  }

  public void abaixarSom() {
    volume--;
  }

  public void mudarCanal(int escolher) {
    canal = escolher;
  }
}
