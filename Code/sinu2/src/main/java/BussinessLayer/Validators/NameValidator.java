package BussinessLayer.Validators;

public class NameValidator {
    public boolean validate (String name) {
        if ((name.length() > 3) && (name.length() < 50)) {
            return true;
        } else {
            return false;
        }
    }
}
