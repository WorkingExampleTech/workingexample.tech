package working.example.tech.SOLID.OCP;

public class Logger {
    public void Log(LoggingSubSystem obj, String data) {
       obj.Log(data);
    }
}
