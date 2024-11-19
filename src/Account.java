/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

public abstract class Account {

//    defining required variables as private
    private String firstName;
    private String lastName;
    private String email;

    public Account (String firstName, String lastName, String s){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

//    Getters for strings firstName, lastName, and email
    public String getFirstName(){
        return firstName;
    }

    public String getLastname(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

//    Setters for strings firstName, lastName, and email
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void String (String email){
        this.email = email;
    }
}