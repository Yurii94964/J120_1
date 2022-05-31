/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telphone;

/**
 *
 * @author Юрий
 */
public class TelPhone {

    private final String areaCode;
    private final String localNumber;

    public TelPhone(String areaCode, String localNumber) {
        this.areaCode = areaCode;
        this.localNumber = localNumber;
        checkValue(areaCode, "region code");
        checkValue(localNumber, "local number");
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }


    private void checkValue(String value, String partName) {
        if (value == null)
            throw new NullPointerException(partName + " empty value.");
        if (value.isEmpty())
            throw new IllegalArgumentException(partName + " empty line.");
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (!Character.isDigit(ch))
                throw new IllegalArgumentException(partName + " contains invalid characters.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof TelPhone)) return false;
        TelPhone temp = (TelPhone) obj;
        return temp.getAreaCode().equals(areaCode) && temp.getLocalNumber().equals(localNumber);
    }

    @Override
    public int hashCode() {
        return areaCode.hashCode() + localNumber.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(').append(areaCode).append(')');
        int p = localNumber.length() % 2+2;
        if (p < localNumber.length()) {
            sb.append(localNumber, 0, p);
            while (p <= (localNumber.length() - 2)) {
                sb.append('-').append(localNumber, p, p + 2);
                p += 2;
            }
        }else
            sb.append(localNumber);

        return sb.toString();
    }
}









    
    
    

