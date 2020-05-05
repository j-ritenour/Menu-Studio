import java.util.Date;
import java.util.ArrayList;
package restaurant;

public class Menu {
    private String restaurantName;
    private Date lastUpdate = new Date();
    private ArrayList<MenuItem> selections = new ArrayList<>();


    public Menu(String restaurantName, Date lastUpdate) {
        this.restaurantName = restaurantName;
        this.lastUpdate = lastUpdate;
    }
    //getters
    public String getRestaurantName(){return restaurantName;}
    public Date getLastUpdate(){return lastUpdate;}

    //setters
    public void setRestaurantName(String aRestaurantName){restaurantName = aRestaurantName;}
    public void setLastUpdate(Date aLastUpdate){lastUpdate = aLastUpdate;}
}
