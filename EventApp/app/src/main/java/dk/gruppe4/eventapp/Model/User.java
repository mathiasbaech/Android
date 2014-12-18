package dk.gruppe4.eventapp.Model;

/**
 * Created by Mathias on 18-12-2014.
 */
public class User {

    public String fName;
    public String lName;
    public String email;
    public String birthday;
    public int rank;

    public User(String fName, String lName, String email, String birthday, int rank)
    {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.birthday = birthday;
        this.rank = rank;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
