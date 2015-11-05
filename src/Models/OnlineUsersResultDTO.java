package Models;

import org.json.JSONObject;

import Kivun.Infra.DTO.DTOJSONConverter;
import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;

public class OnlineUsersResultDTO implements IDTO {
	OnlineUsersDTO _result;
	@GetProperty(PropName="Result")
	public OnlineUsersDTO get_result() {
		return _result;
	}
	@SetProperty(PropName="Result")
	public void set_result(OnlineUsersDTO _result) {
		this._result = _result;
	} 
	@Override
	public String toString(){
		DTOJSONConverter converter = new DTOJSONConverter(); 
		JSONObject obj = converter.ToJSON(this); 
		return obj.toString();
	}
}
