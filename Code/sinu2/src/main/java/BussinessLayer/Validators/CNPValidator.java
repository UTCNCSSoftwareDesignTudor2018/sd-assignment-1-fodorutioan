package BussinessLayer.Validators;

public class CNPValidator {
    public boolean validate (String CNP) {
        if (CNP.length() < 20) {
            return true;
        } else {
            return false;
        }
    }
}
