public class Squad{
  private String mName;
  private String mCause;

  public Squad(String name, String cause) {
    mName = name;
    mCause = cause;
  }

  public String getName(){
      return mName;
  }

  public String getCause(){
      return mCause;
  }
}
