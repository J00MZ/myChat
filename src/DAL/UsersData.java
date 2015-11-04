package DAL;

import java.util.ArrayList;



import Models.UserDTO;

public class UsersData implements IUserData{
  public static ArrayList<UserDTO> _instance;
  public static ArrayList<UserDTO> Instance(){
		if (_instance == null){
			_instance = new ArrayList<UserDTO>();
		}
		return _instance; 
	}
@Override
public UserDTO getUserByUsernameAndPass(String username, String pass) {
	UserDTO user = null;
	for (UserDTO u: _instance){
		if(u.get_nickname().compareTo(username) == 0 && 
				u.get_password().compareTo(pass) == 0){
			user = u ;
		}
	}
	return user;
}
@Override
public Boolean isUserDTOExists(UserDTO user) {
	Boolean result = false;
	
		if(getUserByUsernameAndPass(user.get_nickname(),user.get_password())
				!= null){
			result = true ;
		
	}
	return result;
}
   
}
