package Models;

import org.json.JSONObject;

import Kivun.Infra.DTO.DTOJSONConverter;
import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;

public class SignInResultDTO implements IDTO {
	UserDTO _result;
	@GetProperty(PropName="Result")
	public UserDTO get_result() {
		return _result;
	}
	@SetProperty(PropName="Result")
	public void set_result(UserDTO _result) {
		this._result = _result;
	} 
	@Override
	public String toString(){
		DTOJSONConverter converter = new DTOJSONConverter(); 
		JSONObject obj = converter.ToJSON(this); 
		return obj.toString();
	}
}
