package BussinessLayer.Validators;

public class AddressValidator {
    public boolean validate (String address) {
        if ((address.length() > 5) && (address.length() < 50)) {
            return true;
        } else {
            return false;
        }
    }
}
