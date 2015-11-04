package DAL;


import Models.UserDTO;

public interface IUserData {
 UserDTO getUserByUsernameAndPass(String username,String pass);
 Boolean isUserDTOExists(UserDTO user);
}
