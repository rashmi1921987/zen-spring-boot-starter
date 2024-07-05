package com.zensar.constants;

public class ZenConstants {
    private ZenConstants() {
    }

    public static final String EMPTY = "";
    public static final String CODE_EXISTS = "exists";
    public static final String CODE_INVALID = "invalid";
    public static final String CODE_REQUIRED = "required";
    public static final String HTTP_SCHEME_URL = "http://";
    public static final String HTTPS_SCHEME_URL = "https://";
    public static final String HREF = "href";
    public static final String AUDIT_TABLE_SUFFIX = "AUD";

    public static class Format {
        private Format() {
        }

        public static final String DATE = "yyyy-MM-dd";
        public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
        public static final String DATE_OPTIONAL_TIME = "yyyy-MM-dd[ HH:mm:ss]";
        public static final String RFC3339_DATE_TIME = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    }

    public static class MDCField {
        private MDCField() {

        }

        public static final String CORRELATION_ID = "correlationid";
        public static final String USER_ID = "userid";
        public static final String REQUEST_ID = "requestid";
    }

    public static class Field {
        private Field() {
        }

        public static final String OFFSET = "offset";
        public static final String LIMIT = "limit";
        public static final String SORT = "sort";
        public static final String ID = "id";
        public static final String REFERENCE_ID = "referenceId";
        public static final String CLIENT_ID = "clientId";
        public static final String TIME_ZONE = "TZ";
    }

    public static class Delimiter {
        private Delimiter() {
        }

        public static final String UNDERSCORE = "_";
        public static final String PERIOD = ".";
        public static final String COMMA = ",";
        public static final String SPACE = " ";
        public static final String QUOTE = "'";
        public static final String BACKSLASH = "\\";
        public static final String EQUAL = "=";
        public static final String HASH = "#";
        public static final String SLASH = "/";
        public static final String PIPE = "|";
        public static final String PERCENT = "%";
        public static final String COLON = ":";
        public static final String AT = "@";
        public static final String QUESTION = "?";
        public static final String TILDE = "~";
        public static final String STAR = "*";
        public static final String DOLLAR = "$";
        public static final String AMPERSAND = "&";
        public static final String HYPHEN = "-";
        public static final String DOT = ".";
        public static final String TAB = "\t";
        public static final String OPEN_CURLY = "{";
        public static final String CLOSE_CURLY = "}";
    }
}
