package numbers.process;

import java.text.NumberFormat;
import java.util.Locale;

public interface Process {
    public static final NumberFormat format = NumberFormat.getInstance(new Locale("en", "US"));
}
