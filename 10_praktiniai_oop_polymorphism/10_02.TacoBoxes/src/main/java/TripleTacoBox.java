public class TripleTacoBox implements TacoBox {
  private int tacosRemaining = 3;

  public TripleTacoBox() {
  }

  @Override
  public int tacosRemaining() {
    return tacosRemaining;
  }

  @Override
  public void eat() {
    if (tacosRemaining > 0) {
      tacosRemaining--;
    }
  }
}
