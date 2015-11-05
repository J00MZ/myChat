package Models;

import java.util.ArrayList;

import DAL.UsersData;
import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;

public class OnlineUsersDTO implements IDTO {
  private ArrayList<String> _users;
@SetProperty(PropName="onlineUsers")
public void setUsers() {
	_users = new ArrayList<String>();
	ArrayList<UserDTO> usersList = UsersData.Instance();
	for(UserDTO u: usersList){
		if(u.get_isActive()){
			_users.add(u.get_nickname());
		}
	}
	
}
@GetProperty(PropName="onlineUsers")
public ArrayList<String> getUsers() {
	
	return _users;
}

}
