package DAL;

import java.util.ArrayList;

import Models.MessageDTO;

public interface IMessageData {
  void AddMessage(MessageDTO message);
  ArrayList<MessageDTO> getMessages(String username);
}
