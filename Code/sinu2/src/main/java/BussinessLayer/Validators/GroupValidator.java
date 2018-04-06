package BussinessLayer.Validators;

public class GroupValidator {
    public boolean validate (String group) {
        if ((group.length() > 4) && (group.length() < 20)) {
            return true;
        } else {
            return false;
        }
    }
}
