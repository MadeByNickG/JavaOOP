package solidEx.implementations;

import solidEx.enums.*;
import solidEx.interfaces.*;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    private void log(String time, ReportLevel reportLevel, String message) {
        Arrays.stream(appenders).forEach(appender ->
                appender.append(time, reportLevel, message));
    }

    @Override
    public void logInfo(String time, String message) {
        log(time, ReportLevel.INFO, message);
    }

    @Override
    public void logWarning(String time, String message) {
        log(time, ReportLevel.WARNING, message);
    }

    @Override
    public void logError(String time, String message) {
        log(time, ReportLevel.ERROR, message);
    }

    @Override
    public void logCritical(String time, String message) {
        log(time, ReportLevel.CRITICAL, message);
    }

    @Override
    public void logFatal(String time, String message) {
        log(time, ReportLevel.FATAL, message);
    }
}
