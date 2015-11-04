package myChat.DTO;

import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;
import Models.User;

public class SignIn implements IDTO  {
  private User u;
@GetProperty(PropName="A")
public User getUser() {
	return u;
}
@SetProperty(PropName="A")
public void setUser(User u) {
	this.u = u;
}
}
