package TDDTomas;

public class User {
    //4.
    private String userName,password; //attribut, variabler, klassvariabler instansvariabler.
    private String typeOfUser;
    private String types ="normal admin super";// bra för inlämnings uppgiften
    //3.
    //Konstruktor med 2 string argument (inparametrar) kör en gång vid "new"
    public User(String user, String pwd) {
        this.userName=user;
        this.password=pwd;
        this.typeOfUser="normal";
    }
    //5.
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
//7.
    public void setUserName(String newUser) {
       if (newUser.length()<=4) userName= newUser;
    }
    public String getTypeOfUser(){
        return typeOfUser;
    }
    public void setTypeOfUser(String newType) {
        if(types.contains(newType)) typeOfUser= newType;
    }
}
