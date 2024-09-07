package solidEx.implementations;

import solidEx.enums.*;
import solidEx.interfaces.*;

public class ConsoleAppender implements Appender {
    private Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public void append(String time, ReportLevel reportLevel, String message) {
        String formattedMessage = this.layout.format(time, reportLevel, message);
        System.out.println(formattedMessage);
    }
}
