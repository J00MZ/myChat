#KivunChatServer
Kivun Big Data course Chat Server exercise

#Yosef Tavin & Asaf Tobi
This is a Chat server that uses the following architecture:

#Client DTO

signup_DTO
Fields: nickname mail password
signin_DTO
Fields: nickname password
signout_DTO
Fields: nickname
user_DTO
Fields: nickname online_state
all_users_DTO
Fields: user_DTO_list
abstract_message_DTO
Fields: text timestamp
send_message_DTO
Fields: recipients/all_users_DTO

#Server DTO

signup_DTO
Fields: succeeded nickname
signin_DTO
Fields: succeeded nickname users list
get_message_DTO
Fields: text sender

Models
======
User
Fields: nickname mail password isActive last_signin 
Message
Fields: sender recipients timestamp messageText

DAL
======
users getAllUsers()

DATA
======
users.xml
