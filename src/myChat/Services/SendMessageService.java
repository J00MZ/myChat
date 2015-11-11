package myChat.Services;

import java.util.ArrayList;

import DAL.MessageData;
import DAL.UsersData;
import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.MessageDTO;
import Models.UserDTO;

public class SendMessageService implements ISendMessageService,IService {
  MessageDTO message;
	@Override
	public void Execute() {
		ArrayList<UserDTO>users = UsersData.Instance();
		message.set_recipients(users);
		MessageData messages = new MessageData();
		messages.AddMessage(message);
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
		message = (MessageDTO)arg0;
		
	}

}
