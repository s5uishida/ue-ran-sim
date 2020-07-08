package tr.havelsan.ueransim.controller;


import io.javalin.Javalin;
import io.javalin.websocket.*;
import org.jetbrains.annotations.NotNull;
import tr.havelsan.ueransim.Program;
import tr.havelsan.ueransim.events.EventParser;
import tr.havelsan.ueransim.utils.Console;
import tr.havelsan.ueransim.utils.Json;


import java.util.ArrayList;
import java.util.List;

public class Backend {


    public static void main(String[] args) {

        var handler = new Handler();

        Javalin.create().start(7070).ws("/demo", ws -> {

            ws.onConnect(handler);

            ws.onMessage(handler);

        });

        new Thread(() -> Program.main(args)).start();

    }

    static class Handler implements WsMessageHandler, WsConnectHandler {

        List<String> stringList = new ArrayList<>();

        public Handler() {
            Console.addPrintHandler(str -> stringList.add(str));
        }

        @Override
        public void handleMessage(@NotNull WsMessageContext ctx) {

            var stringBuilder = new StringBuilder();

            for (var s : stringList) {

                stringBuilder.append(s);
                stringBuilder.append("\r\n");

            }

            ctx.send(Json.toJson(stringBuilder.toString()));

            stringList.clear();

        }

        @Override
        public void handleConnect(@NotNull WsConnectContext ctx){
            ctx.send(Json.toJson(EventParser.possibleEvents()));
        }
    }

}





