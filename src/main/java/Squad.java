import java.util.List;
import java.util.ArrayList;

public class Squad{
  private String mName;
  private String mCause;
  private static List<Squad> instances = new ArrayList<Squad>();

  public Squad(String name, String cause) {
    mName = name;
    mCause = cause;
    instances.add(this);
  }

  public String getName(){
      return mName;
  }

  public String getCause(){
      return mCause;
  }

  public static List<Squad> all(){
      return instances;
  }
}
