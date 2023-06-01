package NetWork;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

import application.SInformation;

public class SocketController {
    Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public SocketController() {
        try {
            socket = new Socket("192.168.233.55", 5000); 
            OutputStream os = socket.getOutputStream(); 
            InputStream is = socket.getInputStream(); 
            oos = new ObjectOutputStream(os); 
            ois = new ObjectInputStream(is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void sendKey(int key) {
        try {
            oos.writeObject(01); 
            oos.writeObject(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SInformation reciveObject() {
    	SInformation rtnValue = null;
        try {
            rtnValue = (SInformation) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rtnValue;
    }

    public void sendSearch(String msg, String msg2, String msg3) {
        try {
            oos.writeObject(02);
            oos.writeObject(msg);
            oos.writeObject(msg2);
            oos.writeObject(msg3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SInformation> reciveObjectList() throws IOException {
        ArrayList<SInformation> rtnValue = null;
        try {
            rtnValue = (ArrayList<SInformation>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rtnValue;
    }
    public void closeSocket() throws IOException {
        socket.close();
    }
}