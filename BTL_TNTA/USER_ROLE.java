public enum USER_ROLE {
    User(1, "User"),
    Admin(2, "Admin");

    private int id;
    private String name;
    USER_ROLE(int id, String name){
        this.setId(id);
        this.setName(name);
    }

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
}
