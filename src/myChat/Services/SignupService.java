package myChat.Services;

import java.util.ArrayList;

import DAL.UsersData;
import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.SignInResultDTO;
import Models.UserDTO;

public class SignupService implements ISignupService,IService{
    UserDTO _user;
    private ArrayList<UserDTO> users;
    SignInResultDTO _resultDTO; 
	@Override
	public void Execute() {
		
		users  =  UsersData.Instance();
		AddUserToList();
	}

	@Override
	public Class<?> get_DTOType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IServiceMessage get_Response() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set_Params(IDTO arg0) {
		_user = (UserDTO)arg0;
		
	}
    private Boolean isUsernameExists(){
    	Boolean toAdd = true;
    	for(int i = 0;i<users.size();i++){
    		if(_user.get_nickname()
    				.compareTo(users.get(i).get_nickname()) == 0){
    			toAdd = false;
    		}
    	}
    	return toAdd;
    } 
    private Boolean AddUserToList(){
    	if(isUsernameExists()){
    		users.add(_user);
    		return true;
    	}else{
    		return false;
    	}
    }
}
