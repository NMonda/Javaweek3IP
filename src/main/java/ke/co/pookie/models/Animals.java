package ke.co.pookie.models;

public class Animals {
    private Integer id;
    private String animal;
    private Boolean endangered;
    private Boolean deleted;

    public Integer getId() { return id; }
    public String getAnimal() { return animal; }
    public Boolean getEndangered() { return endangered; }
    public Boolean getDeleted() { return deleted; }

    public void setAnimal(String animal) { this.animal = animal; }
    public void setId(Integer id) { this.id = id; }

    public Animals() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void setEndangered(Boolean endangered) { this.endangered = endangered; }
    public void setDeleted(Boolean deleted) { this.deleted = deleted; }

    public Animals(Integer id, String animal, Boolean endangered, Boolean deleted) {
        this.id = id;
        this.animal = animal;
        this.endangered = endangered;
        this.deleted = deleted;
    }

}
