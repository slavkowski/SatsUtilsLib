package validators;

import exceptions.WrongLengthException;

public class NipNumberValidator {
    private String nip;
    private int[] weightVector = {6, 5, 7, 2, 3, 4, 5, 6, 7};

    public NipNumberValidator(String nip) {
        this.nip = nip.trim().replaceAll("-", "");
    }

    public String getNip() {
        return nip;
    }

    public boolean isNipValid() throws WrongLengthException{
        if (nip.length() != 10) throw new WrongLengthException("Nip number should consist of 10 characters");
        int sum = 0;
        for (int i = 0; i < nip.length() - 1; i++) {
            sum += weightVector[i] * Integer.parseInt(nip.substring(i,i+1));
        }
        return Integer.parseInt(nip.substring(9,10)) == sum % 11;
    }
}
