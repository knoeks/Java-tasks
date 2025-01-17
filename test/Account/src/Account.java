import java.util.Date;

public class Account {
  private String id;
  private Date date;

  public Account(Date date, String id) {
    this.date = date;
    this.id = id;
  }

  public String getDate() {
    return date.toString();
  }
}
