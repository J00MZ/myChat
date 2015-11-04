package Models;

import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;
import Kivun.Infra.Interfaces.IDTO;


public class UserDTO implements IDTO{
 private String _nickname;
 private String _mail;
 private String _password;
 private Boolean _isActive;
 private Boolean _isExists;
 
 @GetProperty(PropName="nickname") 
public String get_nickname() {
	return _nickname;
}
@SetProperty(PropName="nickname")
public void set_nickname(String _nickname) {
	this._nickname = _nickname;
}
@GetProperty(PropName="mail")
public String get_mail() {
	return _mail;
}
@GetProperty(PropName="mail")
public void set_mail(String _mail) {
	this._mail = _mail;
}
@GetProperty(PropName="password")
public String get_password() {
	return _password;
}
@SetProperty(PropName="password")
public void set_password(String _password) {
	this._password = _password;
}
@GetProperty(PropName="isActive")
public Boolean get_isActive() {
	return _isActive;
}
@SetProperty(PropName="isActive")
public void set_isActive(Boolean _isActive) {
	this._isActive = _isActive;
}
@GetProperty(PropName="isExists")
public Boolean get_isExists() {
	return _isExists;
}
@SetProperty(PropName="isExists")
public void set_isExists(Boolean _isExists) {
	this._isExists = _isExists;
}
}
