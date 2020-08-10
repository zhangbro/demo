package com.fttec.socket.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author zhangbro
 */
@ServerEndpoint(value = "/demo/{name}")
@Component
@Slf4j
public class DemoSocket {

    private static CopyOnWriteArraySet<DemoSocket> line = new CopyOnWriteArraySet<>();
    private String user;
    private Session session;

    @OnOpen
    public void open(Session session, @PathParam("name") String name) throws IOException {
        this.user = name;
        this.session = session;
        log.info("user : {}  open", this.user);
        line.add(this);
        session.getBasicRemote().sendText("user " + this.user + "connected ,current user :" + line.size());
    }

    @OnClose
    public void close() {
        log.info("user : {}  close", this.user);
        line.remove(this);
    }

    @OnError
    public void error(Session session, Throwable throwable) throws IOException {
        log.info("user : {}  error", this.user);
    }

    @OnMessage
    public void message(String msg) throws IOException {
        log.info(this.user + " : " + msg);
        line.forEach(demoSocket -> {
            try {
                demoSocket.sendMessage(this.user + " : " + msg);
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        });

    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }
}
