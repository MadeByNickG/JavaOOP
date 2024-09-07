package solidEx.implementations;

import solidEx.enums.*;
import solidEx.interfaces.*;

public class SimpleLayout implements Layout {

    @Override
    public String format(String time, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s", time, reportLevel, message);
    }
}
