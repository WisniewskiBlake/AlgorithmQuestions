public class RomanToInt {
    public int romanToInt(String s) {
        int convertedInt = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case 'I':
                    if(i == charArray.length - 1) {
                        convertedInt += 1;
                    } else if(charArray[i + 1] == 'V' || charArray[i + 1] == 'X') {
                        convertedInt -= 1;
                    } else {
                        convertedInt += 1;
                    }
                    break;
                case 'V':
                    convertedInt += 5;
                    break;
                case 'X':
                    if(i == charArray.length - 1) {
                        convertedInt += 10;
                    } else if(charArray[i + 1] == 'L' || charArray[i + 1] == 'C') {
                        convertedInt -= 10;
                    } else {
                        convertedInt += 10;
                    }
                    break;
                case 'L':
                    convertedInt += 50;
                    break;
                case 'C':
                    if(i == charArray.length - 1) {
                        convertedInt += 100;
                    } else if(charArray[i + 1] == 'D' || charArray[i + 1] == 'M') {
                        convertedInt -= 100;
                    } else {
                        convertedInt += 100;
                    }
                    break;
                case 'D':
                    convertedInt += 500;
                    break;
                case 'M':
                    convertedInt += 1000;
                    break;


            }
        }

        return convertedInt;
    }
}
