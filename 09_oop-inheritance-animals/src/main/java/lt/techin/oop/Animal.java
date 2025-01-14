package lt.techin.oop;

public class Animal {
  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  public Animal (String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    StringBuilder description = new StringBuilder();
    description.append("This animal is mostly ").append(color).
            append(". It has ").append(numberOfPaws);
    if (numberOfPaws == 1) {
      description.append(" paw and a fur.");
    } else {
      description.append(" paws and a fur.");
    }
    return description.toString();
  }
}
