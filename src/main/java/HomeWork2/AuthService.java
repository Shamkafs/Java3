package HomeWork2;

import java.sql.SQLException;

public interface AuthService {

    void start() throws SQLException;

    void stop() throws SQLException;

    String getNickByLoginAndPass(String login, String pass);


}