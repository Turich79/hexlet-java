package hexlet.code;

public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean isEqual(User user2){
        if(id == user2.getId()){
            return true;
        } else {
            return false;
        }
    }
}
