public abstract class user {
    private string name;
    private int id;

    public user(String name,int id ){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

     public String getid() {
        return id;
    }
     public void setName(String name) {
     this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public abstract String getRole();
    }


