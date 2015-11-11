package Models;

import java.util.ArrayList;

import Kivun.Infra.DTO.Annotations.GetProperty;
import Kivun.Infra.DTO.Annotations.SetProperty;

public class MessageDTO {
 private String _sender;
 private ArrayList<UserDTO>_recipients;
 private int _timesapn;
 private String _textMessage;
 @GetProperty(PropName="_sender")
public String get_sender() {
	return _sender;
}
 @SetProperty(PropName="_sender")
public void set_sender(String _sender) {
	this._sender = _sender;
}
@GetProperty(PropName="_recipients")
public ArrayList<UserDTO> get_recipients() {
	return _recipients;
}
@SetProperty(PropName="_recipients")
public void set_recipients(ArrayList<UserDTO> _recipients) {
	this._recipients = _recipients;
}
@GetProperty(PropName="timespan")
public int get_timesapn() {
	return _timesapn;
}
@SetProperty(PropName="timespan")
public void set_timesapn(int _timesapn) {
	this._timesapn = _timesapn;
}
@GetProperty(PropName="_textMessage")
public String get_textMessage() {
	return _textMessage;
}
@SetProperty(PropName="_textMessage")
public void set_textMessage(String _textMessage) {
	this._textMessage = _textMessage;
}
}
