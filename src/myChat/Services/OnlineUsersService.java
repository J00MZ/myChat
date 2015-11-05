package myChat.Services;

import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.OnlineUsersDTO;

public class OnlineUsersService implements IOnlineUsersService,IService {
OnlineUsersDTO _onlineUsers;

	@Override
	public void Execute() {
		_onlineUsers = new OnlineUsersDTO();
		
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
		_onlineUsers = (OnlineUsersDTO)arg0;
		
	}

}
