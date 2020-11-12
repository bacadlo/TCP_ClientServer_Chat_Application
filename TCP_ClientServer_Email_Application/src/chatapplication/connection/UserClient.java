
package chatapplication.connection;

/**
 *
 * @author root
 */
public class UserClient {
    
    private String username;
    private Client client;
    
    public UserClient(String username, Client client){
        this.username = username;
        this.client = client;
    }
    public String getUsername(){
        return username;
    }
    public Client getClient(){
        return client;
    }
}
