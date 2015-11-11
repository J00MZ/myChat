package Models;

import org.json.JSONObject;

import Kivun.Infra.DTO.DTOJSONConverter;
import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;

public class SignInResultDTO implements IDTO {
	String _result;
	@GetProperty(PropName="Result")
	public String get_result() {
		return _result;
	}
	@SetProperty(PropName="Result")
	public void set_result(UserDTO _result) {
		if(_result.get_isExists()){
		this._result = "succeed";
		}else{
			this._result = "faild";
		}
	} 
	@Override
	public String toString(){
		DTOJSONConverter converter = new DTOJSONConverter(); 
		JSONObject obj = converter.ToJSON(this); 
		return obj.toString();
	}
}
