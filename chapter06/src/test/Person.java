package test;

public class Person {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shout() {
        System.out.println("人在喊话");
    }

    public void shout(String speak) {
        System.out.println(speak);
    }
}