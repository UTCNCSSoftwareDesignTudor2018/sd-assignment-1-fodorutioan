package BussinessLayer.Validators;

import javax.print.DocFlavor;
import java.math.BigInteger;

public class IDValidator {
    public boolean validate (Long ID) {
        if ((ID > 0) && (ID < Long.MAX_VALUE)) {
            return true;
        } else {
            return false;
        }
    }
}
