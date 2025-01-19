import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidString implements Validatable<String>{
  private String text;
  String nameRegex = "[!#$%&*+,.\\/:;<=>?@\\\\^`{|}~\\x00-\\x20]";
  String descriptionRegex = "[#$%&*+/<=>?@\\\\^`{|}~\\x00-\\x20]";


  public ValidString(String text) {
    this.text = text;
  }

  public String ValidateName() {
    text = text.replaceAll(nameRegex, "");
    if (text.length() < 2 || text.length() > 30) {
      System.out.print("Invalid name length. ");
      throw new NumberFormatException();
    }
    return text;
  }

  public String ValidateDescription() {
    text = text.replaceAll(descriptionRegex, "");
    if (text.length() < 10 || text.length() > 255) {
      System.out.print("Invalid description length. ");
      throw new NumberFormatException();
    }
    return text;
  }

  @Override
  public String validate() {
    return text;
  }
}
