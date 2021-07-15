public abstract class Animal {
    private String name,type, desc;
    private int price;
    private boolean inStock;

    public Animal(){}

    public Animal(String name, String type, String desc, int price, boolean inStock){
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.price = price;
        this.inStock = inStock;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public boolean isInStock() {
        return inStock;
    }

    abstract String getPet();

}
