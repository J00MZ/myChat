package myChat.Services;

import myChat.ServiceResponse.IOnlineUsersServiceResponse;
import myChat.ServiceResponse.ISignupServiceResponse;
import Kivun.Infra.DTO.ServiceMessage;
import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.OnlineUsersDTO;
import Models.OnlineUsersResultDTO;

public class OnlineUsersService implements IOnlineUsersService,IService {
OnlineUsersDTO _onlineUsers;
OnlineUsersResultDTO  _resultDTO; 
	@Override
	public void Execute() {
		_onlineUsers = new OnlineUsersDTO();
		_onlineUsers.setUsers();
		_resultDTO.set_result(_onlineUsers);
		
	}

	@Override
	public Class<?> get_DTOType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IServiceMessage get_Response() {
		ServiceMessage serviceMessage = new ServiceMessage(); 
		serviceMessage.set_DTO(_resultDTO);
		serviceMessage.set_Handler(IOnlineUsersServiceResponse.class);
		return serviceMessage; 
	}

	@Override
	public void set_Params(IDTO arg0) {
		_onlineUsers = (OnlineUsersDTO)arg0;
		
	}

}
