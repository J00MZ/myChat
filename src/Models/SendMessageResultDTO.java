package Models;

import org.json.JSONObject;

import Kivun.Infra.DTO.DTOJSONConverter;
import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;

public class SendMessageResultDTO implements IDTO {
	String _result;
	@GetProperty(PropName="Result")
	public String get_result() {
		return _result;
	}
	@SetProperty(PropName="Result")
	public void set_result(boolean isSucceed) {
		if(isSucceed){
		this._result = "message succeed";
		}else{
			this._result = "message faild";
		}
	} 
	@Override
	public String toString(){
		DTOJSONConverter converter = new DTOJSONConverter(); 
		JSONObject obj = converter.ToJSON(this); 
		return obj.toString();
	}
}
