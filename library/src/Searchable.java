import java.util.ArrayList;

public interface Searchable {

    public boolean matches(String keyword, ArrayList<String> item);
    public ArrayList<String> getinfo();

}
