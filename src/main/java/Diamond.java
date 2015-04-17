import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Strings.padEnd;
import static com.google.common.base.Strings.repeat;
import static com.google.common.collect.Iterables.concat;

public class Diamond {

    public final String SPACE = ".";

    public String create(int length) {
        String[] letters = {"A", "B", "C", "D"};
        List<String> topStrings = new ArrayList<>();
        int lengthOfFirstRow = -1;
        for(int i=0;i<length;i++) {
            int numberOfSpacesPrefix = length - (i+1);
            if (i==0)  lengthOfFirstRow = numberOfSpacesPrefix + 1;
            String leftStringWithCenter =  padEnd(repeat(SPACE, numberOfSpacesPrefix) + letters[i], lengthOfFirstRow, SPACE.charAt(0));
            String rightString = new StringBuilder(
                        leftStringWithCenter.substring(0, leftStringWithCenter.length() - 1)
                    ).reverse().toString();
            topStrings.add(leftStringWithCenter + rightString);
        }
        List<String> bottomString = new ArrayList<>();
        for(int i=topStrings.size()-2;i>=0;i--) {
            bottomString.add(topStrings.get(i));
        }
        return String.join("\n", concat(topStrings, bottomString));
    }

}
