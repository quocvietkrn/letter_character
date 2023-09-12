package model;

public class Model {

        private String inputString;
    
        public void setInputString(String inputString) {
            this.inputString = inputString;
        }
    
        public String getInputString() {
            return inputString;
        }
    
        public int countCharacters() {
            return inputString.length();
        }
    
        public int countLetters(char letter) {
            int count = 0;
            for (char c : inputString.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }
            return count;
        }
    }

