package myChat.Services;

import java.util.ArrayList;

import myChat.ServiceResponse.ISendServiceResponse;
import myChat.ServiceResponse.ISignupServiceResponse;
import DAL.MessageData;
import DAL.UsersData;
import Kivun.Infra.DTO.ServiceMessage;
import Kivun.Infra.Interfaces.IDTO;
import Kivun.Infra.Interfaces.IService;
import Kivun.Infra.Interfaces.IServiceMessage;
import Models.MessageDTO;
import Models.SendMessageResultDTO;
import Models.UserDTO;

public class SendMessageService implements ISendMessageService,IService {
  MessageDTO message;
  SendMessageResultDTO _resultDTO;
	@Override
	public void Execute() {
		ArrayList<UserDTO>users = UsersData.Instance();
		message.set_recipients(users);
		MessageData messages = new MessageData();
		messages.AddMessage(message);
		_resultDTO.set_result(true);
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
		serviceMessage.set_Handler(ISendServiceResponse.class);
		return serviceMessage; 
	}

	@Override
	public void set_Params(IDTO arg0) {
		message = (MessageDTO)arg0;
		
	}

}
