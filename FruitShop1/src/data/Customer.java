
package data;


public class Customer {
    protected String name;
    protected String idOders;

    public Customer(String name, String idOders) {
        this.name = name;
        this.idOders = idOders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdOders() {
        return idOders;
    }

    public void setIdOders(String idOders) {
        this.idOders = idOders;
    }
    
    
    
}
