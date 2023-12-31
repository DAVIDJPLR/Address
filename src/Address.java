import java.util.ArrayList;
import java.util.Arrays;

public class Address implements Comparable<Address>{
    /**
     * Member Variables
     */
    private String status;
    private String reason;
    private String number;
    private String preDirection;
    private String name;
    private String suffix;
    private String postDirection;
    private String unitDesignator;
    private String unit;
    private String city;
    private String state;
    private String zip;
    private String pin;
    private String propertyType;
    private String confirmedCity;
    private String confirmedCounty;
    private String taxCode;
    private String landValue;
    private String buildingValue;
    private String serviceDate;
    private String correctionDate;
    private String notes;
    private ArrayList<String> extra;

    /**
     * Default Constructor
     */
    public Address()
    {
        setStatus("Status");
        setReason("Reason");
        setNumber("Number");
        setPreDirection("PRE DIRECTION");
        setName("NAME");
        setSuffix("SUFFIX");
        setPostDirection("POST DIRECTION");
        setUnitDesignator("Unit Designator");
        setUnit("Unit");
        setCity("City");
        setState("State");
        setZip("Zip");
        setPin("pin");
        setPropertyType("Property Type");
        setConfirmedCity("Confirmed City");
        setConfirmedCounty("Confirmed County");
        setTaxCode("Tax Code");
        setLandValue("Land Value");
        setBuildingValue("Building Value");
        setServiceDate("Service Date");
        setCorrectionDate("Correction Date");
        setNotes("Notes");
        setExtra(new ArrayList<String>());
    }

    /**
     * Constructor
     * @param status
     * @param reason
     * @param number
     * @param preDirection
     * @param name
     * @param suffix
     * @param postDirection
     * @param unitDesignator
     * @param unit
     * @param city
     * @param state
     * @param zip
     * @param pin
     * @param propertyType
     * @param confirmedCity
     * @param confirmedCounty
     * @param taxCode
     * @param landValue
     * @param buildingValue
     * @param serviceDate
     * @param correctionDate
     * @param notes
     * @param extra
     */
    public Address(String status, String reason, String number, String preDirection, String name, String suffix, String postDirection, String unitDesignator, String unit, String city, String state,
                   String zip, String pin, String propertyType, String confirmedCity, String confirmedCounty, String taxCode, String landValue,
                   String buildingValue, String serviceDate, String correctionDate, String notes, String extra)
    {
        setStatus(status);
        setReason(reason);
        setNumber(number);
        setPreDirection(preDirection);
        setName(name);
        setSuffix(suffix);
        setPostDirection(postDirection);
        setUnitDesignator(unitDesignator);
        setUnit(unit);
        setCity(city);
        setState(state);
        setZip(zip);
        setPin(pin);
        setPropertyType(propertyType);
        setConfirmedCity(confirmedCity);
        setConfirmedCounty(confirmedCounty);
        setTaxCode(taxCode);
        setLandValue(landValue);
        setBuildingValue(buildingValue);
        setServiceDate(serviceDate);
        setCorrectionDate(correctionDate);
        setNotes(notes);

        ArrayList<String> lst = new ArrayList<>();
        lst.add(extra.strip().toUpperCase());
        setExtra(lst);
    }

    /**
     * Constructor
     * @param status
     * @param reason
     * @param number
     * @param preDirection
     * @param name
     * @param suffix
     * @param postDirection
     * @param unitDesignator
     * @param unit
     * @param city
     * @param state
     * @param zip
     * @param pin
     * @param propertyType
     * @param confirmedCity
     * @param confirmedCounty
     * @param taxCode
     * @param landValue
     * @param buildingValue
     * @param serviceDate
     * @param correctionDate
     * @param notes
     * @param extra
     */
    public Address(String status, String reason, String number, String preDirection, String name, String suffix, String postDirection, String unitDesignator, String unit, String city, String state,
                   String zip, String pin, String propertyType, String confirmedCity, String confirmedCounty, String taxCode, String landValue,
                   String buildingValue, String serviceDate, String correctionDate, String notes, ArrayList<String> extra)
    {
        setStatus(status);
        setReason(reason);
        setNumber(number);
        setPreDirection(preDirection);
        setName(name);
        setSuffix(suffix);
        setPostDirection(postDirection);
        setUnitDesignator(unitDesignator);
        setUnit(unit);
        setCity(city);
        setState(state);
        setZip(zip);
        setPin(pin);
        setPropertyType(propertyType);
        setConfirmedCity(confirmedCity);
        setConfirmedCounty(confirmedCounty);
        setTaxCode(taxCode);
        setLandValue(landValue);
        setBuildingValue(buildingValue);
        setServiceDate(serviceDate);
        setCorrectionDate(correctionDate);
        setNotes(notes);
        setExtra(extra);
    }

    /**
     * Constructor
     * @param number
     * @param preDirection
     * @param name
     * @param suffix
     * @param postDirection
     * @param unit
     * @param city
     * @param state
     * @param zip
     */
    public Address(String number, String preDirection, String name, String suffix, String postDirection, String unit, String city, String state, String zip)
    {
        setStatus("");
        setReason("");
        setNumber(number);
        setPreDirection(preDirection);
        setName(name);
        setSuffix(suffix);
        setPostDirection(postDirection);
        setUnitDesignator("");
        setUnit(unit);
        setCity(city);
        setState(state);
        setZip(zip);
        setPin("");
        setPropertyType("");
        setConfirmedCity("");
        setConfirmedCounty("");
        setTaxCode("");
        setLandValue("");
        setBuildingValue("");
        setServiceDate("");
        setCorrectionDate("");
        setNotes("");
        setExtra(new ArrayList<String>());
    }

    /**
     * Constructor
     * @param number
     * @param preDirection
     * @param name
     * @param suffix
     * @param postDirection
     * @param unit
     * @param city
     * @param state
     * @param zip
     * @param extra
     */
    public Address(String number, String preDirection, String name, String suffix, String postDirection, String unit, String city, String state, String zip, String extra)
    {
        setStatus("");
        setReason("");
        setNumber(number);
        setPreDirection(preDirection);
        setName(name);
        setSuffix(suffix);
        setPostDirection(postDirection);
        setUnitDesignator("");
        setUnit(unit);
        setCity(city);
        setState(state);
        setZip(zip);
        setPin("");
        setPropertyType("");
        setConfirmedCity("");
        setConfirmedCounty("");
        setTaxCode("");
        setLandValue("");
        setBuildingValue("");
        setServiceDate("");
        setCorrectionDate("");
        setNotes("");

        ArrayList<String> lst = new ArrayList<>();
        lst.add(extra.strip().toUpperCase());
        setExtra(lst);
    }

    /**
     * Constructor
     * @param number
     * @param preDirection
     * @param name
     * @param suffix
     * @param postDirection
     * @param unit
     * @param city
     * @param state
     * @param zip
     * @param extra
     */
    public Address(String number, String preDirection, String name, String suffix, String postDirection, String unit, String city, String state, String zip, ArrayList<String> extra)
    {
        setStatus("");
        setReason("");
        setNumber(number);
        setPreDirection(preDirection);
        setName(name);
        setSuffix(suffix);
        setPostDirection(postDirection);
        setUnitDesignator("");
        setUnit(unit);
        setCity(city);
        setState(state);
        setZip(zip);
        setPin("");
        setPropertyType("");
        setConfirmedCity("");
        setConfirmedCounty("");
        setTaxCode("");
        setLandValue("");
        setBuildingValue("");
        setServiceDate("");
        setCorrectionDate("");
        setNotes("");
        setExtra(extra);
    }

    /**
     * Constructor
     * @param in An ArrayList that contains the variables of an Address as elements
     */
    public Address(ArrayList<String> in){
        try{setStatus(in.get(0));} catch(Exception e){setStatus("");}
        try{setReason(in.get(1));} catch(Exception e){setReason("");}
        try{setNumber(in.get(2));} catch(Exception e){setNumber("");}
        try{setPreDirection(in.get(3));} catch(Exception e){setPreDirection("");}
        try{setName(in.get(4));} catch(Exception e){setName("");}
        try{setSuffix(in.get(5));} catch(Exception e){setSuffix("");}
        try{setPostDirection(in.get(6));} catch(Exception e){setPostDirection("");}
        try{setUnitDesignator(in.get(7));} catch(Exception e){setUnitDesignator("");}
        try{setUnit(in.get(8));} catch(Exception e){setUnit("");}
        try{setCity(in.get(9));} catch(Exception e){setCity("");}
        try{setState(in.get(10));} catch(Exception e){setState("");}
        try{setZip(in.get(11));} catch(Exception e){setZip("");}
        try{setPin(in.get(12));} catch(Exception e){setPin("");}
        try{setPropertyType(in.get(13));} catch(Exception e){setPropertyType("");}
        try{setConfirmedCity(in.get(14));} catch(Exception e){setConfirmedCity("");}
        try{setConfirmedCounty(in.get(15));} catch(Exception e){setConfirmedCounty("");}
        try{setTaxCode(in.get(16));} catch(Exception e){setTaxCode("");}
        try{setLandValue(in.get(17));} catch(Exception e){setLandValue("");}
        try{setBuildingValue(in.get(18));} catch(Exception e){setBuildingValue("");}
        try{setServiceDate(in.get(19));} catch(Exception e){setServiceDate("");}
        try{setCorrectionDate(in.get(20));} catch(Exception e){setCorrectionDate("");}
        try{setNotes(in.get(21));} catch(Exception e){setCorrectionDate("");}
    }

    /**
     * Constructor
     * Deep Copy
     * @param a : The Address that a deep copy will be made of
     */
    public Address(Address a) {
        this.status = (a.status);
        this.reason = (a.reason);
        this.number = (a.number);
        this.preDirection = (a.preDirection);
        this.name = (a.name);
        this.suffix = (a.suffix);
        this.postDirection = (a.postDirection);
        this.unitDesignator = (a.unitDesignator);
        this.unit = (a.unit);
        this.city = (a.city);
        this.state = (a.state);
        this.zip = (a.zip);
        this.pin = (a.pin);
        this.propertyType = (a.propertyType);
        this.confirmedCity = (a.confirmedCity);
        this.confirmedCounty = (a.confirmedCounty);
        this.taxCode = (a.taxCode);
        this.landValue = (a.landValue);
        this.buildingValue = (a.buildingValue);
        this.serviceDate = (a.serviceDate);
        this.correctionDate = (a.correctionDate);
        this.notes = (a.notes);
        this.extra = (a.extra);
    }

    /**
     * Start of getters ad setters
     * The setters make sure to strip any whitespace
     * from the start and end of the incoming string
     * and change it to all uppercase letters
     */
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getPreDirection(){
        return preDirection;
    }
    public void setPreDirection(String preDirection){
        this.preDirection = preDirection.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getSuffix(){
        return suffix;
    }
    public void setSuffix(String suffix){
        this.suffix = suffix.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getPostDirection(){
        return postDirection;
    }
    public void setPostDirection(String postDirection){
        this.postDirection = postDirection.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getUnitDesignator() {
        return unitDesignator;
    }
    public void setUnitDesignator(String unitDesignator) {
        this.unitDesignator = unitDesignator.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String propertyType) {

        if (propertyType.toUpperCase().contains("EXEMPT")){
            this.propertyType = "EXEMPT";
        } else if (propertyType.toUpperCase().contains("VACANT")){
            this.propertyType = "VACANT";
        } else if (propertyType.toUpperCase().contains("VAC")){
            this.propertyType = "VACANT";
        } else{
            if ((propertyType.toUpperCase().contains("RESIDENTIAL"))&&(propertyType.toUpperCase().contains("HOME"))){
                this.propertyType = "RESIDENTIAL";
            } else if (propertyType.toUpperCase().contains("COMMERCIAL")){
                this.propertyType = "COMMERCIAL";
            } else if (propertyType.toUpperCase().contains("INDUSTRIAL")){
                this.propertyType = "INDUSTRIAL";
            } else if ((propertyType.toUpperCase().contains("REL"))||(propertyType.toUpperCase().contains("RELIGIOUS"))||
                        (propertyType.toUpperCase().contains("HEALTH"))||(propertyType.toUpperCase().contains("HOSPITAL"))||
                        (propertyType.toUpperCase().contains("CLINIC"))||(propertyType.toUpperCase().contains("PUBLIC"))){
                this.propertyType = "REL, HEALTH, PUB BUILDING";
            } else {
                this.propertyType = propertyType;
            }
        }
    }

    public String getConfirmedCity() {
        return confirmedCity;
    }
    public void setConfirmedCity(String confirmedCity) {
        this.confirmedCity = confirmedCity.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getConfirmedCounty() {
        return confirmedCounty;
    }
    public void setConfirmedCounty(String confirmedCounty) {
        this.confirmedCounty = confirmedCounty.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getTaxCode() {
        return taxCode;
    }
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getLandValue() {
        return landValue;
    }
    public void setLandValue(String landValue) {
        this.landValue = landValue.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getBuildingValue() {
        return buildingValue;
    }
    public void setBuildingValue(String buildingValue) {
        this.buildingValue = buildingValue.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getServiceDate() {
        return serviceDate;
    }
    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getCorrectionDate() {
        return correctionDate;
    }
    public void setCorrectionDate(String correctionDate) {
        this.correctionDate = correctionDate.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes.strip().toUpperCase().replace("$", "").replace(",", "");
    }

    public ArrayList<String> getExtra() {
        return extra;
    }
    public void setExtra(ArrayList<String> extra) {

        ArrayList<String> lst = new ArrayList<>();

        for (int x = 0; x < extra.size(); x++){
            lst.add(extra.get(x).strip().toUpperCase());
        }

        this.extra = lst;
    }
    /**
     *^^^End of Getters and Setter^^^
     */

    /**
     * Method
     * Adds a String to the ArrayList of extra; It removes whitespace
     * from the start and end of the string and changes it to UpperCase
     * before it is added to the ArrayList
     * @param word : A String to be added to the extra ArrayList
     */
    public void addExtra(String word) {
        extra.add(word.strip().toUpperCase());
    }

    /**
     * Method
     * @return Address in string form (to use to search for addresses in assessor websites (only the number and street))
     */
    @Override
    public String toString()
    {
        String out = number;
        if (!(preDirection.equalsIgnoreCase(""))){
            out = out + " " + preDirection;
        }
        if (!(name.equalsIgnoreCase(""))){
            out = out + " " + name;
        }
        if (!(suffix.equalsIgnoreCase(""))){
            out = out + " " + suffix;
        }
        if (!(postDirection.equalsIgnoreCase(""))){
            out = out + " " + postDirection;
        }
        if (!(unit.equalsIgnoreCase(""))){
            out = out + " " + unit;
        }

        return out;
    }

    /**
     * Method
     * Turns the address into an array of string
     * @return An array of strings each index holding the value of one field
     */
    public String[] toStringArray() {
        String[] out = new String[]{status , reason , number, preDirection, name, suffix, postDirection,
                unitDesignator, unit, city, state, zip, pin, propertyType, confirmedCity, confirmedCounty,
                taxCode, landValue, buildingValue, serviceDate, correctionDate, notes};
        return out;
    }

    public ArrayList<String> toStringArrayList() {
        return new ArrayList(Arrays.asList(toStringArray()));
    }

    /**
     * Method
     * Compares an address with an object using (number and street name) for provider check
     * @param other : the object to compare with 'this'
     * @return true if they are equal and false if they don't match
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Address)) {
            return false;
        }

        Address o = (Address) other;
        if ((this.number.equalsIgnoreCase(o.number))&&(this.name.equalsIgnoreCase(o.name))) {
            return true;
        }

        return false;
    }

    /**
     * Method
     * Compares two address to an object to see if the number, predirection, name, suffix, and postdirection match
     * @param other : The address that is  being compared to 'this'
     * @return true if the addresses match with only the number and entire street ie. (predirection, name, suffix, and postdirection)
     *          and returns false if they don't match
     */
    public boolean match(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Address)) {
            return false;
        }

        Address o = (Address) other;
        if ((this.number.equalsIgnoreCase(o.number))&&(this.preDirection.equalsIgnoreCase(o.preDirection))&&
                (this.name.equalsIgnoreCase(o.name))&&(this.suffix.equalsIgnoreCase(o.suffix))&&
                (this.postDirection.equalsIgnoreCase(o.postDirection))) {
            return true;
        }

        return false;
    }

    /**
     * Method
     * compares an address with an object using all the address paramaters excluding extra
     * @param other : The address that is  being compared to 'this'
     * @return true if they match and false if they don't match
     */
    public boolean exactMatch(Object other) {
        if (!(other instanceof Address)){
            return false;
        }

        Address o = (Address) other;
        if (this.status.equalsIgnoreCase(o.status)) {
            if (this.reason.equalsIgnoreCase(o.reason)) {
                if (this.number.equalsIgnoreCase(o.number)) {
                    if (this.preDirection.equalsIgnoreCase(o.preDirection)) {
                        if (this.name.equalsIgnoreCase(o.name)) {
                            if (this.suffix.equalsIgnoreCase(o.suffix)) {
                                if (this.postDirection.equalsIgnoreCase(o.postDirection)) {
                                    if (this.unitDesignator.equalsIgnoreCase(o.unitDesignator)) {
                                        if (this.unit.equalsIgnoreCase(o.unit)) {
                                            if (this.city.equalsIgnoreCase(o.city)) {
                                                if (this.state.equalsIgnoreCase(o.state)) {
                                                    if (this.zip.equalsIgnoreCase(o.zip)) {
                                                        if (this.pin.equalsIgnoreCase(o.pin)) {
                                                            if (this.propertyType.equalsIgnoreCase(o.propertyType)) {
                                                                if (this.confirmedCity.equalsIgnoreCase(o.confirmedCity)) {
                                                                    if (this.confirmedCounty.equalsIgnoreCase(o.confirmedCounty)) {
                                                                        if (this.taxCode.equalsIgnoreCase(o.taxCode)) {
                                                                            if (this.landValue.equalsIgnoreCase(o.landValue)) {
                                                                                if (this.buildingValue.equalsIgnoreCase(o.buildingValue)) {
                                                                                    if (this.serviceDate.equalsIgnoreCase(o.serviceDate)) {
                                                                                        if (this.correctionDate.equalsIgnoreCase(o.correctionDate)) {
                                                                                            if (this.notes.equalsIgnoreCase(o.notes)) {
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Method
     * @param str
     * @return true if str only contains number, false if not
     */
    public static boolean isUnit(String str){
        if (str == null){
            return false;
        }
        try{
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * Method
     * defines the order of operation to sort addresses
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Address o) {
        if (this.name.compareTo(o.name) == 0){
            if (this.suffix.compareTo(o.suffix) == 0) {
                if (this.number.compareTo(o.number) == 0) {
                    if (this.preDirection.compareTo(o.preDirection) == 0) {
                        if (this.postDirection.compareTo(o.postDirection) == 0) {
                            return (this.unit.compareTo(o.unit));
                        } else {
                            return (this.postDirection.compareTo(o.postDirection));
                        }
                    } else {
                        return (this.preDirection.compareTo(o.preDirection));
                    }
                } else {
                    return (this.number.compareTo(o.number));
                }
            } else {
                return (this.suffix.compareTo(o.suffix));
            }
        }else{
            return (this.name.compareTo(o.name));
        }
    }

    @Override
    public int hashCode() {
        String id = number + name;
        return id.hashCode();
    }

    public boolean isException(){
        try {
            if (Integer.parseInt(buildingValue) == 0) {
                return false;
            }
        } catch (Exception e){}
        if (propertyType.toUpperCase().contains("EXEMPT")){
            return false;
        }
        if (propertyType.toUpperCase().contains("VACANT")){
            return false;
        }
        return true;
    }
}
