package turntabl.first;

public class Private_client extends Client {

    public Private_client(String name, int client_ID, Level service_level) {
        super(name, client_ID, service_level);
    }

    public void getContactName(){
        String contact_name =  getName();
    }

    public void getLevel() {
        Level client = Private_client.super.service_level;
    }
}
