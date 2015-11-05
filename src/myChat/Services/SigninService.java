package myChat.Services;

import java.util.ArrayList;

import myChat.ServiceResponse.ISignupServiceResponse;
import DAL.UsersData;
import Kivun.Infra.DTO.ServiceMessage;
import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.SignInResultDTO;
import Models.UserDTO;


public class SigninService implements ISigninService,IService {
 UserDTO _user;
private ArrayList<UserDTO> users;
SignInResultDTO _resultDTO; 
	@Override
	public void Execute() {
		 users =  UsersData.Instance();
		 _user.set_isExists(getUserByUsernameAndPass());
		 _user.set_isActive(true);
		 _resultDTO.set_result(_user);
	}

	@Override
	public Class<?> get_DTOType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IServiceMessage get_Response() {
		//// TODO Auto-generated method stub
		ServiceMessage serviceMessage = new ServiceMessage(); 
		serviceMessage.set_DTO(_resultDTO);
		serviceMessage.set_Handler(ISignupServiceResponse.class);
		return serviceMessage; 
	}

	@Override
	public void set_Params(IDTO arg0) {
		_user = (UserDTO)arg0;
		
	}

	
	public Boolean getUserByUsernameAndPass() {
		Boolean isUserExists = false;
		for (UserDTO u: users){
			if(u.get_nickname().compareTo(_user.get_nickname()) == 0 && 
					u.get_password().compareTo(_user.get_password()) == 0){
				isUserExists = true ;
			}
		}
		return isUserExists;
	}

}
