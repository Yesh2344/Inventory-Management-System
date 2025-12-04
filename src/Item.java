# Minor edit
import java.io.Serializable;
# Added comment

public class Item implements Serializable {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
# Added comment
    }

# Added comment
    public String getName() {
        return name;
    }
# Added comment

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
# Added comment
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}