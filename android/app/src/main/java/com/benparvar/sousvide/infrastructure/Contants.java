package com.benparvar.sousvide.infrastructure;
/**
 * Created by alans on 19/05/17.
 */

public class Contants {
    // BLUETOOTH
    public interface Bluetooth {
        public final int REQUEST_ENABLE_BT = 0;
        public final String END_LINE = "\n";
        public final String LINE_FEED = "\r";
    }

    public interface Timer {
        public Long MIN_TARGET_TIMER_IN_SECONDS = 0L;
        public Long MAX_TARGET_TIMER_IN_SECONDS = 86400L;
    }

    public interface TimTemperatureer {
        public Double MIN_TARGET_TEMPERATURE = 30.00;
        public Double MAX_TARGET_TEMPERATURE = 60.00;
    }

    // ERROR CODE
    public interface ErrorCode {
        public final int NO_ERROR = -1;
        public final int UNKNOWN = 0;
        public final int NO_PAIRED_DEVICES = 1;
        public final int YES_PAIRED_DEVICES = 2;
        public final int NO_BLUETOOTH_ADAPTER = 3;
        public final int INVALID_TEMPERATURE = 4;
        public final int OFF = 5;
        public final int ON = 6;
        public final int READY = 7;

    }

    // STATUS
    public interface PanStatus {
        public final String STS_OFF = "0";
        public final String STS_READY = "1";
        public final String STS_COOK_IN_PROGRESS = "2";
        public final String STS_COOK_FINISHED = "3";
    }

    // COMMAND
    public interface PanCommand {
        public final String HEADER = "PAN";
        public final String SEPARATOR = ":";
        public final String VERB = "V";
        public final String NOUN = "N";
        public final String STATUS = "S";
    }

    // VERB
    public interface PanVerb {
        public final String PAN_OFF = "000";
        public final String PAN_ON = "001";
        public final String PAN_TIMER = "002";
        public final String PAN_TEMPERATURE = "003";
        public final String PAN_TIMER_TARGET = "004";
        public final String PAN_TEMPERATURE_TARGET = "005";
        public final String PAN_CURRENT_TIMER = "006";
        public final String PAN_CURRENT_TEMPERATURE = "007";
        public final String PAN_READY = "008";
        public final String PAN_COOK_IN_PROGRESS = "009";
        public final String PAN_COOK_FINISHED = "010";
        public final String PID_VALUE = "011";
        public final String PAN_VERSION = "012";
    }

    // ERROR CODE
    public interface PanErrorCode {
        public final String INVALID_HEADER = "900";
        public final String INVALID_VERB = "901";
        public final String INVALID_NOUN = "902";
        public final String INVALID_TIMER_TARGET = "903";
        public final String INVALID_TEMPERATURE_TARGET = "904";
        public final String INVALID_ALREADY_OFF = "905";
        public final String INVALID_ALREADY_COOKING = "906";
        public final String INVALID_ALREADY_FINISHED_COOKING = "907";
        public final String INVALID_NO_PROGRAMMED = "908";
    }

    public interface SecurityKeys {
        String PREFERENCE_NAME = new String(new char[]{'b', 'e', 'n', 'p', 'a', 'r', 'v', 'a', 'r',
                's', 'r', 'a', 'v', 'r', 'a', 'p', 'n', 'e', 'b' });
    }
}
