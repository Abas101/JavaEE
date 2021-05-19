<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Weather ChatBot</title>
</head>
<body>
<textarea id="messageTextArea" rows="10" cols="50"> </textarea>
<br>

<form>
    <input id="textMessage" type="text">
    <input onclick="sendMessage();" value="Send Message" type="button">
</form>
<script>
    const webSocket = new WebSocket("ws://localhost:8081/saba_kikvidze_davaleba_2_war_exploded/weatherbot");
    const messageTextArea = document.querySelector("#messageTextArea");
    const textMessage = document.querySelector("#textMessage")
    webSocket.onopen = (message) => {
        processOpen(message);
    };
    webSocket.onmessage = (message) => {
        processMessage(message);
    };
    webSocket.onclose = (message) => {
        processClose(message);
    };
    webSocket.onerror = (message) => {
        processError(message);
    };
    const processOpen = (message) => {
        messageTextArea.value += "The connection is established .. " + "\n";
    }
    const processMessage = (message) => {
        messageTextArea.value += "Server : " + message.data + "\n";
    }
    const sendMessage = () => {
        webSocket.send(textMessage.value);
        messageTextArea.value += "Client :  " + textMessage.value + "\n";
        textMessage.value = "";
    }
    const processClose = (message) => {
        webSocket.send("Client disconnected ... ")
        messageTextArea.value += "Server Disconnect ... ";
    }
    const processError = (message) => {
        messageTextArea.value += "error ... " + message;
    }
</script>
</body>
</html>