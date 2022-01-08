package com.pb.demidenko.hw14;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    static class ThreadServer implements Runnable {
        private final Socket socket;

        public ThreadServer(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

            try {

                System.out.println(Thread.currentThread().getName() + ": Получен запрос от клиента");
                // поток для чтения данных
                BufferedReader in = null;
                // поток для отправки данных
                PrintWriter out = null;

                // создаем потоки для связи с клиентом
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                String clientMessage;

                // цикл ожидания сообщений от клиента
                System.out.println("Ожидаем сообщений");
                while ((clientMessage = in.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break;
                    }
                    out.println(LocalDate.now().toString() + " Сервер: " + clientMessage);
                    System.out.println(clientMessage);
                }

                System.out.println("Закрываем соединение с клиентом");
                out.close();
                in.close();
                socket.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception ex) {
                    ex.printStackTrace();

                }

            }
        }
    }


    public static void main(String[] args) throws Exception {
        int port = 1234;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Сервер запущен на порту : " + port);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        // В цикле ждем запроса клиента
        while (true) {
            Socket clientSocket = serverSocket.accept();
            threadPool.submit(new ThreadServer(clientSocket));
        }
    }
}



