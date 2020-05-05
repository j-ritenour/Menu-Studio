package restaurant;

public class MenuItem {

    // fields
    private String name;
    private String description;
    private int price;
    private String category;

    // constructor
    public MenuItem(String name, String description, int price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    // getters
    public String getName(){return name; }

    public String getDescription(){return description;}

    public int getPrice(){return price;}

    public String getCategory(){return category;}

//setters
    public void setName(String aName) {name = aName;}
    public void setDescription(String aDescription) {description = aDescription;}
    public void setPrice(int aPrice) {price = aPrice;}
    public void setCategory(String aCategory) {category = aCategory;}

}

