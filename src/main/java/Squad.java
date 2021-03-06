import java.util.List;
import java.util.ArrayList;

public class Squad{
  private String mName;
  private String mCause;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeroes;

  public Squad(String name, String cause) {
    mName = name;
    mCause = cause;
    instances.add(this);
    mId = instances.size();
    mHeroes = new ArrayList<Hero>();
  }

  public List<Hero> getHeroes(){
      return mHeroes;
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

  public static void clear(){
      instances.clear();
  }

  public int getId(){
      return mId;
  }

  public static Squad find(int id){
      return instances.get(id - 1);
  }

  public void addHero(Hero hero){
      if(mHeroes.size() < 4) {
        mHeroes.add(hero);
    } else {
       // do nothing
    }
      //mHeroes.add(hero);
  }
}
