package myChat.DTO;

import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;
import Models.UserDTO;

public class SignIn implements IDTO  {
  private UserDTO u;
@GetProperty(PropName="A")
public UserDTO getUser() {
	return u;
}
@SetProperty(PropName="A")
public void setUser(UserDTO u) {
	this.u = u;
}
}
