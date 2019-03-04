package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {


    Map<Integer, String> months;

    public MonthConversion(){
        months = new HashMap<Integer, String>();
    }
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        return months.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Set<Integer> keys = months.keySet();
        Integer monthNumber = null;
        for(Integer key : keys){
            if(monthName.equals(months.get(key))){
                monthNumber = key;
                break;
            }
        }
        return monthNumber;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return months.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Integer monthNumber = getNumber(monthName);
        return monthNumber != null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }
}
