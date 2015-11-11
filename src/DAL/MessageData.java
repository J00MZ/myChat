package DAL;

import java.util.ArrayList;

import Models.MessageDTO;
import Models.UserDTO;


public class MessageData implements IMessageData {
	  public static ArrayList<MessageDTO> _instance;
	  public static ArrayList<MessageDTO> Instance(){
			if (_instance == null){
				_instance = new ArrayList<MessageDTO>();
			}
			return _instance; 
		}
	@Override
	public void AddMessage(MessageDTO message) {
		_instance.add(message);
		
	}
	@Override
	public ArrayList<MessageDTO> getMessages(String username) {
		ArrayList<MessageDTO>userMessages = new ArrayList<MessageDTO>();
		for(MessageDTO m: _instance){
			ArrayList<UserDTO>users = m.get_recipients();
			for(UserDTO u: users){
				if(u.get_nickname().compareTo(username) == 0){
					userMessages.add(m);
				}
			}
		}
		return userMessages;
	}
}
