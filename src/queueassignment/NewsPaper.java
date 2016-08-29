package queueassignment;

/**
 * @author george oster
 */
import java.io.*;

public class NewsPaper implements Serializable {//begin class newspaper

    String name;
    String circulation;
    String city;
    String state;
    String ISSN;

    public NewsPaper() {
    }

    public NewsPaper(String nam, String cir, String cit, String sta, String ISS) {
        name = nam;
        circulation = cir;
        city = cit;
        state = sta;
        ISSN = ISS;
    }

    public String getName() {
        return name;
    }

    public String getCirculation() {
        return circulation;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setCirculation(String cir) {
        circulation = cir;
    }

    public void setCity(String cit) {
        city = cit;
    }

    public void setState(String sta) {
        state = sta;
    }

    public void setISSN(String ISS) {
        ISSN = ISS;
    }

    @Override
    public String toString() {
        String whatIsHappening = name + ", " + circulation + ", " + city + ", " + state + ", " + ISSN;
        return whatIsHappening;
    }

}//end class newspaper

