package Models;

import java.util.ArrayList;

public class Message {
 private String _sender;
 private ArrayList<User>_recipients;
 private int _timesapn;
 private String _textMessage;
public String get_sender() {
	return _sender;
}
public void set_sender(String _sender) {
	this._sender = _sender;
}
public ArrayList<User> get_recipients() {
	return _recipients;
}
public void set_recipients(ArrayList<User> _recipients) {
	this._recipients = _recipients;
}
public int get_timesapn() {
	return _timesapn;
}
public void set_timesapn(int _timesapn) {
	this._timesapn = _timesapn;
}
public String get_textMessage() {
	return _textMessage;
}
public void set_textMessage(String _textMessage) {
	this._textMessage = _textMessage;
}
}
