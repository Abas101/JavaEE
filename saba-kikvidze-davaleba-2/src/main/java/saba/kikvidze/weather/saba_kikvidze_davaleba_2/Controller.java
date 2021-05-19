package saba.kikvidze.weather.saba_kikvidze_davaleba_2;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/weatherbot")
public class Controller {

    @OnOpen
    public void handleOpen() {
        System.out.println("Connection Established");
    }

    @OnClose
    public void handleClose() {
        System.out.println("Connection closed");
    }

    @OnError
    public void handleError(Throwable e) {
        e.printStackTrace();
    }

    @OnMessage
    public String handleMessage(String message) {
        return Service.answer(message);
    }
}
