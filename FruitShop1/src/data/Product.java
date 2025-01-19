
package data;

public abstract class Product {
    protected String id;
    protected String name;
    protected int quanlity;
    protected String origin;

    public Product(String id, String name, int quanlity, String Origin) {
        this.id = id;
        this.name = name;
        this.quanlity = quanlity;
        this.origin = Origin;
    }

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

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String Origin) {
        this.origin = Origin;
    }
    
        public void showInfor() { 
        String str = String.format("|%4s|%-12s|%-7d|%12s|",
                                    id, name, quanlity, origin);
        System.out.println(str);
    }
}
