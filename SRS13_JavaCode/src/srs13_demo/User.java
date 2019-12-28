package srs13_demo;

public class User {
    
 String name;
String email;
String password;
String gender;
String birthDate;
Page page;
User user = new User();

public void logIn(String email , String password)
{
    user.email = email;
    user.password = password;

}
public void logOut()
{}
public void update()
{}

public void signUp(String name , String email , String password , String gender , String birthday)
{
    user.birthDate = birthday;
    user.email = email;
    user.gender = gender;
    user.password = password;
    user.name = name;
    DataBase.insert(user);
}


}