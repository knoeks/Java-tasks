public class CustomTacoBox implements TacoBox {
  private int tacosRemaining;

  public CustomTacoBox(int tacosRemaining) {
    this.tacosRemaining = tacosRemaining;
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
