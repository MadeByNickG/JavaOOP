package solidEx.interfaces;

import solidEx.enums.*;

public interface Appender {
    void append(String time, ReportLevel reportLevel, String message);
}
