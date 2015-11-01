#KivunChatServer
Kivun Big Data course Chat Server exercise

#Yosef Tavin & Asaf Tobi
This is a Chat server that uses the following architecture:

client DTO

signup_DTO nickname mail password
signin_DTO nickname password
signout_DTO nickname
user_DTO nickname online_state
all_users_DTO user_DTO_list
abstract_message_DTO text timestamp
send_message_DTO recipients/all_users_DTO

server DTO
signup_DTO succeeded nickname
signin_DTO succeeded nickname users list
get_message_DTO text sender

Models
User nickname mail password isActive last_signin Message sender recipients timestamp messageText

DAL
users getAllUsers()

DATA users.xml
