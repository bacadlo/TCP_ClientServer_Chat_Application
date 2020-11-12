
package chatapplication.rooms;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Room {
    private String room;
    private ArrayList<String> users;
    private StringBuilder chat;
    
    public Room(String room){
        this.room = room;
        users = new ArrayList<>();
        chat = new StringBuilder();
    }
    
    public String getRoom() {
        return room;
    }
    public void setChat(StringBuilder chat){
        this.chat = chat;
    }
    public StringBuilder getChat(){
        return chat;
    }
    public void setRoom(String room, String mailbox) {
        this.room = mailbox ;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }
    
    
}
